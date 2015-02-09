package com.it.heritageireland;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class GarnishIsland extends Activity{
	DatabaseHelper  databaseHelper;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.garnish);
		
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
				Adare.Share(GarnishIsland.this, "Garnish Island", "Glengarriff Harbour");	
                break;
			case R.id.directions:
				WebView web;
            	web = new WebViewHelper().webview(GarnishIsland.this);
                // specify the URL we want to load
            	 web.loadUrl("http://maps.google.com/maps?saddr=Current%20Location&daddr=51.7355755, -9.5431059");
                setContentView(web);
	               break;
			case R.id.add:
				String Altmont = "GarnishIsland";
            	// Below is the adding to the db code
            	databaseHelper = new DatabaseHelper(GarnishIsland.this, null,null, 1);
            	Products product = new Products(Altmont.toString());
            	databaseHelper.addProduct(product);
            	Adare.saved(GarnishIsland.this);
	            break;
	            
			}     }
		};
	
	
}
	