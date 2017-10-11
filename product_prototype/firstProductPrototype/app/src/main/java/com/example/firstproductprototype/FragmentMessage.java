package com.example.firstproductprototype;

import android.support.v4.app.Fragment;
import android.view.View;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.firstproductprototype.View.TitileView;

/**
 * Created by admin on 2017/10/9.
 */

public class FragmentMessage extends Fragment {
    private View view;
    private TitileView titileView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_message, null);
        titileView = new TitileView();
        titileView.titleCenterText = view.findViewById(R.id.tx_title_center);
        titileView.showTitleCenterText(R.string.message, true);

        return view;
    }
}

