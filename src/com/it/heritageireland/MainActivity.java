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
	protected static Marker Derrynane = null;
	protected static Marker Desmond = null;
	protected static Marker Doneraile = null;
	protected static Marker DromoreWood = null;
	protected static Marker DunAonghasa = null;
	protected static Marker DungarvanCastle = null;
	protected static Marker DunmoreCave = null;
	protected static Marker McAllisterCottage = null;
	protected static Marker EmoCourt = null;
	protected static Marker EnnisFriary = null;
	protected static Marker FernsCastle = null;
	protected static Marker GallarusCastle = null;
	protected static Marker GarnishIsland = null;
	protected static Marker GlebeHouse = null;
	protected static Marker GlendaLough = null;
	protected static Marker GlenveaghCaslte = null;
	protected static Marker GriananofAileach = null;
	protected static Marker HeywoodGardens = null;
	protected static Marker HillofTara = null;
	protected static Marker HoleOfSorrows = null;
	protected static Marker Insideljerpoint = null;
	protected static Marker JFKArboretum = null;
	
	
	
	
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
				Derrynane();
				Desmond();
				Doneraile();
				DromoreWood();
				DunAonghasa();
				DungarvanCastle();
				DunmoreCave();
				McAllisterCottage();
				EmoCourt();
				EnnisFriary();
				FernsCastle();
				GallarusCastle();
				GarnishIsland();
				GlebeHouse();
				GlendaLough();
				GlenveaghCaslte();
				GriananofAileach();
				HeywoodGardens();
				HillofTara();
				HoleOfSorrows();
				Insideljerpoint();
				JFKArboretum();
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
		            	else if (Derrynane.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, Derrynane.class);
		            		startActivity(intent);
		            	}
		            	else if (Desmond.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, Desmond.class);
		            		startActivity(intent);
		            	}
		            	else if (Doneraile.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, Doneraile.class);
		            		startActivity(intent);
		            	}
		            	else if (DromoreWood.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, DromoreWood.class);
		            		startActivity(intent);
		            	}
		            	else if (DunAonghasa.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, DunAonghasa.class);
		            		startActivity(intent);
		            	}
		            	else if (DungarvanCastle.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, DungarvanCastle.class);
		            		startActivity(intent);
		            	}
		            	else if (DunmoreCave.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, DunmoreCave.class);
		            		startActivity(intent);
		            	}
		            	else if (McAllisterCottage.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, McAllisterCottage.class);
		            		startActivity(intent);
		            	}
		            	else if (EmoCourt.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, EmoCourt.class);
		            		startActivity(intent);
		            	}
		            	else if (EnnisFriary.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, EnnisFriary.class);
		            		startActivity(intent);
		            	}
		            	else if (FernsCastle.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, FernsCastle.class);
		            		startActivity(intent);
		            	}
		            	else if (GallarusCastle.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, GallarusCastle.class);
		            		startActivity(intent);
		            	}
		            	else if (GarnishIsland.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, GarnishIsland.class);
		            		startActivity(intent);
		            	}
		            	else if (GlebeHouse.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, GlebeHouse.class);
		            		startActivity(intent);
		            	}
		            	else if (GlendaLough.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, GlendaLough.class);
		            		startActivity(intent);
		            	}
		            	else if (GlenveaghCaslte.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, GlenveaghCaslte.class);
		            		startActivity(intent);
		            	}
		            	else if (GriananofAileach.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, GriananofAileach.class);
		            		startActivity(intent);
		            	}
		            	else if (HeywoodGardens.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, HeywoodGardens.class);
		            		startActivity(intent);
		            	}
		            	else if (HillofTara.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, HillofTara.class);
		            		startActivity(intent);
		            		
		            	}
		            	
		            	else if (HoleOfSorrows.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this, HoleOfSorrows.class);
		            		startActivity(intent);
		            		
		            	}
		            	
		            	else if (Insideljerpoint.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this,Insideljerpoint.class);
		            		startActivity(intent);
		            	}
		            	else if (JFKArboretum.isInfoWindowShown()){
		            		Intent intent = new Intent(MainActivity.this,JFKArboretum.class);
		            		startActivity(intent);
		            	}
		            	
		            }		
		        });		}	

			
public void JFKArboretum(){
		
		LatLng pos = new LatLng(52.320914, -6.933714);
				
		JFKArboretum = theMap.addMarker(new MarkerOptions()
				
						.title("JFK Arboretum")
						.snippet("Garden")
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
						.position(pos)
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
				);
				// below displays the window...remove this!!!
				//Pin.showInfoWindow();
				
		JFKArboretum.isInfoWindowShown();
		}	
	
