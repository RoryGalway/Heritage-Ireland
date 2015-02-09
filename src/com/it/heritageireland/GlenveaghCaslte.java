package com.it.heritageireland;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class GlenveaghCaslte extends Activity{
	DatabaseHelper  databaseHelper;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.glenveagh);
		
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
				Adare.Share(GlenveaghCaslte.this, "Glenveagh Caslte", "1870 Castle and Park");	
                break;
			case R.id.directions:
				WebView web;
            	web = new WebViewHelper().webview(GlenveaghCaslte.this);
                // specify the URL we want to load
            	 web.loadUrl("http://maps.google.com/maps?saddr=Current%20Location&daddr=55.008343, -7.98674");
                setContentView(web);
	               break;
			case R.id.add:
				String Altmont = "GlenveaghCaslte";
            	// Below is the adding to the db code
            	databaseHelper = new DatabaseHelper(GlenveaghCaslte.this, null,null, 1);
            	Products product = new Products(Altmont.toString());
            	databaseHelper.addProduct(product);
            	Adare.saved(GlenveaghCaslte.this);
	            break;
	            
			}     }
		};
	
	
}
	