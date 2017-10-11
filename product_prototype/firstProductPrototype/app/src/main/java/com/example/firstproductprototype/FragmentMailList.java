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

public class FragmentMailList extends Fragment {
    private View view;
    private TitileView titileView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_maillist, null);
        titileView = new TitileView();
        titileView.titleCenterText = view.findViewById(R.id.tx_title_center);
        titileView.showTitleCenterText(R.string.maillist, true);
        titileView.titleRightButton = view.findViewById(R.id.btn_title_edit);
        titileView.showTitleRightBtnImg(R.drawable.ic_arrow_upward, true);

        return view;
    }
}

