public class Artista
{
  private String nomeArtista;

  public Artista(String nomeArtista )
  {
  	this.nomeArtista=nomeArtista;
  }
   public String getNomeArtista()
   {
   	 return nomeArtista;
   } 
   public void stampaInfoArtista()
   {
   	System.out.println("Nome artista: " + getNomeArtista());
   }

}