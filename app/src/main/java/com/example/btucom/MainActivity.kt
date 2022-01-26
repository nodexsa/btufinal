package com.example.btucom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var buttonloginmain:Button
    private lateinit var editTextTextEmailAddress:EditText
    private lateinit var editTextTextPassword:EditText
    private lateinit var buttonregistration:Button
    private lateinit var buttonforgotpassword:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        registerListener()
    }
    private fun init(){
        buttonloginmain=findViewById(R.id.buttonloginmain)
        editTextTextEmailAddress=findViewById(R.id.editTextTextEmailAddress)
        editTextTextPassword=findViewById(R.id.editTextTextPassword)
        buttonregistration=findViewById(R.id.buttonregistration)
        buttonforgotpassword=findViewById(R.id.buttonforgotpassword)

    }
    private fun registerListener(){
        buttonloginmain.setOnClickListener {

            val email = editTextTextEmailAddress.text.toString()
            val password = editTextTextPassword.text.toString()
            if (email.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "shecdoma", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }
            FirebaseAuth.getInstance()
                .signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful){
                        ragaca()

                    }else{
                        Toast.makeText(this, "shecdoma", Toast.LENGTH_SHORT).show()
                    }
                }
        }
        buttonregistration.setOnClickListener {
            startActivity(Intent(this, RegistrationActivity::class.java))
        }
        buttonforgotpassword.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }

    }
    private fun ragaca(){
      startActivity(Intent(this, Fragments::class.java))
        finish()
    }
}