/**
 * Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.identitykitdemopro.util

import android.content.Context
import android.net.ConnectivityManager
import android.widget.Toast


object Util {
    /**
     * @param context
     * @return boolean
     */
    fun isNetworkAvailable(context: Context?): Boolean {
        if (context != null) {
            val connectivityManager = context
                    .getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val mNetworkInfo = connectivityManager.activeNetworkInfo
            mNetworkInfo?.let {
                return mNetworkInfo.isAvailable
            }
        }
        return false
    }
    fun Context.toast(text: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, text, duration).show()
    }
}