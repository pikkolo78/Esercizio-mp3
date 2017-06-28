public class Cd
{
  private String nomeCd;
  private int annoCd;
  private String genereCd;
  private String artistaCd;
  public Cd(String nomeCd,int annoCd,String genereCd,String artistaCd)// costruttore
  {
    this.nomeCd=nomeCd;
    this.annoCd=annoCd;
    this.genereCd=genereCd;
    this.artistaCd=artistaCd;
  }

  public String getNomecd()// metodi get
  {
  	return nomeCd;
  }
  public int getAnnoCd()
  {
  	return annoCd;
  }
  public String getGenereCd()
  {
  	return genereCd;
  }
  public String getArtistaCd()
  {
  	return artistaCd;
  }

  public void StampaInfoCd()
  {
  	System.out.println("Nome cd: " + getNomecd());
  	System.out.println("Anno: " + getAnnoCd());
  	System.out.println("Genere: " + getGenereCd());
  	System.out.println("Artista: " + getArtistaCd());
  }



}