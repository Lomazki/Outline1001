package by.lomazki.outline1001

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import by.lomazki.outline1001.databinding.FragmentFifthBinding
import by.lomazki.outline1001.databinding.FragmentThirdBinding

class FifthFragment : Fragment() {

    private var _binding : FragmentFifthBinding? = null
    private val binding get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentFifthBinding.inflate(inflater, container, false)
            .also { _binding = it }
            .root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.root.setBackgroundColor(Color.BLACK)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}