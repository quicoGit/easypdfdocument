/*
 * Copyright 2018 Marvin O. Quevedo, https://www.marvinquevedo.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.quevedo.marvin.easypdfdocument.settigns

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.util.Log
import android.graphics.drawable.BitmapDrawable



object CanvasDebug {
    var dCanvas: Canvas? = null
    var width = 100
    var height = 100
    fun draw(canvas:Canvas?){
        if(dCanvas != null){
           try {
               val bitmap =  Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

               //val paint = Paint()
               //paint.isAntiAlias = true
               canvas?.matrix = dCanvas?.matrix
           }catch (ex:Exception){
               Log.e("dCnvas", ex.toString())
           }
        }
    }
}