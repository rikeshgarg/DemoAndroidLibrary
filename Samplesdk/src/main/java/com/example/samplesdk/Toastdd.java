package com.example.samplesdk;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.widget.Toast;

import java.io.IOException;

public class Toastdd extends Application {

    public void showtext(Context c, String msg) {
        Toast.makeText(c, msg, Toast.LENGTH_SHORT).show();

    }


}
