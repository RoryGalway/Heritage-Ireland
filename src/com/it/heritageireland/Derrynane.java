package com.it.heritageireland;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class Derrynane extends Activity {
	
	DatabaseHelper  databaseHelper;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.derrynane);
		
        Button share = (Button) findViewById(R.id.share);
        Button directions = (Button) findViewById(R.id.directions);
        Button fav = (Button) findViewById(R.id.add);
        share.setOnClickListener(onClickListener);
        directions.setOnClickListener(onClickListener);
        fav.setOnClickListener(onClickListener);         
	}
	
	private OnClickListener onClickListener = new OnClickListener() {
	     
		public void onClick(View v){		
			switch(v.getId()){
			case R.id.share:
				Adare.Share(Derrynane.this, "Derrynane House","National Monument");	
                break;
			case R.id.directions:
				WebView web;
            	web = new WebViewHelper().webview(Derrynane.this);
                // specify the URL we want to load
                web.loadUrl("http://maps.google.com/maps?saddr=Current%20Location&daddr=51.762402, -10.1306");
                setContentView(web);
	               break;
			case R.id.add:
				String Altmont = "Derrynane";
            	// Below is the adding to the db code
            	databaseHelper = new DatabaseHelper(Derrynane.this, null,null, 1);
            	Products product = new Products(Altmont.toString());
            	databaseHelper.addProduct(product);
            	Adare.saved(Derrynane.this);
	            break;
	            
			}     }
		};
	
	
}
