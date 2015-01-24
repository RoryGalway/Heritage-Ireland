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

public class Altmont extends Activity {
	
	DatabaseHelper  databaseHelper;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.altamont);
		
		
		Button directions = (Button) findViewById(R.id.directions);
        directions.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	WebView web;
            	web = new WebViewHelper().webview(Altmont.this);
                // specify the URL we want to load
                web.loadUrl("http://maps.google.com/maps?saddr=Current%20Location&daddr=52.735844, -6.720746");
                setContentView(web);
             }
        });
			//	52.735844 -6.720746
        
        Button Fav = (Button) findViewById(R.id.add);
        Fav.setOnClickListener(new OnClickListener() {
        	
            public void onClick(View agrs) {
            	
            	String Altmont = "Altmont";
            	// Below is the adding to the db code
            	databaseHelper = new DatabaseHelper(Altmont.this, null,null, 1);
            	Products product = new Products(Altmont.toString());
            	databaseHelper.addProduct(product);

            	new AlertDialog.Builder( Altmont.this )
                .setIcon(R.drawable.favs)
                .setTitle( "Added to Favourites" )
                .setPositiveButton( "Awsome!!!", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Log.d( "AlertDialog", "Positive" );
                    }
                
                
                } )
                
                .show();
            
             }
        });
        
        
	}
}
