package education.cccp.basics

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import education.cccp.basics.R.layout.activity_main

class MainActivity : AppCompatActivity() {

    companion object {
        const val FOO_KEY = "foo_key"
        const val FOO_VALUE = "foo_value"
    }

    lateinit var myApp: MyApp
    lateinit var model: DataModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        Log.d(MainActivity::class.java.name, "onCreate")
        myApp = application as MyApp
        myApp.apply {
            connection = "connection à ${MainActivity::javaClass.name}"
        }
        model = ViewModelProvider(this).get(DataModel::class.java)
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

    fun onClickButtonEvent(view: View) {
        Intent(
            this,
            SecondActivity::class.java
        ).apply {
            putExtra(FOO_KEY, FOO_VALUE)
            startActivity(this)
        }
    }


}