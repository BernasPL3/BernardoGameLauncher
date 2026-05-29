package com.bernardo.gamelauncher

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class GameAdapter(private val games: List<Game>) :
    RecyclerView.Adapter<GameAdapter.GameViewHolder>() {

    class GameViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.gameTitle)
        val console: TextView = view.findViewById(R.id.gameConsole)
        val card: CardView = view.findViewById(R.id.gameCard)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_game, parent, false)

        return GameViewHolder(view)
    }

    override fun getItemCount(): Int = games.size

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {

        val game = games[position]

        holder.title.text = game.title
        holder.console.text = game.console

        holder.card.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Abrindo ${game.title}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
