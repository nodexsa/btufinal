package com.example.btucom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class ForgotPasswordActivity : AppCompatActivity() {
    private lateinit var emailforgotpassword:EditText
    private lateinit var buttonforgotpasswordsend:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        init()
        RegisterListener()
    }
    private fun init(){
        emailforgotpassword=findViewById(R.id.emailforgotpassword)
        buttonforgotpasswordsend=findViewById(R.id.buttonforgotpasswordsend)
    }
    private fun RegisterListener(){
        emailforgotpassword.setOnClickListener(){
            val email = emailforgotpassword.text.toString()
            if (email.isEmpty()){
                Toast.makeText(this, "ERROR!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

        FirebaseAuth.getInstance().sendPasswordResetEmail(email).addOnCompleteListener {
            task ->
            if (task.isSuccessful){
                Toast.makeText(this, "check email", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "error!", Toast.LENGTH_SHORT).show()
            }
        }
    }}
}