package com.it.heritageireland;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class Barryscourt  extends Activity {
	
	DatabaseHelper  databaseHelper;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.barryscourt);
		
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
				Adare.Share(Barryscourt.this, "Barryscourt Castle","15th to 16th century Castle");	
                break;
			case R.id.directions:
				WebView web;
            	web = new WebViewHelper().webview(Barryscourt.this);
                // specify the URL we want to load
                web.loadUrl("http://maps.google.com/maps?saddr=Current%20Location&daddr=51.904604, -8.259016");
                setContentView(web);
	               break;
			case R.id.add:
				String Altmont = "Barryscourt";
            	// Below is the adding to the db code
            	databaseHelper = new DatabaseHelper(Barryscourt.this, null,null, 1);
            	Products product = new Products(Altmont.toString());
            	databaseHelper.addProduct(product);
            	Adare.saved(Barryscourt.this);
	            break;
	            
			}     }
		};
	
	
}

