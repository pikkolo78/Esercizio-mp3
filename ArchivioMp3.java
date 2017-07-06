import java.util.ArrayList;
public class ArchivioMp3
{
 ArrayList<Cd> cd = new ArrayList<Cd>();
  ArrayList<Genere> generi = new ArrayList<Genere>();
   ArrayList<Artista> artisti = new ArrayList<Artista>();
    ArrayList<Brano> brani = new ArrayList<Brano>();

    public Artista aggiungiArtista(String nomeArtista)
    {  
    	Artista artistaMomentaneo=null;// puntatore creato solo per fare un if sulla creazione del nuovo oggetto
    	for ( Artista artista1:artisti )// si crea un for dv usciamo singolarmente l'oggetto
    	{
    	   if(artista1.getNomeArtista().equalsIgnoreCase(nomeArtista))//tramite il metodo della classe artisti ne prendiamo il nome e lo compariamo a quello passato al metodo "aggiunggi artista"
            {
               artistaMomentaneo=artista1;// se è uguale puntatore art diventera artista alrimenti restera' "null" e il programma andra' avanti e non creera' nessun oggetto artista in quanto gia presente in archivio
    	    }
        }
        if (artistaMomentaneo==null)// se artistaMomentaneo è "null" quindi nel precedente "for",e if nn si è verificata la condizione,
        { 

        Artista nuovoArtista= new Artista(nomeArtista);//creiamo l'oggetto artista, in quanto in archivio non è presente l'artista 
        artisti.add(nuovoArtista);//e aggiungiamo l oggetto artista all array list di competenza
        return nuovoArtista;
        }
        else 
        {
        	return artistaMomentaneo;
        }

    }
    public Genere aggiungiGenereCd(String genereCd)
    {
    	Genere genereMomentaneo=null;
      for ( Genere genere1:generi ) 
      {
      	if(genere1.getNomeGenere().equals(genereCd))
      	{
           genereMomentaneo=genere1;
      	}
      }
      if(genereMomentaneo == null)
      {
      	Genere nuovoGenere= new Genere(genereCd);
      	generi.add(nuovoGenere);
      	return nuovoGenere;
      }
      else
      {
      	return genereMomentaneo;
      }
    }
   
    public Cd aggiungiCd(String nomeCd,Genere genereCd,Artista artistaCd)
    {
    	Cd cdMomentaneo=null;
    	for ( Cd cd1: cd) 
    	{
    		if (cd1.getNomeCd().equals(nomeCd) && cd1.getArtistaCd()==artistaCd) 
    		{
    			cdMomentaneo =cd1;
    		}

    	}
    	if (cdMomentaneo == null) 
    	{
    		Cd nuovoCd =new Cd(nomeCd,genereCd,artistaCd);
    		cd.add(nuovoCd);
    		return nuovoCd;
    	}
    	else
    	{
    		return cdMomentaneo;
    	}
    }
    public void aggiungiNuovoBrano(int durataBrano,String nomeBrano,Cd appartenenza)
    {
    	Brano branoMomentaneo=null;
    	for ( Brano brano1:brani ) 
    	{
    		if (brano1.getNomeBrano().equals(nomeBrano) && brano1.getCdBrano()==appartenenza) 
    		{
    			branoMomentaneo=brano1;
    		}
    	}
    	if (branoMomentaneo== null) 
    	{
    		Brano nuovoBrano=new Brano(durataBrano,nomeBrano,appartenenza);
    		brani.add(nuovoBrano);
    	}
    	
    }
    public void stampaInfoCd()                                              
    {
         for ( Cd infoCd: cd) 
         {
         	infoCd.stampaInfoCd();
         	for (Brano brano : brani) 
         	{
         		if (brano.getCdBrano() == infoCd ) 
         		{
         			System.out.print("   ");
         			brano.stampaInfoBrano();
         		}
         	}
         }

    }
    public void ricercaParolaBrani(String parola)
    {
      System.out.println("I brani trovati sono: ");
      boolean branoTrovato=false;
      for (Brano brano :brani ) 
      {
      
        //if (brano.getNomeBrano().indexOf(parola) != -1 )
         if (brano.getNomeBrano().toLowerCase().contains(parola.toLowerCase()))
        {
          System.out.println(brano.getNomeBrano());  
          branoTrovato=true;
        }
       
      }
      if(!branoTrovato)
      {
        System.out.println("Nessun brano trovato");
      }
    }
      




 



 }  