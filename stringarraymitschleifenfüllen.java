package stringarraymitschleifefüllen;
import java.util.Scanner;

public class StringArrayMitSchleifeFüllen {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte gib an, wie viele Namen du speichern möchtest:");
        int anzahl = eingabe.nextInt();
        
        String[]namensliste = new String [anzahl];
    
        for (int a=0; a<anzahl; a++){
        System.out.println("Bitte gib einen Namen ein");
            String name = eingabe.next();
            namensliste[a]=name;
        }
        
        }
        
    }
