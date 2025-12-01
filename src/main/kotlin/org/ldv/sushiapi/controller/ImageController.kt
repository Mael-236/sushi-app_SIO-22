package org.ldv.sushiapi.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = [ "/api/image"])
class ImageController(private val resourceLoader: ResourceLoader) {
}