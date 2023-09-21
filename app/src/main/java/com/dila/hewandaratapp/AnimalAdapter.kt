package com.dila.hewandaratapp

import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimalAdapter (
    val namaHewan: Array<String>,
    val gambarHewan: Array<Int>,
    val suaraIndo: Array<Int>,
    val suaraEng: Array<Int>
    ) : RecyclerView.Adapter<AnimalAdapter.AnViewHolder>() {

    class AnViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNamaHewan = view.findViewById<TextView>(R.id.tv_nama_animal)
        val ivGambarHewan = view.findViewById<ImageView>(R.id.iv_animal)
        val suaraIndo = view.findViewById<Button>(R.id.btn_indo)
        val suaraEng = view.findViewById<Button>(R.id.btn_eng)
    }

//    Manggil Layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalAdapter.AnViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row_animal, parent, false)
        return  AnViewHolder(view)
    }


//    penempatan data di View sesuai dengan urutan datanya
    override fun onBindViewHolder(holder: AnimalAdapter.AnViewHolder, position: Int) {
        holder.tvNamaHewan.text = namaHewan[position]
        holder.ivGambarHewan.setImageResource(gambarHewan[position])
        holder.suaraIndo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(holder.suaraIndo.context, suaraIndo[position])
            mediaPlayer.start()
        }

        holder.suaraEng.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(holder.suaraEng.context, suaraEng[position])
            mediaPlayer.start()
        }
    }

//    Data yang dikembalikan

    override fun getItemCount(): Int {
        return namaHewan.size
    }

}