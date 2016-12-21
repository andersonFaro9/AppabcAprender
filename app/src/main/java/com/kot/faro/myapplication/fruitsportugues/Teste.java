package com.kot.faro.myapplication.fruitsportugues;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by faro on 06/12/16.
 */

public class Teste extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}
