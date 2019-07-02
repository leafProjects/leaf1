package com.projectleaf.leaf1.controller;


import javax.validation.Valid;

import com.projectleaf.leaf1.entity.Avatar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvatarController {

	private static final Logger log = LoggerFactory.getLogger(AvatarController.class);

	@PostMapping("/avatar")
	public ResponseEntity<Avatar> createAvatar(@Valid @RequestBody Avatar avatar){
		log.error("Attenzione, colpo di scena!");
		log.info(String.valueOf(avatar));
		avatar.firstName = "Pippo";
		return new ResponseEntity(avatar, HttpStatus.ACCEPTED);
	}

}
