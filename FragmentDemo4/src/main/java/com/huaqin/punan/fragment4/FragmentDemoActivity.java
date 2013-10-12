package com.huaqin.punan.fragment4;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

public class FragmentDemoActivity extends Activity implements HeadlinesFragment.OnHeadlineSelectedListener{

    boolean mDualPane;
    int mCurCheckPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main4);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.fragment_demo, menu);
        return true;
    }

    @Override
    public void onArticleSelected(int position) {
        Toast.makeText(this,position+" clicked",Toast.LENGTH_SHORT).show();
    }
}