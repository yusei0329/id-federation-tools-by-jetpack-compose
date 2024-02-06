package com.example.mycomposeapp.ui.qrcode

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun BottomButtonContent() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Button(
            modifier = Modifier
                .padding(8.dp)
                .weight(1F),
            onClick = {},
            colors = ButtonDefaults.textButtonColors(
                containerColor = Color.DarkGray,
                contentColor = Color.White,
                disabledContainerColor = Color.LightGray
            )
        ) {
            Text(fontSize = 16.sp, text = "polling")
        }
        Button(
            modifier = Modifier
                .padding(8.dp)
                .weight(1F),
            onClick = {},
            colors = ButtonDefaults.textButtonColors(
                containerColor = Color.DarkGray,
                contentColor = Color.White,
                disabledContainerColor = Color.LightGray
            )
        ) {
            Text(fontSize = 16.sp, text = "game start")
        }
    }
}