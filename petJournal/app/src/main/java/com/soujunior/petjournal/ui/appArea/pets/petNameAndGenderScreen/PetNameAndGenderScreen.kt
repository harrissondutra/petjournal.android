package com.soujunior.petjournal.ui.appArea.pets.petNameAndGenderScreen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.soujunior.petjournal.ui.appArea.pets.petNameAndGenderScreen.components.Screen


@Composable
fun PetNameAndGenderScreen(petSpecie: String?, navController: NavController){

    Screen(petSpecie, navController)
}


