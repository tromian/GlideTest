package com.tromian.game.glidetest

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class TestVH(view: View) : RecyclerView.ViewHolder(view) {

    private val img :ImageView = view.findViewById(R.id.imageView)

    fun bind( obj : TestObject ){

        Glide.with(itemView.context).load(obj.imgUrl).into(img)


    }

}