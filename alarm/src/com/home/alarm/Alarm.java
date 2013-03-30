package com.home.alarm;

import android.app.Activity;
import android.app.AlarmManager;
import android.os.Bundle;
import android.view.Menu;

public class Alarm extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        
        configureAlarm();
    }

    private void configureAlarm() {
    	AlarmManager service = (AlarmManager) getSystemService(ALARM_SERVICE);
//    	service.setRepeating(, triggerAtTime, interval, operation)
		
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_alarm, menu);
        return true;
    }
}
