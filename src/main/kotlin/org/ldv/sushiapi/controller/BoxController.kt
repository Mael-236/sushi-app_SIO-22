package org.ldv.sushiapi.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.ldv.sushiapi.dao.BoxDao
import org.ldv.sushiapi.dto.BoxDtoApi



@RestController
@RequestMapping( "/api")
@CrossOrigin
open class BoxController(val boxDao: BoxDao) {

    @GetMapping( "/boxes")
    @CrossOrigin(origins = ["*"])
    open fun allBoxes(): ResponseEntity<List<BoxDtoApi>> {
        return ResponseEntity.ok(boxDao.findAll().map { boxToBoxDtoApi( it)} )
    }
}