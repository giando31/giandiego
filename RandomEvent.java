//programma che genera un evento casuale
public class RandomEvent {


  public static void main(String[] arg) {
	int random = (int)(Math.random() * 10 + 1); //ovviamente possiamo decidere noi quante casistiche mettere per la generazione di eventi.
	switch(random){
		case 1: System.out.println("es: la folla si rivolta contro la milizia");break;
		case 2: System.out.println("es: un rivoluzionario è diventato tossicodipendente(-1 esercito della liberazione)");break;
		case 3: System.out.println("quest 3");break;
		case 4: System.out.println("quest 4");break;
		case 5: System.out.println("quest 5");break;
		case 6: System.out.println("quest 6");break;  
		case 7: System.out.println("quest 7");break;
		case 8: System.out.println("quest 8");break;
		case 9: System.out.println("quest 9");break;
		case 10: System.out.println("quest 10");break;  
    }
  }
} 