public void Insideljerpoint(){
		
		LatLng pos = new LatLng(52.510997, -7.158279);
				
		Insideljerpoint = theMap.addMarker(new MarkerOptions()
				
						.title("Jerpoint Abbey")
						.snippet("Cistercian Monastery")
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
						.position(pos)
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
				);
				// below displays the window...remove this!!!
				//Pin.showInfoWindow();
				
		Insideljerpoint.isInfoWindowShown();
		}	
public void HoleOfSorrows(){
		
		LatLng pos = new LatLng(53.0495693, -9.1404912);
				
		HoleOfSorrows = theMap.addMarker(new MarkerOptions()
				
						.title("Hole Of Sorrows")
						.snippet("Neolithic Poulnabrone dolmen")
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
						.position(pos)
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
				);
				// below displays the window...remove this!!!
				//Pin.showInfoWindow();
				
		HoleOfSorrows.isInfoWindowShown();
		}	
	
public void HillofTara(){
		
		LatLng pos = new LatLng(53.578811, -6.611649);
				
		HillofTara = theMap.addMarker(new MarkerOptions()
				
						.title("Hill of Tara")
						.snippet("Seat of the pre-Christian High Kings")
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
						.position(pos)
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
				);
				// below displays the window...remove this!!!
				//Pin.showInfoWindow();
				
		HillofTara.isInfoWindowShown();
		}	
	
public void GriananofAileach(){
		
		LatLng pos = new LatLng(55.0166662, -7.4166667);
				
		GriananofAileach = theMap.addMarker(new MarkerOptions()
				
						.title("Grianan of Aileach")
						.snippet("Structure stone ringfort")
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
						.position(pos)
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
				);
				// below displays the window...remove this!!!
				//Pin.showInfoWindow();
				
		GriananofAileach.isInfoWindowShown();
		}	



public void HeywoodGardens(){
	
	LatLng pos = new LatLng(52.873549, -7.309534);
			
	HeywoodGardens	 = theMap.addMarker(new MarkerOptions()
			
					.title("Heywood Gardens")
					.snippet("Landscape")
					.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
					.position(pos)
					.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
			);
			// below displays the window...remove this!!!
			//Pin.showInfoWindow();
			
	HeywoodGardens.isInfoWindowShown();
	}		

public void GlenveaghCaslte	(){
		
		LatLng pos = new LatLng(55.008343, -7.98674);
				
		GlenveaghCaslte	 = theMap.addMarker(new MarkerOptions()
				
						.title("Glenveagh Caslte")
						.snippet("Caslte and Park")
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
						.position(pos)
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
				);
				// below displays the window...remove this!!!
				//Pin.showInfoWindow();
				
		GlenveaghCaslte.isInfoWindowShown();
		}		
public void GlebeHouse(){
		
		LatLng pos = new LatLng(55.002629, -7.904663);
				
		GlebeHouse = theMap.addMarker(new MarkerOptions()
				
						.title("Glebe House")
						.snippet("Regency House")
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
						.position(pos)
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
				);
				// below displays the window...remove this!!!
				//Pin.showInfoWindow();
				
		GlebeHouse.isInfoWindowShown();
			
		}		
	


public void GlendaLough(){
	
	LatLng pos = new LatLng(53.01106, -6.32267);
			
	GlendaLough = theMap.addMarker(new MarkerOptions()
			
					.title("GlendaLough")
					.snippet("6th century Site")
					.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
					.position(pos)
					.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
			);
			// below displays the window...remove this!!!
			//Pin.showInfoWindow();
			
	GlendaLough.isInfoWindowShown();
		
	}

public void GarnishIsland(){
		
		LatLng pos = new LatLng(51.7355755, -9.5431059);
				
		GarnishIsland = theMap.addMarker(new MarkerOptions()
				
						.title("Garnish Island")
						.snippet("Glengarriff Harbour")
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
						.position(pos)
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
				);
				// below displays the window...remove this!!!
				//Pin.showInfoWindow();
				
		GarnishIsland.isInfoWindowShown();
			
		}	
	
	
public void FernsCastle(){
		
		LatLng pos = new LatLng(52.5901141, -6.4969973);
				
		FernsCastle = theMap.addMarker(new MarkerOptions()
				
						.title("Ferns Castle")
						.snippet("13th-century Megalithic castle")
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
						.position(pos)
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
				);
				// below displays the window...remove this!!!
				//Pin.showInfoWindow();
				
		FernsCastle.isInfoWindowShown();
			
		}


public void GallarusCastle(){
	
	LatLng pos = new LatLng(52.172809, -10.352626);
			
	GallarusCastle = theMap.addMarker(new MarkerOptions()
			
					.title("Gallarus Castle")
					.snippet("Pre 1600 castle")
					.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
					.position(pos)
					.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
			);
			// below displays the window...remove this!!!
			//Pin.showInfoWindow();
			
	GallarusCastle.isInfoWindowShown();
		
	}


