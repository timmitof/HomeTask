package com.timmitof.hometask.models

import java.io.Serializable

data class ModelClass(
    val image: String,
    val name: String,
    val description: String,
    val detailDescription: String
): Serializable
