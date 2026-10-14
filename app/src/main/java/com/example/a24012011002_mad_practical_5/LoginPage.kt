
package com.example.a24012011002_mad_practical_5

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun LoginPage(
    context: Context = LocalContext.current,
    navController: NavController
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 20.dp)
    ) {
        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.guni_pink_logo),
            contentDescription = "GUNI Logo",
            modifier = Modifier
                .height(130.dp)
                .align(Alignment.CenterHorizontally),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(defaultElevation = 20.dp),
            shape = MaterialTheme.shapes.medium
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                FormField(
                    label = "Email",
                    textState = email,
                    onTextChange = { email = it }
                )

                FormField(
                    label = "Password",
                    textState = password,
                    onTextChange = { password = it },
                    isPasswordField = true
                )

                TextButton(
                    onClick = {
                        Toast.makeText(
                            context,
                            "Forgot Password Clicked",
                            Toast.LENGTH_SHORT
                        ).show()
                    },
                    modifier = Modifier.align(Alignment.End)
                ) {
                    Text("Forgot Password", fontSize = 16.sp)
                }

                Button(
                    onClick = {
                        val message = when {
                            email.isBlank() -> "Please enter your email"
                            password.isBlank() -> "Please enter your password"
                            else -> "Login Clicked"
                        }

                        Toast.makeText(
                            context,
                            message,
                            Toast.LENGTH_SHORT
                        ).show()
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Login", fontSize = 18.sp)
                }
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Don't Have an Account?", fontSize = 14.sp)

            Spacer(modifier = Modifier.width(8.dp))

            TextButton(
                onClick = {
                    navigateToRegistrationScreen(navController)
                }
            ) {
                Text(
                    "SIGN UP",
                    color = Color(0xFF563D89),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

fun navigateToRegistrationScreen(navController: NavController) {
    navController.navigate("register") {
        launchSingleTop = true
    }
}
