package com.example.lenovo.tab_fragments_tasks;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
 private  static  final  String tab="MainActivity";
 private SectionsPageAdapter mSectionPageAdapter;
private ViewPager mviewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tab ,"onCreate : Starting.");
        mSectionPageAdapter=new SectionsPageAdapter(getSupportFragmentManager());
        mviewPager=(ViewPager) findViewById(R.id.container);
        setupViewPager(mviewPager);
        TabLayout tabLayout=(TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mviewPager);

    }
    private void setupViewPager(ViewPager viewPager){


        SectionsPageAdapter adapter=new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new staus(),"STATUS");
        adapter.addFragment(new chats(),"CHATS");
        adapter.addFragment(new calls(),"CALLS");
        viewPager .setAdapter(adapter);

    }


}