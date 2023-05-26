package com.rebecca.twitterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rebecca.twitterclone.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
    }
    fun displayTweets(){
        val tweet1=TweetData("","peace","hghjkkfh","fdddfdg",6,9,5)
        val tweet2=TweetData("","hjhfhjf","hghjkkfh","fdddfdg",6,9,5)
        val tweetList= listOf(tweet1,tweet2)
        val twtAdapter=TweeterAdapter(tweetList)
        binding.rvTweets.layoutManager=LinearLayoutManager(this)
        binding.rvTweets.adapter=twtAdapter

    }
}