package com.it.heritageireland;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class KilkennyCastle extends Activity{
	DatabaseHelper  databaseHelper;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kilkenny);
		
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
				Adare.Share(KilkennyCastle.this, "Kilkenny Castle", "Castle and Parklands");	
                break;
			case R.id.directions:
				WebView web;
            	web = new WebViewHelper().webview(KilkennyCastle.this);
                // specify the URL we want to load
            	 web.loadUrl("http://maps.google.com/maps?saddr=Current%20Location&daddr=52.650462, -7.249298");
                setContentView(web);
	               break;
			case R.id.add:
				String Altmont = "KilkennyCastle";
            	// Below is the adding to the db code
            	databaseHelper = new DatabaseHelper(KilkennyCastle.this, null,null, 1);
            	Products product = new Products(Altmont.toString());
            	databaseHelper.addProduct(product);
            	Adare.saved(KilkennyCastle.this);
	            break;
	            
			}     }
		};
	
	
}
	