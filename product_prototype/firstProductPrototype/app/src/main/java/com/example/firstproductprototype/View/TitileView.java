package com.example.firstproductprototype.View;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.firstproductprototype.R;

/**
 * Created by admin on 2017/10/10.
 */

public class TitileView {

    public TextView titleLeftText;
    public TextView titleCenterText;
    public TextView titleRightText;
    public Button titleLeftButton;
    public Button titleRightButton;

    public void showTitleLeftText(int leftTxedID, boolean isshow) {
        if(titleLeftText != null) {
            if(isshow){
                titleLeftText.setText(leftTxedID);
                titleLeftText.setVisibility(View.VISIBLE);
            }else{
                titleLeftText.setVisibility(View.INVISIBLE);
            }
        }
    }
    public void showTitleCenterText(int centerTxedID, boolean isshow) {
        if(titleCenterText != null) {
            if(isshow){
                titleCenterText.setText(centerTxedID);
                titleCenterText.setVisibility(View.VISIBLE);
            }else{
                titleCenterText.setVisibility(View.INVISIBLE);
            }
        }
    }

    public void showTitleRightText(int rightTxedID, boolean isshow) {
        if(titleRightText != null) {
            if(isshow){
                titleRightText.setText(rightTxedID);
                titleRightText.setVisibility(View.VISIBLE);
            }else{
                titleRightText.setVisibility(View.INVISIBLE);
            }
        }
    }


    public void showTitleLeftBtnImg(int titleLeftBtnImgID, boolean isshow){
        if (titleLeftButton != null){
            if (isshow){
                titleLeftButton.setBackgroundResource(titleLeftBtnImgID);
                titleLeftButton.setVisibility(View.VISIBLE);
            }else{
                titleLeftButton.setVisibility(View.INVISIBLE);
            }
        }
    }

    public void showTitleRightBtnImg(int titleRightBtnImgID, boolean isshow){
        if (titleRightButton != null){
            if (isshow){
                titleRightButton.setBackgroundResource(titleRightBtnImgID);
                titleRightButton.setVisibility(View.VISIBLE);
            }else{
                titleRightButton.setVisibility(View.INVISIBLE);
            }
        }
    }
}
