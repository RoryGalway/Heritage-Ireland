package com.it.heritageireland;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class Desmond extends Activity{

	DatabaseHelper  databaseHelper;
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.desomnd);
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
				Adare.Share(Desmond.this, "Desmond Castle","Tower House");	
                break;
			case R.id.directions:
				WebView web;
            	web = new WebViewHelper().webview(Desmond.this);
                // specify the URL we want to load
            	web.loadUrl("http://maps.google.com/maps?saddr=Current%20Location&daddr=51.70726, -8.524691");
                setContentView(web);
	               break;
			case R.id.add:
				String Altmont = "Desmond";
            	// Below is the adding to the db code
            	databaseHelper = new DatabaseHelper(Desmond.this, null,null, 1);
            	Products product = new Products(Altmont.toString());
            	databaseHelper.addProduct(product);
            	Adare.saved(Desmond.this);
	            break;
	            
			}     }
		};
	
	
	
	
	
	
	
}