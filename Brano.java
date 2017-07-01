public class Brano
{

	private int durataBrano;
	private String nome;
	private Cd cd1;
	public Brano(int durataBrano,String nome,Cd cd1)
	{
    this.durataBrano=durataBrano;
    this.nome=nome;
    this.cd1=cd1;
	}

	public int getDurataBrano()
	{
		return durataBrano;
	}
	public String getNomeBrano()
	{
		return nome;
	}
	public Cd getCdBrano()
	{
		return cd1;
	}
	public void stampaInfoBrano()
	{
		System.out.println("Nome Brano: "+ getNomeBrano()+"," +"Durata brano: "+ getDurataBrano());
	}
     

}
