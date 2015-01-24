package com.it.heritageireland;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;

public class Adare extends Activity{
	
	DatabaseHelper  databaseHelper;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		LayoutInflater inflater = (LayoutInflater) getActionBar()
	            .getThemedContext().getSystemService(LAYOUT_INFLATER_SERVICE);
	    View customActionBarView = inflater.inflate(R.layout.actionbar_custom, null);
	    ActionBar actionBar = getActionBar();
	   actionBar.setTitle("Hidden Ireland");
	  
	    actionBar.setDisplayOptions(
	    	
	            ActionBar.DISPLAY_SHOW_CUSTOM,
	            ActionBar.DISPLAY_SHOW_CUSTOM | ActionBar.DISPLAY_SHOW_HOME
	                    | ActionBar.DISPLAY_SHOW_TITLE);
	    
	    	
	    actionBar.setCustomView(customActionBarView,
	            new ActionBar.LayoutParams(
	                    ViewGroup.LayoutParams.MATCH_PARENT,
	                    ViewGroup.LayoutParams.MATCH_PARENT));
		
		
		setContentView(R.layout.stone);
		Button directions = (Button) findViewById(R.id.directions);
        directions.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	WebView web;
            	web = new WebViewHelper().webview(Adare.this);
                // specify the URL we want to load
                web.loadUrl("http://maps.google.com/maps?saddr=Current%20Location&daddr=52.5651667, -8.7895846");
                setContentView(web);
             }
        });
			//	52.5651667 -8.7895846
        
        Button Fav = (Button) findViewById(R.id.add);
        Fav.setOnClickListener(new OnClickListener() {
        	
            public void onClick(View agrs) {
            	String Adare = "Adare";
            	// Below is the adding to the db code
            	databaseHelper = new DatabaseHelper(Adare.this, null,null, 1);
            	Products product = new Products(Adare.toString());
            	databaseHelper.addProduct(product);
            	new AlertDialog.Builder( Adare.this )
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
        
        
        Button share = (Button) findViewById(R.id.share);
    	share.setOnClickListener(new OnClickListener(){
		@Override
		public void onClick(View v) {
			
			Share("Adare Castle","Medieval fortified castle in County Limerick");
			
		}
    	
    	
    });
        
        
	}
	public void Share(String name, String body){
		Intent intent = new Intent(android.content.Intent.ACTION_SEND);
		intent.setAction(Intent.ACTION_SEND);
		
		intent.setType("text/plain");
		intent.putExtra(Intent.EXTRA_TEXT, name + "  " + body);
		startActivity(Intent.createChooser(intent, "Share"));
		
	}
	
	
}