package nc_dominio;

public class Operadores {
	private double reais;
	private double imaginarios;
	
	public Operadores(double reais, double imaginarios) {this.reais = reais; this.imaginarios = imaginarios;}
	
	public Operadores add(Operadores other) {
        double novoReal = this.reais + other.reais;
        double novoImaginário = this.imaginarios + other.imaginarios;
        return new Operadores(novoReal, novoImaginário);
     	}
	
	public Operadores subtrair(Operadores other) {
        double novoReal = this.reais - other.reais;
        double novoImaginário = this.imaginarios - other.imaginarios;
        return new Operadores(novoReal, novoImaginário);
    }
	
    public Operadores multiplicar(Operadores other) {
        double novoReal = (this.reais * other.reais) - (this.imaginarios * other.imaginarios);
        double novoImaginário = (this.reais * other.imaginarios) + (this.imaginarios * other.reais);
        return new Operadores(novoReal, novoImaginário);
    }
    
    public Operadores divide(Operadores other) {
        double denominador = other.reais * other.reais + other.imaginarios * other.imaginarios;
        double novoReal = (this.reais * other.reais + this.imaginarios * other.imaginarios) / denominador;
        double novoImaginario = (this.imaginarios * other.reais - this.reais * other.imaginarios) / denominador;
        return new Operadores(novoReal, novoImaginario);
    }
    
    
	@Override
    public String toString() {
        return "(" + reais + " + " + imaginarios + "i)";
    }
}
