package com.acilia.barcodeoflife;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity extends ActionBarActivity {
    Button scheduleButton;
    Button ttdButton;
    Button mapButton;
    Button contactButton;
    Button sponButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //schedule button links to Monday calender
        scheduleButton = (Button)findViewById(R.id.schedule);
        scheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.acilia.barcodeoflife.MONDAYACTIVITY");
                startActivity(i);
            }
        });
        ttdButton = (Button)findViewById(R.id.ttd);
        ttdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.acilia.barcodeoflife.TTDACTIVITY");
                startActivity(i);
            }
        });
        mapButton = (Button)findViewById(R.id.map);
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.acilia.barcodeoflife.MAPSACTIVITY");
                startActivity(i);
            }
        });
        contactButton = (Button)findViewById(R.id.con);
        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.acilia.barcodeoflife.CONTACTACTIVITY");
                startActivity(i);
            }
        });
        sponButton = (Button)findViewById(R.id.Spon);
        sponButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.acilia.barcodeoflife.SPONSORACTIVITY");
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.btm) {
            return true;
        }else if(id == R.id.exit){
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
