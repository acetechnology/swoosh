package com.arcadiamobiletv.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import com.arcadiamobiletv.swoosh.Model.Player
import com.arcadiamobiletv.swoosh.R
import com.arcadiamobiletv.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }

    fun mensBtnClicked(view: View){

        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "Mens"
    }

    fun womensBtnClicked(view: View){

        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "Womens"
    }


    fun coedBtnClicked(view: View){
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        player.league = "Coed"

    }

    fun leagueNextClicked(view: View){
    if (player.league != "") {
    val skillActivity = Intent(this, SkillActivity::class.java)
        skillActivity.putExtra(EXTRA_PLAYER, player)
        startActivity(skillActivity)

    }else {
        Toast.makeText(this, "Please select a league", Toast.LENGTH_LONG).show()
    }


    }
}
