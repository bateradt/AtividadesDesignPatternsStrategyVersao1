package fib.adp.Classes;

import fib.adp.Interface.ICalc;
import fib.adp.Interface.IFuncionarioCalc;

public class CalcularSalarioComissao implements ICalc {

	@Override
	public double calcularSalario(IFuncionarioCalc funcionario) {
		double vlSalario = 0.0;
		double vlComissao = 0.0;
		
		vlSalario = funcionario.getSalario() - (funcionario.getSalario() * 0.06); // Taxa governo

		vlSalario = vlSalario - (vlSalario * 0.11); // INSS
		
		vlComissao = (funcionario.getTotalVendas() * (funcionario.getComissao()/100)); //CALCULO COMISSAO SOBRE VENDAS
		
		vlSalario = vlSalario + vlComissao;
		
		return vlSalario;
	}

}
