package com.example.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class BroadcastReceiverExample : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent != null) {
            if (Intent.ACTION_BOOT_COMPLETED == intent.action) {
                Toast.makeText(context, "Boot Completed", Toast.LENGTH_SHORT).show()
            }

            if (ConnectivityManager.EXTRA_NO_CONNECTIVITY == intent.action) {
                Toast.makeText(context, "Internet Disconnected", Toast.LENGTH_SHORT).show()
            }

            if ("com.example.broadcastreceivers.CUSTOM_ACTION" == intent.action) {
                val receivedString =
                    intent.getStringExtra("com.example.broadcastreceivers.EXTRA_TEXT")
                Toast.makeText(context, "$receivedString", Toast.LENGTH_SHORT).show()
            }
        }
    }
}