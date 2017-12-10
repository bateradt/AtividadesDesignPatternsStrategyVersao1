package fib.adp.Classes;

import fib.adp.Interface.ICalc;
import fib.adp.Interface.IFuncionarioCalc;

public class CalculaProLabore implements ICalc {
	
	@Override
	public double calcularSalario(IFuncionarioCalc funcionario) {
		return funcionario.getSalario() - (funcionario.getSalario() * 0.02); //Taxa governo
	}

	
}
