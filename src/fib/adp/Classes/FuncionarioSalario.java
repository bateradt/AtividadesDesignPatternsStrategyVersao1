package fib.adp.Classes;

import fib.adp.Enum.ECargos;
import fib.adp.Interface.IFuncionarioCalc;

public class FuncionarioSalario implements IFuncionarioCalc {

	public FuncionarioSalario (String nome, Double salario, ECargos cargo) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	private Double salario;
	private ECargos cargo;
	private String nome;

	public ECargos getCargo() {
		return cargo;
	}

	public void setCargo(ECargos cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public double receberPgto() { //efetua o cálculo de acordo com o cargo dele
		Double vlSalario = 0.0;
		
		switch (cargo) {
		case PRESIDENTE:
			vlSalario = salario - (salario * 0.02);	//Taxa governo
			break;
		case DESENVOLVEDOR:
            vlSalario = salario - (salario * 0.06);	//Taxa governo
			
			vlSalario = vlSalario - (vlSalario * 0.11); //INSS
			break;
		case DIRETORPRODUCAO:
            vlSalario = salario - (salario * 0.06);	//Taxa governo
			
			vlSalario = vlSalario - (vlSalario * 0.11); //INSS
			break;	
		default:
			vlSalario = 0.0;
			break;
		}

		return vlSalario;
	}

	@Override
	public String dadosFuncionario() {
		return "Nome: " + getNome() + " Cargo " + cargo.name() + " ";
	}

}
