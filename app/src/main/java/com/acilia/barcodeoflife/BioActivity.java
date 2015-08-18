package com.acilia.barcodeoflife;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by alicia on 2015-07-07.
 */
public class BioActivity extends ActionBarActivity {
    Button biod1, biod2, biod3, biod4, biod5, biod6, biod7;
    Button go1, go2, go3, go4, go5, go6, go7;
    TextView biot1, biot2, biot3, biot4, biot5, biot6, biot7;
    Boolean bio1 = false, bio2 = false, bio3 = false, bio4 = false, bio5 = false, bio6 = false, bio7 = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bio);
        this.biot1 = (TextView) findViewById(R.id.biot1);
        this.go1 = (Button) findViewById(R.id.go21);
        this.biod1 = (Button) findViewById(R.id.biod1);
        biod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bio1 == false) {
                    biot1.setVisibility(View.VISIBLE);
                    bio1 = true;
                    go1.setVisibility(View.VISIBLE);
                    go1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Arboretum,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    biot1.setVisibility(View.GONE);
                    bio1 = false;
                    go1.setVisibility(View.GONE);
                }
            }
        });
        this.biot2 = (TextView) findViewById(R.id.biot2);
        this.go2 = (Button) findViewById(R.id.go22);
        this.biod2 = (Button) findViewById(R.id.biod2);
        biod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bio2 == false) {
                    biot2.setVisibility(View.VISIBLE);
                    bio2 = true;
                    go2.setVisibility(View.VISIBLE);
                    go2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=116+Gordon+Street,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    biot2.setVisibility(View.GONE);
                    bio2 = false;
                    go2.setVisibility(View.GONE);
                }
            }
        });
        this.biot3 = (TextView) findViewById(R.id.biot3);
        this.go3 = (Button) findViewById(R.id.go23);
        this.biod3 = (Button) findViewById(R.id.biod3);
        biod3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bio3 == false) {
                    biot3.setVisibility(View.VISIBLE);
                    bio3 = true;
                    go3.setVisibility(View.VISIBLE);
                    go3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=2259+Milburough+Line,+Hamilton+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    biot3.setVisibility(View.GONE);
                    bio3 = false;
                    go3.setVisibility(View.GONE);
                }
            }
        });
        this.biot4 = (TextView) findViewById(R.id.biot4);
        this.go4 = (Button) findViewById(R.id.go24);
        this.biod4 = (Button) findViewById(R.id.biod4);
        biod4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bio4 == false) {
                    biot4.setVisibility(View.VISIBLE);
                    bio4 = true;
                    go4.setVisibility(View.VISIBLE);
                    go4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Cambridge+Butterfly+Conservatory,+Cambridge+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    biot4.setVisibility(View.GONE);
                    bio4 = false;
                    go4.setVisibility(View.GONE);
                }
            }
        });
        this.biot5 = (TextView) findViewById(R.id.biot5);
        this.go5 = (Button) findViewById(R.id.go25);
        this.biod5 = (Button) findViewById(R.id.biod5);
        biod5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bio5 == false) {
                    biot5.setVisibility(View.VISIBLE);
                    bio5 = true;
                    go5.setVisibility(View.VISIBLE);
                    go5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=680+Plains+Rd+W,+Burlington+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    biot5.setVisibility(View.GONE);
                    bio5 = false;
                    go5.setVisibility(View.GONE);
                }
            }
        });
        this.biot6 = (TextView) findViewById(R.id.biot6);
        this.go6 = (Button) findViewById(R.id.go26);
        this.biod6 = (Button) findViewById(R.id.biod6);
        biod6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bio6 == false) {
                    biot6.setVisibility(View.VISIBLE);
                    bio6 = true;
                    go6.setVisibility(View.VISIBLE);
                    go6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Bruce+Peninsule+National+Park,+Tobermory+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    biot6.setVisibility(View.GONE);
                    bio6 = false;
                    go6.setVisibility(View.GONE);
                }
            }
        });
        this.biot7 = (TextView) findViewById(R.id.biot7);
        this.go7 = (Button) findViewById(R.id.go27);
        this.biod7 = (Button) findViewById(R.id.biod7);
        biod7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bio7 == false) {
                    biot7.setVisibility(View.VISIBLE);
                    bio7 = true;
                    go7.setVisibility(View.VISIBLE);
                    go7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Niagara+Falls,+Niagara+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    biot7.setVisibility(View.GONE);
                    bio7 = false;
                    go7.setVisibility(View.GONE);
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
