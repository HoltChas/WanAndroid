package com.holtchas.wanandroid.main

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import by.kirich1409.viewbindingdelegate.viewBinding
import com.holtchas.wanandroid.R
import com.holtchas.wanandroid.base.BaseActivity
import com.holtchas.wanandroid.main.ui.Message
import com.holtchas.wanandroid.main.ui.theme.Shapes
import com.holtchas.wanandroid.main.ui.theme.Teal200
import com.holtchas.wanandroid.main.ui.theme.WanAndroidTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WanAndroidTheme {
                Conversation(message = SampleData.conversationSample)
            }
        }
    }


    @Composable
    fun Messagenba(msg: Message) {
        Row(Modifier.padding(all = 10.dp)) {
            Image(
                painter = painterResource(id = R.drawable.icon_home_selected),
                contentDescription = "enen",
                modifier = Modifier
                    .size(10.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, Color.Red, CircleShape)
            )
            Spacer(
                modifier = Modifier
                    .width(16.dp)
                    .background(
                        Color.Black,
                        CircleShape
                    )
            )

            var isExpanded by remember {
                mutableStateOf(false)
            }

            Column(modifier = Modifier.clickable { isExpanded = !isExpanded }) {
                Text(text = msg.author, color = Teal200, style = MaterialTheme.typography.subtitle2)
                Spacer(modifier = Modifier.width(16.dp))
                Surface(
                    shape = Shapes.medium,
                    elevation = 1.dp,
                    modifier = Modifier.padding(5.dp)
                ) {
                    Text(
                        text = msg.body,
                        modifier = Modifier.padding(all = 4.dp),
                        maxLines = if (isExpanded) Int.MAX_VALUE else 1,

                        style = MaterialTheme.typography.body2
                    )
                }
            }
        }
//
//
//    }
//    @Preview(name = "Light Mode")
//    @Preview(
//        uiMode = Configuration.UI_MODE_NIGHT_YES,
//        showBackground = true,
//        name = "Dark Mode"
//    )
//    @Composable
//    fun kan() {
//        MaterialTheme {
//            Messagenba(msg = Message("nidie", "android "))
//        }
//
//    }


    }

    @Composable
    fun Conversation(message: List<Message>) {
        LazyColumn(content = {
            items(message) { message ->
                Messagenba(msg = message)
            }
        })
    }

    @Preview
    @Composable
    fun PreviewConversation() {
        WanAndroidTheme {
            Conversation(message = SampleData.conversationSample)
        }
    }
}