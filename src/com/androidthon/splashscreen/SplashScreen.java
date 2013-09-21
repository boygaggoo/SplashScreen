package com.androidthon.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		
		Thread myThread = new Thread(){
			public void run(){
				try {
					/* splash screen will show for 6 seconds*/
					sleep(6000);
					finish();
					/* after showing the splash screen,
					 *  the MainActivity will be started through an intent */					
					Intent main = new Intent(SplashScreen.this, MainActivity.class);
					startActivity(main);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		myThread.start();
	}
	
	

}
