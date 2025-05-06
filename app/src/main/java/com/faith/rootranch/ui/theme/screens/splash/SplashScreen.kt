package com.faith.harakamall.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.faith.rootranch.R
import com.faith.rootranch.navigation.ROUT_LOGIN
import com.faith.rootranch.navigation.ROUT_HOME
import com.faith.rootranch.ui.theme.neworange
import com.faith.rootranch.navigation.ROUT_LOGIN
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){
    //navigation
    val coroutine= rememberCoroutineScope()
    coroutine.launch {
        delay(2000)
        navController.navigate(ROUT_HOME)

    }
    //end of navigation
    Column(
        modifier = Modifier
            .height(height = 300.dp)
            .paint(painter = painterResource(R.drawable.img), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(text = "WELCOME TO ROOTRANCH FARM ",
                fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 50.sp,
            color= Color.Black

        )
        Spacer(modifier = Modifier.height(100.dp))
        Text(text = "Get Started ...",
            fontStyle = FontStyle.Italic,
            fontSize = 20.sp)


    }





}


@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}