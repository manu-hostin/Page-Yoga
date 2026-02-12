package com.example.helloworld2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helloworld2.ui.theme.HelloWorld2Theme
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorld2Theme {

                Surface(
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxSize()
                        .safeDrawingPadding()
                ) {
                    Column {
                        Surface (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(280.dp),
                            color = Color(0xFF4F8D76),
                            shape = RoundedCornerShape(
                                bottomEnd = 16.dp,
                                bottomStart = 16.dp
                            )

                        ) {
                            Column (
                                modifier = Modifier.padding(22.dp)
                            ){

                                Text(
                                    text = "Welcome back",
                                    fontSize = 16.sp,
                                    color = Color.White
                                )
                                Text(
                                    text = "Sarah",
                                    fontSize = 28.sp,
                                    color = Color.White
                                )

                                Surface (
                                    modifier = Modifier
                                        .width(400.dp)
                                        .height(180.dp)
                                        .padding(top = 26.dp),
                                    color = Color(0xFFD9D9D9),
                                    shape = RoundedCornerShape(16.dp)

                                ) {

                                    Column (
                                        modifier = Modifier.padding(20.dp)
                                    ){

                                        Text (
                                            text = "Continue your exercise",
                                            fontSize = 16.sp,
                                            color = Color.Black

                                        )
                                        
                                        Row (
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {

                                            Box(
                                                modifier = Modifier
                                                    .padding(top = 20.dp)
                                                    .size(70.dp)
                                                    .background(
                                                        color = Color(0xFFF28C52),
                                                        shape = RoundedCornerShape(20.dp)
                                                    )
                                            )

                                            Column (
                                                modifier = Modifier.padding(start = 12.dp)
                                            ){

                                                Text(
                                                    text = "Yoga Ashtanga",
                                                    fontSize = 18.sp,
                                                    fontWeight = FontWeight.Bold
                                                )

                                                Text(
                                                    text = "Last minute 1:03",
                                                    modifier = Modifier.padding(top = 10.dp)
                                                )
                                            }
                                        }
                                    }

                                }


                            }
                        }

                        Column (
                            modifier = Modifier.padding(22.dp)
                        ){

                            Text (
                                text = "Yoga Exercise",
                                fontSize = 22.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text (
                                text = "Choose the type of yoga",
                                modifier = Modifier.padding(top = 10.dp)
                            )

                        }
                        Column (
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally, // Ocupa o meio na horizontal
                            // O meio de toda a tela por conta do fillMaxWidth
                            verticalArrangement = Arrangement.spacedBy(22.dp)
                            // Pede para colocar 22.dp entre os elementos, na vertical, entre os quadrados de cima e os de bx
                        ){

                            Row (horizontalArrangement = Arrangement.spacedBy(22.dp)){
                                // Pede para colocar 22.dp entre os elementos, na horizontal

                                Box(
                                    modifier = Modifier
                                        .size(180.dp)
                                        .background(
                                            color = Color(0xFF4F8D76),
                                            shape = RoundedCornerShape(16.dp)
                                        ),
                                    contentAlignment = Alignment.Center

                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.photohere),
                                        contentDescription = null,
                                        modifier = Modifier.size(60.dp)
                                    )
                                    Text(
                                        text = "Beginner",
                                        modifier = Modifier.padding(top = 120.dp),
                                        fontSize = 20.sp
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .size(180.dp)
                                        .background(
                                            color = Color(0xFF4F8D76),
                                            shape = RoundedCornerShape(16.dp)
                                        ),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.photohere),
                                        contentDescription = null,
                                        modifier = Modifier.size(60.dp)
                                    )
                                    Text(
                                        text = "Pregnant",
                                        modifier = Modifier.padding(top = 120.dp),
                                        fontSize = 20.sp
                                    )
                                }

                            }
                            Row (horizontalArrangement = Arrangement.spacedBy(22.dp)) {
                                // Pede para colocar 22.dp entre os elementos, na horizontal

                                Box(
                                    modifier = Modifier
                                        .size(180.dp)
                                        .background(
                                            color = Color(0xFF4F8D76),
                                            shape = RoundedCornerShape(16.dp)
                                        ),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.photohere),
                                        contentDescription = null,
                                        modifier = Modifier.size(60.dp)
                                    )
                                    Text(
                                        text = "Parent",
                                        modifier = Modifier.padding(top = 120.dp),
                                        fontSize = 20.sp
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .size(180.dp)
                                        .background(
                                            color = Color(0xFF4F8D76),
                                            shape = RoundedCornerShape(16.dp)
                                        ),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.photohere),
                                        contentDescription = null,
                                        modifier = Modifier.size(60.dp)
                                    )
                                    Text(
                                        text = "Expert",
                                        modifier = Modifier.padding(top = 120.dp),
                                        fontSize = 20.sp
                                    )
                                }
                            }

                        }
                        Column (
                            modifier = Modifier.padding(start = 22.dp, top = 22.dp)
                        ){
                            Text(
                                text = "Latest News",
                                fontSize = 22.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "About physical health and sports"
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWorld2Theme {
        Greeting("Android")
    }
}