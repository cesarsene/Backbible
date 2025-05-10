package com.controller;

import com.model.Versiculo;
import com.repository.VersiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/biblia")
public class VersiculoController {

    @Autowired
    private VersiculoRepository repository;

    // Consulta por parâmetros (ex: ?versao=aa&livro=genesis&capitulo=1&versiculo=1)
    @GetMapping("/versiculo")
    public List<Versiculo> getVersiculo(
            @RequestParam String versao,
            @RequestParam String livro,
            @RequestParam Integer capitulo,
            @RequestParam(required = false) Integer versiculo
    ) {
        if (versiculo != null) {
            return repository.findByVersaoAndLivroAndCapituloAndVersiculo(versao, livro, capitulo, versiculo);
        } else {
            return repository.findByVersaoAndLivroAndCapitulo(versao, livro, capitulo);
        }
    }

    // Consulta por caminho (ex: /aa/genesis/1/1)
    @GetMapping("/{versao}/{livro}/{capitulo}/{versiculo}")
    public List<Versiculo> getVersiculoPath(
            @PathVariable String versao,
            @PathVariable String livro,
            @PathVariable Integer capitulo,
            @PathVariable Integer versiculo
    ) {
        return repository.findByVersaoAndLivroAndCapituloAndVersiculo(versao, livro, capitulo, versiculo);
    }

    // Consulta por capítulo (ex: /aa/genesis/1)
    @GetMapping("/{versao}/{livro}/{capitulo}")
    public List<Versiculo> getCapituloPath(
            @PathVariable String versao,
            @PathVariable String livro,
            @PathVariable Integer capitulo
    ) {
        return repository.findByVersaoAndLivroAndCapitulo(versao, livro, capitulo);
    }
}
