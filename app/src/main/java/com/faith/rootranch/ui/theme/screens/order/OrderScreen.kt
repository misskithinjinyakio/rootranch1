package com.faith.rootranch.ui.theme.screens.order

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.faith.rootranch.R

import com.faith.rootranch.ui.theme.neworange



@Composable
fun OrderScreen(navController: NavController){
    Column (modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text(text = "Create An ACCOUNT", fontWeight = FontWeight.ExtraBold,
            fontSize = (30.sp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(R.drawable.image1),
            contentDescription = "home",
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        var fullname by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var rewritepassword by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        //fullname
        OutlinedTextField(
            value = fullname,
            onValueChange = {fullname=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "") },
            label ={Text(text = "fullname")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        //end of fullname
        Spacer(modifier = Modifier.height(20.dp))
        //USERNAME
        OutlinedTextField(
            value = username,
            onValueChange = {username=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "") },
            label ={Text(text = "USERNAME")},
            colors = OutlinedTextFieldDefaults.colors(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        //end of USERNMAE
        Spacer(modifier = Modifier.height(20.dp))
        //EMAIL
        OutlinedTextField(
            value = email,
            onValueChange = {email=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
            label ={Text(text = "email")},
            colors = OutlinedTextFieldDefaults.colors(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )
        //end of EMAIL
        Spacer(modifier = Modifier.height(20.dp))
        //PASSWORD
        OutlinedTextField(
            value = password,
            onValueChange = {password=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
            label ={Text(text = "PASSWORD")},
            colors = OutlinedTextFieldDefaults.colors(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )
        //end of PASSWORD
        Spacer(modifier = Modifier.height(20.dp))
        //PASSWORD
        OutlinedTextField(
            value = rewritepassword,
            onValueChange = {rewritepassword=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
            label ={Text(text = "rewritepassword")},
            colors = OutlinedTextFieldDefaults.colors(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )
        //end of PASSWORD
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {

        },
            colors= ButtonDefaults.buttonColors(Color.Red),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp)
        )
        { Text(text = "SUBMIT") }





    }





}


@Preview(showBackground = true)
@Composable
fun OrderScreenPreview(){
    OrderScreen(rememberNavController())
}