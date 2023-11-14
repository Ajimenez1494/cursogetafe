package es.curso.java.bbdd.ejercicios.bibliotecabbdd.entities;

public class Libro {

	private String titulo;
	private String autor;
	private int ISBN;
	private int num_copias;
    private int id;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public int getNum_copias() {
		return num_copias;
	}
	public void setNum_copias(int num_copias) {
		this.num_copias = num_copias;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Libro(String titulo, String autor, int ISBN, int num_copias, int id) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		ISBN = ISBN;
		this.num_copias = num_copias;
		this.id = id;
	}

	
		// TODO Auto-generated constructor stub
	
}
