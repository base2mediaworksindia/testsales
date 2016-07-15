package com.example.vanip_000.profile_salesbox;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import mg.yra.lib.trackingring.DataEntry;
import mg.yra.lib.trackingring.DataSet;
import mg.yra.lib.trackingring.OverlayedCircularProgressDrawable;
import mg.yra.lib.trackingring.TrackingRingView;


/**
 * Created by vanip_000 on 14-07-2016.
 */
public class Custom_Circular_progress extends AppCompatActivity {

    private  TrackingRingView trackingRingView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_circular_progressbar);

        trackingRingView = (TrackingRingView) findViewById(R.id.tracking_ring1);
        configureRingView1();
    }

    private void configureRingView1() {
        final List<DataEntry> entries = new ArrayList<>();
        entries.add(new DataEntry(10,"", Color.BLUE, Color.WHITE));
        entries.add(new DataEntry(100,"", Color.MAGENTA, Color.WHITE));
        //entries.add(new DataEntry(60, getResources().getDrawable(android.R.drawable.ic_menu_compass), Color.GREEN, Color.LTGRAY));
        final DataSet dataset = new DataSet(entries);
        trackingRingView.setDataSet(dataset);
    }


}
