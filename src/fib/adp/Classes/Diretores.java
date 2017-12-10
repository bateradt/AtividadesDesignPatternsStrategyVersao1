package fib.adp.Classes;

import java.util.ArrayList;
import java.util.List;

import fib.adp.Enum.ECargos;
import fib.adp.Interface.ICalc;
import fib.adp.Interface.IFuncionarioCalc;

public class Diretores implements IFuncionarioCalc {

	private String nome;
	private Double salario;
	private Double comissao;
	private ECargos cargo;
	private Double valorTotalVendas;
	private List<IFuncionarioCalc> funcionarios;
	private ICalc calculoSalario;

	public Diretores(String nome, Double salario, Double comissao, Double valorTotalVendas, ECargos cargo, ICalc calculoSalario) {
		this.nome = nome;
		this.salario = salario;
		this.comissao = comissao;
		this.cargo = cargo;
		this.valorTotalVendas = valorTotalVendas;
		this.calculoSalario = calculoSalario;
		this.funcionarios = new ArrayList<>();
	}

	public void incluirFuncionario(IFuncionarioCalc func) {
		funcionarios.add(func);
	}

	public void removerFuncionario(IFuncionarioCalc func) {
		if (funcionarios.contains(func))
			funcionarios.remove(func);
	}

	public List<IFuncionarioCalc> getFuncionarios() {
		return funcionarios;
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

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public ECargos getCargo() {
		return cargo;
	}

	public void setCargo(ECargos cargo) {
		this.cargo = cargo;
	}

	public Double getValorTotalVendas() {
		return valorTotalVendas;
	}

	public void setValorTotalVendas(Double valorTotalVendas) {
		this.valorTotalVendas = valorTotalVendas;
	}

	public void setFuncionarios(List<IFuncionarioCalc> funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public double receberPgto() {
		return calculoSalario.calcularSalario(this);
	}

	@Override
	public String dadosFuncionario() {
		return "Nome: " + getNome() + " Cargo " + cargo.name() + " ";
	}

	@Override
	public double getSalario() {
		return this.salario;
	}

	@Override
	public double getComissao() {
		// TODO Auto-generated method stub
		return this.comissao;
	}

	@Override
	public double getTotalVendas() {
		return this.valorTotalVendas;
	}

}
