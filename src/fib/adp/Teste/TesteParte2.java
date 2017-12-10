package fib.adp.Teste;

import java.text.NumberFormat;

import fib.adp.Classes.CalculaProLabore;
import fib.adp.Classes.CalcularSalario;
import fib.adp.Classes.CalcularSalarioComissao;
import fib.adp.Classes.Diretores;
import fib.adp.Classes.FuncionarioComissionado;
import fib.adp.Classes.FuncionarioSalario;
import fib.adp.Enum.ECargos;
import fib.adp.Interface.IFuncionarioCalc;

public class TesteParte2 {
	
	public static void main(String[] args) {		
		CalculaProLabore prolabore = new CalculaProLabore();
		CalcularSalarioComissao calculoSalarioComi = new CalcularSalarioComissao();
		CalcularSalario calculoSalario = new CalcularSalario();
		
		Diretores presidente = new Diretores("Bill", 15000.00, 0.0, 0.0, ECargos.PRESIDENTE, prolabore);
		//strategy para receber o salario do presidente	é passada como parametro		
				
		Diretores diretorComercial = new Diretores("Ted", 5500.00, 20.00, 12.300, ECargos.DIRETORCOMERCIAL, calculoSalarioComi);
		//strategy do calculo do salario é passada como parametro 		
				
		Diretores diretorProducao = new Diretores("Bob", 4000.00, 0.0, 0.0, ECargos.DIRETORPRODUCAO, calculoSalario);
		//strategy do calculo do salario é passada como parametro 	
		
		IFuncionarioCalc vendedor = new FuncionarioComissionado("Mike", 3000.00, 8.00, 16400.00, ECargos.VENDEDOR, calculoSalarioComi);
		//strategy do calculo do salario é passada como parametro 	
		IFuncionarioCalc vendedor2 = new FuncionarioComissionado("Will", 2500.00, 10.00, 8900.00, ECargos.VENDEDOR, calculoSalarioComi);
		;
		IFuncionarioCalc desenvolvedor1 = new FuncionarioSalario("On", 1500.00, ECargos.DESENVOLVEDOR, calculoSalario);		
		IFuncionarioCalc desenvolvedor2 = new FuncionarioSalario("Max", 2500.00, ECargos.DESENVOLVEDOR, calculoSalario);
		IFuncionarioCalc desenvolvedor3 = new FuncionarioSalario("Snow", 2000.00, ECargos.DESENVOLVEDOR, calculoSalario);
		
		diretorComercial.incluirFuncionario(vendedor);
		diretorComercial.incluirFuncionario(vendedor2);
		
		diretorProducao.incluirFuncionario(desenvolvedor1);
		diretorProducao.incluirFuncionario(desenvolvedor2);
		diretorProducao.incluirFuncionario(desenvolvedor3);
		
		presidente.incluirFuncionario(diretorComercial);
		presidente.incluirFuncionario(diretorProducao);

		System.out.println(presidente.dadosFuncionario() + "Salario: " + presidente.receberPgto());
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
        for (IFuncionarioCalc diretores : presidente.getFuncionarios()) {    	
            System.out.println("\t" + diretores.dadosFuncionario() + " Salário: " + diretores.receberPgto()); //mostro o nome, cargo do funcionario do nó primário da árvore
                        
            if (diretores instanceof Diretores) { //irá listar a hierarquias dos funcionarios na árvore
                for (IFuncionarioCalc func : ((Diretores)diretores).getFuncionarios())
                    System.out.println("\t\t" + func.dadosFuncionario() + " Salário: " + func.receberPgto());
            }
        }
       		
	}
}
