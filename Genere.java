public class Genere
{
	private String genere;
	public Genere(String genere)
	{
		this.genere=genere;
	}
	public String getGenere()
	{
		return genere;
	}
	public void stampaInfoGenere()
	{
		System.out.println("Genere: " + getGenere());
	}
}