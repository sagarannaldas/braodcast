package com.example.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class BroadcastReceiverExample : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent != null) {
            if(Intent.ACTION_BOOT_COMPLETED == intent.action) {
                Toast.makeText(context, "Boot Completed", Toast.LENGTH_SHORT).show()
            }
            if (ConnectivityManager.CONNECTIVITY_ACTION == intent.action) {
                Toast.makeText(context, "Connectivity Changed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}