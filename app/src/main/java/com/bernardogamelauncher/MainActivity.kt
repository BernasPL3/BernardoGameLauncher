package com.bernardo.gamelauncher

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: GameAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.gamesRecycler)

        val games = listOf(
            Game("Super Mario Bros", "NES"),
            Game("Zelda ALTTP", "SNES"),
            Game("God of War II", "PS2"),
            Game("Gran Turismo 4", "PS2"),
            Game("Crash Bandicoot", "PS1")
        )

        adapter = GameAdapter(games)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter
    }
}
