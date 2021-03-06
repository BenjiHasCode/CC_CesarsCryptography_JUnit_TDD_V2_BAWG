package Basic;

public class Main {
    public static void main(String[] args) {
        //NOTE: The program is so fast, that it might be difficult to see it encode/decode at runtime.

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
        String encodedMoby = FileHandler.readFile("MobyDickEncoded.txt");
        System.out.println(encodedMoby);
        String decodedMoby = Decoder.decode(encodedMoby);
        System.out.println(decodedMoby);
        FileHandler.writeFile("MobyDickDecoded.txt", decodedMoby);
    */}
}
