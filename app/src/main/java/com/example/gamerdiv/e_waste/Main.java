package com.example.gamerdiv.e_waste;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Main extends Activity {
    Button b1 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.button1);

        b1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                startAlert();
            }
        });


    }   public void startAlert() {

        Intent intent = new Intent(this, MyBroadcastReceiver.class);

        PendingIntent pendingIntent = PendingIntent.getBroadcast(
                this.getApplicationContext(), 0, intent,0 );

        AlarmManager manager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        int interval = 1000*60*60*12;

        manager.setInexactRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(), interval, pendingIntent);
        Toast.makeText(this, "Notifications Starts", Toast.LENGTH_SHORT).show();

    }

    public void inf(View view) {
        Intent intent = new Intent(this , Informations.class);
        startActivity(intent);}

    public void stop(View view){

        Intent intent = new Intent(this, MyBroadcastReceiver.class);

        PendingIntent pendingIntent = PendingIntent.getBroadcast(
                this.getApplicationContext(), 0, intent,0 );
        AlarmManager manager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        manager.cancel(pendingIntent);
        Toast.makeText(this, "Notifications Stops", Toast.LENGTH_LONG).show();
    }

    public void thanks(View view){
        Intent intent = new Intent(this , Thanks.class);
        startActivity(intent);
    }

    public void madeBy(View view) {
        Intent intent = new Intent(this , MadeBy.class);
        startActivity(intent);
    }
}