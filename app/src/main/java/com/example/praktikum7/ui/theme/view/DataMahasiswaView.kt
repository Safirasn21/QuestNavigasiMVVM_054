package com.example.praktikum7.ui.theme.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.praktikum7.model.DataMahasiswa

@Composable
fun DataMahasiswaView(
    modifier: Modifier = Modifier,
    uiStateMahasiswa: DataMahasiswa
)
{
    val listDatamhs = listOf(
        Pair("Nama", uiStateMahasiswa.nama),
        Pair("Gender", uiStateMahasiswa.gender),
        Pair("Alamat", uiStateMahasiswa.alamat),
    )

    Column() {
        listDatamhs.forEach { items -> CardSection(
            judulParam = items.first,
            isiParam = items.second
        ) }
    }

    @Composable
    fun CardSection(judulParam: String, isiParam:String){
        Column(){
            Row(
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = judulParam, modifier = Modifier.weight(0.8f))
                Text(text = " = ", modifier = Modifier.weight(0.2f))
                Text(text = "$isiParam",
                    modifier = Modifier.weight(2f))
            }
        }
    }