package org.ldv.sushiapi.model.entity

import jakarta.persistence.*

open class Box(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val boxId: Long,

    var nom: String,
    var nbPieces: Int,
    var prix: Double,
    var nomImage: String,

    // Relation many to many des boxes aux saveurs :
    @ManyToMany
    @JoinTable(
        name = "saveurs_boxes",
        joinColumns = [JoinColumn(name = "fk_box_id")],
        inverseJoinColumns = [JoinColumn(name = "fk_saveur_id")]
    )
    val saveurs: MutableSet<Saveur>,

    //Relation one to many d'une box a ses aliments
    @OneToMany(mappedBy = "box")
    val alimentBoxes: MutableList<AlimentBox>
) {
}