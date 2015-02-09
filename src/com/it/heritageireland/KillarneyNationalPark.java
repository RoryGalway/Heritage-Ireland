package com.it.heritageireland;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class KillarneyNationalPark extends Activity{
	DatabaseHelper  databaseHelper;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.killarneynational);
		
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
				Adare.Share(KillarneyNationalPark.this, "Killarney National Park", "Parklands");	
                break;
			case R.id.directions:
				WebView web;
            	web = new WebViewHelper().webview(KillarneyNationalPark.this);
                // specify the URL we want to load
            	 web.loadUrl("http://maps.google.com/maps?saddr=Current%20Location&daddr=52.005845, -9.55618");
                setContentView(web);
	               break;
			case R.id.add:
				String Altmont = "KillarneyNationalPark";
            	// Below is the adding to the db code
            	databaseHelper = new DatabaseHelper(KillarneyNationalPark.this, null,null, 1);
            	Products product = new Products(Altmont.toString());
            	databaseHelper.addProduct(product);
            	Adare.saved(KillarneyNationalPark.this);
	            break;
	            
			}     }
		};
	
	
}
	