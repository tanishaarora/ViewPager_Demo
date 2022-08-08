package com.androidprojects.viewpager_demo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.androidprojects.viewpager_demo.adapter.ViewPager_Adapter;

import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

public class MainActivity extends AppCompatActivity {

    /*ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager  = (ViewPager) findViewById(R.id.viewpager);
        ViewPager_Adapter viewPagerAdapter = new ViewPager_Adapter(this);
        viewPager.setAdapter(viewPagerAdapter);
    }*/

     ViewPager viewPager;
    /*LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
       // ViewPager_Adapter viewPagerAdapter = new ViewPager_Adapter(this);
        viewPager.setAdapter(new ViewPager_Adapter(this));

        ScrollingPagerIndicator pagerIndicator2 = findViewById(R.id.indicator);
        pagerIndicator2.attachToPager(viewPager);

      /*  dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];*/

        /*for(int i = 0; i < dotscount; i++){

            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.inactive_dot_indicator));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8, 0, 8, 0);

            sliderDotspanel.addView(dots[i], params);
        }*/

//        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot_indicator_));

        /*viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            @Override
            public void onPageSelected(int position) {
                for(int i = 0; i< dotscount; i++){
//                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.inactive_dot_indicator));
                }
//                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot_indicator_));
            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });*/
    }
}