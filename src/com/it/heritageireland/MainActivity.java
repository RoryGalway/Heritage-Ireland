package com.it.heritageireland;


import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Context;
import android.content.Intent;


public class MainActivity extends ActionBarActivity {
	
	protected static Marker Pin = null;
	protected static Marker Altamont = null;
	protected static Marker Ardfert =null; 
	protected static Marker Athenry  =null; 
	protected static Marker Aughnanure =null;
	protected static Marker Ballyhack =null;
	protected static Marker Barryscourt =null;
	protected static Marker BoyleAbbey =null;
	protected static Marker Newgrange = null;
	protected static Marker Carrowmore = null;
	protected static Marker Connemara = null;
	protected static Marker Coole = null;
	
	// The map
	private GoogleMap theMap;
	
	//location manager
	private LocationManager locMan;

	//user marker
	private Marker userMarker;

	int pinNum = 0;
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
		
				//find out if we already have it
				if(theMap==null){
					//get the map
					
					SupportMapFragment mf = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
					theMap = mf.getMap();
					
					// Below sets my location
					theMap.setMyLocationEnabled(true);
					// Below sets the map view to normal.
					theMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
					
					//check in case map/ Google Play services not available
					if(theMap!=null){
						//ok - proceed
						theMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
						//update location
						updatePlaces();
					}
				}
				
