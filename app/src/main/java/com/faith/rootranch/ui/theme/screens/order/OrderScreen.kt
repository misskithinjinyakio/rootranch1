package com.faith.rootranch.ui.theme.screens.order

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
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
import com.faith.rootranch.navigation.ROUT_ABOUT
import com.faith.rootranch.navigation.ROUT_ADD_PRODUCT
import com.faith.rootranch.navigation.ROUT_HOME
import com.faith.rootranch.navigation.ROUT_INVENTORY
import com.faith.rootranch.navigation.ROUT_ITEM
import com.faith.rootranch.navigation.ROUT_ORDER
import com.faith.rootranch.navigation.ROUT_SELL

import com.faith.rootranch.ui.theme.neworange
import com.faith.rootranch.ui.theme.newwhite


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrderScreen(navController: NavController){
    var showMenu by remember { mutableStateOf(false) }
    var mContext= LocalContext.current
    //topappbar
    TopAppBar(title = { Text(text = "make your order", fontSize = 20.sp) },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = newwhite,
            titleContentColor = neworange,
            navigationIconContentColor = neworange,
            actionIconContentColor = neworange,



            ),

        navigationIcon = {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "Back")
            }
        },
        actions = {
            IconButton(onClick = { showMenu = true }) {
                Icon(imageVector = Icons.Default.MoreVert, contentDescription = "Menu")
            }
            DropdownMenu(
                expanded = showMenu,
                onDismissRequest = { showMenu = false }
            ) {
                DropdownMenuItem(
                    text = { Text("about") },
                    onClick = {
                        navController.navigate(ROUT_ABOUT)
                        showMenu = false
                    }
                )
                DropdownMenuItem(
                    text = { Text("Add Product") },
                    onClick = {
                        navController.navigate(ROUT_ADD_PRODUCT)
                        showMenu = false
                    }
                )
                DropdownMenuItem(
                    text = { Text("inventory") },
                    onClick = {
                        navController.navigate(ROUT_INVENTORY)
                        showMenu = false
                    }
                )
                DropdownMenuItem(
                    text = { Text("sell ") },
                    onClick = {
                        navController.navigate(ROUT_SELL)
                        showMenu = false
                    }
                )
                DropdownMenuItem(
                    text = { Text("home") },
                    onClick = {
                        navController.navigate(ROUT_HOME)
                        showMenu = false
                    }
                )
                DropdownMenuItem(
                    text = { Text("item") },
                    onClick = {
                        navController.navigate(ROUT_ITEM)
                        showMenu = false
                    }
                )

            }
        }

    )




    // end of topappbar

    Column (modifier = Modifier
        .fillMaxSize()
      ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text(text = "Make your order now !!!!", fontWeight = FontWeight.ExtraBold,
            fontSize = (30.sp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(R.drawable.cow),
            contentDescription = "home",
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        var fullname by remember { mutableStateOf("") }
        var productname by remember { mutableStateOf("") }
        var price by remember { mutableStateOf("") }
        var phonenumber by remember { mutableStateOf("") }
        var location by remember { mutableStateOf("") }
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
            value = productname ,
            onValueChange = {productname =it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "") },
            label ={Text(text = "productname")},
            colors = OutlinedTextFieldDefaults.colors(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        //end of USERNMAE
        Spacer(modifier = Modifier.height(20.dp))
        //EMAIL
        OutlinedTextField(
            value = price,
            onValueChange = {price=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
            label ={Text(text = "price")},
            colors = OutlinedTextFieldDefaults.colors(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )
        //end of EMAIL
        Spacer(modifier = Modifier.height(20.dp))
        //PASSWORD
        OutlinedTextField(
            value = phonenumber,
            onValueChange = {phonenumber=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription = "") },
            label ={Text(text = "phonenumber")},
            colors = OutlinedTextFieldDefaults.colors(),

        )
        //end of PASSWORD
        Spacer(modifier = Modifier.height(20.dp))
        //PASSWORD
        OutlinedTextField(
            value = location,
            onValueChange = {location=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.LocationOn, contentDescription = "") },
            label ={Text(text = "location")},
            colors = OutlinedTextFieldDefaults.colors(),



        )
        //end of PASSWORD
        Button(onClick = {
            val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }


        },
            colors= ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp)
        )
        { Text(text = "ORDER SEND") }
        Spacer(modifier = Modifier.height(20.dp))




    }





}


@Preview(showBackground = true)
@Composable
fun OrderScreenPreview(){
    OrderScreen(rememberNavController())
}