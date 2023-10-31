package es.curso.java.colecciones.mapas.biblioteca;

public class Libro {
 private String	titulo;
 private String autor;
 private int CopiasDis;
 
 
public Libro(String titulo, String autor, int copiasDis) {
	super();
	this.titulo = titulo;
	this.autor = autor;
	CopiasDis = copiasDis;
}


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
public int getCopiasDis() {
	return CopiasDis;
}
public void setCopiasDis(int copiasDis) {
	CopiasDis = copiasDis;
}
 
 
 
 
}

