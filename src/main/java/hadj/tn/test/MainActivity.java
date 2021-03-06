package hadj.tn.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private static final int NUM_PAGES = 6;
    private ScreenslidePagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //  remove action bar and title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
       // getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        pagerAdapter = new ScreenslidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
    }

    private class ScreenslidePagerAdapter extends FragmentStatePagerAdapter{

        public ScreenslidePagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    FragmentPage1 tab1 = new FragmentPage1();
                    return tab1;
                case 1:
                    FragmentPage2 tab2 = new FragmentPage2();
                    return tab2;
                case 2:
                    FragmentPage3 tab3 = new FragmentPage3();
                    return tab3;
                case 3:
                    FragmentPage4 tab4 = new FragmentPage4();
                    return tab4;
                case 4:
                    FragmentPage5 tab5 = new FragmentPage5();
                    return tab5;
                case 5:
                    FragmentPage6 tab6 = new FragmentPage6();
                    return tab6;
            }
            return null;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}