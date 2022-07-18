package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //R stands for "resource", id stands for simply "id"
        //and we set the value to the constant "val"
        val button = findViewById<Button>(R.id.button_hello) //this is how we target the button attribute and id
        //now we add instructions for when the user is going to click on the app
        button.setOnClickListener {
            //here we add instructions for what will happen when we click on the hello button
            //Log is used to display something on the screen of our emulator, v stands for verbose, letting us
            //add additional follow up instructions
            Log.v("Hello World", "Button clicked!")   //check the output using logcat
            //now that we have logged the message, we simply need a message that will display to user
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT).show()
        }
    }
}