package com.soujunior.petjournal.ui.accountManager.changePasswordScreen.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.soujunior.petjournal.ui.accountManager.changePasswordScreen.ChangePasswordFormEvent
import com.soujunior.petjournal.ui.accountManager.changePasswordScreen.ChangePasswordViewModel
import com.soujunior.petjournal.ui.components.Button
import com.soujunior.petjournal.ui.components.Button2
import com.soujunior.petjournal.ui.components.CheckboxWithText
import com.soujunior.petjournal.ui.components.CreateTitleAndImageLogo
import com.soujunior.petjournal.ui.components.InputText
import com.soujunior.petjournal.ui.states.States

@Composable
fun Screen(
    viewModel: ChangePasswordViewModel
) {
    Box(modifier = Modifier.fillMaxWidth()) {
        LazyColumn(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
        ) {
            item {
                CreateTitleAndImageLogo(
                    title = "Crie uma nova senha!",
                    styleTitle = MaterialTheme.typography.displayMedium,
                    spaceTop = 60.dp,
                    spaceBetween = 40.dp,
                    spaceBottom = 30.dp
                )
            }
            item {
                InputText(
                    textTop = "Senha",
                    textHint = "Digite sua senha",
                    textValue = viewModel.state.password,
                    textError = viewModel.state.passwordError,
                    isPassword = true,
                    onEvent = { it: String ->
                        viewModel.onEvent(
                            ChangePasswordFormEvent.PasswordChanged(
                                it
                            )
                        )
                    },
                )
            }
            item { Spacer(modifier = Modifier.height(30.dp)) }
            item {
                InputText(
                    textTop = "Confirmar senha",
                    textHint = "Confirme sua senha",
                    textValue = viewModel.state.repeatedPassword,
                    textError = viewModel.state.repeatedPasswordError,
                    isPassword = true,
                    onEvent = { it: String ->
                        viewModel.onEvent(
                            ChangePasswordFormEvent.ConfirmPasswordChanged(
                                it
                            )
                        )
                    },
                )
            }
            item { Spacer(modifier = Modifier.height(30.dp)) }
            item {
                CheckboxWithText(
                    text = "É necessário que todos os dispositivos acesssem sua conta com a nova senha ?",
                    checkbox = viewModel.state.disconnectOtherDevices,
                    onEvent = { it: Boolean ->
                        viewModel.onEvent(
                            ChangePasswordFormEvent.DisconnectOtherDevices(
                                it
                            )
                        )
                    }
                )
            }
            item { Spacer(modifier = Modifier.height(30.dp)) }
            item {
                Button2(
                    submit = {
                             viewModel.onEvent(event = ChangePasswordFormEvent.Submit)
                    },
                    enableButton = viewModel.enableButton(),
                    text = "Redefinir Senha",
                )
            }
        }
    }
}