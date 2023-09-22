package com.example.myfoodapplication

import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Screen3(navController: NavController) {
    val context = LocalContext.current
    lateinit var courseList: List<GridModal>
    courseList = ArrayList<GridModal>()

    courseList = courseList + GridModal("Biryani", R.drawable.img1)
    courseList = courseList + GridModal("Fried Rice", R.drawable.img1)
    courseList = courseList + GridModal("Manchuria", R.drawable.img1)
    courseList = courseList + GridModal("Meals", R.drawable.img1)
    courseList = courseList + GridModal("Noodles", R.drawable.img1)
    courseList = courseList + GridModal("Java", R.drawable.img1)
    courseList = courseList + GridModal("Node Js", R.drawable.img1)

    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.img_2), contentDescription = "Login Background",
            contentScale = ContentScale.Crop, modifier = Modifier.matchParentSize()
        )
        LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.padding(10.dp)) {

            items(courseList.size) {
                Card(

                    modifier = Modifier
                        .padding(8.dp).size(200.dp).clickable { Toast.makeText(context,"This is " +courseList[it].languageName,Toast.LENGTH_SHORT).show() },
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFFAA01C),
                    )
                ) {
                    Column(

                        Modifier
                            .padding( 46.dp, 20.dp).background(Color.White),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = courseList[it].languageImg),
                            contentDescription = "Javascript",
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .padding(5.dp)
                        )
                        Spacer(modifier = Modifier.height(9.dp))
                        Text(
                            text = courseList[it].languageName,
                            modifier = Modifier.padding(4.dp),
                            color = Color.Black,
                        )
                    }
                }
            }
        }
    }
}

data class GridModal(
    val languageName: String,
    val languageImg: Int
)