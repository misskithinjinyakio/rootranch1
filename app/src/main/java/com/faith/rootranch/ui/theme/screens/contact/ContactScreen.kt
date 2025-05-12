package com.faith.rootranch.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
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
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.CameraPosition
import com.google.maps.android.compose.*


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContactScreen(navController: NavController) {
    var name by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var message by remember { mutableStateOf(TextFieldValue("")) }
    var showMenu by remember { mutableStateOf(false) }
    //topappbar
    TopAppBar(title = { Text(text = "Contact us", fontSize = 20.sp) },
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
                    text = { Text("home") },
                    onClick = {
                        navController.navigate(ROUT_HOME)
                        showMenu = false
                    }
                )
            }
        }

    )




    // end of topappbar


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Contact Us", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.ExtraBold)

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Name") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = message,
            onValueChange = { message = it },
            label = { Text("Message") },
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                // TODO: Handle form submission logic here
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text("Send")
        }

        Spacer(modifier = Modifier.height(24.dp))

    }
}



@Preview(showBackground = true)
@Composable
fun ContactScreenPreview() {
    ContactScreen(rememberNavController())
}
