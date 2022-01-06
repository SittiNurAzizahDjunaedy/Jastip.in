package com.example.jastpin.data

import com.example.jastpin.R
import com.example.jastpin.model.ModelCemilan

object DataCemilan {

    private val cemilanNames = arrayOf(
        "Kuping Gajah berwarna",
        "Kcanag Polong Campur",
        "Keripik Singkong",
        "Keripik Pisang",
        "Keripik Tempe",
        "Keripik Talas",
        "Keripik Kentang",
        "Kacang Disko",)

    private val cemilanSub = arrayOf(
        "Strawberry,Coklat,Vanila",
        "Tepung,Pedas,Hijau,",
        "Pedas balado manis",
        "Original",
        "Sagu",
        "Pedas",
        "Original",
        "Original",
    )

    private val cemilanHarga = arrayOf(
        "Rp. 30.000",
        "Rp. 20.000",
        "Rp. 25.000",
        "Rp. 40.000",
        "Rp. 30.500",
        "Rp. 38.000",
        "Rp. 42.000",
        "Rp. 42.000",
    )

    private val cemilanDeskripsi = arrayOf(
        "Kue kuping gajah memiliki tampilan unik dan cukup menantang, kuping gajah merupakan salah satu kue tradisional indonesia sebagai resep kue peninggalan leluhur.",
        "desc",
        "desc",
        "desc",
        "desc",
        "desc",
        "desc",
        "desc",
    )

    private val cemilanImages = intArrayOf(
        R.drawable.kuping_gajah,
        R.drawable.kacang_polong,
        R.drawable.kripik_singkong,
        R.drawable.kripik_pisang,
        R.drawable.kripik_tempe,
        R.drawable.kriprik_talas,
        R.drawable.krirpik_kentang,
        R.drawable.kacang_disko,)

    val listData: ArrayList<ModelCemilan>
        get() {
            val list = arrayListOf<ModelCemilan>()
            for (position in cemilanNames.indices) {
                val data = ModelCemilan()
                data.cemilanName = cemilanNames[position]
                data.cemilanSub = cemilanSub[position]
                data.cemilanHarga = cemilanHarga[position]
                data.cemilanPhoto = cemilanImages[position]
                data.cemilanDesc = cemilanDeskripsi[position]
                list.add(data)
            }
            return list
        }
}