package com.faith.rootranch.ui.theme.screens.inventory

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
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
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
import com.faith.rootranch.navigation.ROUT_CONTACT
import com.faith.rootranch.navigation.ROUT_HOME
import com.faith.rootranch.navigation.ROUT_INVENTORY
import com.faith.rootranch.navigation.ROUT_ITEM
import com.faith.rootranch.navigation.ROUT_ORDER
import com.faith.rootranch.navigation.ROUT_SELL

import com.faith.rootranch.ui.theme.neworange
import com.faith.rootranch.ui.theme.newwhite


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InventoryScreen(navController: NavController){
    var showMenu by remember { mutableStateOf(false) }
    //topappbar
    TopAppBar(title = { Text(text = "Update", fontSize = 20.sp) },
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
                    text = { Text("home") },
                    onClick = {
                        navController.navigate(ROUT_HOME)
                        showMenu = false
                    }
                )
                DropdownMenuItem(
                    text = { Text("sell") },
                    onClick = {
                        navController.navigate(ROUT_SELL)
                        showMenu = false
                    }
                )
                DropdownMenuItem(
                    text = { Text("order") },
                    onClick = {
                        navController.navigate(ROUT_ORDER)
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
                DropdownMenuItem(
                    text = { Text("contact") },
                    onClick = {
                        navController.navigate(ROUT_CONTACT)
                        showMenu = false
                    }
                )
            }
        }

    )




    // end of topappbar

    Column (modifier = Modifier

        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text(text = "UPDATE INVENTORY",fontStyle = FontStyle.Italic, fontWeight = FontWeight.ExtraBold,
            fontSize = (30.sp)
        )


        Spacer(modifier = Modifier.height(20.dp))

        var name by remember { mutableStateOf("") }
        var date by remember { mutableStateOf("") }
        var litres by remember { mutableStateOf("") }
        var changes by remember { mutableStateOf("") }
        var fedkgs by remember { mutableStateOf("") }
        //fullname
        OutlinedTextField(
            value = name,
            onValueChange = {name=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),

            label ={Text(text = "name", fontWeight = FontWeight.ExtraBold)},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        //end of fullname
        Spacer(modifier = Modifier.height(20.dp))
        //USERNAME
        OutlinedTextField(
            value = date ,
            onValueChange = {date =it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),

            label ={Text(text = "date", fontWeight = FontWeight.ExtraBold)},
            colors = OutlinedTextFieldDefaults.colors(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        //end of USERNMAE
        Spacer(modifier = Modifier.height(20.dp))
        //EMAIL
        OutlinedTextField(
            value = litres,
            onValueChange = {litres=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),

            label ={Text(text = "litres", fontWeight = FontWeight.ExtraBold)},
            colors = OutlinedTextFieldDefaults.colors(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )
        //end of EMAIL
        Spacer(modifier = Modifier.height(20.dp))
        //PASSWORD
        OutlinedTextField(
            value = changes,
            onValueChange = {changes=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),

            label ={Text(text = "changes", fontWeight = FontWeight.ExtraBold)},
            colors = OutlinedTextFieldDefaults.colors(),

            )
        //end of PASSWORD
        Spacer(modifier = Modifier.height(20.dp))
        //PASSWORD
        OutlinedTextField(
            value = fedkgs,
            onValueChange = {fedkgs=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),

            label ={Text(text = "fedkgs", fontWeight = FontWeight.ExtraBold)},
            colors = OutlinedTextFieldDefaults.colors(),



            )
        //end of PASSWORD
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {

        },
            colors= ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp)
        )
        { Text(text = "update", fontWeight = FontWeight.ExtraBold) }





    }





}


@Preview(showBackground = true)
@Composable
fun InventoryScreenPreview(){
    InventoryScreen(rememberNavController())
}