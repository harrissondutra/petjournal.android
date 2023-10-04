package com.soujunior.petjournal.ui.accountManager.awaitingCodeScreen

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.soujunior.petjournal.ui.ValidationEvent
import com.soujunior.petjournal.ui.accountManager.awaitingCodeScreen.components.Screen
import org.koin.androidx.compose.getViewModel

@Composable
fun AwaitingCodeScreen(arg: String?, navController: NavController) {
    val viewModel: AwaitingCodeViewModel = getViewModel()
    val context = LocalContext.current

    LaunchedEffect(key1 = context) {
        if (arg != null) {
            viewModel.onEvent(AwaitingCodeFormEvent.EmailChanged(arg))
        } else {
            navController.navigateUp()
        }
        viewModel.validationEvents.collect { event ->
            when (event) {
                is ValidationEvent.Success -> {
                    Toast.makeText(
                        context,
                        "Success: " + viewModel.message.value,
                        Toast.LENGTH_LONG
                    ).show()
                    navController.navigate("changePassword")
                }

                is ValidationEvent.Failed -> {
                    Toast.makeText(context, "Failed: " + viewModel.message.value, Toast.LENGTH_LONG)
                        .show()
                }
            }
        }
    }
    Screen(navController, viewModel)
}

