package com.repository;

import com.model.Versiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VersiculoRepository extends JpaRepository<Versiculo, Long> {
    List<Versiculo> findByVersaoAndLivroAndCapitulo(String versao, String livro, Integer capitulo);
    List<Versiculo> findByVersaoAndLivroAndCapituloAndVersiculo(String versao, String livro, Integer capitulo, Integer versiculo);
}
