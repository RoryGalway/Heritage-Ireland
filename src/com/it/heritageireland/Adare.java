package com.it.heritageireland;

import com.facebook.UiLifecycleHelper;
import com.facebook.widget.FacebookDialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

// This class contains all the pop ups and share dialogs for the other classes

public class Adare extends Activity{
	
	// url for facebook dialog
	static String appurl = "http://www.amazon.com/s?ie=UTF8&field-brandtextbin=Derek%20McAuley&page=1&rh=n%3A2350149011";
	
	DatabaseHelper  databaseHelper;
	private static UiLifecycleHelper uiHelper;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stone);
		
		uiHelper = new UiLifecycleHelper(this, null);
	    uiHelper.onCreate(savedInstanceState);
		
		
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
            	saved(Adare.this);
             }
        });
        
        
        Button share = (Button) findViewById(R.id.share);
    	share.setOnClickListener(new OnClickListener(){
		@Override
		public void onClick(View v) {
			Share(Adare.this, "Adare Castle","Medieval fortified castle in County Limerick");			
		}   	
    });
             
	}
	
	public static void Share(Activity a, String name, String body){

		try{
			
		FacebookDialog shareDialog = new FacebookDialog.ShareDialogBuilder(a)
		.setLink(appurl)
	    .setName("Check out this get place on the Hidden Ireland app")
//	    .setCaption("Hello Facebook")
//        .setApplicationName("Hidden Ireland")
//        .setPicture("https://drive.google.com/file/d/0ByycdEPHqbpKNzctYWliOUhHMW8/view?usp=sharing")
        .build();
		uiHelper.trackPendingDialogCall(shareDialog.present());
		
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    super.onActivityResult(requestCode, resultCode, data);

	    uiHelper.onActivityResult(requestCode, resultCode, data, new FacebookDialog.Callback() {
	        @Override
	        public void onError(FacebookDialog.PendingCall pendingCall, Exception error, Bundle data) {
	            Log.e("Activity", String.format("Error: %s", error.toString()));
	        }

	        @Override
	        public void onComplete(FacebookDialog.PendingCall pendingCall, Bundle data) {
	            Log.i("Activity", "Success!");
	        }
	    });
	}
	
	@Override
	protected void onResume() {
	    super.onResume();
	    uiHelper.onResume();
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
	    super.onSaveInstanceState(outState);
	    uiHelper.onSaveInstanceState(outState);
	}

	@Override
	public void onPause() {
	    super.onPause();
	    uiHelper.onPause();
	}

	@Override
	public void onDestroy() {
	    super.onDestroy();
	    uiHelper.onDestroy();
	}
	// method for the saved dialog
	public static void saved(Activity name){
		new AlertDialog.Builder(name)
        .setIcon(R.drawable.favs)
        .setTitle( "Added to Favourites" )
        .setPositiveButton( "Awsome!!!", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Log.d( "AlertDialog", "Positive" );  
            }
        } )
        .show();
	}
	
	

	
}