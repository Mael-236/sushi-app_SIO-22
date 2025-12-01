package org.ldv.sushiapi.model.entity

import jakarta.persistence.*
import org.ldv.sushiapi.model.id.AlimentBoxId

@Entity
@Table(name = "aliments_boxes")
class AlimentBox(
    @EmbeddedId
    val alimentBoxId: AlimentBoxId,

    @ManyToOne
    @MapsId(value = "boxId") // On indique l'attribut correspondant sur AlimentBoxId
    @JoinColumn(name = "fk_box_id")
    //@JsonBackReference
    val box: Box,

    @ManyToOne
    @MapsId(value = "alimentId") // On indique l'attribut correspondant sur AlimentBoxId
    @JoinColumn(name = "fk_aliment_id")
    //@JsonBackReference
    val aliment: Aliment,

    val quantite: Int
) {
}