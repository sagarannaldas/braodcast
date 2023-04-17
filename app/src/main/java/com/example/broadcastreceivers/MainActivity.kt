package com.example.broadcastreceivers

import android.content.IntentFilter
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private val broadcastReceiverExample = BroadcastReceiverExample()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentFilter = IntentFilter("com.example.broadcastreceivers.CUSTOM_ACTION")
        registerReceiver(broadcastReceiverExample, intentFilter)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(broadcastReceiverExample)
    }
}
