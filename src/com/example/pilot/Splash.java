package com.example.pilot;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Splash extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Thread timer=new Thread(){
			public void run(){
			try{
				sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			finally{
				Intent themax=new Intent("com.example.pilot.HOME");
				startActivity(themax);
			}
			}
			
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	
		finish();
	}
	}


	

