package com.example.myapplication

import android.app.Application
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.instabug.library.Instabug
import com.instabug.library.invocation.InstabugInvocationEvent

class ClassApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        val str = "b5c62a787a94399f736d05a1e2f80770"
        Instabug.Builder(this, str)
            .setInvocationEvents(InstabugInvocationEvent.SHAKE, InstabugInvocationEvent.FLOATING_BUTTON)
            .build()

    }

}