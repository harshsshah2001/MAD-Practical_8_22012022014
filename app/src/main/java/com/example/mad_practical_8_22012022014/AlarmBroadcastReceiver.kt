package com.example.mad_practical_8_22012022014

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mad_practical_8_22012022014.R.layout.activity_alarm_broadcast_receiver

class AlarmBroadcastReceiver : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_alarm_broadcast_receiver)
        companion object{
            val ALARM_KEY = "key" val ALARM_START = "start" val ALARM_STOP = "stop"
        }
        override fun onReceive(context: Context, intent: Intent) {
// This method is called when the BroadcastReceiver is receiving an Intent broadcast.

            val ALARM_KEY = ""
            val DATA = intent.getStringExtra(ALARM_KEY)
            val intentservice = Intent(context,AlarmService::class.java) if(DATA == ALARM_START){
                context.startService(intentservice)
            }
            else{
                context.startService(intentservice)
            }
        }

    }

}
}