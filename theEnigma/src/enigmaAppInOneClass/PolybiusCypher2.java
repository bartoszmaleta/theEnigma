package enigmaAppInOneClass;

public class PolybiusCypher2 {
    public char[][] cypher = {
        {'p', 'h', '0', 'q', 'g', '6'}, 
        {'4', 'm', 'e', 'a', '1', 'y'}, 
        {'l', '2', 'n', 'o', 'f', 'd'},
        {'x', 'k', 'r', '3', 'c', 'v'}, 
        {'s', '5', 'c', 'w', '7', 'b'}, 
        {'j', '9', 'u', 't', 'i', '8'},};

    public void printArrayElement(){
        System.out.println(cypher[1][3]);
    }

    public static void main(String[] args) {
        // Need to create instance of PolybiusCypher to access its fields (cypher)
        new PolybiusCypher2().printArrayElement();
    }
}