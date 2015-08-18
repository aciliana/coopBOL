package com.acilia.barcodeoflife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by alicia on 2015-07-08.
 */
public class Inst2Activity extends ActionBarActivity{
    Button full;
    Button skip;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inst2);
        full = (Button)findViewById(R.id.inst2);
        full.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.acilia.barcodeoflife.INST3ACTIVITY");
                startActivity(i);
            }
        });
        skip = (Button)findViewById(R.id.skip2);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.acilia.barcodeoflife.MAINACTIVITY");
                startActivity(i);
            }
        });
    }
    @Override
    protected void onPause() {
        // destroy screen after used
        super.onPause();
        finish();
    }
}
