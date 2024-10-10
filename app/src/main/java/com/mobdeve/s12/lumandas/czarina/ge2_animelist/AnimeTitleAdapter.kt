package com.mobdeve.s12.lumandas.czarina.ge2_animelist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.ImageView
import android.widget.TextView

class AnimeTitleAdapter(private val animeTitles: ArrayList<AnimeTitle>) : RecyclerView.Adapter<AnimeTitleAdapter.AnimeTitleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeTitleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_anime_title, parent, false)
        return AnimeTitleViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimeTitleViewHolder, position: Int) {
        val animeTitle = animeTitles[position]
        holder.bind(animeTitle)
    }

    override fun getItemCount(): Int {
        return animeTitles.size
    }

    class AnimeTitleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val animeImageView: ImageView = itemView.findViewById(R.id.anime_image)
        private val animeNameTextView: TextView = itemView.findViewById(R.id.anime_name)

        fun bind(animeTitle: AnimeTitle) {
            animeImageView.setImageResource(animeTitle.imageId)
            animeNameTextView.text = animeTitle.name
        }
    }
}
