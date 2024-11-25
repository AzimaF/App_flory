package com.example.florys_app.ui.adapter

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.florys_app.R

class VerticalAdapter(
    private var isLoading: Boolean = true,
    //private val onFavoriteClick: (ArticleEntity) -> Unit
)
    /*
    :
    ListAdapter<ArticleEntity, RecyclerView.ViewHolder>(DIFF_CALLBACK) {

    override fun getItemViewType(position: Int): Int {
        return if (isLoading) VIEW_TYPE_SHIMMER else VIEW_TYPE_DATA
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == VIEW_TYPE_SHIMMER) {
            val binding = ItemShimmerVerticalBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
            ShimmerViewHolder(binding)
        } else {
            val binding = ItemNormalVerticalBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
            MyViewHolder(binding)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder && !isLoading) {
            val event = getItem(position)
            holder.bind(event)
            val favoriteImageView = holder.binding.favoriteImageView
            favoriteImageView.setImageResource(
                if (event.isFavorite == true) R.drawable.baseline_bookmark_24
                else R.drawable.baseline_bookmark_border_24
            )
            favoriteImageView.setOnClickListener {
                onFavoriteClick(event)
            }
        }
    }

    override fun getItemCount(): Int {
        return if (isLoading) 5 else super.getItemCount()
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setLoadingState(isLoading: Boolean) {
        this.isLoading = isLoading
        notifyDataSetChanged()
    }

    class ShimmerViewHolder(binding: ItemShimmerVerticalBinding) :
        RecyclerView.ViewHolder(binding.root)

    class MyViewHolder(val binding: ItemNormalVerticalBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(event: ArticleEntity) {
            binding.titleTextView.text = event.name
            binding.ownerTextView.text = event.ownerName
            Glide.with(binding.root.context)
                .load(event.imageLogo)
                .transform(RoundedCorners(16))
                .into(binding.imageView)
            itemView.setOnClickListener {
                val intent = Intent(binding.root.context, ArticleActivity::class.java)
                intent.putExtra("EXTRA_EVENT", event)
                binding.root.context.startActivity(intent)
            }
        }
    }

    companion object {
        private const val VIEW_TYPE_SHIMMER = 0
        private const val VIEW_TYPE_DATA = 1

        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<ArticleEntity>() {
            override fun areItemsTheSame(oldItem: ArticleEntity, newItem: ArticleEntity): Boolean {
                return oldItem.id == newItem.id
            }

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(oldItem: ArticleEntity, newItem: ArticleEntity): Boolean {
                return oldItem == newItem
            }
        }
    }

}

     */