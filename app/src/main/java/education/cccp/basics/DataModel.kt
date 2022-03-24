package education.cccp.basics

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlin.random.Random.Default.nextInt

class DataModel : ViewModel() {

    init {
        Log.d(
            this::class.java.name,
            "data model created"
        )
    }

    var lastName: String=""
    var firstName: String=""
    var age: Int = 0


    override fun onCleared() {
        super.onCleared()
        Log.d(
            this::class.java.name,
            "data model cleared"
        )
    }

    fun traitement() {
        nextInt(1, 100).apply {
            firstName += this
            lastName += this
            age = this
        }
    }
}