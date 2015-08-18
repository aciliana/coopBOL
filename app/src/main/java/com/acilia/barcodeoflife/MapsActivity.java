package com.acilia.barcodeoflife;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map2);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        map.setMyLocationEnabled(true);
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.533226, -80.22693))
                .title("Welcome!"));
        //Conference Locations
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.532571, -80.231391))
                .title("War Memorial Hall")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.532227, -80.225858))
                .title("Rozanski Hall")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.532227, -80.225858))
                .title("Summerlee Science Complex")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.533950, -80.229414))
                .title("Creelman Hall")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.547744, -80.246263))
                .title("River Run Centre")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.363483, -80.316099))
                .title("Cambridge Mill")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        //Art Locations
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.533004, -80.232959))
                .title("Macdonald Steward Art Center")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.543444, -80.251468))
                .title("Guelph Civil Museum")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.536189, -80.244499))
                .title("Mccrae House")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.653607, -79.392512))
                .title("Art Gallery of Ontario")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.667710, -79.394777))
                .title("Royal Ontario Museum")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.725749, -79.331813))
                .title("Aga Khan Museum")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.843524, -79.616461))
                .title("McMichael Canadian Art Collection")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.374277, -80.968475))
                .title("Stratford Festival")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        //Biodiversity Locations
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.538639, -80.216489))
                .title("Arboretum")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.539077, -80.241912))
                .title("The Boathouse")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.462755, -80.02591))
                .title("Halton Hills Conservation Area")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.451060, -80.369717))
                .title("Cambridge Butterfly Conservatory")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.290625, -79.87555))
                .title("Royal Botanical Gardens")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(45.225834, -81.468234))
                .title("Bruce Peninsula National Park")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.089558, -79.084944))
                .title("Niagara Falls")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        //Child Locations
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.817699, -79.18589))
                .title("Toronto Zoo")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.341858, -80.182624))
                .title("African Lion Safari")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.642426, -79.38618))
                .title("Ripley's Aquarium of Canada")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.544151, -80.247982))
                .title("Market Square")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.565360, -80.270462))
                .title("Riverside Park")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.547956, -80.307698))
                .title("Funmazing Playcenter")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.550288, -80.256856))
                .title("Children's Art Factory")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.843018, -79.539463))
                .title("Canada's Wonderland")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.450247, -80.489477))
                .title("THE MUSEUM")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.465644, -80.203063))
                .title("Donkey Sanctuary of Canada")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        //drink locations
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.548078, -80.252736))
                .title("The Wolly")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.522193, -80.21377))
                .title("Manhattans")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.512929, -80.19788))
                .title("Borealis")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.543946, -80.250368))
                .title("The Albion Hotel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.547751, -80.252402))
                .title("Baker Street Station")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.524928, -80.222614))
                .title("The Shakespeare's Arm")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        //eat locations
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.544537, -80.248167))
                .title("Salsateria")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.544971, -80.249249))
                .title("Guelph Caribbean Cuisine")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.544368, -80.244896))
                .title("Einstein's Cafe")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.544359, -80.244204))
                .title("Zen Garden")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.544577, -80.247577))
                .title("Cornerstone")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.544941, -80.24746))
                .title("Pierre's Poutine")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        //town locations
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.542407, -80.248342))
                .title("Guelph Farmer's Market")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.497193, -80.29342))
                .title("Strom's Farm and Bakery")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.470307, -80.14701))
                .title("Aberfoyle Antique Market")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.683715, -80.430543))
                .title("Elora")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(43.540121, -80.553523))
                .title("St.Jacob's")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.btm:
                Intent i = new Intent("com.acilia.barcodeoflife.MAINACTIVITY");
                startActivity(i);
                break;
            case R.id.exit:
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;
        }
        return false;
    }
}