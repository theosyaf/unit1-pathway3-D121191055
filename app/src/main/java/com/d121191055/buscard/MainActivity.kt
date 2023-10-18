package com.d121191055.buscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.d121191055.buscard.ui.theme.BusCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(Color(216, 236, 212)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .clip(RoundedCornerShape(16.dp))
        )
        Text(
            text = stringResource(R.string.full_name),
            modifier = Modifier.padding(top = 10.dp),
            fontWeight = FontWeight.Medium,
            fontSize = 30.sp,
            color = Color(0, 0, 0, 255)


        )
        Text(
            text = stringResource(R.string.my_status),
            modifier = Modifier.padding(top = 10.dp),
            fontSize = 20.sp,
            color = Color(76,181,171)
        )
        Column(modifier = Modifier.padding(top = 150.dp)) {
            Row(modifier = Modifier.padding(bottom = 10.dp)) {
                Icon(
                    painter = painterResource(R.drawable.ic_baseline_phone_android_24),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp)
                )
                Text(
                    text = stringResource(R.string.my_number),
                    fontSize = 17.sp,
                    color = Color(0, 0, 0, 255),
                    modifier = Modifier.padding(start = 20.dp)
                )

            }
            Row(modifier = Modifier.padding(bottom = 10.dp)) {
                Icon(
                    painter = painterResource(R.drawable.ic_baseline_share_24),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp)
                )
                Text(
                    text = stringResource(R.string.my_social_media),
                    fontSize = 17.sp,
                    color = Color(0, 0, 0, 255),
                    modifier = Modifier.padding(start = 20.dp)
                )
            }
            Row(modifier = Modifier.padding(bottom = 10.dp)) {
                Icon(
                    painter = painterResource(R.drawable.ic_baseline_message_24),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp)
                )
                Text(
                    text = stringResource(R.string.my_email),
                    fontSize = 17.sp,
                    color = Color(0, 0, 0, 255),
                    modifier = Modifier.padding(start = 20.dp)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusCardTheme {
        Greeting()
    }
}
