package br.edu.univas.vo;

public class Titulo {
	
	private String tipo;
	private String titulo;
	private String elenco;
	private String descricao;
	private String genero;
	private String diretor;
	private String classificacaoEtaria;
	private Player plataforma;
	
	public static int aleatorio(int aux) {
		return aux;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getElenco() {
		return elenco;
	}
	public void setElenco(String elenco) {
		this.elenco = elenco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getClassificacaoEtaria() {
		return classificacaoEtaria;
	}
	public void setClassificacaoEtaria(String classificacaoEtaria) {
		this.classificacaoEtaria = classificacaoEtaria;
	}
	public Player getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(Player plataforma) {
		this.plataforma = plataforma;
	}
	
	

}
