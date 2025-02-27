package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskManagerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun SmoothGradient(modifier: Modifier = Modifier){
    Column(
        modifier = Modifier.background(Color.Black)
            .padding(25.dp)

    ) {
        Text(
            text = "04",
            fontSize = 40.sp,
            color = Color.Red,
            fontWeight = FontWeight.Black,
        )
        Text(
            text = "Pure Lust",
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 20.dp),
            style = TextStyle(
                brush = Brush.verticalGradient(
                    listOf(
                        Color.White, Color.Black
                    )
                )
            )
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Row(
                Modifier.border(
                    width = 1.dp,
                    Color.White,
                    shape = RoundedCornerShape(5.dp)
                )
                    .padding(5.dp)
                    .weight(1f)
            ) {
                Box(
                    Modifier.size(25.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color(0xff333333))
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "#333333",
                    color = Color.White,
                    fontSize = 12.sp,
                )
                Spacer(modifier = Modifier.weight(1f))
            }
            Row(
                Modifier.border(
                    width = 1.dp,
                    Color.White,
                    shape = RoundedCornerShape(5.dp)
                )
                    .weight(1f)
                    .padding(5.dp)
            ) {
                Box(
                    Modifier.size(25.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color(0xffdd1818))
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "#dd1818",
                    color = Color.White,
                    fontSize = 12.sp,
                )
                Spacer(modifier = Modifier.weight(1f))
            }
        }
        Box(
            Modifier.padding(top=5.dp)
                .width(500.dp)
                .height(200.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        Color(0xff333333), Color(0xffdd1818)
                    )
                )
            )

        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TaskManagerTheme {
        SmoothGradient()
    }
}