public void EnnisFriary(){
		
		LatLng pos = new LatLng(52.84743, -8.98874);
				
		EnnisFriary = theMap.addMarker(new MarkerOptions()
				
						.title("Ennis Friary")
						.snippet("13th-century Franciscan Friary")
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
						.position(pos)
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
				);
				// below displays the window...remove this!!!
				//Pin.showInfoWindow();
				
		EnnisFriary.isInfoWindowShown();
			
		}
	
public void EmoCourt(){
		
		LatLng pos = new LatLng(53.107194, -7.1968533);
				
		EmoCourt = theMap.addMarker(new MarkerOptions()
				
						.title("Emo Court")
						.snippet("Neo-classical House")
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
						.position(pos)
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
				);
				// below displays the window...remove this!!!
				//Pin.showInfoWindow();
				
		EmoCourt.isInfoWindowShown();
			
		}
	
	
	
	
public void McAllisterCottage(){
		
		LatLng pos = new LatLng(52.9619269, -6.5648108);
				
		McAllisterCottage = theMap.addMarker(new MarkerOptions()
				
						.title("Dwyer McAllister Cottage")
						.snippet("Traditional Cottage - 1798 Rebellion")
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
						.position(pos)
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
				);
				// below displays the window...remove this!!!
				//Pin.showInfoWindow();
				
		McAllisterCottage.isInfoWindowShown();
			
		}
	
	
public void DunmoreCave(){
		
		LatLng pos = new LatLng(52.733981, -7.246861);
				
		DunmoreCave= theMap.addMarker(new MarkerOptions()
				
						.title("DunmoreCave")
						.snippet("Site of Viking massacre in 928")
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
						.position(pos)
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
				);
				// below displays the window...remove this!!!
				//Pin.showInfoWindow();
				
		DunmoreCave.isInfoWindowShown();
			
		}
	
	
public void DungarvanCastle(){
		
		LatLng pos = new LatLng(52.0889827, -7.6162451);
				
		DungarvanCastle = theMap.addMarker(new MarkerOptions()
				
						.title("Dungarvan Castle")
						.snippet("12th-century shell keep")
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
						.position(pos)
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
				);
				// below displays the window...remove this!!!
				//Pin.showInfoWindow();
				
		DungarvanCastle.isInfoWindowShown();
			
		}
	
	
	
public void DunAonghasa(){
		
		LatLng pos = new LatLng(53.125553, -9.766848);
				
		DunAonghasa = theMap.addMarker(new MarkerOptions()
				
						.title("Dun Aonghasa")
						.snippet("Prehistoric stone fort")
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
						.position(pos)
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
				);
				// below displays the window...remove this!!!
				//Pin.showInfoWindow();
				
		DunAonghasa.isInfoWindowShown();
			
		}
	public void DromoreWood(){
		
		LatLng pos = new LatLng(52.7164544, -8.8615971);
				
		DromoreWood = theMap.addMarker(new MarkerOptions()
				
						.title("Dromore Wood")
						.snippet("Nature reserve")
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
						.position(pos)
						.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
				);
				// below displays the window...remove this!!!
				//Pin.showInfoWindow();
				
		DromoreWood.isInfoWindowShown();
			
		}
	
	public void Doneraile(){
		
	LatLng pos = new LatLng(52.221723, -8.5816388);
			
	Doneraile = theMap.addMarker(new MarkerOptions()
			
					.title("Doneraile Park")
					.snippet("18th-century landscaped park")
					.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
					.position(pos)
					.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
			);
			// below displays the window...remove this!!!
			//Pin.showInfoWindow();
			
	Doneraile.isInfoWindowShown();
		
	}
	
	
	public void Desmond(){
		
	LatLng pos = new LatLng(51.70726, -8.524691);
			
			Desmond = theMap.addMarker(new MarkerOptions()
			
					.title("Desmond Castle")
					.snippet("Tower House")
					.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
					.position(pos)
					.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
			);
			// below displays the window...remove this!!!
			//Pin.showInfoWindow();
			
			Desmond.isInfoWindowShown();
		
	}
	
	public void Derrynane()
	{
		LatLng pos = new LatLng(51.762402, -10.1306);
		
		Derrynane = theMap.addMarker(new MarkerOptions()
		
				.title("Derrynane House")
				.snippet("National Monument")
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
				.position(pos)
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))			
		);
		// below displays the window...remove this!!!
		//Pin.showInfoWindow();
		
		Derrynane.isInfoWindowShown();
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
