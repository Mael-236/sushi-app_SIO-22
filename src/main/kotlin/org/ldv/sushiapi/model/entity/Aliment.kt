package org.ldv.sushiapi.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "aliments")
open class Aliment (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val alimentId: Long,

    val nom: String,

    @OneToMany(mappedBy = "aliment") //aliment est l'attribut d'alimentBox
    val alimentBoxes: MutableList<AlimentBox>
) {
}