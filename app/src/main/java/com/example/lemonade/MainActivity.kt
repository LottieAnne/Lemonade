package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                LemonApp()
            }
        }
    }
}

@Composable
fun LemonApp() {
    LemonTextAndImage()
}

@Composable
fun LemonTextAndImage(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Text(
            text = stringResource(R.string.lemon_select),
            fontSize = 18.sp
        )
        Image(painter = painterResource(R.drawable.lemon_tree),contentDescription = stringResource(R.string.lemon_tree_content_description))
        Text(
            text = stringResource(R.string.lemon_squeeze),
            fontSize = 18.sp
        )
        Image(painter = painterResource(R.drawable.lemon_squeeze),contentDescription = stringResource(R.string.lemon_content_description))
        Text(
            text = stringResource(R.string.lemon_drink),
            fontSize = 18.sp
        )
        Image(painter = painterResource(R.drawable.lemon_drink),contentDescription = stringResource(R.string.lemonade_content_description))
        Text(
            text = stringResource(R.string.lemon_empty_glass),
            fontSize = 18.sp
        )
        Image(painter = painterResource(R.drawable.lemon_restart),contentDescription = stringResource(R.string.empty_glass_content_description))

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LemonadeTheme() {
        LemonApp()
    }
}