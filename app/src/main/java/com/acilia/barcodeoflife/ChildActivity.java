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
public class ChildActivity extends ActionBarActivity {
    Button childd1, childd2, childd3, childd4, childd5, childd6, childd7, childd8, childd9, childd10;
    Button go1, go2, go3, go4, go5, go6, go7, go8, go9, go10;
    TextView childt1, childt2, childt3, childt4, childt5, childt6, childt7, childt8, childt9, childt10;
    Boolean child1 = false , child2 = false , child3 = false , child4 = false , child5 = false , child6 = false , child7 = false , child8 = false , child9 = false , child10 = false ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.child);
        this.childt1 = (TextView)findViewById(R.id.childt1);
        this.go1 = (Button)findViewById(R.id.go31);
        this.childd1 = (Button)findViewById(R.id.childd1);
        childd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (child1 == false) {
                    childt1.setVisibility(View.VISIBLE);
                    child1 = true;
                    go1.setVisibility(View.VISIBLE);
                    go1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Toronto+Zoo,+Toronto+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    childt1.setVisibility(View.GONE);
                    child1 = false;
                    go1.setVisibility(View.GONE);
                }
            }
        });
        this.childt2 = (TextView)findViewById(R.id.childt2);
        this.go2 = (Button)findViewById(R.id.go32);
        this.childd2 = (Button)findViewById(R.id.childd2);
        childd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (child2 == false) {
                    childt2.setVisibility(View.VISIBLE);
                    child2 = true;
                    go2.setVisibility(View.VISIBLE);
                    go2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=African+Lion+Safari,+Toronto+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    childt2.setVisibility(View.GONE);
                    child2 = false;
                    go2.setVisibility(View.GONE);
                }
            }
        });
        this.childt3 = (TextView)findViewById(R.id.childt3);
        this.go3 = (Button)findViewById(R.id.go33);
        this.childd3 = (Button)findViewById(R.id.childd3);
        childd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (child3 == false) {
                    childt3.setVisibility(View.VISIBLE);
                    child3 = true;
                    go3.setVisibility(View.VISIBLE);
                    go3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Ripley's+Aquarium+of+Canada,+Toronto+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    childt3.setVisibility(View.GONE);
                    child3 = false;
                    go3.setVisibility(View.GONE);
                }
            }
        });
        this.childt4 = (TextView)findViewById(R.id.childt4);
        this.go4 = (Button)findViewById(R.id.go34);
        this.childd4 = (Button)findViewById(R.id.childd4);
        childd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (child4 == false) {
                    childt4.setVisibility(View.VISIBLE);
                    child4 = true;
                    go4.setVisibility(View.VISIBLE);
                    go4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=6981+Puslinch+Conc.+4+RR#6,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    childt4.setVisibility(View.GONE);
                    child4 = false;
                    go4.setVisibility(View.GONE);
                }
            }
        });
        this.childt5 = (TextView)findViewById(R.id.childt5);
        this.go5 = (Button)findViewById(R.id.go35);
        this.childd5 = (Button)findViewById(R.id.childd5);
        childd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (child5 == false) {
                    childt5.setVisibility(View.VISIBLE);
                    child5 = true;
                    go5.setVisibility(View.VISIBLE);
                    go5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=59+Carden+Street,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    childt5.setVisibility(View.GONE);
                    child5 = false;
                    go5.setVisibility(View.GONE);
                }
            }
        });
        this.childt6 = (TextView)findViewById(R.id.childt6);
        this.go6 = (Button)findViewById(R.id.go36);
        this.childd6 = (Button)findViewById(R.id.childd6);
        childd6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (child6 == false) {
                    childt6.setVisibility(View.VISIBLE);
                    child6 = true;
                    go6.setVisibility(View.VISIBLE);
                    go6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Riverside+Park+Concession,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    childt6.setVisibility(View.GONE);
                    child6 = false;
                    go6.setVisibility(View.GONE);
                }
            }
        });
        this.childt7 = (TextView)findViewById(R.id.childt7);
        this.go7 = (Button)findViewById(R.id.go37);
        this.childd7 = (Button)findViewById(R.id.childd7);
        childd7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (child7 == false) {
                    childt7.setVisibility(View.VISIBLE);
                    child7 = true;
                    go7.setVisibility(View.VISIBLE);
                    go7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Funmazing+Playcenter,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    childt7.setVisibility(View.GONE);
                    child7 = false;
                    go7.setVisibility(View.GONE);
                }
            }
        });
        this.childt8 = (TextView)findViewById(R.id.childt8);
        this.go8 = (Button)findViewById(R.id.go38);
        this.childd8 = (Button)findViewById(R.id.childd8);
        childd8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (child8 == false) {
                    childt8.setVisibility(View.VISIBLE);
                    child8 = true;
                    go8.setVisibility(View.VISIBLE);
                    go8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=The+Children's+Art+Factory,+Guelph+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    childt8.setVisibility(View.GONE);
                    child8 = false;
                    go8.setVisibility(View.GONE);
                }
            }
        });
        this.childt9 = (TextView)findViewById(R.id.childt9);
        this.go9 = (Button)findViewById(R.id.go39);
        this.childd9 = (Button)findViewById(R.id.childd9);
        childd9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (child9 == false) {
                    childt9.setVisibility(View.VISIBLE);
                    child9 = true;
                    go9.setVisibility(View.VISIBLE);
                    go9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Canada's+Wonderland,+Vaughan+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    childt9.setVisibility(View.GONE);
                    child9 = false;
                    go9.setVisibility(View.GONE);
                }
            }
        });
        this.childt10 = (TextView)findViewById(R.id.childt10);
        this.go10 = (Button)findViewById(R.id.go30);
        this.childd10 = (Button)findViewById(R.id.childd10);
        childd10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (child10 == false) {
                    childt10.setVisibility(View.VISIBLE);
                    child10 = true;
                    go10.setVisibility(View.VISIBLE);
                    go10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri gmmIntentUri = Uri.parse("google.navigation:q=THEMUSEUM,+Kitchener+Canada");
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                                startActivity(mapIntent);
                            }
                        }
                    });
                } else {
                    childt10.setVisibility(View.GONE);
                    child10 = false;
                    go10.setVisibility(View.GONE);
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
