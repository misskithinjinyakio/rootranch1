package com.faith.rootranch.ui.theme.screens.home




import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
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
import com.faith.rootranch.navigation.ROUT_CONTACT
import com.faith.rootranch.navigation.ROUT_HOME
import com.faith.rootranch.navigation.ROUT_ITEM
import com.faith.rootranch.ui.theme.neworange
import com.faith.rootranch.ui.theme.neworange1
import com.faith.rootranch.ui.theme.screens.contact.ContactScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(

                navigationIcon = {
                    IconButton(onClick = {navController.navigate(ROUT_ABOUT)}) {
                        Icon(Icons.Default.ArrowForward, contentDescription = "forward")
                    }
                },
                actions = {
                    IconButton(onClick = {"faithkithinji39@gmail.com"}) {
                        Icon(imageVector = Icons.Default.Email, contentDescription = "menu")
                    }


                }  ,title = { Text("RootRanch farm") },



                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Black,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        },
        bottomBar = {
            NavigationBar(containerColor = Color.Black) {
                NavigationBarItem(
                    icon = { Icon(Icons.Default.ShoppingCart, contentDescription = "Home") },
                    label = { Text("shopus") },
                    selected = selectedIndex == 0,
                    onClick = {
                        selectedIndex = 0
                        navController.navigate(ROUT_ITEM)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "About") },
                    label = { Text("About") },
                    selected = selectedIndex == 1,
                    onClick = {
                        selectedIndex = 1
                        navController.navigate(ROUT_ABOUT)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Place, contentDescription = "Contact") },
                    label = { Text("Contact") },
                    selected = selectedIndex == 2,
                    onClick = {
                        selectedIndex = 2
                        navController.navigate(ROUT_CONTACT)
                    }
                )
            }
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxHeight()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(Color(0xFFFFF3E0), Color(0xFF244105))
                        )
                    )
                    .verticalScroll(rememberScrollState())
            ) {
                Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = "Home Cow",
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
                Text(text = "What to reach us on social media?",fontStyle = FontStyle.Italic)
                Text(text = "Reach @rootranch.com ",fontStyle = FontStyle.Italic)
                Text(text = "and rootranch in Facebook,Intagram and Tiktok",fontStyle = FontStyle.Italic)
                Text(text = "or call us",fontStyle = FontStyle.Italic)
                Text(text = "0741058154",fontStyle = FontStyle.Italic)




                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                        .align(Alignment.Start)
                        .padding(horizontal = 20.dp)
                        .offset(y = 90.dp),
                    shape = RoundedCornerShape(30.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize().padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Top
                    ) {
                        Text(
                            text = "WELCOME TO ROOTRANCH FARM",
                            fontSize = 20.sp,
                            fontStyle = FontStyle.Italic,
                            color = Color.Black
                        )

                        Image(
                            painter = painterResource(R.drawable.cow),
                            contentDescription = "Home Cow",
                            modifier = Modifier
                                .size(120.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Empowering Farmers With Smart Solutions",
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                            color = Color.Black
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        Button(
                            onClick = { navController.navigate(ROUT_ABOUT) },
                            colors = ButtonDefaults.buttonColors(Color.Black),
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(text = "Learn more...", fontStyle = FontStyle.Italic)
                        }
                    }
                }

                Spacer(modifier = Modifier.height(100.dp))

                Text(
                    text = "Animal Care Tips",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 20.dp, bottom = 8.dp),
                    color = Color.White
                )

                Row(modifier = Modifier.padding(start = 20.dp)) {
                    Card(
                        modifier = Modifier
                            .width(150.dp)
                            .height(180.dp)
                            .shadow(4.dp, RoundedCornerShape(12.dp)),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(8.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(R.drawable.cow),
                                contentDescription = "Cow",
                                modifier = Modifier.size(100.dp).clip(CircleShape)
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = "Vaccinate regularly, offer shelter and nutrition.",
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }

                    Spacer(modifier = Modifier.width(20.dp))

                    Card(
                        modifier = Modifier
                            .width(150.dp)
                            .height(180.dp)
                            .clickable { navController.navigate(ROUT_ABOUT) }
                            .shadow(4.dp, RoundedCornerShape(12.dp)),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(8.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(R.drawable.cow),
                                contentDescription = "Cow",
                                modifier = Modifier.size(100.dp).clip(CircleShape)
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = "Animal care requires attention and dedication.",
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "Quick Actions",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 20.dp, bottom = 8.dp),
                    color = Color.DarkGray
                )

                Row(modifier = Modifier.padding(start = 20.dp, bottom = 40.dp)) {
                    Card(
                        modifier = Modifier
                            .width(150.dp)
                            .height(180.dp)
                            .clickable { navController.navigate(ROUT_ITEM) }
                            .shadow(4.dp, RoundedCornerShape(12.dp)),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(8.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(R.drawable.cow),
                                contentDescription = "Cow",
                                modifier = Modifier.size(100.dp).clip(CircleShape)
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = "Why animal farming? Focus yields better results.",
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }

                    Spacer(modifier = Modifier.width(20.dp))

                    Card(
                        modifier = Modifier
                            .width(150.dp)
                            .height(180.dp)
                            .shadow(4.dp, RoundedCornerShape(12.dp)),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(8.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Button(
                                onClick = { navController.navigate(ROUT_ABOUT) },
                                colors = ButtonDefaults.buttonColors(Color.Black),
                                shape = RoundedCornerShape(8.dp),
                                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
                            ) {
                                Text("About Us", fontSize = 12.sp)
                            }
                            Button(
                                onClick = { navController.navigate(ROUT_ITEM) },
                                colors = ButtonDefaults.buttonColors(Color.Black),
                                shape = RoundedCornerShape(8.dp),
                                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
                            ) {
                                Text("Shop Products", fontSize = 12.sp)
                            }
                            Button(
                                onClick = { navController.navigate(ROUT_CONTACT) },
                                colors = ButtonDefaults.buttonColors(Color.Black),
                                shape = RoundedCornerShape(8.dp),
                                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
                            ) {
                                Text("Contact Us", fontSize = 12.sp)
                            }
                        }
                    }
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())
}
