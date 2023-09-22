package com.example.myfoodapplication

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun MyApp(){
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = "screen1"){
        composable("screen1"){Screen1(navController)}
        composable("screen2"){Screen2(navController)}
        composable("screen3"){Screen3(navController)}
        composable("signuppage"){SignUpPage(navController)}
        composable("forgetPasswordPage"){ ForgetPasswordPage(navController) }
    }
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}
