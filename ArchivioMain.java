
import java.util.Scanner;
public class ArchivioMain
{
	public static void main(String[] args) 
	{
		Scanner input =new Scanner(System.in);
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
        archivio.aggiungiNuovoBrano(115,"oltre il cielo",cd2);
        archivio.aggiungiNuovoBrano(118,"il romanzo",cd3);
        archivio.aggiungiNuovoBrano(113,"il bello",cd3);
        archivio.aggiungiNuovoBrano(116,"forse",cd1);
        archivio.aggiungiNuovoBrano(117,"AMORE MIO",cd2);
        archivio.aggiungiNuovoBrano(116,"forse amore",cd2);
        archivio.aggiungiNuovoBrano(119,"ciao",cd3);
        archivio.aggiungiNuovoBrano(116,"il treno dell amore",cd3);
        archivio.aggiungiNuovoBrano(114,"vai",cd3);
        archivio.aggiungiNuovoBrano(116,"amore per forza",cd1);
        archivio.aggiungiNuovoBrano(116,"il cielo",cd3);
        archivio.aggiungiNuovoBrano(115,"cielo e amore",cd1);
        archivio.aggiungiNuovoBrano(117,"le stelle",cd3);
        archivio.aggiungiNuovoBrano(118,"il mare",cd3);
        archivio.aggiungiNuovoBrano(119,"amore di tutti",cd1);
        archivio.aggiungiNuovoBrano(116,"il sole dell amore",cd3);
        archivio.aggiungiNuovoBrano(116,"la mattina",cd1);
        archivio.aggiungiNuovoBrano(113,"amore per sempre",cd2);
        archivio.aggiungiNuovoBrano(115,"un altra casa",cd3);

        archivio.aggiungiNuovoBrano(189,"casa",cd1);

        archivio.aggiungiNuovoBrano(107,"stella",cd2);

        //archivio.stampaInfoCd();
        System.out.println("Digita la parola chiave:");
        archivio.ricercaParolaBrani( input.nextLine());
	}             
}