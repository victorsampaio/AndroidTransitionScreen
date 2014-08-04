package com.example.androidtransitionscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondScreen extends Activity {

	protected static final String CATEGORY = "info";
	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.activity_second_screen);
		
		// Show message using TextView
		//TextView view = new TextView(this);
		//view.setText("Second Screen Text");
		//setContentView(view);
				
		// Get parameters using Bundle
		Intent it = getIntent();
		if(it != null){
			Bundle params= it.getExtras();
			if(params!= null ){
				String msg = params.getString("msg");
				Log.i(CATEGORY,"Menssage 1: " + msg);
				
			}
		}	
		
		// Get parameters using Intent
		if (it != null){
			String msg2 = it.getStringExtra("msg2");
			Log.i(CATEGORY, "Menssage 2: " + msg2);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second_screen, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
