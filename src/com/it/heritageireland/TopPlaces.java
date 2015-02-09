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
		Button b5 = (Button) findViewById(R.id.button5);
		Button b6 = (Button) findViewById(R.id.button6);
		Button b7 = (Button) findViewById(R.id.button7);
		
		b1.setOnClickListener(onClickListener);
		b2.setOnClickListener(onClickListener);
		b3.setOnClickListener(onClickListener);
		b4.setOnClickListener(onClickListener);
		b5.setOnClickListener(onClickListener);
		b6.setOnClickListener(onClickListener);
		b7.setOnClickListener(onClickListener);
		
	}
	
	// onClickListener for buttons and image view.
	private OnClickListener onClickListener = new OnClickListener() {
	     
		public void onClick(View v){	
			
			switch(v.getId()){
			
			case R.id.button1:
				Intent intent = new Intent(TopPlaces.this, Rock_Of_Cashel.class);
                startActivity(intent);
                break;
			case R.id.button2:
				Intent intent2 = new Intent(TopPlaces.this, Newgrange.class);
	               startActivity(intent2); 
	               break;
			case R.id.button3:
				Intent intent3 = new Intent(TopPlaces.this, GriananofAileach.class);
	            startActivity(intent3);
	            break;
			case R.id.button4:
				// Place holder - This needs to be changed to when topPlaces has been created.
				Intent intent4 = new Intent(TopPlaces.this, Coole.class);
	            startActivity(intent4);
	            break;
			case R.id.button5:
				// Place holder - This needs to be changed to when topPlaces has been created.
				Intent intent5 = new Intent(TopPlaces.this, Ardfert.class);
	            startActivity(intent5);
	            break;
			case R.id.button6:
				// Place holder - This needs to be changed to when topPlaces has been created.
				Intent intent6 = new Intent(TopPlaces.this, GlendaLough.class);
	            startActivity(intent6);
	            break;
			case R.id.button7:
				// Place holder - This needs to be changed to when topPlaces has been created.
				Intent intent7 = new Intent(TopPlaces.this, Altmont.class);
	            startActivity(intent7);
	            break;
		
			}
			
		}
	};
	
	

}
