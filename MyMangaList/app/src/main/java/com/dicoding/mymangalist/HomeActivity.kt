package com.dicoding.mymangalist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.mymangalist.DetailActivity.Companion.EXTRA_DETAIL
import com.dicoding.mymangalist.DetailActivity.Companion.EXTRA_IMAGE
import com.dicoding.mymangalist.DetailActivity.Companion.EXTRA_TITLE

class HomeActivity : AppCompatActivity() {
    private lateinit var rvManga: RecyclerView
    private var list: ArrayList<Manga> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvManga = findViewById(R.id.rv_mangas)
        rvManga.setHasFixedSize(true)

        list.addAll(MangaData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.user_info,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.user_info -> {
                val moveIntent = Intent (this@HomeActivity, AboutMeActivity::class.java)
                startActivity(moveIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerList() {
        rvManga.layoutManager = LinearLayoutManager(this)
        val listMangaAdapter = ListMangaAdapter(list)
        rvManga.adapter = listMangaAdapter

        listMangaAdapter.setOnItemClickCallback(object : ListMangaAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Manga) {
                showSelectedManga(data)
            }
        })
    }

    private fun showSelectedManga(manga: Manga) {
        Toast.makeText(this, "Kamu memilih " + manga.name, Toast.LENGTH_SHORT).show()
        val detail = Intent (this@HomeActivity, DetailActivity::class.java)
        detail.putExtra(EXTRA_TITLE, manga.name)
        detail.putExtra(EXTRA_DETAIL, manga.detail)
        detail.putExtra(EXTRA_IMAGE, manga.photo)
        startActivity(detail)
    }
}