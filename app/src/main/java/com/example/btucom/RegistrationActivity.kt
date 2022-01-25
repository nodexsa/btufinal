package com.example.btucom

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class RegistrationActivity : AppCompatActivity() {
    private lateinit var Emailregistration:EditText
    private lateinit var passwordregistration:EditText
    private lateinit var buttonregister:Button
    private lateinit var imageView2:Image
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        init()

        RegisterListener()
    }
    private fun init(){
        Emailregistration=findViewById(R.id.Emailregistration)
        passwordregistration=findViewById(R.id.passwordregistration)
        buttonregister=findViewById(R.id.buttonregister)

    }
    private fun RegisterListener(){
        buttonregister.setOnClickListener {
            val email = Emailregistration.text.toString()
            val password = passwordregistration.text.toString()
            if (email.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "eror", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener { task->
                    if (task.isSuccessful){
                        startActivity(Intent(this, MainActivity::class.java))
                        finish()
                }else{
                        Toast.makeText(this, "error!", Toast.LENGTH_SHORT).show()
                    }
                }
        }

    }
}