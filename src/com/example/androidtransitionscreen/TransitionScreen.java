package com.example.androidtransitionscreen;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class TransitionScreen extends Activity implements OnClickListener{

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_transition_screen);
        
        //Button nextScreen;
        //nextScreen = (Button)findViewById(R.id.buttonNext);
        
        Button b = new Button(this);
        b.setText("Click aqui");
        b.setOnClickListener(this);
        setContentView(b);
    }


	@Override
	public void onClick(View v) {
		Intent it= new Intent(this, SecondScreen.class);
		startActivity(it);
		
	
	}
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.transition_screen, menu);
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
