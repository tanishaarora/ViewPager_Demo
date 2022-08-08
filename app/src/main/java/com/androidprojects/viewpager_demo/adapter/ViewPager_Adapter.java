package com.androidprojects.viewpager_demo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.androidprojects.viewpager_demo.R;


public class ViewPager_Adapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images = {R.drawable.slide1,R.drawable.slide2,R.drawable.slide3};

    public ViewPager_Adapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return ViewPager_Model.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    public CharSequence getPageTitle(int position){
        ViewPager_Model viewPager_Enum = ViewPager_Model.values()[position];
        return context.getString(viewPager_Enum.getmTitleResId());
    }


    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        ViewPager_Model viewPager_model = ViewPager_Model.values()[position];
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewGroup layout = (ViewGroup) inflater.inflate(viewPager_model.getmLayoutResId(),
                container, false);

        container.addView(layout);
        return layout;

       /* layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);


        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;*/

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);

        /*ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);*/

    }
}