				holystone();
				theRock();
				Altamont();
				Ardfert();
				Athenry();
				Aughnanure();
				Ballyhack();
				Barryscourt();
				BoyleAbbey();
				Newgrange();
				Currowmore();
				Connemara();
				Coole();
	}
	
	private void Barryscourt() 
	{
		
		// TODO Auto-generated method stub
		LatLng pos = new LatLng(51.904604, -8.259016);
		Barryscourt = theMap.addMarker(new MarkerOptions()
		
				.title("Barryscourt Castle")
				.snippet("15th to 16th century Castle")
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
				.position(pos)
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
		);
		// below displays the window...remove this!!!
		//Pin.showInfoWindow();
		
		Barryscourt.isInfoWindowShown();
		
		
	}
	
	private void holystone() 
	{
		
		// TODO Auto-generated method stub
		LatLng pos = new LatLng(52.5651667, -8.7895846);
		Pin = theMap.addMarker(new MarkerOptions()
		
				.title("Adare Castle")
				.snippet("Medieval Castle")
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
				.position(pos)
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
		);
		// below displays the window...remove this!!!
		//Pin.showInfoWindow();
		
			Pin.isInfoWindowShown();
		
		
	}
	public void theRock()
	{
		
		// TODO Auto-generated method stub
				LatLng pos = new LatLng(52.520064, -7.890482);
				final Marker Casino = theMap.addMarker(new MarkerOptions()
						.title("Rock Of Cashel")
						.snippet("It's huge, it's complex, it's iconic, there is nothing like it anywhere else in the world and it's right here in Cashel at the heart of Tipperary.")
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
						.position(pos)			
						);
				
				
					
					Casino.isInfoWindowShown();
					theMap.setOnInfoWindowClickListener(new OnInfoWindowClickListener() {
		            @Override
		            public void onInfoWindowClick(Marker M) 
		            {	
		            	
		            	if(Casino.isInfoWindowShown()){
		               Intent intent = new Intent(MainActivity.this, Rock_Of_Cashel.class);
		               startActivity(intent);
		               
		            	}
		            	
		            	else if(Pin.isInfoWindowShown()){
		                    Intent intent = new Intent(MainActivity.this, Adare.class);
		                    
		                    startActivity(intent);
		                 	}
		            	
		            	else if(Altamont.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, Altmont.class);
		            		startActivity(intent);
		            	}
		            	//Ardfert
		            	else if(Ardfert.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, Ardfert.class);
		            		startActivity(intent);
		            	}
		            	//Athenry
		            	else if(Athenry.isInfoWindowShown())
		            	{
		            		Intent intent = new Intent(MainActivity.this,Athenry.class);
		            		startActivity(intent);
		            	}
		            	
		            	//Aughnanure
		            	
		            	else if(Aughnanure.isInfoWindowShown())
		            	{
		            		Intent intent = new Intent(MainActivity.this, Aughnanure.class);
		            		startActivity(intent);
		            	}
		            	// Barryscourt
		            	else if(Ballyhack.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, Ballyhack.class);
		            		startActivity(intent);
		            	}
		            	else if (Barryscourt.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, Barryscourt.class);
		            		startActivity(intent);
		            	}
		            	else if (BoyleAbbey.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, BoyleAbbey.class);
		            		startActivity(intent);
		            	}
		            	else if (Newgrange.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, Newgrange.class);
		            		startActivity(intent);
		            	}
		            	else if (Carrowmore.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, Carrowmore.class);
		            		startActivity(intent);
		            	}
		            	else if (Connemara.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, Connemara.class);
		            		startActivity(intent);
		            	}
		            	else if (Coole.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, Coole.class);
		            		startActivity(intent);
		            	}
		            }		
		        });		
	}
	
	public void Coole()
	{
		LatLng pos = new LatLng(53.080184, -8.854295);
		
		Coole = theMap.addMarker(new MarkerOptions()
		
				.title("Coole Park")
				.snippet("National Park")
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
				.position(pos)
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
		);
		// below displays the window...remove this!!!
		//Pin.showInfoWindow();
		
		Coole.isInfoWindowShown();
	}
	
	public void Connemara()
	{
		LatLng pos = new LatLng(53.538378, -9.887542);
		Connemara = theMap.addMarker(new MarkerOptions()
		
				.title("Connemara National Park")
				.snippet("National Park")
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
				.position(pos)
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
		);
		// below displays the window...remove this!!!
		//Pin.showInfoWindow();
		
		Connemara.isInfoWindowShown();
	
	}
	
	
	public void Currowmore()
	{
		LatLng pos = new LatLng(54.250807, -8.519323);
		
		Carrowmore = theMap.addMarker(new MarkerOptions()
		
				.title("Currowmore")
				.snippet("Megalithic Cemetery")
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
				.position(pos)
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
		);
		// below displays the window...remove this!!!
		//Pin.showInfoWindow();
		
		Carrowmore.isInfoWindowShown();
	
	}
	
	
	public void Ballyhack()
	{
		LatLng pos = new LatLng(52.248475, -6.964192);
		
		Ballyhack = theMap.addMarker(new MarkerOptions()
		
				.title("Ballyhack Castle")
				.snippet("15th-century Knights Hospitallers.")
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
				.position(pos)
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
		);
		// below displays the window...remove this!!!
		//Pin.showInfoWindow();
		
		Ballyhack.isInfoWindowShown();
	
	}
	public void Newgrange()
	{
		LatLng pos = new LatLng(53.694712, -6.475492);
		
		Newgrange = theMap.addMarker(new MarkerOptions()
		
				.title("Newgrange - Brú na Bóinne")
				.snippet("Neolithic monuments")
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
				.position(pos)
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
		);
		// below displays the window...remove this!!!
		//Pin.showInfoWindow();
		Newgrange.isInfoWindowShown();
	
	}
	private void BoyleAbbey() 
	{
		
		// TODO Auto-generated method stub
		LatLng pos = new LatLng(53.973559, -8.296974);
		BoyleAbbey = theMap.addMarker(new MarkerOptions()
		
				.title("BoyleAbbey")
				.snippet("Cistercian Monastery")
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
				.position(pos)
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
		);
		// below displays the window...remove this!!!
		//Pin.showInfoWindow();
		
		BoyleAbbey.isInfoWindowShown();
		
		
	}
	
	public void Aughnanure()
	{
		LatLng pos = new LatLng(53.418684, -9.275484);
		
		Aughnanure = theMap.addMarker(new MarkerOptions()
		
				.title("Aughnanure Castle")
				.snippet("16th-century tower house.")
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
				.position(pos)
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
		);
		// below displays the window...remove this!!!
		//Pin.showInfoWindow();
		
		Aughnanure.isInfoWindowShown();
	
	}
	
	public void Ardfert()
	{
		LatLng pos = new LatLng(52.328601, -9.7816633);
		//52.328601 -9.7816633
		Ardfert = theMap.addMarker(new MarkerOptions()
		
				.title("Ardfert Cathedral")
				.snippet("12th to 17th century Cathedral.")
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
				.position(pos)
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
		);
		// below displays the window...remove this!!!
		//Pin.showInfoWindow();
		
		Ardfert.isInfoWindowShown();
	
	}
	
	public void Athenry()
	{
		LatLng pos = new LatLng(53.299996, -8.744618);
	
		Athenry = theMap.addMarker(new MarkerOptions()
		
				.title("Athenry Castle")
				.snippet("13th century, tower house.")
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
				.position(pos)
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
		);
		// below displays the window...remove this!!!
		//Pin.showInfoWindow();
		
		Athenry.isInfoWindowShown();
		
	}
	public void Altamont()
	
	{	LatLng pos = new LatLng(52.735844, -6.720746);
				//52.735844 -6.720746
				Altamont = theMap.addMarker(new MarkerOptions()
				
						.title("Altamont Gardens")
						.snippet("Old world garden")
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
						.position(pos)
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
				);
				// below displays the window...remove this!!!
				//Pin.showInfoWindow();
				
				Altamont.isInfoWindowShown();
	
	}
	
	
	

	
	
	
	private void updatePlaces()
	{
		//get location manager
		locMan = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
		//get last location
		Location lastLoc = locMan.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
		double lat = lastLoc.getLatitude();
		double lng = lastLoc.getLongitude();
		//create LatLng
		LatLng lastLatLng = new LatLng(lat, lng);

		//remove any existing marker
		if(userMarker!=null) userMarker.remove();
		//create and set marker properties
		userMarker = theMap.addMarker(new MarkerOptions()
		.position(lastLatLng)
		.title("You are here")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED))
		.snippet("Your last recorded location"));
		
		//move to location 
		CameraUpdate yourLocation = CameraUpdateFactory.newLatLngZoom(lastLatLng, 7);
		theMap.animateCamera(yourLocation);
	}
	

	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) 
		{
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
