import java.util.ArrayList
public class ArchivioMp3
{
 ArrayList<Cd> cd = new ArrayList<Cd>();
  ArrayList<Genere> generi = new ArrayList<Genere>();
   ArrayList<Artista> artisti = new ArrayList<Artista>();
    ArrayList<Brano> brani = new ArrayList<Brano>();

    public void aggiungiArtista(String nomeArtista)
    {  
    	Artista art=null;// puntatore creato solo per fare un if sulla creazione del nuovo oggetto
    	for ( Artista artista1:artisti )// si crea un for dv usciamo singolarmente l'oggetto
    	{
    	   if(artista1.getNome().equals(nomeArtista))//tramite il metodo della classe artisti ne prendiamo il nome e lo compariamo a quello passato al metodo "aggiunggi artista"
            {
               art=artista1;// se è uguale puntatore art diventera artista alrimenti restera' "null" e il programma andra' avanti e non creera' nessun oggetto artista in quanto gia presente in archivio
    	    }
        }
        if (art==null)// se art è "null" quindi nel precedente "for",e if nn si è verificata la condizione,
        { 

        Artista nuovoArtista= new Artista(nomeArtista);//creiamo l'oggetto artista, in quanto in archivio non è presente l'artista 
        artisti.add(nuovoArtista);//e aggiungiamo l oggetto artista all array list di competenza
        }
    }
    public void aggiungiGenereCd(String genereCd)
    {
    	Genere genere1=null;
      for ( Genere nuovoGenere:generi ) 
      {
      	if(nuovoGenere.get.nomeGenere.equals(genereCd))
      	{
           genere1=nuovo genere;
      	}
      }
      if(genere1 == null)
      {
      	Genere nuovoGenere= new Genere(String nomeGenere);
      	generi.add(nuovoGenere);
      }

    }



 



 }  