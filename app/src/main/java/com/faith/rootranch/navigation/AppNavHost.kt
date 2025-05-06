package com.faith.rootranch.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.faith.harakamall.ui.screens.auth.RegisterScreen
import com.faith.harakamall.ui.screens.product.AddProductScreen
import com.faith.harakamall.ui.screens.product.EditProductScreen
import com.faith.harakamall.ui.screens.product.ProductListScreen
import com.faith.harakamall.ui.screens.splash.SplashScreen
import com.faith.rootranch.data.UserDatabase
import com.faith.rootranch.repository.UserRepository
import com.faith.rootranch.ui.screens.auth.LoginScreen
import com.faith.rootranch.ui.theme.screens.about.AboutScreen
import com.faith.rootranch.ui.theme.screens.contact.ContactScreen
import com.faith.rootranch.ui.theme.screens.home.HomeScreen
import com.faith.rootranch.ui.theme.screens.item.ItemScreen
import com.faith.rootranch.ui.theme.screens.order.OrderScreen
import com.faith.rootranch.ui.theme.screens.order.OrderScreenPreview
import com.faith.rootranch.viewmodel.AuthViewModel

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH,

) {
    val context= LocalContext.current

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ORDER) {
            OrderScreen(navController)
        }
        composable(ROUT_CONTACT) {
            ContactScreen(navController)

        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)

        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)

        }

        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }
        // PRODUCTS
        composable(ROUT_ADD_PRODUCT) {
            AddProductScreen(navController, productViewModel)
        }

        composable(ROUT_PRODUCT_LIST) {
            ProductListScreen(navController, productViewModel)
        }

        composable(
            route = ROUT_EDIT_PRODUCT,
            arguments = listOf(navArgument("productId") { type = NavType.IntType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getInt("productId")
            if (productId != null) {
                EditProductScreen(productId, navController, productViewModel)
            }
        }









    }
}

