package com.mobdeve.s12.lumandas.czarina.ge2_animelist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var animeTitleAdapter: AnimeTitleAdapter
    private lateinit var reviewAdapter: ReviewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setting up Anime Titles RecyclerView
        val animeTitlesRecyclerView = findViewById<RecyclerView>(R.id.recyclerview_anime_titles)
        animeTitlesRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        animeTitleAdapter = AnimeTitleAdapter(DataGenerator.generateAnimeTitleData())
        animeTitlesRecyclerView.adapter = animeTitleAdapter

        // Setting up Reviews RecyclerView
        val reviewsRecyclerView = findViewById<RecyclerView>(R.id.recyclerview_reviews)
        reviewsRecyclerView.layoutManager = LinearLayoutManager(this)
        reviewAdapter = ReviewAdapter(DataGenerator.generateRecentReviewsData())
        reviewsRecyclerView.adapter = reviewAdapter
    }
}
