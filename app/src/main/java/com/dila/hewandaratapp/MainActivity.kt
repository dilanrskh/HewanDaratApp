package com.dila.hewandaratapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.dila.hewandaratapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        hewanDarat()
    }

    private fun hewanDarat() {
        val namaHewan = arrayOf("Ayam", "Burung Unta", "Dinosaurus", "Domba", "Hamster", "Kambing", "Kangguru", "Kelinci", "Kucing", "Kuda", "Monyet", "Panda", "Rusa", "Sapi", "Ular")

        val gambarHewan = arrayOf(
            R.drawable.ayam,
            R.drawable.burungunta,
            R.drawable.dinosaurus,
            R.drawable.domba,
            R.drawable.hamster,
            R.drawable.kambing,
            R.drawable.kangguru,
            R.drawable.kelinci,
            R.drawable.kucing,
            R.drawable.kuda,
            R.drawable.monyet,
            R.drawable.panda,
            R.drawable.rusa,
            R.drawable.sapi,
            R.drawable.ular,
        )

        val suaraIndo = arrayOf(
            R.raw.ayam,
            R.raw.burungunta,
            R.raw.dinosaurus,
            R.raw.domba,
            R.raw.hamster,
            R.raw.kambing,
            R.raw.kangguru,
            R.raw.kelinci,
            R.raw.kucing,
            R.raw.kuda,
            R.raw.monyet,
            R.raw.panda,
            R.raw.rusa,
            R.raw.sapi,
            R.raw.ular,
        )

        val suaraEng = arrayOf(
            R.raw.chicken,
            R.raw.ostrich,
            R.raw.dinosaur,
            R.raw.sheep,
            R.raw.hamster,
            R.raw.goat,
            R.raw.kangaroo,
            R.raw.rabbit,
            R.raw.cat,
            R.raw.horse,
            R.raw.monkey,
            R.raw.panda,
            R.raw.deer,
            R.raw.cow,
            R.raw.snake,
        )

        val AnimalAdapter = AnimalAdapter(namaHewan, gambarHewan, suaraIndo, suaraEng)
        binding.rvAnimal.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = AnimalAdapter
        }
    }
}