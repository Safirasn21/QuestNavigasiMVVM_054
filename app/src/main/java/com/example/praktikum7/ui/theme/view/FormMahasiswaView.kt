package com.example.praktikum7.ui.theme.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FormMahasiswaView(
    modifier: Modifier = Modifier,
    listJK: List<String>,
    onSubmitClicked: (MutableList<String>) -> Unit
){
    var nama by rememberSaveable { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var NIM by remember { mutableStateOf("") }
    var selectedGender by remember { mutableStateOf("") }


    val dataMahasiswa: MutableList<String> = mutableListOf(nama, selectedGender, alamat, email, NIM)


    Column (
        Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        OutlinedTextField(value = nama,
            onValueChange = {nama = it},
            placeholder = { Text("Masukkan namamu") },
            label = { Text("Nama") },
            modifier= Modifier.fillMaxWidth().padding(5.dp))

        Row (){
            listJK.forEach { item ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(selected = selectedGender == item,
                        onClick = {
                            selectedGender = item
                        })
                    Text(item)
                }
            }
        }

        OutlinedTextField(value = email,
            onValueChange = {email = it},
            placeholder = { Text("Masukkan emailmu") },
            label = { Text("Email") },
            modifier= Modifier.fillMaxWidth().padding(5.dp)
        )

        OutlinedTextField(value = alamat,
            onValueChange = {alamat = it},
            placeholder = { Text("Masukkan alamatmu") },
            label = { Text("Alamat") },
            modifier= Modifier.fillMaxWidth().padding(5.dp)
        )

        OutlinedTextField(value = NIM,
            onValueChange = {NIM = it},
            placeholder = { Text("Masukkan NIM") },
            label = { Text("NIM") },
            modifier= Modifier.fillMaxWidth().padding(5.dp)
        )

        Button(
            onClick = {onSubmitClicked(dataMahasiswa)})
        {
            Text("Simpan")
        }

    }
}