package com.arcadiamobiletv.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }

    fun mensBtnClicked(view: View){

        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "Mens"
    }

    fun womensBtnClicked(view: View){

        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "Womens"
    }


    fun coedBtnClicked(view: View){
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        selectedLeague = "Coed"

    }

    fun leagueNextClicked(view: View){
    if (selectedLeague != "") {
    val skillActivity = Intent(this, SkillActivity::class.java)
        skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
        startActivity(skillActivity)

    }else {
        Toast.makeText(this, "Please select a league", Toast.LENGTH_LONG).show()
    }


    }
}
