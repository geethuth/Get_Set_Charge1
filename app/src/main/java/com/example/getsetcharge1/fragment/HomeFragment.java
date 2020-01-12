package com.example.getsetcharge1.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.getsetcharge1.R;
import com.example.getsetcharge1.activity.MyorderActivity;
import com.example.getsetcharge1.activity.PaymentActivity;
import com.example.getsetcharge1.activity.RentActivity;
import com.example.getsetcharge1.activity.StationActivity;

public class HomeFragment extends Fragment {
    RelativeLayout rentLayout, swapLayout, returnLayout, stationsLayout;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        rentLayout = root.findViewById(R.id.rentLayout);
        swapLayout = root.findViewById(R.id.swapLayout);
        returnLayout = root.findViewById(R.id.returnsLayout);
        stationsLayout = root.findViewById(R.id.nearbyLayout);
        rentLayout.setOnClickListener(clickedView -> {
            Intent intent = new Intent(getActivity(), RentActivity.class);
            startActivity(intent);
        });
        swapLayout.setOnClickListener(clickedView -> {
            Intent intent = new Intent(getActivity(), PaymentActivity.class);
            startActivity(intent);
        });
        returnLayout.setOnClickListener(clickedView -> {
            Intent intent = new Intent(getActivity(), MyorderActivity.class);
            startActivity(intent);
        });
        stationsLayout.setOnClickListener(clickedView -> {
            Intent intent = new Intent(getActivity(), StationActivity.class);
            startActivity(intent);
        });

        return root;
    }
}