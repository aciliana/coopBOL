package com.acilia.barcodeoflife;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by alicia on 2015-07-07.
 */
public class ArtActivity extends ActionBarActivity {
    Button artd1, artd2, artd3, artd4, artd5, artd6, artd7, artd8;
    Button go1, go2, go3, go4, go5, go6, go7, go8;
    TextView artt1, artt2, artt3, artt4, artt5, artt6, artt7, artt8;
    Boolean art1 = false, art2 = false, art3 = false, art4 = false, art5 = false, art6 = false, art7 = false, art8 = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.art);
        this.artt1 = (TextView) findViewById(R.id.artt1);
        this.go1 = (Button) findViewById(R.id.go1);
        this.artd1 = (Button) findViewById(R.id.artd1);
        artd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (art1 == false) {
                    artt1.setVisibility(View.VISIBLE);
                    art1 = true;
                    go1.setVisibility(View.VISIBLE);
                    go1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Macdonald+Stewart+Art+Center,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    artt1.setVisibility(View.GONE);
                    art1 = false;
                    go1.setVisibility(View.GONE);
                }
            }
        });
        this.artt2 = (TextView) findViewById(R.id.artt2);
        this.artd2 = (Button) findViewById(R.id.artd2);
        this.go2 = (Button) findViewById(R.id.go2);
        artd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (art2 == false) {
                    artt2.setVisibility(View.VISIBLE);
                    art2 = true;
                    go2.setVisibility(View.VISIBLE);
                    go2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Guelph+Civic+Museum,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    artt2.setVisibility(View.GONE);
                    art2 = false;
                    go2.setVisibility(View.GONE);
                }
            }
        });
        this.artt3 = (TextView) findViewById(R.id.artt3);
        this.artd3 = (Button) findViewById(R.id.artd3);
        this.go3 = (Button) findViewById(R.id.go3);
        artd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (art3 == false) {
                    artt3.setVisibility(View.VISIBLE);
                    art3 = true;
                    go3.setVisibility(View.VISIBLE);
                    go3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Mccrae+House,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    artt3.setVisibility(View.GONE);
                    art3 = false;
                    go3.setVisibility(View.GONE);
                }
            }
        });
        this.artt4 = (TextView) findViewById(R.id.artt4);
        this.artd4 = (Button) findViewById(R.id.artd4);
        this.go4 = (Button) findViewById(R.id.go4);
        artd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (art4 == false) {
                    artt4.setVisibility(View.VISIBLE);
                    art4 = true;
                    go4.setVisibility(View.VISIBLE);
                    go4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Art+Gallery+of+Ontario,+Toronto+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    artt4.setVisibility(View.GONE);
                    art4 = false;
                    go4.setVisibility(View.GONE);
                }
            }
        });
        this.artt5 = (TextView) findViewById(R.id.artt5);
        this.artd5 = (Button) findViewById(R.id.artd5);
        this.go5 = (Button) findViewById(R.id.go5);
        artd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (art5 == false) {
                    artt5.setVisibility(View.VISIBLE);
                    art5 = true;
                    go5.setVisibility(View.VISIBLE);
                    go5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Royal+Ontario+Museum,+Toronto+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    artt5.setVisibility(View.GONE);
                    art5 = false;
                    go5.setVisibility(View.GONE);
                }
            }
        });
        this.artt6 = (TextView) findViewById(R.id.artt6);
        this.artd6 = (Button) findViewById(R.id.artd6);
        this.go6 = (Button) findViewById(R.id.go6);
        artd6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (art6 == false) {
                    artt6.setVisibility(View.VISIBLE);
                    art6 = true;
                    go6.setVisibility(View.VISIBLE);
                    go6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Aga+Khan+Museum,+Toronto+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    artt6.setVisibility(View.GONE);
                    art6 = false;
                    go6.setVisibility(View.GONE);
                }
            }
        });
        this.artt7 = (TextView) findViewById(R.id.artt7);
        this.artd7 = (Button) findViewById(R.id.artd7);
        this.go7 = (Button) findViewById(R.id.go7);
        artd7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (art7 == false) {
                    artt7.setVisibility(View.VISIBLE);
                    art7 = true;
                    go7.setVisibility(View.VISIBLE);
                    go7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=McMichael+Canadian+Art+Collection,+Toronto+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    artt7.setVisibility(View.GONE);
                    art7 = false;
                    go7.setVisibility(View.GONE);
                }
            }
        });
        this.artt8 = (TextView) findViewById(R.id.artt8);
        this.artd8 = (Button) findViewById(R.id.artd8);
        this.go8 = (Button) findViewById(R.id.go8);
        artd8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (art8 == false) {
                    artt8.setVisibility(View.VISIBLE);
                    art8 = true;
                    go8.setVisibility(View.VISIBLE);
                    go8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Stratford+Festival,+Stratford+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    artt8.setVisibility(View.GONE);
                    art8 = false;
                    go8.setVisibility(View.GONE);
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