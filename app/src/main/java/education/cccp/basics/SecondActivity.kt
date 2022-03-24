package education.cccp.basics

import android.os.Bundle
import android.util.Log
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.makeText
import androidx.appcompat.app.AppCompatActivity
import education.cccp.basics.MyApp.Companion.FOO_KEY
import education.cccp.basics.R.layout.activity_second

class SecondActivity : AppCompatActivity() {

    lateinit var myApp: MyApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_second)
        Log.d(
            SecondActivity::class.java.name, "onCreate : ${
                intent.getStringExtra(FOO_KEY).apply {
                    makeText(
                        this@SecondActivity,
                        this,
                        LENGTH_LONG
                    ).show()
                }
            }"
        )
        myApp = application as MyApp
        myApp.run {
            makeText(
                this@SecondActivity,
                connection,
                LENGTH_LONG
            ).show()
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(SecondActivity::class.java.name, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(SecondActivity::class.java.name, "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(SecondActivity::class.java.name, "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(SecondActivity::class.java.name, "onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(SecondActivity::class.java.name, "onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d(SecondActivity::class.java.name, "onStart")
    }
}