package post;

public class Post {
	String legenda;
	String id;
	int numeroCurtida;
	int numeroComentario;
	String localizacao;
	
	public Post(String legenda) {
		this.legenda = legenda;
	}
	
	//metodos de acesso controlado
	//legenda
	public String getLegenda() {
		return this.legenda;
	}
	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}
	//id
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	//localizacao
	public String getLocalizacao() {
		return this.localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	//curtidas
	public int getNumeroCurtida() {
		return this.numeroCurtida;
	}
	public void getNumeroCurtida(int numeroCurtida) {
		this.numeroCurtida = numeroCurtida;
	}
	//comentario
	public int getNumeroComentario() {
		return this.numeroComentario;
	}
	public void getNumeroComentario(int numeroComentario) {
		this.numeroComentario = numeroComentario;
	}S
}
