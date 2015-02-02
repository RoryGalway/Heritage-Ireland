package com.it.heritageireland;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class BoyleAbbey extends Activity {
	
	DatabaseHelper  databaseHelper;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.boyleabbey);
		
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
				Adare.Share(BoyleAbbey.this, "Boyle Abbey","Cistercian Monastery");	
                break;
			case R.id.directions:
				WebView web;
            	web = new WebViewHelper().webview(BoyleAbbey.this);
                // specify the URL we want to load
                web.loadUrl("http://maps.google.com/maps?saddr=Current%20Location&daddr=53.973559, -8.296974");
                setContentView(web);
	               break;
			case R.id.add:
				String Altmont = "BoyleAbbey";
            	// Below is the adding to the db code
            	databaseHelper = new DatabaseHelper(BoyleAbbey.this, null,null, 1);
            	Products product = new Products(Altmont.toString());
            	databaseHelper.addProduct(product);
            	Adare.saved(BoyleAbbey.this);
	            break;
	            
			}     }
		};
	
	
}
