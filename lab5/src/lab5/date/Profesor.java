package lab5.date;

public class Profesor extends Angajat{
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public int getGrad() {
		return grad;
	}
	public void setGrad(int grad) {
		this.grad = grad;
	}
	String disciplina;
	int grad;
	public static final double SPOR_PROFESOR = 10; //constanta
	public static final double SPOR_GRAD = 15;

	public double calculSalariu() 
	{
		return salariu_db + SPOR_PROFESOR*vechime + SPOR_GRAD * grad;
	}
}