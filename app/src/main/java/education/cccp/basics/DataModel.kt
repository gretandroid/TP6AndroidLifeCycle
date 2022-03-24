package education.cccp.basics

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random.Default.nextInt

class DataModel : ViewModel() {

    private val _firstName: MutableLiveData<String>
    val firstName: LiveData<String>
        get() = _firstName

    private val _lastName: MutableLiveData<String>
    val lastName: LiveData<String>
        get() = _lastName

    private val _age: MutableLiveData<Int>
    val age: LiveData<Int>
        get() = _age

    init {
        Log.d(
            this::class.java.name,
            "data model created"
        )
        _firstName.value = "prénom"
        _lastName.value = "nom"
        _age.value = 0

    }

    //    lateinit var firstNameLiveData: MutableLiveData<String>
//    lateinit var lastNameLiveData: MutableLiveData<String>
//    lateinit var ageLiveData: MutableLiveData<Int>


    override fun onCleared() {
        super.onCleared()
        Log.d(
            this::class.java.name,
            "data model cleared"
        )
    }

    fun traitement() {
        nextInt(
            from = 1,
            until = 100
        ).apply {
            firstName += this
            lastName += this
            age = this
        }
    }
}