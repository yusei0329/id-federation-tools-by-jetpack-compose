package com.example.mycomposeapp.ui.qrcode

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.example.mycomposeapp.R


@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun QrCodeCardContent() {
    // Display 2 items
    val pages = 2
    val pagerState = rememberPagerState { pages }
    val dummyName = listOf("cocco","niwasei")

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
            ) {
                HorizontalPager(
                    state = pagerState,
                    contentPadding = PaddingValues(32.dp),
                    pageSpacing = 16.dp,
                    modifier = Modifier.fillMaxSize()
                ) { page ->
                    CardContents(page, dummyName[page])
                }
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .weight(0.1f),
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(pages) { iteration ->
                    val color =
                        if (pagerState.currentPage == iteration) Color.DarkGray else Color.LightGray
                    Box(
                        modifier = Modifier
                            .padding(6.dp)
                            .clip(CircleShape)
                            .background(color)
                            .size(8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun CardContents(pageId: Int, username: String) {
    val backgroundCol = listOf(Color.LightGray, Color.White)
    val userId = pageId + 1

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        ElevatedCard(
            colors = CardDefaults.cardColors(
                containerColor = backgroundCol[pageId],
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 16.dp
            ),
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                ) {
                    Text(fontSize = 24.sp, text = userId.toString() + "人目")
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(2f)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.qr),
                        contentDescription = "qr code",
                        contentScale = ContentScale.Fit
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                ) {
                    Text(fontSize = 24.sp,text = username)
                }
            }
        }
    }
}
