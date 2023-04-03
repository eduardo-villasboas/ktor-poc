package com.bootstrap.service.application

import kotlinx.serialization.Serializable

@Serializable
data class Customer(
    val name: String = "eduardo"
)

