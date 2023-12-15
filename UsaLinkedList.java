import java.util.LinkedList;

public class UsaLinkedList{
    
    public static void main (String[] args){
        
        //ListaDoble lista = new ListaDoble();
        LinkedList<String> lista = new LinkedList<String>();
        //lista.insertaPrimerNodo("R");     
        lista.addFirst("R");
        //lista.imprimir();
        System.out.println(lista);
        
        //lista.insertaPrimerNodo("F");
        lista.addFirst("F");
        //lista.imprimir();
        System.out.println(lista);
        //lista.insertaAntesPrimerNodo("H");
        lista.add(0,"H");
        System.out.println(lista);
        //lista.insertaAlFinal("Z");
        lista.addLast("Z");
        System.out.println(lista);
        //lista.insertaEntreNodos("T", "R");
        int posicion = lista.indexOf("R");
        System.out.println("Posición de R: " + posicion);
        lista.add(3, "T");
        System.out.println(lista);
        //lista.insertaAntesPrimerNodo("K");
        lista.addFirst("K");
        System.out.println(lista);
        //lista.insertaAlFinal("Ñ");
        lista.offer("Ñ");
        System.out.println(lista);
        //lista.borrarPrimerNodo();
        lista.removeFirst();
        System.out.println(lista);
        //lista.borrarUltimoNodo();
        lista.removeLast();
        System.out.println(lista);
        //lista.borrarCualquierNodo("R");
        lista.remove("R");
        System.out.println(lista);
    }
}