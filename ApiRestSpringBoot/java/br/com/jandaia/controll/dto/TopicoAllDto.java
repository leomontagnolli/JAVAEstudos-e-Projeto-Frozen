package br.com.jandaia.controll.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.jandaia.model.StatusTopico;
import br.com.jandaia.model.Topico;

public class TopicoAllDto {
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime data;
	private String nomeAutor;
	private StatusTopico status;
	private List<RespostaDto> resposta;
	
	public TopicoAllDto (Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.data = topico.getDataCriacao();
		this.nomeAutor = topico.getAutor().getNome();
		this.status = topico.getStatus();
		this.resposta = new ArrayList<>();
		this.resposta.addAll(topico.getRespostas().stream().map(RespostaDto::new).collect(Collectors.toList()));
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getData() {
		return data;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public StatusTopico getStatus() {
		return status;
	}

	public List<RespostaDto> getResposta() {
		return resposta;
	}
	
	
	
}
