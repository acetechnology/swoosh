package com.arcadiamobiletv.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.arcadiamobiletv.swoosh.Model.Player
import com.arcadiamobiletv.swoosh.R
import com.arcadiamobiletv.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchleaguestext.text = "Looking for ${player.league} ${player.skill} near you"
    }
}
