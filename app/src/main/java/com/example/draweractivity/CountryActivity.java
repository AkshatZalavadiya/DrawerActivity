package com.example.draweractivity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CountryActivity extends Fragment {

    TextView tv;
    public CountryActivity() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_country, container, false);
        String country = getArguments().getString("country");

        tv = view.findViewById(R.id.text);
        tv.setText(country);
        return view;
    }

}
