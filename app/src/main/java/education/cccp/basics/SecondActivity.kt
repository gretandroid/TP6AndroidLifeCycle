package education.cccp.basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    override fun onResume() {
        super.onResume()
        Log.d(SecondActivity::class.java.name,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(SecondActivity::class.java.name,"onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(SecondActivity::class.java.name,"onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(SecondActivity::class.java.name,"onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(SecondActivity::class.java.name,"onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d(SecondActivity::class.java.name,"onStart")
    }
}