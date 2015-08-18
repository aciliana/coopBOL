package com.acilia.barcodeoflife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
/**
 * Created by alicia on 2015-07-03.
 */
public class SplashScreen extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        //Create new thread for splash timer
        Thread timerThread = new Thread(){
            public void run(){
                try{//try to display splash for 4 seconds
                    sleep(3000);
                }catch(InterruptedException e){//otherwise print error
                    e.printStackTrace();
                }finally{//display the next screen
                    Intent i = new Intent("com.acilia.barcodeoflife.INST1ACTIVITY");
                    startActivity(i);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // destroy screen after used
        super.onPause();
        finish();
    }
}
