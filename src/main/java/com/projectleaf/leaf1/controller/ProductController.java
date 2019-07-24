package com.projectleaf.leaf1.controller;

import com.projectleaf.leaf1.entity.Tea;
import com.projectleaf.leaf1.repository.TeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RequestMapping("/api")
@RestController
public class ProductController {

	@Autowired
    private TeaRepository teaRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/products")
    public Iterable<Tea> getTeas() {
        return teaRepository.findAll();
    }
}