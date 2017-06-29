import java.util.ArrayList
public class ArchivioMp3
{
 ArrayList<Cd> cd = new ArrayList<Cd>();
  ArrayList<Genere> generi = new ArrayList<Genere>();
   ArrayList<Artista> artisti = new ArrayList<Artista>();
    ArrayList<Brano> brani = new ArrayList<Brano>();

    public void aggiungiArtista(String nomeArtista)
    {  
    	Artista art=null;
    	for ( Artista artista:artisti ) 
    	{
    	
            if(artista.getNome().equals(nomeArtista))
            {

              art=artista;
    	      
    	    }

        }
        if (art==null)
        { 

        Artista nuovoArtista= new Artista(nomeArtista);
        artisti.add(nuovoArtista);
        }
    }
 }  