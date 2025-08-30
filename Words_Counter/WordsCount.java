import java.util.Scanner;

public class WordsCount {
    String sentence;

    // Take sentence from user as an input
    public WordsCount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        sentence = sc.nextLine();
    }

    public void frequency() {
        String[] words = sentence.toLowerCase().split(" "); //convert to lower case 

        for (int i = 0; i < words.length; i++) {
            int count = 1; 
            boolean alreadyExist = false; 

            for (int k = 0; k < i; k++) {
                if (words[k].equals(words[i])) {
                    alreadyExist = true; 
                    break;
                }
            }

            if (!alreadyExist) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                    }
                }

                System.out.println("Count of \"" + words[i] + "\" = " + count);
            }
        }
    }
}
