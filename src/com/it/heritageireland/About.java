package com.it.heritageireland;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class About extends ActionBarActivity{
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		
		Button but1 = (Button) findViewById(R.id.button1);
		but1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_SEND);
				intent.setType("plain/text");
				intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "derekmcauley7@gmail.com" });
				intent.putExtra(Intent.EXTRA_SUBJECT, "Hidden Ireland App");
				intent.putExtra(Intent.EXTRA_TEXT, "Hey Derek, "
						+ "");
				startActivity(Intent.createChooser(intent, ""));
				
			}
			
			
		});
		
	}

}
