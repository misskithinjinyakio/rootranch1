package com.faith.rootranch.ui.theme.screens.home




import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.faith.rootranch.R
import com.faith.rootranch.navigation.ROUT_ABOUT
import com.faith.rootranch.navigation.ROUT_HOME
import com.faith.rootranch.navigation.ROUT_ITEM
import com.faith.rootranch.ui.theme.neworange
import com.faith.rootranch.ui.theme.neworange1
import com.faith.rootranch.ui.theme.screens.contact.ContactScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){


    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("HOMEPAGE") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }


                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Black,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )

            )
        },

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Color.Black
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Search, contentDescription = "Home") },
                    label = { Text("search") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = Color.LightGray
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()

            ) {


                //Main Contents of the page
                //box
                Box(){
                    //card

                    //end of card
                    Card (
                        modifier= Modifier.fillMaxWidth().height(250.dp)
                            .align(alignment = Alignment.BottomCenter)
                            .padding(start = 20.dp, end = 20.dp)
                            .offset(y=90.dp),
                        shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp, topStart = 60.dp, topEnd = 60.dp)
                    ){

                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(text = "WELCOME TO ROOTRANCH FARM",
                                fontSize = 20.sp,
                                fontStyle = FontStyle.Italic,

                                color = Color.Black)
                            Spacer(modifier = Modifier.height(40.dp))


                            Text(text = "Empowering Farmers With Smart Solutions", fontSize = 20.sp,
                                textAlign = TextAlign.Center,


                                color = Color.Black)

                            Spacer(modifier = Modifier.height(40.dp))
                            Button(onClick = {
                                navController.navigate(ROUT_ABOUT)
                            },
                                colors= ButtonDefaults.buttonColors(Color.Black),
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier.fillMaxWidth().padding(start = 20.dp)
                            )
                            { Text(text = " learn more...", fontStyle = FontStyle.Italic,) }
                        }
                    }

                }
                //end of box
                Spacer(modifier = Modifier.height(100.dp))
                //Row
                Row (modifier = Modifier.padding(start = 20.dp)){


                    //card 1
                    Card (
                        modifier = Modifier.width(150.dp).height(180.dp)
                    ){
                        Column(modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Top) {
                            Image(
                                painter = painterResource(R.drawable.cow),
                                contentDescription = "home"
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "On animal management there are several things to look upto that are:", fontSize = 10.sp)
                            Text(text = "vaccinating your animals every season, to make sure they are health and safe from diseases", fontSize = 10.sp)
                            Text(text = "Providing good sheltering, that can keep them warm and safe from pests", fontSize = 10.sp)
                            Text(text = "Giving your animal enough and healthy food and others life saving things such as salt and water", fontSize = 10.sp)
                        }

                    }
                    //end of card 1
                    Spacer(modifier = Modifier.width(40.dp))
                    //card 2
                    Card (
                        modifier = Modifier.width(150.dp).height(180.dp).clickable{navController.navigate(
                            ROUT_ABOUT
                        )}
                    ){
                        Column(modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center) {
                            Image(
                                painter = painterResource(R.drawable.profile),
                                contentDescription = "home"
                            )
                            Text(text = "about us", fontSize = 15.sp)
                        }

                    }
                    //end of card 1

                }






                //end of row

                Spacer(modifier = Modifier.height(20.dp))

                //Row
                Row (modifier = Modifier.padding(start = 20.dp)){


                    //card 3
                    Card (modifier = Modifier.width(150.dp).height(180.dp).clickable{navController.navigate(ROUT_ITEM)}
                    ){
                        Column(modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center) {
                            Image(
                                painter = painterResource(R.drawable.gallery),
                                contentDescription = "home"
                            )
                            Text(text = "product", fontSize = 15.sp)
                        }

                    }
                    //end of card 1
                    Spacer(modifier = Modifier.width(40.dp))
                    //card 2

                    Card (modifier = Modifier.width(150.dp).height(180.dp)
                        .clickable{navController.navigate(
                            ROUT_ITEM
                        )}
                    ){
                        Column(modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center) {
                            Image(
                                painter = painterResource(R.drawable.contacticon),
                                contentDescription = "home",
                                modifier = Modifier.height(60.dp).width(60.dp)
                            )
                            Text(text = "contacts", fontSize = 15.sp)
                        }

                    }
                    //end of card 1

                }












            }
        }
    )

    //End of scaffold



}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}