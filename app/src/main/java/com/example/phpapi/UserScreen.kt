package com.example.phpapi

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.phpapi.model.User
import androidx.compose.foundation.lazy.items

@Composable
fun UserScreen(viewModel: UserViewModel = UserViewModel()) {
    if (viewModel.isLoading) {
        CircularProgressIndicator(modifier = Modifier.padding(16.dp))
    } else {
        LazyColumn {
            items(viewModel.users) {user ->
                UserCard(user)
            }
        }

    }
}

@Composable
fun UserCard(user: User) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)) {
        Text("Name: ${user.name}", style = MaterialTheme.typography.titleMedium)
        Text("Email: ${user.email}", style = MaterialTheme.typography.bodyMedium)
        HorizontalDivider(modifier = Modifier.padding(top = 8.dp))
    }
}
