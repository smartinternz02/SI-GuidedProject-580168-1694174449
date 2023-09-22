package com.example.myfoodapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Screen2(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription = "Login Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )
        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.padding(10.dp))
            Card(
                modifier = Modifier
                    .size(250.dp)
                    .clickable { navController.navigate("screen3") },
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFAA01C),
                )
            )
            {
                Column(
                    Modifier
                        .padding(47.dp, 5.dp)
                        .background(Color.White),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img1),
                        contentDescription = "Login Screen",
                        modifier = Modifier
                            .size(150.dp)
                            .padding(16.dp)
                    )
                    Text("Hotel1", fontWeight = FontWeight.W700)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text("Noida, India", color = Color.Gray)
                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Card(
                modifier = Modifier
                    .size(250.dp)
                    .clickable { navController.navigate("screen3") },
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFAA01C),
                )
            ) {
                Column(
                    Modifier
                        .padding(46.dp, 5.dp)
                        .background(Color.White),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img1),
                        contentDescription = "Login Screen",
                        modifier = Modifier
                            .size(150.dp)
                            .padding(16.dp)
                    )
                    Text("Hotel2", fontWeight = FontWeight.W700)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text("Noida, India", color = Color.Gray)
                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Card(
                modifier = Modifier
                    .size(250.dp)
                    .clickable { navController.navigate("screen3") },
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFAA01C),
                )
            ) {
                Column(
                    Modifier
                        .padding(46.dp, 5.dp)
                        .background(Color.White),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img1),
                        contentDescription = "Login Screen",
                        modifier = Modifier
                            .size(150.dp)
                            .padding(16.dp)
                    )
                    Text("Hotel3", fontWeight = FontWeight.W700)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text("Noida, India", color = Color.Gray)
                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Card(
                modifier = Modifier
                    .size(250.dp)
                    .clickable { navController.navigate("screen3") },
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFAA01C),
                )
            ) {
                Column(
                    Modifier
                        .padding(46.dp, 5.dp)
                        .background(Color.White),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img1),
                        contentDescription = "Login Screen",
                        modifier = Modifier
                            .size(150.dp)
                            .padding(16.dp)
                    )
                    Text("Hotel4", fontWeight = FontWeight.W700)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text("Noida, India", color = Color.Gray)
                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Card(
                modifier = Modifier
                    .size(250.dp)
                    .clickable { navController.navigate("screen3") },
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFAA01C),
                )
            ) {
                Column(
                    Modifier
                        .padding(46.dp, 5.dp)
                        .background(Color.White),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img1),
                        contentDescription = "Login Screen",
                        modifier = Modifier
                            .size(150.dp)
                            .padding(16.dp)
                    )
                    Text("Hotel5", fontWeight = FontWeight.W700)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text("Noida, India", color = Color.Gray)
                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
        }
    }
}

