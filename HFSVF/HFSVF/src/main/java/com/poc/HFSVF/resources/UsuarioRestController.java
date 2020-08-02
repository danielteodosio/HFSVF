package com.poc.HFSVF.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poc.HFSVF.models.Usuario;
import com.poc.HFSVF.repository.UsuarioRepository;

@Controller
@RequestMapping(value = "/api/usuario")
public class UsuarioRestController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Usuario>> listUsuario(){
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios = usuarioRepository.findAll();
		return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
	}
}
