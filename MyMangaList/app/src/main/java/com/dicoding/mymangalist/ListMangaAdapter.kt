package com.dicoding.mymangalist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMangaAdapter(private val listManga: ArrayList<Manga>) : RecyclerView.Adapter<ListMangaAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_manga, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val manga = listManga[position]
        Glide.with(holder.itemView.context)
            .load(manga.photo)
            .apply(RequestOptions().override(80, 100))
            .into(holder.imgPhoto)
        holder.tvName.text = manga.name
        holder.tvDetail.text = manga.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listManga[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listManga.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Manga)
    }

}