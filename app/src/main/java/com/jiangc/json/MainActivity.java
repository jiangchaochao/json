package com.jiangc.json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    Gson gSon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String str = loadConfig();

        gSon = new Gson();

        InfoBean infoBean = gSon.fromJson(str, InfoBean.class);
        Log.e(TAG, "onCreate: infoBean.toString = " + infoBean.getName() + "   number = " + infoBean.getNumber());
        List<Results> results = infoBean.getResults();
        for (int i = 0; i < results.size(); i++) {
            Log.e(TAG, "name :" + results.get(i).getName() + "  number: " + results.get(i).getNumber());
            for (int j = 0; j < results.get(i).getrtmpinfo().size(); j ++)
            {
                Log.e(TAG, "name: " +  results.get(i).getrtmpinfo().get(j).getName() + "    uri: " + results.get(i).getrtmpinfo().get(j).getUri());
            }
        }
//        Log.e(TAG, "onCreate: str = " + str );

    }



    private String loadConfig() {
        InputStream is = null;
        ByteArrayOutputStream bos = null;
        try {
            is = getAssets().open("config.json");
            bos = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int len;
            while ((len = is.read(b)) != -1) {
                bos.write(b, 0, len);
            }
            return bos.toString("utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null)
                    bos.close();
                if (is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
