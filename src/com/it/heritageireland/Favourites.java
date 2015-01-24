package com.it.heritageireland;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Favourites extends ActionBarActivity {
	
	DatabaseHelper  databaseHelper;
	String sbut1 = "";
	String sbut2 = "";
	public void onCreate(Bundle savedInstanceState)
	{
		databaseHelper =new DatabaseHelper(Favourites.this, null,null, 1);
		final String dbString = databaseHelper.databaseToString();
		final String lines[] = dbString.split("\n");
		if(lines.length > 0 && lines[0] != null){
			sbut1 = lines[0];
		}// end of if statement
		if(lines.length>1 && lines[1]!= null){
			sbut2 = lines[1];
		}	// end of if statement
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fav);

		final Button but1 = (Button) findViewById(R.id.button1);
		but1.setText(sbut1); 
		final Button but2 = (Button) findViewById(R.id.button2);
		but2.setText(sbut2);
		
		if (but1.getText().toString()== ""){
		but1.setOnClickListener(new OnClickListener() {
	           public void onClick(View v) {
	           }   
	       });
		}// end of if
		
		else{
			but1.setOnClickListener(new OnClickListener() {
				String classString = "com.it.heritageireland." + sbut1;
		           public void onClick(View v) {
		  
		               Intent intent = null;         
					try {
						intent = new Intent(Favourites.this, Class.forName(classString));
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		               startActivity(intent);  
		       
		           }   
		       });
			
		}
		
		
		
		
	but1.setOnLongClickListener(new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
        databaseHelper.delet_prodcut(sbut1); // try string1 here
        but1.setText("");
        messageDialog(Favourites.this);
    	return true;        
        }     
    });

	
	if (but2.getText().toString()== ""){
		but2.setOnClickListener(new OnClickListener() {
	           public void onClick(View v) {
	           }   
	       });
		}// end of if
		
		else{
	but2.setOnClickListener(new OnClickListener() {
		String classString = "com.it.heritageireland." + sbut2;
        public void onClick(View v) {
            Intent intent = null;         
			try {
				intent = new Intent(Favourites.this, Class.forName(classString));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            startActivity(intent);    
        }   
    });
	but2.setOnLongClickListener(new View.OnLongClickListener() {
		public boolean onLongClick(View v) {
			databaseHelper.delet_prodcut(sbut2); // try string1 here
			but2.setText("");
			messageDialog(Favourites.this);
	    	return true;    
	    	}     
	});

		}
}
	public static void messageDialog(Activity a){
	    AlertDialog.Builder dialog = new AlertDialog.Builder(a);
	    dialog.setMessage(Html.fromHtml("<font color='#FFA500'>Favourites item deleted!!!</font>"));
	    dialog.setTitle( Html.fromHtml("<font color='#FFA500'>Bye Bye!!!</font>"));
	    dialog.setIcon(R.drawable.delete);
	    dialog.setPositiveButton( "Awsome!!!", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Log.d( "AlertDialog", "Positive" );
                
            }
        } )
        .show();
	}// end of dialog message
	
	

		
		
	
	
	
}
