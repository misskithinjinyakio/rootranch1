package com.faith.rootranch.ui.theme.screens.item

import android.media.RouteListingPreference.Item
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
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
import com.faith.rootranch.ui.theme.neworange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){
    var showMenu by remember { mutableStateOf(false) }
    Column (modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())
    ){
        //topappbar
        TopAppBar(title = { Text(text = "Choose and buy your products", fontSize = 20.sp) },
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
        Image(
            painter = painterResource(R.drawable.cows),
            contentDescription = "home",
            modifier = Modifier.fillMaxWidth().height(200.dp),
            contentScale = ContentScale.FillWidth
        )

        Spacer(modifier = Modifier.height(20.dp))
        //searchbar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = {search=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") },
            placeholder = { Text(text = "search here") }
        )
        //end of searchbar


        Spacer(modifier = Modifier.height(20.dp))
        //Row starts

        Column(modifier = Modifier) {
            Row(modifier = Modifier.padding(start = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.heifer),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale=ContentScale.FillWidth


                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(
                        text = "Holstein dairy cow",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "milk production is 60 litres per day",
                        fontSize = 15.sp,

                        )
                    Text(
                        text = "ksh 60,000",
                        fontSize = 20.sp,


                    )


                    Button(onClick =   {   navController.navigate(ROUT_ORDER)},
                        colors= ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp))
                    { Text(text = "Buy Now") }
                }



            }
            //row ends


            Spacer(modifier = Modifier.height(20.dp))
            //Row starts

            Row(modifier = Modifier.padding(start = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.j),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale=ContentScale.FillWidth


                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(
                        text = "Jesey dairy cow",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "milk production is 65 liters per day",
                        fontSize = 15.sp,

                        )
                    Text(
                        text = "ksh 65,000",
                        fontSize = 20.sp,


                    )


                    Button(onClick = { navController.navigate(ROUT_ORDER)},
                        colors= ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp))
                    { Text(text = "buy now") }
                }



            }
            //row ends
            Spacer(modifier = Modifier.height(20.dp))
            //Row starts

            Row(modifier = Modifier.padding(start = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.g),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale=ContentScale.FillWidth





                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(
                        text = "Guernsey dairy cow ",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "milk production is 72 liters per day",
                        fontSize = 15.sp,

                        )
                    Text(
                        text = "ksh 80,000",
                        fontSize = 20.sp,


                    )


                    Button(onClick = { navController.navigate(ROUT_ORDER)},
                        colors= ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp))
                    { Text(text = "Buy now") }
                }



            }
            //row ends

            Spacer(modifier = Modifier.height(20.dp))
            //Row starts

            Row(modifier = Modifier.padding(start = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.we),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale=ContentScale.FillWidth





                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(
                        text = "Weaned calf ",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "Age is 6-8 weeks",
                        fontSize = 15.sp,

                        )
                    Text(
                        text = "ksh 40,000",
                        fontSize = 20.sp,


                        )


                    Button(onClick = { navController.navigate(ROUT_ORDER)},
                        colors= ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp))
                    { Text(text = "Buy now") }
                }



            }
            //row ends
            Spacer(modifier = Modifier.height(20.dp))
            //Row starts

            Row(modifier = Modifier.padding(start = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.fc),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale=ContentScale.FillWidth





                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(
                        text = "Feeder calf",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "age of 6-10 months",
                        fontSize = 15.sp,

                        )
                    Text(
                        text = "ksh 50,000",
                        fontSize = 20.sp,


                        )


                    Button(onClick = { navController.navigate(ROUT_ORDER)},
                        colors= ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp))
                    { Text(text = "Buy now") }
                }



            }
            //row ends
            Spacer(modifier = Modifier.height(20.dp))
            //Row starts

            Row(modifier = Modifier.padding(start = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.n),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale=ContentScale.FillWidth





                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(
                        text = "Newborn",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "few weeks",
                        fontSize = 15.sp,

                        )
                    Text(
                        text = "ksh 50,000",
                        fontSize = 20.sp,


                        )


                    Button(onClick = { navController.navigate(ROUT_ORDER)},
                        colors= ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp))
                    { Text(text = "Buy now") }
                }



            }
            //row ends





















        }
    }



}


@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(rememberNavController())}
