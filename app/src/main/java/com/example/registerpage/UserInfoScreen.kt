package com.example.registerpage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun UserInfoScreen(name: String?, lastName: String?, id: String?, pickedDate: String?) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {

        Text(text = "Your Information", fontSize = 32.sp)

        Text(text = "Name: $name", fontSize = 16.sp)

        Text(text = "LastName: $lastName", fontSize = 16.sp)

        Text(text = "ID: $id", fontSize = 16.sp)

        Text(text = "PickedDate: $pickedDate", fontSize = 16.sp)

        Button(
            onClick = {
//              navController.popBackStack()
            },
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Text(text = "Exit")
        }

    }
}