package fib.adp.Classes;

import fib.adp.Enum.ECargos;
import fib.adp.Interface.IFuncionarioCalc;

public class FuncionarioComissionado implements IFuncionarioCalc {

	public FuncionarioComissionado(String nome, Double salario, Double comissao, Double valorTotalVendas,
			ECargos cargo) {
		this.nome = nome;
		this.salario = salario;
		this.comissao = comissao;
		this.valorTotalVendas = valorTotalVendas;
		this.cargo = cargo;
	}

	private Double salario;
	private Double comissao;
	private Double valorTotalVendas;
	private ECargos cargo;
	private String nome;

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

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
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
		Double vlComissao = 0.0;

		if ((cargo.equals(ECargos.VENDEDOR)) || (cargo.equals(ECargos.DIRETORCOMERCIAL))) {
			vlSalario = salario - (salario * 0.06); // Taxa governo

			vlSalario = vlSalario - (vlSalario * 0.11); // INSS
			
			vlComissao = (valorTotalVendas * (comissao/100)); //CALCULO COMISSAO SOBRE VENDAS
			
			vlSalario = vlSalario + vlComissao;
		}

		return vlSalario;
	}
	
	@Override
	public String dadosFuncionario() {
		return "Nome: " + getNome() + " Cargo " + cargo.name() + " ";
	}

}
