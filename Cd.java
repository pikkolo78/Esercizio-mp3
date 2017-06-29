public class Cd
{
  private String nomeCd;
  private Genere genereCd;
  private Artista artistaCd;
  public Cd(String nomeCd,Genere genereCd,Artista artistaCd)// costruttore
  {
    this.nomeCd=nomeCd;
    this.genereCd=genereCd;
    this.artistaCd=artistaCd;
  }

  public String getNomecd()// metodi get
  {
  	return nomeCd;
  }
  
  public Genere getGenereCd()
  {
  	return genereCd;
  }
  public Artista getArtistaCd()
  {
  	return artistaCd;
  }

  public void StampaInfoCd()
  {
  	System.out.println("Nome cd: " + getNomecd());
  	System.out.println("Genere: " + getGenereCd());
  	System.out.println("Artista: " + getArtistaCd());
  }



}