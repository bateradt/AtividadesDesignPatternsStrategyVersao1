package fib.adp.Classes;

import fib.adp.Interface.ICalc;
import fib.adp.Interface.IFuncionarioCalc;

public class CalcularSalario implements ICalc {

	@Override
	public double calcularSalario(IFuncionarioCalc funcionario) {
		double vlSalario = 0.0;
		
		vlSalario = funcionario.getSalario() - (funcionario.getSalario()  * 0.06);	//Taxa governo
		
		vlSalario = vlSalario - (vlSalario * 0.11); //INSS
		return vlSalario;
	}

}
