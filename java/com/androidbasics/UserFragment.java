package com.androidbasics;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by tasol on 4/7/17.
 */

public class UserFragment extends Fragment {
    String fragmentName="UserFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_one,container,false);
        TextView tvText=(TextView)view.findViewById(R.id.tvText);
        tvText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((FragDashActivity)getActivity()).changePosition(1);

            }
        });
        Log.v("@@@WWe","onCrateView "+fragmentName);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("@@@WWe","onCreate "+fragmentName);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.v("@@@WWe","onAttach "+fragmentName);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.v("@@@WWe","onActivityCreated "+fragmentName);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.v("@@@WWe","onStart "+fragmentName);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.v("@@@WWe","onResume "+fragmentName);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v("@@@WWe","onPaused "+fragmentName);
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.v("@@@WWe","onStop "+fragmentName);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.v("@@@WWe","onDestroyView "+fragmentName);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v("@@@WWe","onDestroy "+fragmentName);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.v("@@@WWe","onDetach "+fragmentName);
    }

    @Override
    public void setMenuVisibility(boolean menuVisible) {
        super.setMenuVisibility(menuVisible);
        Log.v("@@@WWe","Menu Visibility "+fragmentName);
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.v("@@@WWe","User Visible hint "+fragmentName);
    }
}
