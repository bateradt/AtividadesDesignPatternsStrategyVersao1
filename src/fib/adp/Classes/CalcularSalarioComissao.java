package fib.adp.Classes;

import fib.adp.Interface.IFuncionarioCalc;

public class CalcularSalarioComissao implements IFuncionarioCalc {
	
	private FuncionarioComissionado funcionario;
	public CalcularSalarioComissao(FuncionarioComissionado funcionario) {
	   this.funcionario = funcionario;	
	}

	@Override
	public double receberPgto() {
		double vlSalario = 0.0;
		double vlComissao = 0.0;
		
		vlSalario = funcionario.getSalario() - (funcionario.getSalario() * 0.06); // Taxa governo

		vlSalario = vlSalario - (vlSalario * 0.11); // INSS
		
		vlComissao = (funcionario.getValorTotalVendas() * (funcionario.getComissao()/100)); //CALCULO COMISSAO SOBRE VENDAS
		
		vlSalario = vlSalario + vlComissao;
		
		return vlSalario;
	}

	@Override
	public String dadosFuncionario() {
		return "Nome: " + funcionario.getNome() + " Cargo " + funcionario.getCargo().name() + " ";
	}

}
