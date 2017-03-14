package pcctae;

import java.util.List;

public class Funcionario extends Pessoa {
	private String cpnj;
	private String cargo;
	private List<Categoria> categoria;
		
	public List<Categoria> getCategoria() {
		return categoria;
	}
	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}
	public String getCpnj() {
		return cpnj;
	}
	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
