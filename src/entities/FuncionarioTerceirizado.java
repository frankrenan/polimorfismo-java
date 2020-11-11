package entities;

public class FuncionarioTerceirizado extends Funcionario {

	private Double adicional;

	public FuncionarioTerceirizado() {
		super();
	}

	public FuncionarioTerceirizado(String nome, Integer hora, Double valorPorHora, Double adicional) {
		super(nome, hora, valorPorHora);
		this.adicional = adicional;
	}

	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}

	@Override
	public double pagamento() {
		return super.pagamento() + adicional * 1.1;
	}

}
