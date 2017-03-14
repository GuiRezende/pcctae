package pcctae;

public class Principal {

	public static void main (String[]args){
		
		Cargo analista = new Cargo();
		analista.setDescricao("Analista");
		
		MesAno ano2017 = new MesAno();
		ano2017.setData("Marco de 2017");
		
		Piso p01 = new Piso();
		p01.setSigla("p01");
		
		Classe classe4 = new Classe();
		classe4.setSigla("classe4");
		
		Categoria categoriaE = new Categoria();
		categoriaE.setPosicao(16);
		categoriaE.setValor("8323,87");
		categoriaE.setCargo(analista);
		categoriaE.setMesAno(ano2017);
		categoriaE.setPiso(p01);
		categoriaE.setClasse(classe4);
	
		Funcionario guilherme = new Funcionario();
		guilherme.setNome("Guilherme Rezende");
		guilherme.setCpf("999.999.999-99");
		guilherme.setSexo(Sexo.M);
		
		guilherme.getCategoria().add(categoriaE);
		
	}
}
