package com.example.firstproductprototype;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.firstproductprototype.View.TitileView;

public class MainActivity extends FragmentActivity{

    private FragmentManager fManager;

    private FragmentKill fragment_kill;
    private FragmentMailList fragment_mail;
    private FragmentMessage fragment_message;
    private FragmentNearby fragment_nearby;
    private FragmentMe fragment_me;

    //新加
    //private TitileView tv1;


    //附近
    private ImageView iv_menu_nearby;
    private TextView tv_menu_nearby;

    // 消息
    private ImageView iv_menu_message;
    private TextView tv_menu_message;

    // 通讯录
    private ImageView iv_menu_maillist;
    private TextView tv_menu_maillist;

    // 技能
    private ImageView iv_menu_kill;
    private TextView tv_menu_kill;

    // 我的
    private ImageView iv_menu_me;
    private TextView tv_menu_me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mian);

        // 初始化组件
        initViews();
        // 默认先点中第一个“首页”
        clickMenu(findViewById(R.id.ll_menu_nearby));
    }

    private void initViews() {
        // 布局管理器
        fManager = getSupportFragmentManager();

        iv_menu_nearby = (ImageView)findViewById(R.id.iv_menu_nearby);
        tv_menu_nearby = (TextView)findViewById(R.id.tv_menu_nearby);

        iv_menu_message = (ImageView)findViewById(R.id.iv_menu_message);
        tv_menu_message = (TextView)findViewById(R.id.tv_menu_message);

        iv_menu_maillist = (ImageView)findViewById(R.id.iv_menu_mail);
        tv_menu_maillist = (TextView)findViewById(R.id.tv_menu_mail);

        iv_menu_kill = (ImageView)findViewById(R.id.iv_menu_kill);
        tv_menu_kill = (TextView)findViewById(R.id.tv_menu_kill);

        iv_menu_me = (ImageView)findViewById(R.id.iv_menu_me);
        tv_menu_me = (TextView)findViewById(R.id.tv_menu_me);
    }

    /**
     * 点击底部菜单事件
     * @param v
     */
    public void clickMenu(View v){
        FragmentTransaction trans = fManager.beginTransaction();
        int vID = v.getId();
        // 设置menu样式
        setMenuStyle(vID);
        // 隐藏所有的fragment
        hideFrament(trans);
        // 设置Fragment
        setFragment(vID,trans);
        trans.commit();
    }
    /**
     * 设置menu样式
     * @param vID
     * @param trans
     */
    private void setMenuStyle(int vID) {
        // 附近
        if(vID==R.id.ll_menu_nearby){
            iv_menu_nearby.setImageDrawable(getResources().getDrawable(R.drawable.menu_home_click));
            tv_menu_nearby.setTextColor(getResources().getColor(R.color.menu_click));
        }else {
            iv_menu_nearby.setImageDrawable(getResources().getDrawable(R.drawable.menu_home));
            tv_menu_nearby.setTextColor(getResources().getColor(R.color.menu_nomarl));
        }
        // 消息
        if(vID==R.id.ll_menu_message){
            iv_menu_message.setImageDrawable(getResources().getDrawable(R.drawable.menu_hot_click));
            tv_menu_message.setTextColor(getResources().getColor(R.color.menu_click));
        }else {
            iv_menu_message.setImageDrawable(getResources().getDrawable(R.drawable.menu_hot));
            tv_menu_message.setTextColor(getResources().getColor(R.color.menu_nomarl));
        }
        // 通讯录
        if(vID==R.id.ll_menu_mail){
            iv_menu_maillist.setImageDrawable(getResources().getDrawable(R.drawable.menu_talk_click));
            tv_menu_maillist.setTextColor(getResources().getColor(R.color.menu_click));
        }else {
            iv_menu_maillist.setImageDrawable(getResources().getDrawable(R.drawable.menu_talk));
            tv_menu_maillist.setTextColor(getResources().getColor(R.color.menu_nomarl));
        }

        // 技能
        if(vID==R.id.ll_menu_kill){
            iv_menu_kill.setImageDrawable(getResources().getDrawable(R.drawable.menu_hot_click));
            tv_menu_kill.setTextColor(getResources().getColor(R.color.menu_click));
        }else {
            iv_menu_kill.setImageDrawable(getResources().getDrawable(R.drawable.menu_hot));
            tv_menu_kill.setTextColor(getResources().getColor(R.color.menu_nomarl));
        }
        // 我的
        if(vID==R.id.ll_menu_me){
            iv_menu_me.setImageDrawable(getResources().getDrawable(R.drawable.menu_me_click));
            tv_menu_me.setTextColor(getResources().getColor(R.color.menu_click));
        }else {
            iv_menu_me.setImageDrawable(getResources().getDrawable(R.drawable.menu_me));
            tv_menu_me.setTextColor(getResources().getColor(R.color.menu_nomarl));
        }
    }


    /**
     * 隐藏所有的fragment(编程初始化状态)
     * @param trans
     */
    private void hideFrament(FragmentTransaction trans) {
        if(fragment_nearby!=null){
            trans.hide(fragment_nearby);
        }
        if(fragment_message!=null){
            trans.hide(fragment_message);
        }
        if(fragment_mail!=null){
            trans.hide(fragment_mail);
        }

        if(fragment_kill!=null){
            trans.hide(fragment_kill);
        }
        if(fragment_me!=null){
            trans.hide(fragment_me);
        }
    }

    /**
     * 设置Fragment
     * @param vID
     * @param trans
     */
    private void setFragment(int vID,FragmentTransaction trans) {
        switch (vID) {
            case R.id.ll_menu_nearby:
                if(fragment_nearby==null){
                    fragment_nearby = new FragmentNearby();
                    trans.add(R.id.content, fragment_nearby);
                }else{
                    trans.show(fragment_nearby);
                }
                break;
            case R.id.ll_menu_message:
                if(fragment_message==null){
                    fragment_message = new FragmentMessage();
                    trans.add(R.id.content, fragment_message);
                }else{
                    trans.show(fragment_message);
                }
                break;
            case R.id.ll_menu_mail:
                if(fragment_mail==null){
                    fragment_mail = new FragmentMailList();
                    trans.add(R.id.content, fragment_mail);
                }else{
                    trans.show(fragment_mail);
                }
                break;

            case R.id.ll_menu_kill:
                if(fragment_kill==null){
                    fragment_kill = new FragmentKill();
                    trans.add(R.id.content, fragment_kill);
                }else{
                    trans.show(fragment_kill);
                }
                break;

            case R.id.ll_menu_me:
                if(fragment_me==null){
                    fragment_me = new FragmentMe();
                    trans.add(R.id.content, fragment_me);
                }else{
                    trans.show(fragment_me);
                }
                break;
            default:
                break;
        }
    }



}
