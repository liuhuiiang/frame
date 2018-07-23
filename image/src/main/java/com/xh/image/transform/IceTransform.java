package com.xh.image.transform;

import android.graphics.Bitmap;

import com.xh.image.Util;

/**
 * 2018/7/4 10:38
 * instructions：
 * author:liuhuiliang  email:825378291@qq.com
 **/

public class IceTransform implements ITransform {
    @Override
    public Bitmap transform(Bitmap bitmap) {
        return Util.ice(bitmap);
    }
}