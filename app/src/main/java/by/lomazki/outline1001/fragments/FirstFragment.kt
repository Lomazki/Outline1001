package by.lomazki.outline1001.fragments

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import by.lomazki.outline1001.adapter.Habit
import by.lomazki.outline1001.adapter.HabitAdapter
import by.lomazki.outline1001.databinding.FragmentFirstBinding
import com.google.android.material.divider.MaterialDividerItemDecoration

class FirstFragment : Fragment() {

    private var _binding : FragmentFirstBinding? = null
    private val binding get() = requireNotNull(_binding)
    private val adapter by lazy {
        HabitAdapter(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentFirstBinding.inflate(inflater, container, false)
            .also { _binding = it }
            .root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            recyclerView.adapter = adapter

            // Decorator
            recyclerView.addItemDecoration(
                MaterialDividerItemDecoration(
                    requireContext(),
                    MaterialDividerItemDecoration.VERTICAL
                )
            )
        }

        val listHabit = listOf(
            Habit(0, "Непривычка 1", "url"),
            Habit(1, "Назв непр-ки ", "url"),
            Habit(2, "Назв непривычки 3", "url"),
            Habit(3, "Назв ошибки 4", "url"),
            Habit(4, "Назве непривычки ", "url"),
            Habit(4, "Непр-ка 6", "url"),
            Habit(4, "Непривычка 7", "url"),
            Habit(4, "Назв привычки 8", "url"),
            Habit(4, "Назва привычки ", "url"),
            Habit(4, "Назв непривычки 0", "url"),
            Habit(4, "Назв непр-ки 11", "url"),
        )

        adapter.submitList(listHabit)

        binding.root.setBackgroundColor(Color.GRAY)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}