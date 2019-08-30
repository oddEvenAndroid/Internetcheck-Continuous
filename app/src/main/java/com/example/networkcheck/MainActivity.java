package com.example.networkcheck;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		this.registerReceiver(new NetworkChangeReceiver(),
				new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
	}

}
