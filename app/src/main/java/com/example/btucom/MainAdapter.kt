package com.example.ftest.recyclerviews

import android.content.Intent
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.btucom.R
import com.example.btucom.UserInfo
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase


class MainAdapter(private val subList : ArrayList<Sub>) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate((R.layout.list_item),
            parent,false)
        return MainViewHolder(itemView)


    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val currentItem = subList[position]
        holder.name.text = currentItem.name


    }

    override fun getItemCount(): Int {
        return subList.size
    }

    class MainViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.name)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val imageView2: ImageView = itemView.findViewById(R.id.imageView2)




        private val user = FirebaseAuth.getInstance()
        private val db = FirebaseDatabase.getInstance().getReference("UserInfo")

        init {

            imageView.setOnClickListener { v: View ->
                val position: Int = adapterPosition

                if(position == 0) {



                    val subj = "კალკლუსი"
                    val userInfo = com.example.btucom.fragments.Subs(subj)
                    db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
                }
                if(position == 1) {

                    val subj = "პითონი"
                    val userInfo = com.example.btucom.fragments.Subs(subj)
                    db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
                }
                if(position == 2) {



                    val subj = "შესავალი მეწარმეობაშi"
                    val userInfo = com.example.btucom.fragments.Subs(subj)
                    db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
                }
                if(position == 3) {

                    val subj = "მათემატიკა ბიზნესისთვის"
                    val userInfo = com.example.btucom.fragments.Subs(subj)
                    db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
                }
                if(position == 4) {



                    val subj = "ციფრული ტექნოლოგიების პრინციპები"
                    val userInfo = com.example.btucom.fragments.Subs(subj)
                    db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
                }
                if(position == 5) {

                    val subj = "მობილური აპლიკაციები"
                    val userInfo = com.example.btucom.fragments.Subs(subj)
                    db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
                }
                if(position == 6) {



                    val subj = "ჯავასკრიპტი"
                    val userInfo = com.example.btucom.fragments.Subs(subj)
                    db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
                }
                if(position == 7) {

                    val subj = "C++"
                    val userInfo = com.example.btucom.fragments.Subs(subj)
                    db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
                }
                if(position == 8) {



                    val subj = "HTML"
                    val userInfo = com.example.btucom.fragments.Subs(subj)
                    db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
                }
                if(position == 9) {

                    val subj = "oracle"
                    val userInfo = com.example.btucom.fragments.Subs(subj)
                    db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
                }

            }
    imageView2.setOnClickListener { v: View ->
        val position: Int = adapterPosition

        if(position == 0) {



            val subj = ""
            val userInfo = com.example.btucom.fragments.Subs(subj)
            db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
        }
        if(position == 1) {

            val subj = ""
            val userInfo = com.example.btucom.fragments.Subs(subj)
            db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
        }
        if(position == 2) {



            val subj = ""
            val userInfo = com.example.btucom.fragments.Subs(subj)
            db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
        }
        if(position == 3) {

            val subj = ""
            val userInfo = com.example.btucom.fragments.Subs(subj)
            db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
        }
        if(position == 4) {



            val subj = ""
            val userInfo = com.example.btucom.fragments.Subs(subj)
            db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
        }
        if(position == 5) {

            val subj = ""
            val userInfo = com.example.btucom.fragments.Subs(subj)
            db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
        }
        if(position == 6) {



            val subj = ""
            val userInfo = com.example.btucom.fragments.Subs(subj)
            db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
        }
        if(position == 7) {

            val subj = ""
            val userInfo = com.example.btucom.fragments.Subs(subj)
            db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
        }
        if(position == 8) {



            val subj = ""
            val userInfo = com.example.btucom.fragments.Subs(subj)
            db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
        }
        if(position == 9) {

            val subj = ""
            val userInfo = com.example.btucom.fragments.Subs(subj)
            db.child(user.currentUser?.uid!!+"Subjects").setValue(userInfo)
        }

        }
/////////
    }

}}