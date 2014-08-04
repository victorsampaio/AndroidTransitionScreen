package com.example.androidtransitionscreen;

//import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class TransitionScreen extends Activity implements OnClickListener{
	protected static final String CATEGORIA = "lifetime";
	
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
	
		// Send parameters using Bundle
		Intent it= new Intent(this, SecondScreen.class);
		Bundle params = new Bundle();
		params.putString("msg", "Hello - Bundle");
		it.putExtras(params);
		
		
		// Send parameters using Intent
		//Intent it2 = new Intent(this, SecondScreen.class);
		it.putExtra("msg2", "Hello - Intent");
		startActivity(it);	
	
	}
	
	protected void onStart(){
    	super.onStart();
    	Log.i(CATEGORIA, getClassName() + ".onStart() executed.");
    	
    }
    
    protected void onRestart(){
    	super.onRestart();
    	Log.i(CATEGORIA, getClassName() + ".onRestart() executed.");
    }

    protected void onResume(){
    	super.onResume();
    	Log.i(CATEGORIA, getClassName() + ".on Resume() executed.");
    }
    
    protected void onPause(){
    	super.onPause();
    	Log.i(CATEGORIA, getClassName() + ".onPause executed.");
    }
    
    protected void onStop(){
    	super.onStop();
    	Log.i(CATEGORIA, getClassName() + ".onStop() executed.");
    }
    
    protected void onDestroy(){
    	super.onDestroy();
    	Log.i(CATEGORIA, getClassName() + ".onDestroy() executed.");
    }
    

    private String getClassName() {
		String name = getClass().getName();
		return name.substring(name.lastIndexOf("."));
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
