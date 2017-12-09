package fib.adp.Classes;

import fib.adp.Interface.IFuncionarioCalc;

public class CalculaProLabore implements IFuncionarioCalc {
	
	private Diretores funcionario;
	
	public CalculaProLabore(Diretores funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public double receberPgto() {
		return funcionario.getSalario() - (funcionario.getSalario() * 0.02);	//Taxa governo
	}

	@Override
	public String dadosFuncionario() {
		return "Nome: " + funcionario.getNome() + " Cargo " + funcionario.getCargo().name() + " ";
	}
	
}
