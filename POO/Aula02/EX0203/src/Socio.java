public class Socio{
	public String nome;
	public String endereco;
	public String dtNasc;
	public int matricula;

	public Socio (int x){
		matricula = x;
	}

	public String getMatric(){
		int aux1 = matricula/10;
		int aux2 = matricula%10;

		return Integer.toString(aux1) + '-' + Integer.toString(aux2);
	}
}