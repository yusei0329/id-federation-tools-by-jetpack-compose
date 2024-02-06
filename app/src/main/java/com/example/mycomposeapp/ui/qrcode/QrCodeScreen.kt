package com.example.mycomposeapp.ui.qrcode

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QrCodeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.LightGray
                ),
                title = {
                    Text("テスト系")
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = null
                        )
                    }
                }
            )
        }){innerPadding ->
        Column(
            Modifier.padding(innerPadding)
        ) {
            Box(
                contentAlignment = Alignment.BottomCenter,
                modifier = Modifier
                    .weight(0.5f)
                    .padding(
                        start = 32.dp,
                        end = 32.dp,
                        top = 16.dp,
                        bottom = 16.dp
                    )
            ) {
                TitleContent()
            }
            Box(
                modifier = Modifier
                    .weight(3f)
            ) {
                QrCodeCardContent()
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(0.5f)
                    .padding(
                        start = 32.dp,
                        end = 32.dp,
                        top = 16.dp,
                        bottom = 16.dp
                    )
            ) {
                BottomButtonContent()
            }
        }

    }
//    Column(
//        Modifier
//            .fillMaxSize()
//    ) {
//        Box(
//            contentAlignment = Alignment.BottomCenter,
//            modifier = Modifier
//                .weight(0.5f)
//                .padding(
//                    start = 32.dp,
//                    end = 32.dp,
//                    top = 16.dp,
//                    bottom = 16.dp
//                )
//        ) {
//            TitleContent()
//        }
//        Box(
//            modifier = Modifier
//                .weight(3f)
//        ) {
//            QrCodeCardContent()
//        }
//        Box(
//            contentAlignment = Alignment.Center,
//            modifier = Modifier
//                .weight(0.5f)
//                .padding(
//                    start = 32.dp,
//                    end = 32.dp,
//                    top = 16.dp,
//                    bottom = 16.dp
//                )
//        ) {
//            BottomButtonContent()
//        }
//    }
}