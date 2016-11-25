package com.dzq.yourweather.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.app.Fragment;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.ImageViewTarget;

/**
 * Description: ImageFrameWork Wrapper
 * Created by dzq on 2016/11/25.
 */

public class ImageLoader {

    public static void loadImage(Context context, String imagePath, ImageView imageView){
        Glide.with(context).load(imagePath).crossFade().centerCrop().into(imageView);
    }

    public static void loadImage(Activity context, String imagePath, ImageView imageView){
        Glide.with(context).load(imagePath).crossFade().centerCrop().into(imageView);
    }

    public static void loadImage(Fragment context, String imagePath, ImageView imageView){
        Glide.with(context).load(imagePath).crossFade().centerCrop().into(imageView);
    }

    public static void loadCircleImage(final Context context, String imagePath, ImageView imageView) {
        Glide.with(context).load(imagePath).asBitmap().into(new ImageViewTarget<Bitmap>(imageView) {
            @Override
            protected void setResource(Bitmap resource) {
                RoundedBitmapDrawable drawable = RoundedBitmapDrawableFactory.create(context.getResources(), resource);
                drawable.setCircular(true);
            }
        });
    }

    public static void loadCircleImage(final Activity context, String imagePath, ImageView imageView) {
        Glide.with(context).load(imagePath).asBitmap().into(new ImageViewTarget<Bitmap>(imageView) {
            @Override
            protected void setResource(Bitmap resource) {
                RoundedBitmapDrawable drawable = RoundedBitmapDrawableFactory.create(context.getResources(), resource);
                drawable.setCircular(true);
            }
        });
    }

    public static void loadCircleImage(final Fragment context, String imagePath, ImageView imageView) {
        Glide.with(context).load(imagePath).asBitmap().into(new ImageViewTarget<Bitmap>(imageView) {
            @Override
            protected void setResource(Bitmap resource) {
                RoundedBitmapDrawable drawable = RoundedBitmapDrawableFactory.create(context.getResources(), resource);
                drawable.setCircular(true);
            }
        });
    }
}
