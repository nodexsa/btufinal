package com.example.btucom.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.btucom.R
import com.example.ftest.recyclerviews.MainAdapter
import com.example.ftest.recyclerviews.Sub


class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList : ArrayList<Sub>


    lateinit var id : Array<Int>
    lateinit var name : Array<String>
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        id = arrayOf(
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10
        )

        name = arrayOf(
            "კალკლუსი",
            "პითონი",
            "შესავალი მეწარმეობაშ",
            "მათემატიკა ბიზნესისთვის",
            "ციფრული ტექნოლოგიების პრინციპები",
            "მობილური აპლიკაციები",
            "ჯავასკრიპტი",
            "C++",
            "HTML",
            "oracle"
        )



        newRecyclerView = view.findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(activity)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Sub>()
        getUserdata()


    }

    private fun getUserdata() {

        for(i in id.indices){
            val mcars = Sub(id[i],name[i])
            newArrayList.add(mcars)

        }

        newRecyclerView.adapter = MainAdapter(newArrayList)

    }
}