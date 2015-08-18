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
public class DrinkActivity extends ActionBarActivity{
    Button drinkd1, drinkd2, drinkd3, drinkd4, drinkd5, drinkd6;
    Button go1, go2, go3, go4, go5, go6;
    TextView drinkt1, drinkt2, drinkt3, drinkt4, drinkt5, drinkt6;
    Boolean drink1 = false, drink2 = false, drink3 = false, drink4 = false, drink5 = false, drink6 = false;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drink);
        this.drinkt1 = (TextView) findViewById(R.id.drinkt1);
        this.go1 = (Button)findViewById(R.id.go41);
        this.drinkd1 = (Button) findViewById(R.id.drinkd1);
        drinkd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drink1 == false) {
                    drinkt1.setVisibility(View.VISIBLE);
                    drink1 = true;
                    go1.setVisibility(View.VISIBLE);
                    go1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=The+Woolwich+Arrow,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    drinkt1.setVisibility(View.GONE);
                    drink1 = false;
                    go1.setVisibility(View.GONE);
                }
            }
        });
        this.drinkt2 = (TextView) findViewById(R.id.drinkt2);
        this.go2 = (Button)findViewById(R.id.go42);
        this.drinkd2 = (Button) findViewById(R.id.drinkd2);
        drinkd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drink2 == false) {
                    drinkt2.setVisibility(View.VISIBLE);
                    drink2 = true;
                    go2.setVisibility(View.VISIBLE);
                    go2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Manhattans ,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    drinkt2.setVisibility(View.GONE);
                    drink2 = false;
                    go2.setVisibility(View.GONE);
                }
            }
        });
        this.drinkt3 = (TextView) findViewById(R.id.drinkt3);
        this.go3 = (Button)findViewById(R.id.go43);
        this.drinkd3 = (Button) findViewById(R.id.drinkd3);
        drinkd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drink3 == false) {
                    drinkt3.setVisibility(View.VISIBLE);
                    drink3 = true;
                    go3.setVisibility(View.VISIBLE);
                    go3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Borealis+Grille+&+Bar ,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    drinkt3.setVisibility(View.GONE);
                    drink3 = false;
                    go3.setVisibility(View.GONE);
                }
            }
        });
        this.drinkt4 = (TextView) findViewById(R.id.drinkt4);
        this.go4 = (Button)findViewById(R.id.go44);
        this.drinkd4 = (Button) findViewById(R.id.drinkd4);
        drinkd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drink4 == false) {
                    drinkt4.setVisibility(View.VISIBLE);
                    drink4 = true;
                    go4.setVisibility(View.VISIBLE);
                    go4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=The+Albion+Hotel ,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    drinkt4.setVisibility(View.GONE);
                    drink4 = false;
                    go4.setVisibility(View.GONE);
                }
            }
        });
        this.drinkt5 = (TextView) findViewById(R.id.drinkt5);
        this.go5 = (Button)findViewById(R.id.go45);
        this.drinkd5 = (Button) findViewById(R.id.drinkd5);
        drinkd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drink5 == false) {
                    drinkt5.setVisibility(View.VISIBLE);
                    drink5 = true;
                    go5.setVisibility(View.VISIBLE);
                    go5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Baker+Street+Station ,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    drinkt5.setVisibility(View.GONE);
                    drink5 = false;
                    go5.setVisibility(View.GONE);
                }
            }
        });
        this.drinkt6 = (TextView) findViewById(R.id.drinkt6);
        this.go6 = (Button)findViewById(R.id.go46);
        this.drinkd6 = (Button) findViewById(R.id.drinkd6);
        drinkd6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drink6 == false) {
                    drinkt6.setVisibility(View.VISIBLE);
                    drink6 = true;
                    go6.setVisibility(View.VISIBLE);
                    go6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=The+Shakespeare's+Arm ,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    drinkt6.setVisibility(View.GONE);
                    drink6 = false;
                    go6.setVisibility(View.GONE);
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
