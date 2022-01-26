package com.example.btucom.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.btucom.ChangePassActivity
import com.example.btucom.MainActivity
import com.example.btucom.R
import com.google.firebase.auth.FirebaseAuth

class SettingsFragment : Fragment(R.layout.fragment_settings){
    private lateinit var textView2: TextView
    private lateinit var button: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView2 = view.findViewById(R.id.textView2)
        button = view.findViewById(R.id.button)
        textView2.setOnClickListener{

            FirebaseAuth.getInstance().signOut()
            startActivity(Intent(this@SettingsFragment.requireContext(), MainActivity::class.java))

        }
        button.setOnClickListener {

            startActivity(Intent(this@SettingsFragment.requireContext(), ChangePassActivity::class.java))


        }



    }
}