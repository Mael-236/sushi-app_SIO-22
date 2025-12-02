package org.ldv.sushiapi.controller

import org.springframework.core.io.ResourceLoader
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = [ "/api/image"])
class ImageController(private val resourceLoader: ResourceLoader) {
}