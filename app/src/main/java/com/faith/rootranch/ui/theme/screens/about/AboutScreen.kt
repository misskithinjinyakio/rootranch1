package com.faith.rootranch.ui.theme.screens.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
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
import com.faith.rootranch.ui.theme.neworange1
import com.faith.rootranch.ui.theme.newwhite
import java.nio.file.WatchEvent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavController) {
    var showMenu by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFFFFF3E0), Color(0xFF264208))
                )
            )

    ) {
        // Header with Image and Title
        Box {

                TopAppBar(
                    title = { Text("ABOUT US",fontStyle = FontStyle.Italic, fontSize = 22.sp, fontWeight = FontWeight.Bold) },
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
                                text = { Text("home") },
                                onClick = {
                                    navController.navigate(ROUT_HOME)
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
                                text = { Text("contact") },
                                onClick = {
                                    navController.navigate(ROUT_CONTACT)
                                    showMenu = false
                                }
                            )
                        }
                    }

                )

        }

        Spacer(modifier = Modifier.height(16.dp))

        // Scrollable Content Section
        androidx.compose.foundation.lazy.LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                InfoCard(
                    title = "WHO ARE WE",
                    description = "RootRanch operates an extensive database of properties available for Sale or Lease...\n\nWe provide value through large-scale properties used for farming, mining, recreation and more. Trusted by multinational firms for decades.",
                    onClick = { navController.navigate(ROUT_HOME) }
                )
            }

            item {
                ImageCard(
                    imageRes = R.drawable.farm2,
                    onClick = { navController.navigate(ROUT_ABOUT) }
                )
            }

            item {
                Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    ImageCard(
                        imageRes = R.drawable.company,
                        modifier = Modifier.weight(1f),
                        onClick = { navController.navigate(ROUT_ITEM) }
                    )

                    InfoCard(
                        title = "WHY US",
                        description = "We match clients with the right land for success. Seamless leasing, custom solutions, and strong partnerships make RootRanch the preferred land sourcing partner.",
                        fontSize = 14.sp,
                        modifier = Modifier.weight(1f),
                        onClick = { navController.navigate(ROUT_ITEM) }
                    )
                }
            }
        }
    }
}

// Reusable Info Card
@Composable
fun InfoCard(
    title: String,
    description: String,
    modifier: Modifier = Modifier,
    fontSize: androidx.compose.ui.unit.TextUnit = 15.sp,
    onClick: () -> Unit
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 180.dp)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(title, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))
            Text(description, fontSize = fontSize)
        }
    }
}

// Reusable Image Card
@Composable
fun ImageCard(
    imageRes: Int,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Card(
        modifier = modifier
            .fillMaxSize()
            .height(200.dp)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.clip(RoundedCornerShape(20.dp)).height(200.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview() {
    AboutScreen(rememberNavController())
}
