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
public class EatActivity extends ActionBarActivity{
    Button eatd1, eatd2, eatd3, eatd4, eatd5, eatd6;
    Button go1, go2, go3, go4, go5, go6;
    TextView eatt1, eatt2, eatt3, eatt4, eatt5, eatt6;
    Boolean eat1 = false, eat2 = false, eat3 = false, eat4 = false, eat5 = false, eat6 = false;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eat);
        this.eatt1 = (TextView) findViewById(R.id.eatt1);
        this.go1 = (Button)findViewById(R.id.go51);
        this.eatd1 = (Button) findViewById(R.id.eatd1);
        eatd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eat1 == false) {
                    eatt1.setVisibility(View.VISIBLE);
                    eat1 = true;
                    go1.setVisibility(View.VISIBLE);
                    go1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Salsateria+Rebel+Foods,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    eatt1.setVisibility(View.GONE);
                    eat1 = false;
                    go1.setVisibility(View.GONE);
                }
            }
        });
        this.eatt2 = (TextView) findViewById(R.id.eatt2);
        this.go2 = (Button)findViewById(R.id.go52);
        this.eatd2 = (Button) findViewById(R.id.eatd2);
        eatd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eat2 == false) {
                    eatt2.setVisibility(View.VISIBLE);
                    eat2 = true;
                    go2.setVisibility(View.VISIBLE);
                    go2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Guelph+Caribbean+Cuisine,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    eatt2.setVisibility(View.GONE);
                    eat2 = false;
                    go2.setVisibility(View.GONE);
                }
            }
        });
        this.eatt3 = (TextView) findViewById(R.id.eatt3);
        this.go3 = (Button)findViewById(R.id.go53);
        this.eatd3 = (Button) findViewById(R.id.eatd3);
        eatd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eat3 == false) {
                    eatt3.setVisibility(View.VISIBLE);
                    eat3 = true;
                    go3.setVisibility(View.VISIBLE);
                    go3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Einstein's+Cafe,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    eatt3.setVisibility(View.GONE);
                    eat3 = false;
                    go3.setVisibility(View.GONE);
                }
            }
        });
        this.eatt4 = (TextView) findViewById(R.id.eatt4);
        this.go4 = (Button)findViewById(R.id.go54);
        this.eatd4 = (Button) findViewById(R.id.eatd4);
        eatd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eat4 == false) {
                    eatt4.setVisibility(View.VISIBLE);
                    eat4 = true;
                    go4.setVisibility(View.VISIBLE);
                    go4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Zen+Garden+Veg+Restaurant,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    eatt4.setVisibility(View.GONE);
                    eat4 = false;
                    go4.setVisibility(View.GONE);
                }
            }
        });
        this.eatt5 = (TextView) findViewById(R.id.eatt5);
        this.go5 = (Button)findViewById(R.id.go55);
        this.eatd5 = (Button) findViewById(R.id.eatd5);
        eatd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eat5 == false) {
                    eatt5.setVisibility(View.VISIBLE);
                    eat5 = true;
                    go5.setVisibility(View.VISIBLE);
                    go5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Cornerstone,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    eatt5.setVisibility(View.GONE);
                    eat5 = false;
                    go5.setVisibility(View.GONE);
                }
            }
        });
        this.eatt6 = (TextView) findViewById(R.id.eatt6);
        this.go6 = (Button)findViewById(R.id.go56);
        this.eatd6 = (Button) findViewById(R.id.eatd6);
        eatd6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eat6 == false) {
                    eatt6.setVisibility(View.VISIBLE);
                    eat6 = true;
                    go6.setVisibility(View.VISIBLE);
                    go6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Pierre's+Poutine,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    eatt6.setVisibility(View.GONE);
                    eat6 = false;
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
