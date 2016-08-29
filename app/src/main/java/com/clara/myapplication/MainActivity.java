package com.clara.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.d("HELLO", "This is a test");

		Button timeButton = (Button) findViewById(R.id.button);
		timeButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String currentTime = new Date().toString();
				Toast.makeText(MainActivity.this, "The time is " + currentTime, Toast.LENGTH_LONG).show();
			}
		});
	}
}
