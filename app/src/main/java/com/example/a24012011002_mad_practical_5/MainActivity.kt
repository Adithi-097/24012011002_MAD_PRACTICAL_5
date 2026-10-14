package com.example.a24012011002_mad_practical_5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.a24012011002_mad_practical_5.ui.theme._24012011002_MAD_PRACTICAL_5Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            _24012011002_MAD_PRACTICAL_5Theme {
                AppNavigation(context = this@MainActivity)
            }
        }
    }
}
