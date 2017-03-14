package pcctae;

import java.util.List;

public class Categoria {
	
	private Cargo cargo;
	private Classe classe;
	private MesAno mesAno;
	private Piso piso;
	private int posicao;
	private String valor;
	private List<Funcionario> funcionario;
	
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Cargo getCargo() {
		return cargo;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public Classe getClasse() {
		return classe;
	}
	
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
	public MesAno getMesAno() {
		return mesAno;
	}
	
	public void setMesAno(MesAno mesAno) {
		this.mesAno = mesAno;
	}
	
	public Piso getPiso() {
		return piso;
	}
	
	public void setPiso(Piso piso) {
		this.piso = piso;
	}
	
	public int getPosicao() {
		return posicao;
	}
	
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	public List<Funcionario> getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
	
	
}
