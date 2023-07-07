package com.example.EC2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/curso")
public class CursoController {
    
    @Autowired
    private CursoReposiitorio cursoRepositorio;

    @GetMapping(path="/listar")
	public @ResponseBody Iterable<Curso> getAllCursos() {
		return cursoRepositorio.findAll();
	}

    @PostMapping(path="/nuevo") 
	public @ResponseBody String addNewUser (@RequestParam String nombre
			, @RequestParam int creditos) {
		Curso n = new Curso();
		n.setNombre(nombre);
		n.setCreditos(creditos);
		cursoRepositorio.save(n);
		return "Curso registrado";
	}

	@DeleteMapping(path="/eliminar")
	public @ResponseBody String delUser (@RequestParam Integer id) {
		Curso n = new Curso();
		n.setId(id);
		cursoRepositorio.delete(n);
		return "Curso eliminado";
	}
}
