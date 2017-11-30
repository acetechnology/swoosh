package com.arcadiamobiletv.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.arcadiamobiletv.swoosh.R
import com.arcadiamobiletv.swoosh.Utilities.EXTRA_LEAGUE
import com.arcadiamobiletv.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        var skill = intent.getStringExtra(EXTRA_SKILL)

        searchleaguestext.text = "Looking for $league $skill near you"
    }
}
