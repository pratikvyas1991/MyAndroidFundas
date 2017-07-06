package com.androidbasics;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by tasol on 4/7/17.
 */

public class StudentFragment extends Fragment {
    String fragmentName="Student Fragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_one,container,false);
        TextView tvText=(TextView)view.findViewById(R.id.tvText);
        tvText.setText("Student Fragment");



        tvText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((FragDashActivity)getActivity()).changePosition(0);

            }
        });
        return view;
    }
}
