package com.longvuse3haui.viettravel;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TabHost;

import java.util.ArrayList;


public class FriendTourFragment extends Fragment {

    public FriendTourFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_friend_tour, container, false);

        Spinner spinnerSex = (Spinner)v.findViewById(R.id.spnSex);

        ArrayList<String> listSex = new ArrayList<String>();
        listSex.add("Male");
        listSex.add("Female");

        ArrayAdapter<String> dataAdapterTour = new ArrayAdapter(this.getActivity(),
                android.R.layout.simple_spinner_item, listSex);
        dataAdapterTour.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSex.setAdapter(dataAdapterTour);

        spinnerSex.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView parent) {

            }
        });


        Spinner spinnerProvince = (Spinner) v.findViewById(R.id.spnProvince);
        ArrayList<String> listProvince = new ArrayList<String>();
        listProvince.add("Hà Nội");
        listProvince.add("Huế");
        listProvince.add("Sa Pa");
        listProvince.add("Lào Cai");
        listProvince.add("Đà Nẵng");
        listProvince.add("Đà Lạt");
        listProvince.add("Cần Thơ");
        listProvince.add("Hà Giang");
        listProvince.add("Vũng Tàu");
        listProvince.add("TP. Hồ Chí Minh");

        ArrayAdapter<String> dataAdapterProvince = new ArrayAdapter<String>(this.getActivity(),
                android.R.layout.simple_spinner_item, listProvince);
        dataAdapterProvince.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerProvince.setAdapter(dataAdapterProvince);

        spinnerProvince.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView parent) {
            }
        });
        return v;
    }
    }
