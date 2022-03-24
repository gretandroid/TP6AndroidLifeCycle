package education.cccp.basics

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import education.cccp.basics.R.id.*
import education.cccp.basics.R.layout.activity_main

class MainActivity : AppCompatActivity() {

    lateinit var myApp: MyApp
    lateinit var model: DataModel

    lateinit var firstNameTextView: TextView
    lateinit var lastNameTextView: TextView
    lateinit var ageTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        Log.d(MainActivity::class.java.name, "onCreate")
        myApp = application as MyApp
        myApp.apply {
            connection = "connection à ${MainActivity::javaClass.name}"
        }
        model = ViewModelProvider(this).get(DataModel::class.java)
        model.run {
            if (model.lastName.value?.isNotBlank()) {
                Toast.makeText(
                    this@MainActivity,
                    lastName,
                    LENGTH_LONG
                ).show()
            }
        }
        firstNameTextView = findViewById(firstNameTextViewId)
        lastNameTextView = findViewById(lastNameTextViewId)
        ageTextView = findViewById(ageTextViewId)
    }

    fun display() {
        model.run {
            firstNameTextView.text = firstName.value
            lastNameTextView.text = lastName.value
            ageTextView.text = age.toString()
        }
    }

    fun onClickButtonEvent(view: View) {
        model.traitement()
        display()
    }

    override fun onResume() {
        super.onResume()
        Log.d(MainActivity::class.java.name, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MainActivity::class.java.name, "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MainActivity::class.java.name, "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MainActivity::class.java.name, "onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MainActivity::class.java.name, "onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d(MainActivity::class.java.name, "onStart")
    }


}