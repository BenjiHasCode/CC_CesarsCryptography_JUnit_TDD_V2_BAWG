package Basic;

public class Main {
    public static void main(String[] args) {
        //Alice in Wonderland
        String alice = FileHandler.readFile("AliceInWonderland.txt");
        System.out.println(alice);
        FileHandler.writeFile("AliceEncoded.txt", Encoder.encode(alice));
        String encoded = FileHandler.readFile("AliceEncoded.txt");
        System.out.println(encoded);
        String decoded = Decoder.decode(encoded);
        System.out.println(decoded);
        FileHandler.writeFile("AliceDecoded.txt", decoded);
        //Moby Dick
       /* String moby = FileHandler.readFile("MobyDick.txt");
        System.out.println(moby);
        FileHandler.writeFile("MobyDickEncoded.txt", Encoder.encode(moby));
        String encoded = FileHandler.readFile("MobyDickEncoded.txt");
        System.out.println(encoded);
        String decoded = Decoder.decode(encoded);
        System.out.println(decoded);
        FileHandler.writeFile("MobyDickDecoded.txt", decoded);*/
    }
}
