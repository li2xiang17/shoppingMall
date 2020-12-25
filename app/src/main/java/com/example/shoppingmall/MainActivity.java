package com.example.shoppingmall;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shoppingmall.fragment.ClassifyFragment;
import com.example.shoppingmall.fragment.HomeFragment;
import com.example.shoppingmall.fragment.MineFragment;
import com.example.shoppingmall.fragment.ShoppingFragment;
import com.example.shoppingmall.fragment.SpecialFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RecyclerView mRecycler;
    private FrameLayout mFragment;
    private RadioGroup mRgMain;
    private RadioButton mRbHomeMain;
    private RadioButton mRbSpecialMain;
    private RadioButton mRbClassifyMain;
    private RadioButton mRbShopcalMain;
    private RadioButton mRbMyMain;
    private ArrayList<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mFragment = (FrameLayout) findViewById(R.id.fragment);
        mRgMain = (RadioGroup) findViewById(R.id.rg_main);
        mRbHomeMain = (RadioButton) findViewById(R.id.rb_home_main);
        mRbSpecialMain = (RadioButton) findViewById(R.id.rb_special_main);
        mRbClassifyMain = (RadioButton) findViewById(R.id.rb_classify_main);
        mRbShopcalMain = (RadioButton) findViewById(R.id.rb_shopcal_main);
        mRbMyMain = (RadioButton) findViewById(R.id.rb_my_main);
        mRgMain.setOnCheckedChangeListener(this);

        mRbHomeMain.setChecked(true);
        final FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment, new HomeFragment());
        transaction.commit();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.rb_home_main:
                final FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fragment,new HomeFragment());
                transaction.commit();
                break;

            case R.id.rb_special_main:
                final FragmentManager fragmentManager1 = getSupportFragmentManager();
                FragmentTransaction transaction1 = fragmentManager1.beginTransaction();
                transaction1.replace(R.id.fragment,new SpecialFragment());
                transaction1.commit();
                break;

            case R.id.rb_classify_main:
                final FragmentManager fragmentManager2 = getSupportFragmentManager();
                FragmentTransaction transaction2 = fragmentManager2.beginTransaction();
                transaction2.replace(R.id.fragment,new ClassifyFragment());
                transaction2.commit();
                break;

            case R.id.rb_shopcal_main:
                final FragmentManager fragmentManager3 = getSupportFragmentManager();
                FragmentTransaction transaction3 = fragmentManager3.beginTransaction();
                transaction3.replace(R.id.fragment,new ShoppingFragment());
                transaction3.commit();
                break;

            case R.id.rb_my_main:
                final FragmentManager fragmentManager4 = getSupportFragmentManager();
                FragmentTransaction transaction4 = fragmentManager4.beginTransaction();
                transaction4.replace(R.id.fragment,new MineFragment());
                transaction4.commit();
                break;
        }
    }


}