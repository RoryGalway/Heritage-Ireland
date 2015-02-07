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
	String sbut3 = "";
	String sbut4 = "";
	String sbut5 = "";
	String sbut6 = "";
	String sbut7 = "";
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
		if(lines.length > 2 && lines[2] != null){
			sbut3 = lines[2];
		}// end of if statement
		if(lines.length > 3 && lines[3] != null){
			sbut4 = lines[3];
		}// end of if statement
		if(lines.length > 4 && lines[4] != null){
			sbut5 = lines[4];
		}// end of if statement
		if(lines.length > 5 && lines[5] != null){
			sbut6 = lines[5];
		}// end of if statement
		if(lines.length > 6 && lines[6] != null){
			sbut7 = lines[6];
		}// end of if statement
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fav);

		final Button but1 = (Button) findViewById(R.id.button1);
		but1.setText(sbut1); 
		final Button but2 = (Button) findViewById(R.id.button2);
		but2.setText(sbut2);
		final Button but3 = (Button) findViewById(R.id.button3);
		but3.setText(sbut3);
		final Button but4 = (Button) findViewById(R.id.button4);
		but4.setText(sbut4);
		final Button but5 = (Button) findViewById(R.id.button5);
		but5.setText(sbut5);
		final Button but6 = (Button) findViewById(R.id.button6);
		but6.setText(sbut6);
		final Button but7 = (Button) findViewById(R.id.button7);
		but7.setText(sbut7);
		
		
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
	});	}
	// button 3
	if (but3.getText().toString()== ""){
		but3.setOnClickListener(new OnClickListener() {
	           public void onClick(View v) {
	           }   
	       });
		}// end of if
	else{
	but3.setOnClickListener(new OnClickListener() {
		String classString = "com.it.heritageireland." + sbut3;
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
	but3.setOnLongClickListener(new View.OnLongClickListener() {
		public boolean onLongClick(View v) {
			databaseHelper.delet_prodcut(sbut3); // try string1 here
			but3.setText("");
			messageDialog(Favourites.this);
	    	return true;    
	    	}     
	});	
	}
	if (but4.getText().toString()== ""){
		but4.setOnClickListener(new OnClickListener() {
	           public void onClick(View v) {
	           }   
	       });
		}// end of if
	else{
	but4.setOnClickListener(new OnClickListener() {
		String classString = "com.it.heritageireland." + sbut4;
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
	but4.setOnLongClickListener(new View.OnLongClickListener() {
		public boolean onLongClick(View v) {
			databaseHelper.delet_prodcut(sbut4); // try string1 here
			but4.setText("");
			messageDialog(Favourites.this);
	    	return true;    
	    	}     
	});}

	// button 5
	if (but5.getText().toString()== ""){
		but5.setOnClickListener(new OnClickListener() {
	           public void onClick(View v) {
	           }   
	       });
		}// end of if
	else{
	but5.setOnClickListener(new OnClickListener() {
		String classString = "com.it.heritageireland." + sbut5;
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
	but5.setOnLongClickListener(new View.OnLongClickListener() {
		public boolean onLongClick(View v) {
			databaseHelper.delet_prodcut(sbut5); // try string1 here
			but5.setText("");
			messageDialog(Favourites.this);
	    	return true;    
	    	}     
	});}
	
	// button 6
		if (but6.getText().toString()== ""){
			but6.setOnClickListener(new OnClickListener() {
		           public void onClick(View v) {
		           }   
		       });
			}// end of if
		else{
		but6.setOnClickListener(new OnClickListener() {
			String classString = "com.it.heritageireland." + sbut6;
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
		but6.setOnLongClickListener(new View.OnLongClickListener() {
			public boolean onLongClick(View v) {
				databaseHelper.delet_prodcut(sbut6); // try string1 here
				but6.setText("");
				messageDialog(Favourites.this);
		    	return true;    
		    	}     
		});}
	//button 7
		if (but7.getText().toString()== ""){
			but7.setOnClickListener(new OnClickListener() {
		           public void onClick(View v) {
		           }   
		       });
			}// end of if
		else{
		but7.setOnClickListener(new OnClickListener() {
			String classString = "com.it.heritageireland." + sbut7;
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
		but7.setOnLongClickListener(new View.OnLongClickListener() {
			public boolean onLongClick(View v) {
				databaseHelper.delet_prodcut(sbut7); // try string1 here
				but7.setText("");
				messageDialog(Favourites.this);
		    	return true;    
		    	}     
		});}// end of the 7th button
	
		}

	public static void messageDialog(Activity a){
	    AlertDialog.Builder dialog = new AlertDialog.Builder(a);
	    dialog.setMessage(Html.fromHtml("<font color='#006600'>Favourites item deleted!!!</font>"));
	    dialog.setTitle( Html.fromHtml("<font color='#006600'>Bye Bye!!!</font>"));
	    dialog.setIcon(R.drawable.delete);
	    dialog.setPositiveButton( Html.fromHtml("<font color='#F00000'>Awsome!!!</font>"), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Log.d( "AlertDialog", "Positive" );
                
            }
        } )
        .show();
	}// end of dialog message
	
}