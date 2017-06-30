import java.util.ArrayList
public class ArchivioMp3
{
 ArrayList<Cd> cd = new ArrayList<Cd>();
  ArrayList<Genere> generi = new ArrayList<Genere>();
   ArrayList<Artista> artisti = new ArrayList<Artista>();
    ArrayList<Brano> brani = new ArrayList<Brano>();

    public void aggiungiArtista(String nomeArtista)
    {  
    	Artista artistaMomentaneo=null;// puntatore creato solo per fare un if sulla creazione del nuovo oggetto
    	for ( Artista artista1:artisti )// si crea un for dv usciamo singolarmente l'oggetto
    	{
    	   if(artista1.getNome().equals(nomeArtista))//tramite il metodo della classe artisti ne prendiamo il nome e lo compariamo a quello passato al metodo "aggiunggi artista"
            {
               artistaMomentaneo=artista1;// se è uguale puntatore art diventera artista alrimenti restera' "null" e il programma andra' avanti e non creera' nessun oggetto artista in quanto gia presente in archivio
    	    }
        }
        if (artistaMomentaneo==null)// se artistaMomentaneo è "null" quindi nel precedente "for",e if nn si è verificata la condizione,
        { 

        Artista nuovoArtista= new Artista(nomeArtista);//creiamo l'oggetto artista, in quanto in archivio non è presente l'artista 
        artisti.add(nuovoArtista);//e aggiungiamo l oggetto artista all array list di competenza
        }
    }
    public void aggiungiGenereCd(String genereCd)
    {
    	Genere genereMomentaneo=null;
      for ( Genere Genere1:generi ) 
      {
      	if(Genere1.get.nomeGenere.equals(genereCd))
      	{
           genereMomentaneo=genere1;
      	}
      }
      if(genereMomentaneo == null)
      {
      	Genere nuovoGenere= new Genere(genereCd);
      	generi.add(nuovoGenere);
      }
   
    public void aggiungiCd(String nomeCd)
    {
    	Cd cdMomentaneo=null;
    	for ( Cd Cd1: cd) 
    	{
    		if (Cd1.getNome().equals(nomeCd)) 
    		{
    			cdMomentaneo =Cd1;
    		}

    	}
    	if (cdMomentaneo == null) 
    	{
    		Cd nuovocd =new Cd(nomeCd);
    		cd.add(nuovocd);
    	}
    }
    public void aggiungiNuovoBrano(int durataBrano,String nomeBrano,Cd appartenenza)
    {
    	Brano branoMomentaneo=null;
    	for ( Brano brano1:brani ) 
    	{
    		if (brano1.getNome().equals(nomeBrano)) 
    		{
    			branoMomentaneo=brano1;
    		}
    	}
    	if (branoMomentaneo== null) 
    	{
    		Brano nuovoBrano=new Brano(durataBrano,nomeBrano,appartenenza)
    		brani.add(nuovoBrano);
    	}
    	
    }




 



 }  