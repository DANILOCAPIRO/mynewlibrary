package com.capiro.mynewlibrary.button

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ButtonTestLibrary(context: Context){
    Button(onClick = {
        Toast.makeText(context, "Teo Chupa Monda", Toast.LENGTH_SHORT).show()
    },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text = "Click to button")
    }
}