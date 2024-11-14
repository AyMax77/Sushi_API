package org.ldv.sushiapi.service

import org.ldv.sushiapi.DTO.AlimentBoxDTOApi
import org.ldv.sushiapi.DTO.BoxDTOApi
import org.ldv.sushiapi.model.entity.Box

fun boxtoBoxDtoApi(box: Box) : BoxDTOApi{
    return BoxDTOApi(
        box.boxId,
        box.nbPieces,
        box.nom,
        box.nomImage,
        box.prix,
        HashSet(box.saveurs.stream().map{it.nom}.toList()),
        box.alimentBox.stream().map { AlimentBoxDTOApi(it.aliment.nom, it.quantite) }.toList()
    )
}