package segurovida;

public class Segurado {
	public String nome;
	public String nascimento;
	public boolean fumante;
	public String sexo;
	public int profissao;
	public float salario;
	public int idade;
	public float mensalidade;
	public double cobertura;

	public void CalcularSeguro() {
		// cálculo base do valor mensal
		this.mensalidade = this.salario * 0.05f;

		if (this.fumante)
			this.mensalidade = this.mensalidade + (this.salario * 0.02f);

		// cálculo de acréscimo dependendo do sexo e idade

		if (this.sexo.equals("F")) {

			if (this.idade >= 26 && this.idade <= 45)
				this.mensalidade = this.mensalidade + (0.02f * this.salario);

			if (this.idade >= 46 && this.idade <= 65)
				this.mensalidade = this.mensalidade + (0.03f * this.salario);
		} if (this.sexo.equals("M")) {

			if (this.idade >= 26 && this.idade <= 45)
				this.mensalidade = this.mensalidade + (0.01f * this.salario);
			if (this.idade >= 46 && this.idade <= 65)
				this.mensalidade = this.mensalidade + (0.02f * this.salario);

		}
		if (this.salario >= 1500.0f && this.salario <= 3000.0f)
			this.cobertura = 250000.000f;

		else if (this.salario >= 3000f && this.salario <= 5000.0f)
			this.cobertura = 350000.000f;

		else
			this.cobertura = 500000.000f;
	}
}
