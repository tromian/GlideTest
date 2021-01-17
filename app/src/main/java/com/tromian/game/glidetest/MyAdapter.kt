package com.tromian.game.glidetest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

class MyAdapter : ListAdapter<TestObject, TestVH>(DIFF_CALLBACK) {

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<TestObject>() {
            override fun areItemsTheSame(oldItem: TestObject, newItem: TestObject): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: TestObject, newItem: TestObject): Boolean =
                oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestVH {
        val inflater = LayoutInflater.from(parent.context)
        return TestVH(inflater.inflate(R.layout.item_view, parent,false))
    }

    override fun onBindViewHolder(holder: TestVH, position: Int) {
        val obj = getItem(position)
        holder.bind(obj)
    }


}