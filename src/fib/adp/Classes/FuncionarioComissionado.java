package fib.adp.Classes;

import fib.adp.Enum.ECargos;
import fib.adp.Interface.ICalc;
import fib.adp.Interface.IFuncionarioCalc;

public class FuncionarioComissionado implements IFuncionarioCalc {

	public FuncionarioComissionado(String nome, Double salario, Double comissao, Double valorTotalVendas,
			ECargos cargo, ICalc calculosalario) {
		this.nome = nome;
		this.salario = salario;
		this.comissao = comissao;
		this.valorTotalVendas = valorTotalVendas;
		this.cargo = cargo;
		this.calculosalario = calculosalario;
	}

	private Double salario;
	private Double comissao;
	private Double valorTotalVendas;
	private ECargos cargo;
	private String nome;
	private ICalc calculosalario;

	public Double getValorTotalVendas() {
		return valorTotalVendas;
	}

	public void setValorTotalVendas(Double valorTotalVendas) {
		this.valorTotalVendas = valorTotalVendas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ECargos getCargo() {
		return cargo;
	}

	public void setCargo(ECargos cargo) {
		this.cargo = cargo;
	}


	public void setComissao(Double comissao) {
		this.comissao = comissao;
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
		return this.comissao;
	}

	@Override
	public double getTotalVendas() {
		// TODO Auto-generated method stub
		return this.valorTotalVendas;
	}

}
