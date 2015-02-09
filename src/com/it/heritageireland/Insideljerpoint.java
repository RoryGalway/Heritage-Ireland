package com.it.heritageireland;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class Insideljerpoint extends Activity{
	DatabaseHelper  databaseHelper;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inside);
		
		Button directions = (Button) findViewById(R.id.directions);
		Button share = (Button) findViewById(R.id.share);
        Button fav = (Button) findViewById(R.id.add);
        directions.setOnClickListener(onClickListener);
        share.setOnClickListener(onClickListener);
        fav.setOnClickListener(onClickListener);
	}
	
	private OnClickListener onClickListener = new OnClickListener() {
	     
		public void onClick(View v){		
			switch(v.getId()){
			case R.id.share:
				Adare.Share(Insideljerpoint.this, "Jerpoint Abbey", "Cistercian Monastery");	
                break;
			case R.id.directions:
				WebView web;
            	web = new WebViewHelper().webview(Insideljerpoint.this);
                // specify the URL we want to load
            	 web.loadUrl("http://maps.google.com/maps?saddr=Current%20Location&daddr=52.510997, -7.158279");
                setContentView(web);
	               break;
			case R.id.add:
				String Altmont = "Insideljerpoint";
            	// Below is the adding to the db code
            	databaseHelper = new DatabaseHelper(Insideljerpoint.this, null,null, 1);
            	Products product = new Products(Altmont.toString());
            	databaseHelper.addProduct(product);
            	Adare.saved(Insideljerpoint.this);
	            break;
	            
			}     }
		};
	
	
}
	