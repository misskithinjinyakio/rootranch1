package com.faith.rootranch.ui.theme.screens.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
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
import java.nio.file.WatchEvent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize().background(neworange)
    ) {
        //box
        Box(){
            //card
            Card(
                modifier= Modifier.fillMaxWidth().height(300.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(neworange1)
            ) {
                TopAppBar(
                    title = { Text(text = "Dashbaord section") },
                    navigationIcon = {
                        IconButton(onClick = {}) {Icon(imageVector = Icons.Default.Menu, contentDescription = "") }             } )

            }
            //end of card
            Card (
                modifier= Modifier.fillMaxWidth().height(800.dp)
                    .align(alignment = Alignment.BottomCenter)

                    .offset(y=90.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp, topStart = 60.dp, topEnd = 60.dp)
            ){

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Row (modifier = Modifier.padding(start = 20.dp)){


                        //card 1
                        Card (
                            modifier = Modifier.width(150.dp).height(180.dp).clickable{navController.navigate(
                                ROUT_HOME
                            )}
                        ){
                            Column(modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center) {
                                Text(text = "WHO ARE WE", fontSize = 20.sp)
                           Text(text = "\n" +
                                   "\n" +
                                   "Kenya Ranches operate an extensive database of properties owned by us and our associates or partners, which are either available for Sale or Lease.\n" +
                                   "\n" +
                                   "Kenya Ranches expertise has grown over the years to source large - scale properties with potential. These are now used throughout the region to provide land that gives our clients excellent value. \n" +
                                   "\n" +
                                   "We have grown considerably in the past five decades owning a number of large-scale properties in Eastern Africa.  \n" +
                                   "\n" +
                                   "In turn, these lands have been used in a range of sectors, including farming, ranching, mining, land banking, recreation or simply for personal use.  \n" +
                                   "\n" +
                                   "Our team has established excellent relationships with a range of multinational farming organisations, investors and entrepreneurs looking for long-term leases. \n" +
                                   "\n" +
                                   "In fact, one of the largest fruit and vegetable producers in the world has leased our properties for more than 2 decades.\n")
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






                    //end of row

                }
            }

        }
        //end of box

        //Row











    }





}


@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(rememberNavController())}
