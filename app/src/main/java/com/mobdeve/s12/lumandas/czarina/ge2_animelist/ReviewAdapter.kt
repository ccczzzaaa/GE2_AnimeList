package com.mobdeve.s12.lumandas.czarina.ge2_animelist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

class ReviewAdapter(private val reviews: ArrayList<Review>) : RecyclerView.Adapter<ReviewAdapter.ReviewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_review, parent, false)
        return ReviewViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {
        val review = reviews[position]
        holder.bind(review)
    }

    override fun getItemCount(): Int {
        return reviews.size
    }

    class ReviewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val usernameTextView: TextView = itemView.findViewById(R.id.review_username)
        private val ratingTextView: TextView = itemView.findViewById(R.id.review_rating)
        private val episodeTitleTextView: TextView = itemView.findViewById(R.id.review_episode_title)
        private val animeNameTextView: TextView = itemView.findViewById(R.id.review_anime_name)

        fun bind(review: Review) {
            usernameTextView.text = review.username
            ratingTextView.text = "Rating: ${review.rating}"
            episodeTitleTextView.text = review.episode.title
            animeNameTextView.text = review.episode.anime.name
        }
    }
}
