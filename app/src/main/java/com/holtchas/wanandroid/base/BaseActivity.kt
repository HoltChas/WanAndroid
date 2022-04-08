package com.holtchas.wanandroid.base

import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by on 2022/4/8 10:49
 * @author HoltChas
 * 说明：
 */
abstract class BaseActivity(@LayoutRes contentLayoutId: Int) : AppCompatActivity(contentLayoutId) {
}