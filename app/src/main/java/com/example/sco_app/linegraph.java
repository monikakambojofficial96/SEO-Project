package com.example.sco_app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

import java.util.ArrayList;

public class linegraph extends AppCompatActivity   {

    private static final String Tag ="linegraph";

    private LineChart mChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

        // To make full screen layout
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView ( R.layout.activity_linegraph );

        mChart=findViewById( R.id.linechart );
       // mChart.setOnChartGestureListener (linegraph.this);
       //mChart.setOnChartValueSelectedListener ( linegraph.this );
        mChart.setDragEnabled ( true );
        mChart.setScaleEnabled ( false );


//store y value
        ArrayList <Entry> yvalues=new ArrayList <> (  );
        yvalues.add ( new Entry (0,60) );
        yvalues.add ( new Entry (1,20) );
        yvalues.add ( new Entry (2,40) );
        yvalues.add ( new Entry (3,30) );

        //store x values
            ArrayList<String> xVals = new ArrayList<String>();
            xVals.add("10");
            xVals.add("20");
            xVals.add("30");
            xVals.add("40");
            xVals.add("50");

        LineDataSet set1=new LineDataSet ( yvalues,"dataset1" );
        set1.setFillAlpha ( 110 );
        set1.setColor(Color.BLACK);
        set1.setCircleColor( Color.BLACK);
        set1.setLineWidth(1f);
        set1.setCircleRadius(3f);
        set1.setDrawCircleHole(false);
        set1.setValueTextSize(9f);
        set1.setDrawFilled(true);

        ArrayList<ILineDataSet> dataSets=new ArrayList <> ( );
        dataSets.add(set1);

        LineData data = new LineData(xVals , dataSets);
        mChart.setData(data);

    }
}
