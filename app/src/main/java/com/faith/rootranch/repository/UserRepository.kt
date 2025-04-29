package com.faith.rootranch.repository



import com.faith.rootranch.data.UserDao
import com.faith.rootranch.moadel.User

class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}