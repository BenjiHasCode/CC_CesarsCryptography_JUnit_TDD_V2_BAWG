package Basic;

import java.util.Scanner;

public class Decoder {
    public static String decode(String text){
        StringBuilder decodedText = new StringBuilder();
        int decodeValue = 0;

        Scanner scanner = new Scanner(text);

        while(scanner.hasNext()){
            String word = scanner.next();
            if(word.length() == 3){
                for (int i = 10; i > 0; i--){
                    StringBuilder temp = new StringBuilder();
                    for(int j = 0; j < word.length(); j++){
                        temp.append((char) (word.charAt(j) - i));
                    }
                    if(temp.toString().equals("the")){
                        decodeValue = i;
                        break;
                    }
                }
            }
        }

        Scanner lineScanner = new Scanner(text);
        while(lineScanner.hasNext()){
            String line = lineScanner.nextLine();

            for(int i = 0; i < line.length(); i++){
                if (line.charAt(i) != ' '){
                    decodedText.append((char) (line.charAt(i) - decodeValue));
                }else if (line.charAt(i) == ' '){
                    decodedText.append(" ");
                }
                else{
                    System.out.println("Something went wrong!");
                }
            }
            decodedText.append("\n");
        }
        return decodedText.toString();
    }
}