public class Main {
    
    public static void main(String[] args) {
        String letras[] = new String[3];
        String frase = "Oi/angelica/linda";
        // frase = frase.replaceAll("/", " ");
        letras = frase.split("/"); 
        

        for (int i = 0; i < letras.length; i++) {
         
            System.out.print(" " + letras[i] + "");
            
        }

        // System.out.println(letras[0]);
    }
}
