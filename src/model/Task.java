package model;

public class Task {
	String titulo;
	String descricao;
	boolean status;

	public Task(String titulo, String descricao) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.status = false;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	 public void setStatus(boolean status) {
	        this.status = status;
    }

	 @Override
	    public String toString() {
	        return "Titulo: " + titulo + ", Descricao: " + descricao + ", Status: " + (status ? "Concluída" : "Pendente");
    }
}
