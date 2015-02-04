package com.it.heritageireland;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TopPlaces extends ActionBarActivity {
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.topplaces);
		
		// sets up the buttons & assigns onClickListener 
		Button b1 = (Button) findViewById(R.id.button1);
		Button b2 = (Button) findViewById(R.id.button2);
		Button b3 = (Button) findViewById(R.id.button3);
		Button b4 = (Button) findViewById(R.id.button4);
		
		b1.setOnClickListener(onClickListener);
		b2.setOnClickListener(onClickListener);
		b3.setOnClickListener(onClickListener);
		b4.setOnClickListener(onClickListener);
		
	}
	
	// onClickListener for buttons and image view.
	private OnClickListener onClickListener = new OnClickListener() {
	     
		public void onClick(View v){	
			
			switch(v.getId()){
			
			case R.id.button1:
				Intent intent = new Intent(TopPlaces.this, MainActivity.class);
                startActivity(intent);
                break;
			case R.id.button2:
				Intent intent2 = new Intent(TopPlaces.this, About.class);
	               startActivity(intent2); 
	               break;
			case R.id.button3:
				Intent intent3 = new Intent(TopPlaces.this, Favourites.class);
	            startActivity(intent3);
	            break;
			case R.id.button4:
				// Place holder - This needs to be changed to when topPlaces has been created.
				Intent intent4 = new Intent(TopPlaces.this, Favourites.class);
	            startActivity(intent4);
	            break;
		
			}
			
		}
	};
	
	

}
