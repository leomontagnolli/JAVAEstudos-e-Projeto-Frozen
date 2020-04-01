package br.com.jandaia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jandaia.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	public Curso findByNome(String nomeCurso);
	

}
