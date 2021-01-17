package com.tromian.game.glidetest

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentList : Fragment(R.layout.list_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var listItems : List<TestObject>? = null

        val adapter = MyAdapter()

        val rvList = view.findViewById<RecyclerView>(R.id.recycler)

        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL,false)



        listItems = listOf(
            TestObject(1, "https://bipbap.ru/wp-content/uploads/2019/05/86ae0b2400c92d333751c8d9a9ae68e4.png"),
            TestObject(2, "https://bipbap.ru/wp-content/uploads/2019/05/1619.jpg"),
            TestObject(3, "https://bipbap.ru/wp-content/uploads/2019/05/1528641301_4.jpg")

        )
        adapter.submitList(listItems)

    }
}