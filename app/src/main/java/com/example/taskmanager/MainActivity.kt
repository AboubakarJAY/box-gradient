package com.example.taskmanager

import android.content.Context
import android.os.Bundle
import android.widget.Toast
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
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
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
import androidx.compose.ui.platform.LocalContext
import com.example.taskmanager.ui.theme.TaskManagerTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import kotlin.coroutines.coroutineContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskManagerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SmoothGradient(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun SmoothGradient(modifier: Modifier = Modifier){
    val context = LocalContext.current
    Box(
        modifier = Modifier.statusBarsPadding()
            .background(Color.Black)
            .fillMaxSize()
            .padding(20.dp)

    ){
        Column(
            modifier.fillMaxWidth()
                .background(Color(0xff007991))
                .height(300.dp)
        ) {
            Row(modifier) {
                Text(
                    text = "Training",
                    color = Color.White,
                    fontSize = 28.sp
                )
                Button(
                    modifier = Modifier.size(30.dp),
                    onClick = {
                        Toast.makeText(context, "Ceci est un message Toast", Toast.LENGTH_SHORT).show()
                    }
                ) {
                    Text(
                        text = "+",
                        fontSize = 16.sp,
                        color = Color.White
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TaskManagerTheme {
        SmoothGradient()
    }
}