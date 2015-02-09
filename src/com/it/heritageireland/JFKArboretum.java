package com.it.heritageireland;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class JFKArboretum extends Activity{
	DatabaseHelper  databaseHelper;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jfk);
		
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
				Adare.Share(JFKArboretum.this, "JFK Arboretum", "Garden");	
                break;
			case R.id.directions:
				WebView web;
            	web = new WebViewHelper().webview(JFKArboretum.this);
                // specify the URL we want to load
            	 web.loadUrl("http://maps.google.com/maps?saddr=Current%20Location&daddr=52.320914, -6.933714");
                setContentView(web);
	               break;
			case R.id.add:
				String Altmont = "JFKArboretum";
            	// Below is the adding to the db code
            	databaseHelper = new DatabaseHelper(JFKArboretum.this, null,null, 1);
            	Products product = new Products(Altmont.toString());
            	databaseHelper.addProduct(product);
            	Adare.saved(JFKArboretum.this);
	            break;
	            
			}     }
		};
	
	
}
	