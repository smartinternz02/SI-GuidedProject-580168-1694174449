package com.example.smartbridgeassignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            
            Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "LOGIN PAGE!", modifier = Modifier.padding(5.dp),fontSize = 30.sp)
                username()
                Spacer(modifier = Modifier.padding(5.dp))
                password()
                Spacer(modifier = Modifier.padding(5.dp))
                button()

            }

        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun username(){
    var text by remember { mutableStateOf("") }
    TextField(value = text, onValueChange = {it -> text = it}, label = {Text(text = "User Name")}
        )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun password(){
    var text by remember { mutableStateOf("") }
    TextField(value = text, onValueChange = {it -> text = it}, label = {Text(text = "Password")},
        visualTransformation = PasswordVisualTransformation()
    )
}


@Composable
fun button(){
    Button(modifier = Modifier.padding(),onClick = { /*TODO*/ }) {
        Text(text = "SUBMIT")
    }
}

@Preview(showBackground = true)
@Composable
fun loginPreview(){
    
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "LOGIN PAGE!",modifier = Modifier.padding(5.dp), fontSize = 30.sp)
        username()
        Spacer(modifier = Modifier.padding(5.dp))
        password()
        Spacer(modifier = Modifier.padding(5.dp))
        button()
    }
}