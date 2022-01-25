package com.example.btucom.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.btucom.ChangeUsernameFragment
import com.example.btucom.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserInfo
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private lateinit var button: Button
    private lateinit var subTv: TextView
    private lateinit var pfpImgView: ImageView
    private lateinit var userTv: TextView
    private val user = FirebaseAuth.getInstance()
    private val db = FirebaseDatabase.getInstance().getReference("UserInfo")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button = view.findViewById(R.id.button)
        subTv = view.findViewById(R.id.subTv)
        pfpImgView = view.findViewById(R.id.pfpImgView)
        userTv = view.findViewById(R.id.userTv)

        db.child(user.currentUser?.uid!!).addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val userInfo = snapshot.getValue(com.example.btucom.UserInfo::class.java) ?: return
                userTv.text = userInfo.name
                val img = userInfo.url


                Glide.with(this@ProfileFragment)
                    .load(img)
                    .placeholder(R.drawable.ic_launcher_foreground)
                    .into(pfpImgView)

            }

            override fun onCancelled(error: DatabaseError) {
            }
        })



        db.child(user.currentUser?.uid!!+"Subjects").addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val userInfo = snapshot.getValue(com.example.btucom.fragments.Subs::class.java) ?: return
                val stv = userInfo.sub
                subTv.text = stv




            }

            override fun onCancelled(error: DatabaseError) {
            }
        })



        button.setOnClickListener {
            val dialog = ChangeUsernameFragment()
            dialog.show(childFragmentManager, "custom")


        }

    }

}