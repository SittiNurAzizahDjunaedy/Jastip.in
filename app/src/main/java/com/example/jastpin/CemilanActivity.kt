package com.example.jastpin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jastpin.data.DataCemilan
import com.example.jastpin.model.ModelCemilan

class CemilanActivity : AppCompatActivity() {
//
//    var list: ArrayList<ModelCemilan> = arrayListOf()
//    var rvCemilan : RecyclerView = findViewById(R.id.rv_cemilan)

    private lateinit var rvCemilan: RecyclerView
    private var list: ArrayList<ModelCemilan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cemilan)

        rvCemilan = findViewById(R.id.rv_cemilan)
        rvCemilan.setHasFixedSize(true)

        list.addAll(DataCemilan.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvCemilan.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = CemilanAdapter(list)
        rvCemilan.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : CemilanAdapter.OnItemClickCallback {
            override fun onItemClicked(data: ModelCemilan) {
                showSelectedCemilan(data)
            }
        })
    }
    private fun showSelectedCemilan(cemilan: ModelCemilan) {
        Toast.makeText(this, "Kamu memilih " + cemilan.cemilanName, Toast.LENGTH_SHORT).show()

        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("title", cemilan.cemilanName)
            putExtra("subtitle", cemilan.cemilanSub)
            putExtra("harga", cemilan.cemilanHarga)
            putExtra("gambar", cemilan.cemilanPhoto)
            putExtra("desc", cemilan.cemilanDesc)
        }
        startActivity(intent)
    }
}