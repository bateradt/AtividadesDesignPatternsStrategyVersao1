package fib.adp.Classes;

import fib.adp.Interface.IFuncionarioCalc;

public class CalcularSalario implements IFuncionarioCalc {

	private FuncionarioSalario funcionario;
	public CalcularSalario(FuncionarioSalario funcionario) {
	   this.funcionario = funcionario;	
	}
	
	@Override
	public double receberPgto() {
		double vlSalario = 0.0;
		
		vlSalario = funcionario.getSalario() - (funcionario.getSalario()  * 0.06);	//Taxa governo
		
		vlSalario = vlSalario - (vlSalario * 0.11); //INSS
		return 0;
	}

	@Override
	public String dadosFuncionario() {
		return "Nome: " + funcionario.getNome() + " Cargo " + funcionario.getCargo().name() + " ";
	}
	

}
