package com.example.praktikum7.ui.theme.view

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
}