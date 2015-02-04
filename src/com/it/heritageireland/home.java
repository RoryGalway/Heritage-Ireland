package com.it.heritageireland;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class home extends ActionBarActivity {
	
	DatabaseHelper  databaseHelper;
	
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		
		// creates the dataabse
		databaseHelper = new DatabaseHelper(home.this, null,null, 1);
		
		// sets up the buttons & assigns onClickListener 
		Button directions = (Button) findViewById(R.id.map);
		Button favourites = (Button) findViewById(R.id.favourites);
		Button topPlaces = (Button) findViewById(R.id.topPlaces);
		Button about = (Button) findViewById(R.id.about);
		ImageView img = (ImageView) findViewById(R.id.imageView1);
		directions.setOnClickListener(onClickListener);
		favourites.setOnClickListener(onClickListener);
		topPlaces.setOnClickListener(onClickListener);
		about.setOnClickListener(onClickListener);
		img.setOnClickListener(onClickListener);
     
	}
	
	// onClickListener for buttons and image view.
	private OnClickListener onClickListener = new OnClickListener() {
	     
		public void onClick(View v){	
			
			switch(v.getId()){
			
			case R.id.map:
				Intent intent = new Intent(home.this, MainActivity.class);
                startActivity(intent);
                break;
			case R.id.about:
				Intent intent2 = new Intent(home.this, About.class);
	               startActivity(intent2); 
	               break;
			case R.id.favourites:
				Intent intent3 = new Intent(home.this, Favourites.class);
	            startActivity(intent3);
	            break;
			case R.id.topPlaces:
				// Place holder - This needs to be changed to when topPlaces has been created.
				Intent intent4 = new Intent(home.this, TopPlaces.class);
	            startActivity(intent4);
	            break;
			case R.id.imageView1:
				Intent intent5 = new Intent(home.this, MainActivity.class);
	               startActivity(intent5);
	               break;
			}
			
		}
	};
	
	

}
