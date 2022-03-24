package education.cccp.basics

import android.util.Log
import androidx.lifecycle.ViewModel

class DataModel : ViewModel() {

    init {
        Log.d(
            this::class.java.name,
            "data model created"
        )
    }

    lateinit var name: String

    override fun onCleared() {
        super.onCleared()
        Log.d(
            this::class.java.name,
            "data model cleared"
        )
    }
}