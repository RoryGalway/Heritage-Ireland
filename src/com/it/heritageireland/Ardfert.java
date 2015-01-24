package com.it.heritageireland;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class Ardfert extends Activity{
	
	DatabaseHelper  databaseHelper;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ardfert);
		Button directions = (Button) findViewById(R.id.directions);
        directions.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	WebView web;
            	web = new WebViewHelper().webview(Ardfert.this);
                // specify the URL we want to load
                web.loadUrl("http://maps.google.com/maps?saddr=Current%20Location&daddr=52.328601, -9.7816633");
                setContentView(web);
             }
        });
			//	52.328601 -9.7816633
        
        Button Fav = (Button) findViewById(R.id.add);
        Fav.setOnClickListener(new OnClickListener() {
        	
            public void onClick(View agrs) {
            	String Ardfert = "Ardfert";
            	// Below is the adding to the db code
            	databaseHelper = new DatabaseHelper(Ardfert.this, null,null, 1);
            	Products product = new Products(Ardfert.toString());
            	databaseHelper.addProduct(product);
            	new AlertDialog.Builder( Ardfert.this )
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