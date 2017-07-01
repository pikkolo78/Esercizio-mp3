public class ArchivioMain
{
	public static void main(String[] args) 
	{
		ArchivioMp3 archivio = new ArchivioMp3();
        Genere uno=archivio.aggiungiGenereCd("Rock");
        Artista art =archivio.aggiungiArtista("Vasco Rossi");
        Cd cd1=archivio.aggiungiCd("Bollicine",uno,art);
        Cd cd2=archivio.aggiungiCd("Bollicine",uno,art);
        Artista art2 =archivio.aggiungiArtista("Ramazzotti");
        Cd cd3=archivio.aggiungiCd("Ramazzotti the best",uno,art2);
        archivio.aggiungiNuovoBrano(184,"un altra te",cd3);
        archivio.aggiungiNuovoBrano(137,"vivo",cd3);
        archivio.aggiungiNuovoBrano(117,"il sole",cd3);

        archivio.aggiungiNuovoBrano(189,"casa",cd1);

        archivio.aggiungiNuovoBrano(107,"stella",cd2);




        archivio.stampaInfoCd();
	}
}