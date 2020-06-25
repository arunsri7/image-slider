package com.example.imageslider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.example.imageslider.Model.SliderItem;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<SliderItem> items = new ArrayList<>();
        SliderItem item = new SliderItem("flower","https://i.picsum.photos/id/798/500/400.jpg?hmac=2oeb8DXb-we2oAWTRMVNYyCfxOlyghVodhv0CPPH96s");
        SliderItem item2 = new SliderItem("kindle","https://i.picsum.photos/id/367/500/400.jpg?hmac=UgA-VWZCR2BvWuNv7LOpq6EY6ouY7fSbGMRUXWF3fVo");
        SliderItem item3 = new SliderItem("city","https://i.picsum.photos/id/274/500/400.jpg?hmac=p6JEMYlUdakXEj3VVfayW3XS8dkYZAb1zclsdhumDg0");
        items.add(item);
        items.add(item2);
        items.add(item3);
        SliderView sliderView = findViewById(R.id.imageSlider);
        SliderAdapterExample adapter = new SliderAdapterExample(this);
        adapter.renewItems(items);
        sliderView.setSliderAdapter(adapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.THIN_WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_RIGHT);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.setSliderAnimationDuration(1);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();


    }
}