package education.cccp.basics

import android.app.Application

class MyApp : Application() {
    lateinit var connection: String

    companion object {
        const val FOO_KEY = "foo_key"
        const val FOO_VALUE = "foo_value"
    }
}