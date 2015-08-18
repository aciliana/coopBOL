package com.acilia.barcodeoflife;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by alicia on 2015-07-07.
 */
public class TownActivity extends ActionBarActivity {
    Button townd1, townd2, townd3, townd4, townd5;
    Button go1, go2, go3, go4, go5;
    TextView townt1, townt2, townt3, townt4, townt5;
    Boolean town1 = false, town2 = false, town3 = false, town4 = false, town5 = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.town);
        this.townt1 = (TextView) findViewById(R.id.townt1);
        this.go1 = (Button) findViewById(R.id.go61);
        this.townd1 = (Button) findViewById(R.id.townd1);
        townd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (town1 == false) {
                    townt1.setVisibility(View.VISIBLE);
                    town1 = true;
                    go1.setVisibility(View.VISIBLE);
                    go1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Guelph+Farmers'+Market,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    townt1.setVisibility(View.GONE);
                    town1 = false;
                    go1.setVisibility(View.GONE);
                }
            }
        });
        this.townt2 = (TextView) findViewById(R.id.townt2);
        this.go2 = (Button) findViewById(R.id.go62);
        this.townd2 = (Button) findViewById(R.id.townd2);
        townd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (town2 == false) {
                    townt2.setVisibility(View.VISIBLE);
                    town2 = true;
                    go2.setVisibility(View.VISIBLE);
                    go2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Strom's+Farm+and+Bakery,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    townt2.setVisibility(View.GONE);
                    town2 = false;
                    go2.setVisibility(View.GONE);
                }
            }
        });
        this.townt3 = (TextView) findViewById(R.id.townt3);
        this.go3 = (Button) findViewById(R.id.go63);
        this.townd3 = (Button) findViewById(R.id.townd3);
        townd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (town3 == false) {
                    townt3.setVisibility(View.VISIBLE);
                    town3 = true;
                    go3.setVisibility(View.VISIBLE);
                    go3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Aberfoyle+Antique+Market,+Aberfoyle+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    townt3.setVisibility(View.GONE);
                    town3 = false;
                    go3.setVisibility(View.GONE);
                }
            }
        });
        this.townt4 = (TextView) findViewById(R.id.townt4);
        this.go4 = (Button) findViewById(R.id.go64);
        this.townd4 = (Button) findViewById(R.id.townd4);
        townd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (town4 == false) {
                    townt4.setVisibility(View.VISIBLE);
                    town4 = true;
                    go4.setVisibility(View.VISIBLE);
                    go4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Elora+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    townt4.setVisibility(View.GONE);
                    town4 = false;
                    go4.setVisibility(View.GONE);
                }
            }
        });
        this.townt5 = (TextView) findViewById(R.id.townt5);
        this.go5 = (Button) findViewById(R.id.go65);
        this.townd5 = (Button) findViewById(R.id.townd5);
        townd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (town5 == false) {
                    townt5.setVisibility(View.VISIBLE);
                    town5 = true;
                    go5.setVisibility(View.VISIBLE);
                    go5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=878+Weber+St+ N,+Waterloo+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    townt5.setVisibility(View.GONE);
                    town5 = false;
                    go5.setVisibility(View.GONE);
                }
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
