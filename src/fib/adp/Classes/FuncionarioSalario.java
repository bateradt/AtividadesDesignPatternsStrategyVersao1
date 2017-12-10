package fib.adp.Classes;

import fib.adp.Enum.ECargos;
import fib.adp.Interface.ICalc;
import fib.adp.Interface.IFuncionarioCalc;

public class FuncionarioSalario implements IFuncionarioCalc {

	public FuncionarioSalario (String nome, Double salario, ECargos cargo, ICalc calculosalario) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
		this.calculosalario = calculosalario;
	}
	
	private Double salario;
	private ECargos cargo;
	private String nome;
	private ICalc calculosalario;

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

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public double receberPgto() { //efetua o cálculo de acordo com o cargo dele
		return calculosalario.calcularSalario(this);
	}

	@Override
	public String dadosFuncionario() {
		return "Nome: " + getNome() + " Cargo " + cargo.name() + " ";
	}

	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		return this.salario;
	}

	@Override
	public double getComissao() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotalVendas() {
		// TODO Auto-generated method stub
		return 0;
	}

}
