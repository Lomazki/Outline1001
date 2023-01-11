package by.lomazki.outline1001.adapter

import android.content.Context
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import by.lomazki.outline1001.databinding.ItemHabitBinding

class HabitViewHolder(
    private val binding: ItemHabitBinding,
    private val context: Context
) : ViewHolder(binding.root) {

    fun bind(habit: Habit) {

        with(binding) {
            buttonDone.setOnClickListener {
                Toast.makeText(context, "I am best of the best", Toast.LENGTH_SHORT).show()
            }
            buttonSkip.setOnClickListener {
                Toast.makeText(context, "I have been lazy", Toast.LENGTH_SHORT).show()
            }

            textView.text = habit.name
        }

    }

}
