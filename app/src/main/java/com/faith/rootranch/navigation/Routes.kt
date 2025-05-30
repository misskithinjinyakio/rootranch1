package com.faith.rootranch.navigation

const val ROUT_HOME = "home"
const val ROUT_ABOUT = "about"
const val ROUT_SPLASH = "splash"
const val ROUT_REGISTER = "register"
const val ROUT_LOGIN = "login"
const val ROUT_ITEM = "item"
const val ROUT_ORDER = "order"
const val ROUT_INVENTORY = "inventory"
const val ROUT_SELL = "sell"


//Products

const val ROUT_ADD_PRODUCT = "add_product"
const val ROUT_PRODUCT_LIST = "product_list"
const val ROUT_EDIT_PRODUCT = "edit_product/{productId}"

// ✅ Helper function for navigation
fun editProductRoute(productId: Int) = "edit_product/$productId"





