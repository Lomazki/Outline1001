package by.lomazki.outline1001.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import by.lomazki.outline1001.R
import by.lomazki.outline1001.databinding.FragmentContentBinding

class ContentFragment : Fragment() {

    private var _binding: FragmentContentBinding? = null
    private val binding get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentContentBinding.inflate(inflater, container, false)
            .also { _binding = it }
            .root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nestedController =
            (childFragmentManager
                .findFragmentById(R.id.container_content) as NavHostFragment)
                .navController
        binding.bottomNavigation.setupWithNavController(nestedController)

        binding.fab.setOnClickListener {
            Toast.makeText(context, "the button is working", Toast.LENGTH_SHORT).show()
        }

        // отключаем кликабельность средней кнопки
        binding.bottomNavigation.menu.getItem(1).isEnabled = false
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}