package org.ldv.sushiapi.DTO

import org.ldv.sushiapi.DTO.AlimentBoxDTOApi

class BoxDTOApi(
    val id: Long?,
    val pièces: Int,
    val nom: String,
    val image:String,
    val prix: Double,
    val saveurs : Set<String>,
    val aliments : List<AlimentBoxDTOApi>
) {
}