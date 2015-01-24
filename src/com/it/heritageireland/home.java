package com.it.heritageireland;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class home extends ActionBarActivity {
	
	DatabaseHelper  databaseHelper;
	
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		
		databaseHelper = new DatabaseHelper(home.this, null,null, 1);
		
		Button directions = (Button) findViewById(R.id.map);

        directions.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(home.this, MainActivity.class);
                startActivity(intent);
                
             }
        });
			
       Button favourites = (Button) findViewById(R.id.favourites);
       
       favourites.setOnClickListener(new OnClickListener() {
           public void onClick(View v) {
               Intent intent = new Intent(home.this, Favourites.class);
               startActivity(intent);
               
               
            }
       });
        
       Button about = (Button) findViewById(R.id.about);

       about.setOnClickListener(new OnClickListener() {
           public void onClick(View v) {
               Intent intent = new Intent(home.this, About.class);
               startActivity(intent);
               
            }
       });
        
	}

}
