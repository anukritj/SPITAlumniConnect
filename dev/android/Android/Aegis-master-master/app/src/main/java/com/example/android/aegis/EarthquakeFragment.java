package com.example.android.aegis;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Anukritjain on 09/10/17.
 */

/*public class EarthquakeFragment extends android.support.v4.app.Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.earthquake, container, false);
    }
}*/


public class EarthquakeFragment extends Fragment {

    View myView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        myView = inflater.inflate(R.layout.earthquake,container,false);
        return myView;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        CardView beforeEarthquake = (CardView)getView().findViewById(R.id.before_earthquake);
        CardView duringEarthquake = (CardView)getView().findViewById(R.id.during_earthquake);
        CardView afterEarthquake = (CardView)getView().findViewById(R.id.after_earthquake);

        beforeEarthquake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),beforeEarthquakeActivity.class));
            }
        });

        duringEarthquake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),duringEarthquakeActivity.class));
            }
        });

        afterEarthquake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),afterEarthquakeActivity.class));
            }
        });
    }

}