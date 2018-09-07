package com.example.victorringeard.converter;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.EditText;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void updateDistance(View v) {
        final TextView walking = findViewById(R.id.textView2);
        final TextView segwayninebot = findViewById(R.id.textView4);
        final TextView segwayse = findViewById(R.id.textView5);
        final TextView razor = findViewById(R.id.textView6);
        final TextView boosted = findViewById(R.id.textView7);
        final TextView evolve = findViewById(R.id.textView8);
        final TextView onewheel = findViewById(R.id.textView9);
        final TextView mototec = findViewById(R.id.textView10);
        final TextView geoblade = findViewById(R.id.textView11);
        final TextView hovertrax = findViewById(R.id.textView12);
        final EditText input = findViewById(R.id.editText);
        if (!TextUtils.isEmpty(input.getText())) {
            String distancetoconvert = input.getText().toString();

            double diss = Float.parseFloat(distancetoconvert);
            double diss_w = (double) Math.round(diss / 3.1 * 10) / 10.0;
            double diss_s9 = (double) Math.round(diss / 18 * 10) / 10.0;
            double diss_se = (double) Math.round(diss / 26 * 10) / 10.0;
            double diss_r = (double) Math.round(diss / 19 * 10) / 10.0;
            double diss_b = (double) Math.round(diss / 22 * 10) / 10.0;
            double diss_e = (double) Math.round(diss / 12.5 * 10) / 10.0;
            double diss_ow = (double) Math.round(diss / 12.5 * 10) / 10.0;
            double diss_mt = (double) Math.round(diss / 10 * 10) / 10.0;
            double diss_g = (double) Math.round(diss / 15 * 10) / 10.0;
            double diss_h = (double) Math.round(diss / 8 * 10) / 10.0;

            walking.setText(Double.toString(diss_w) + " hours");
            segwayninebot.setText(Double.toString(diss_s9) + " hours");
            segwayse.setText(Double.toString(diss_se) + " hours");
            razor.setText(Double.toString(diss_r) + " hours");
            boosted.setText(Double.toString(diss_b) + " hours");
            evolve.setText(Double.toString(diss_e) + " hours");
            onewheel.setText(Double.toString(diss_ow) + " hours");
            mototec.setText(Double.toString(diss_mt) + " hours");
            geoblade.setText(Double.toString(diss_g) + " hours");
            hovertrax.setText(Double.toString(diss_h) + " hours");

            if (diss > 31) {
                walking.setTextColor(android.graphics.Color.RED);
                segwayninebot.setTextColor(android.graphics.Color.RED);
                segwayse.setTextColor(android.graphics.Color.RED);
                razor.setTextColor(android.graphics.Color.RED);
                boosted.setTextColor(android.graphics.Color.RED);
                evolve.setTextColor(android.graphics.Color.RED);
                onewheel.setTextColor(android.graphics.Color.RED);
                mototec.setTextColor(android.graphics.Color.RED);
                geoblade.setTextColor(android.graphics.Color.RED);
                hovertrax.setTextColor(android.graphics.Color.RED);
            } else if (diss > 30) {
                walking.setTextColor(android.graphics.Color.RED);
                segwayninebot.setTextColor(android.graphics.Color.RED);
                segwayse.setTextColor(android.graphics.Color.RED);
                razor.setTextColor(android.graphics.Color.RED);
                boosted.setTextColor(android.graphics.Color.RED);
                evolve.setTextColor(Color.BLACK);
                onewheel.setTextColor(android.graphics.Color.RED);
                mototec.setTextColor(android.graphics.Color.RED);
                geoblade.setTextColor(android.graphics.Color.RED);
                hovertrax.setTextColor(android.graphics.Color.RED);
            } else if (diss > 24) {
                walking.setTextColor(Color.BLACK);
                segwayninebot.setTextColor(android.graphics.Color.RED);
                segwayse.setTextColor(android.graphics.Color.RED);
                razor.setTextColor(android.graphics.Color.RED);
                boosted.setTextColor(android.graphics.Color.RED);
                evolve.setTextColor(Color.BLACK);
                onewheel.setTextColor(android.graphics.Color.RED);
                mototec.setTextColor(android.graphics.Color.RED);
                geoblade.setTextColor(android.graphics.Color.RED);
                hovertrax.setTextColor(android.graphics.Color.RED);
            } else if (diss > 15) {
                walking.setTextColor(Color.BLACK);
                segwayninebot.setTextColor(android.graphics.Color.RED);
                segwayse.setTextColor(Color.BLACK);
                razor.setTextColor(android.graphics.Color.RED);
                boosted.setTextColor(android.graphics.Color.RED);
                evolve.setTextColor(Color.BLACK);
                onewheel.setTextColor(android.graphics.Color.RED);
                mototec.setTextColor(android.graphics.Color.RED);
                geoblade.setTextColor(android.graphics.Color.RED);
                hovertrax.setTextColor(android.graphics.Color.RED);
            } else if (diss > 10) {
                walking.setTextColor(Color.BLACK);
                segwayninebot.setTextColor(Color.BLACK);
                segwayse.setTextColor(Color.BLACK);
                razor.setTextColor(android.graphics.Color.RED);
                boosted.setTextColor(android.graphics.Color.RED);
                evolve.setTextColor(Color.BLACK);
                onewheel.setTextColor(android.graphics.Color.RED);
                mototec.setTextColor(android.graphics.Color.RED);
                geoblade.setTextColor(android.graphics.Color.RED);
                hovertrax.setTextColor(android.graphics.Color.RED);
            } else if (diss > 8) {
                walking.setTextColor(Color.BLACK);
                segwayninebot.setTextColor(Color.BLACK);
                segwayse.setTextColor(Color.BLACK);
                razor.setTextColor(android.graphics.Color.RED);
                boosted.setTextColor(android.graphics.Color.RED);
                evolve.setTextColor(Color.BLACK);
                onewheel.setTextColor(android.graphics.Color.RED);
                mototec.setTextColor(Color.BLACK);
                geoblade.setTextColor(android.graphics.Color.RED);
                hovertrax.setTextColor(android.graphics.Color.RED);
            } else if (diss > 7) {
                walking.setTextColor(Color.BLACK);
                segwayninebot.setTextColor(Color.BLACK);
                segwayse.setTextColor(Color.BLACK);
                razor.setTextColor(android.graphics.Color.RED);
                boosted.setTextColor(android.graphics.Color.RED);
                evolve.setTextColor(Color.BLACK);
                onewheel.setTextColor(android.graphics.Color.RED);
                mototec.setTextColor(Color.BLACK);
                geoblade.setTextColor(Color.BLACK);
                hovertrax.setTextColor(Color.BLACK);
            } else {
                walking.setTextColor(Color.BLACK);
                segwayninebot.setTextColor(Color.BLACK);
                segwayse.setTextColor(Color.BLACK);
                razor.setTextColor(Color.BLACK);
                boosted.setTextColor(Color.BLACK);
                evolve.setTextColor(Color.BLACK);
                onewheel.setTextColor(Color.BLACK);
                mototec.setTextColor(Color.BLACK);
                geoblade.setTextColor(Color.BLACK);
                hovertrax.setTextColor(Color.BLACK);
            }
        }

    }
}
