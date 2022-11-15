package dev.levi.composechallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.levi.composechallenge.ui.theme.ComposeChallengeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeChallengeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TextExample()
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    ComposeChallengeTheme {
//        Greeting("Android")
//    }
//}

@Preview(showBackground = true)

@Composable
fun TextExample() {
    Column(modifier =Modifier.padding(start = 10.dp,end = 10.dp)) {
        Column(modifier = Modifier.padding(bottom = 10.dp)) {
            Text(
                "A Story On The Recent Muggings Seen To Be Occurring In The CBD Of Nairobi City",
                fontSize = 20.sp,
                style = TextStyle(
                    fontWeight = FontWeight.Bold
                )
            )
        }
        Column(modifier = Modifier.padding(bottom = 10.dp,top = 10.dp)) {
            Text(
                text = "The National Police Service (NPS) has announced the crime hotspots in Nairobi where gangs are said to be operating from amid the spike in insecurity." +
                        "According to a report sent to newsrooms on Monday, a survey was conducted on crime statistics within Nairobi which indicated that the gangs are targeting individuals of all ages, business premises, M-Pesa operators and residential homes."
            )
        }
        Column(modifier = Modifier.padding(bottom = 10.dp,top = 10.dp))  {
            Text(
                text = "\"Witnesses have stated that most crimes are committed in broad daylight,\" reads part of the report." +
                        "NPS has listed the areas where the criminals operate including Drive-In flyover up to KCA along Thika road, KCA underpass, Total exit along Thika road, Globe Cinema roundabout and Kipande road.\n" +
                        "\n" +
                        "Other areas are ABC Place, Kangemi along Waiyaki way, CBD (River Road, Archives, Kirinyaga road and Fig Tree.)\n" +
                        "" +
                        "NPS has also offered a few lifesaving tips to Kenyans amid the rising crime cases in Nairobi they say can help save them from being mugged."

            )
        }
        Column(modifier = Modifier.padding(bottom = 10.dp,top = 10.dp))  {
            Text(
                text = "The assailants are said to be using a myriad of tactics including muggings, assaults, robbery with violence, carjacking, murder, housebreaking and burglaries.\n" +
                        "\n" +
                        "Police have therefore recommended these measures to observe while walking or driving in public:", style = TextStyle(

                )
            )
        }
    }
}