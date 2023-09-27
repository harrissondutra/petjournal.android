package com.soujunior.petjournal.ui.appArea.registerPetScreen.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun Header() {
    LaunchedEffect(Unit) {
        //userViewModel.loadUserData(userName)
    }
    Text(
/*<<<<<<< HEAD
        text = "Ola NOME2!",
        style = MaterialTheme.typography.titleSmall,
=======*/
        text = "Olá TESTE USUARIO!",
        style = MaterialTheme.typography.displaySmall,
//>>>>>>> feature/species_choice_screen
        textAlign = TextAlign.Center,
        color = MaterialTheme.colorScheme.primary
    )
    Spacer(modifier = Modifier.padding(12.dp))

    Text(
        text = "Sabemos o quanto o seu pet é especial, e estamos muito animados em recebê-los, venha se juntar a nossa comunidade de amantes de Pets, para melhor aproveitar a nossa plataforma.",
        style = MaterialTheme.typography.headlineLarge,
        textAlign = TextAlign.Center,
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(start = 10.dp, end = 10.dp)
    )

    Spacer(modifier = Modifier.padding(bottom = 20.dp))

}