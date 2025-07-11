package listas_introducao;

public class Funcionario {
	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario() {
	}
	
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public void aumentoSalario(double porcentagem) {
		salario += salario * porcentagem / 100;
	}
	
	public String toString(){
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
	
}
