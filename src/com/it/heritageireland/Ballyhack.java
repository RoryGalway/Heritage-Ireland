package com.it.heritageireland;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class Ballyhack extends Activity {
	
	DatabaseHelper  databaseHelper;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ballyhack);
		
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
				Adare.Share(Ballyhack.this, "Ballyhack Castle","15th-century Knights Hospitallers");	
                break;
			case R.id.directions:
				WebView web;
            	web = new WebViewHelper().webview(Ballyhack.this);
                // specify the URL we want to load
                web.loadUrl("http://maps.google.com/maps?saddr=Current%20Location&daddr=52.248475, -6.964192");
                setContentView(web);
	               break;
			case R.id.add:
				String Altmont = "Ballyhack";
            	// Below is the adding to the db code
            	databaseHelper = new DatabaseHelper(Ballyhack.this, null,null, 1);
            	Products product = new Products(Altmont.toString());
            	databaseHelper.addProduct(product);
            	Adare.saved(Ballyhack.this);
	            break;
	            
			}     }
		};
	
	
}
