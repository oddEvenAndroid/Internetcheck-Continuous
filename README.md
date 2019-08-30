# Internetcheck-Continuous

Add Code in your Activity to check internet on or off in your App

```java

@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Add this code for Register BroadcastReceiver for check internet on off
		this.registerReceiver(new NetworkChangeReceiver(),
				new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
	}

```
