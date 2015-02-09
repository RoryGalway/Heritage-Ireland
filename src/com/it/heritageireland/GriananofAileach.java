package com.it.heritageireland;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class GriananofAileach extends Activity{
	DatabaseHelper  databaseHelper;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grianan);
		
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
				Adare.Share(GriananofAileach.this, "Grianan of Aileach", "Structure stone ringfort");	
                break;
			case R.id.directions:
				WebView web;
            	web = new WebViewHelper().webview(GriananofAileach.this);
                // specify the URL we want to load
            	 web.loadUrl("http://maps.google.com/maps?saddr=Current%20Location&daddr=55.0166662, -7.4166667");
                setContentView(web);
	               break;
			case R.id.add:
				String Altmont = "GriananofAileach";
            	// Below is the adding to the db code
            	databaseHelper = new DatabaseHelper(GriananofAileach.this, null,null, 1);
            	Products product = new Products(Altmont.toString());
            	databaseHelper.addProduct(product);
            	Adare.saved(GriananofAileach.this);
	            break;
	            
			}     }
		};
	
	
}
	