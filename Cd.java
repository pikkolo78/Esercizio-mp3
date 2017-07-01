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

  public String getNomeCd()// metodi get
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

  public void stampaInfoCd()
  {
  	System.out.println("Nome cd: " + getNomeCd()+","+"Genere: " + getGenereCd().getNomeGenere()+"," + "Artista: " + getArtistaCd().getNomeArtista());
  	
  }



}