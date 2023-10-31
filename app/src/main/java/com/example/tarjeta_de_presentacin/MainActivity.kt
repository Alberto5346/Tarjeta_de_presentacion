package com.example.tarjeta_de_presentacin
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjeta_de_presentacin.ui.theme.Tarjeta_de_presentaciónTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tarjeta_de_presentaciónTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                            .border(2.dp, Color(0xFF000080), RoundedCornerShape(16.dp))
                            .background(Color.White)
                    ) {
                        TarjetaDePresentacionApp()
                    }
                }
            }
        }
    }
}


@Composable
fun TarjetaDePresentacionApp() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.lolol), // Reemplaza "tu_imagen_de_fondo" con el ID de tu imagen de fondo
            contentDescription = null,
            contentScale = ContentScale.Crop, // Escala la imagen para que llene el espacio
            modifier = Modifier.fillMaxSize()
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .border(4.dp, Color.Black)
        ) {
            // Tu contenido actual
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White), // Fondo blanco
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.fotob),
                        contentDescription = null,
                        modifier = Modifier.size(150.dp)
                    )
                    Column(modifier = Modifier.padding(top = 8.dp)) {

                        Text(
                            text = stringResource(id = R.string.first_title),
                            fontSize = 26.sp,
                            modifier = Modifier.padding(start = 7.dp)
                        )

                        Text(
                            text = stringResource(id = R.string.your_text_id), // Reemplaza "your_text_id" con el ID de recurso correcto
                            fontSize = 22.sp,
                            modifier = Modifier.padding(start = 7.dp)
                        )
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White), // Fondo blanco
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.gmail1),
                        contentDescription = null,
                        modifier = Modifier.size(50.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.gmail_title),
                        fontSize = 22.sp,
                        modifier = Modifier.padding(start = 7.dp)
                            .align(Alignment.CenterVertically)
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White), // Fondo blanco
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth()
                            .background(Color.White), // Fondo blanco
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.linkedi),
                            contentDescription = null,
                            modifier = Modifier.size(50.dp)
                        )
                        Text(
                            text = stringResource(id = R.string.fourth_description),
                            fontSize = 16.sp,
                            modifier = Modifier.padding(start = 7.dp)
                                .align(Alignment.CenterVertically)
                        )
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White), // Fondo blanco
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.telefono1),
                        contentDescription = null,
                        modifier = Modifier.size(50.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.telefono),
                        fontSize = 24.sp,
                        modifier = Modifier.padding(start = 7.dp)
                            .align(Alignment.CenterVertically)

                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp), // Agrega un espacio en la parte superior
                    horizontalArrangement = Arrangement.Center // Centra el ImageButton horizontalmente
                ) {
                    Box(
                        modifier = Modifier
                            .background(Color.White) // Fondo blanco
                            .size(250.dp) // Ajusta el tamaño del fondo blanco según tus necesidades
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.hite), // Reemplaza "tu_imagen_de_fondo" con el ID de tu imagen de fondo
                            contentDescription = null,
                            contentScale = ContentScale.Crop, // Escala la imagen para que llene el espacio
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
            }
        }
    }
}
@Composable
private fun ComposableInfoCard(
    title: String,
    imagePainter: Painter,
    description: String = "",
    telefono: String = "",
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = imagePainter, contentDescription = null)
        Text(
            text = title,
            fontWeight = FontWeight.Bold
        )
        if (description.isNotEmpty()) {
            Text(
                text = description,
                fontWeight = FontWeight.Bold
            )
        }
        if (telefono.isNotEmpty()) {
            Text(
                text = telefono,
                fontWeight = FontWeight.Bold
            )
        }

    }
}


@Preview(showBackground = true)
@Composable
fun TarjetaDePresentacionPreview() {
    Tarjeta_de_presentaciónTheme {
        TarjetaDePresentacionApp()
    }
}