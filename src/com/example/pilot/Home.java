package com.example.pilot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

@SuppressWarnings("deprecation")
public class Home extends ActionBarActivity {

	DrawerLayout mDrawerlayout;
	ListView mDrawerList;
	ActionBarDrawerToggle mDrawerToggle;
	String mTitle = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		
		mTitle=(String) getTitle();
		mDrawerlayout=(DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerList=(ListView) findViewById(R.id.drawer_list);
		mDrawerToggle=new ActionBarDrawerToggle(this, mDrawerlayout,R.drawable.ic_launcher,R.string.drawer_open, R.string.drawer_close){

			@Override
			public void onDrawerClosed(View drawerView) {
				// TODO Auto-generated method stub
				getActionBar().setTitle(mTitle);
				invalidateOptionsMenu();
				
			}

			@Override
			public void onDrawerOpened(View drawerView) {
				// TODO Auto-generated method stub
				getActionBar().setTitle("select a member");
				invalidateOptionsMenu();
			}
			
			
			
		};
			mDrawerlayout.setDrawerListener(mDrawerToggle);
			ArrayAdapter<String> adapter=new ArrayAdapter<String>(getBaseContext(),R.layout.drawer_list_item,getResources().getStringArray(R.array.members));
		mDrawerList.setAdapter(adapter);
		
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		mDrawerList.setOnItemClickListener(new OnItemClickListener))
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.aboutus) {
			Intent i = new Intent("com.example.pilot.ABOUT");
			startActivity(i);
		}
		return false;
	}

}
