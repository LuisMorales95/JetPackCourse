package com.luiz.jetpackcourse.navigationComponentChallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.luiz.jetpackcourse.R
import com.luiz.jetpackcourse.databinding.ActivityNavigationBinding
import com.luiz.jetpackcourse.databinding.ActivityNavigationChallengeBinding

class NavigationChallengeActivity : AppCompatActivity() {

    private lateinit var binding : ActivityNavigationChallengeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_navigation_challenge)
    }
}
