import com.github.javafaker.Faker;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class TestDemo {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Something: Life, The Universe, and Everything");
        String userInput = input.nextLine();
        System.out.println("You Entered: " + "\"" + userInput + "\"");


//        a. Tells whether or not what the user entered is a number
        if (StringUtils.isNumeric(userInput)){
//            true
            System.out.println("\"" + userInput + "\"" + " is a number" );
        }else {
            System.out.println("\"" + userInput + "\"" + " is NOT a number" );
        }

//        b. Flips the case of the string
        System.out.println(StringUtils.swapCase(userInput));

//       c. Reverses the string
        System.out.println(StringUtils.reverse(userInput));


//        ====== Faker Bonus ======
        Faker faker = new Faker();

        String name = faker.name().fullName(); // Miss Samanta Schmidt
        String firstName = faker.name().firstName(); // Emory
        String lastName = faker.name().lastName(); // Barton

        String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449

        System.out.println(name+"\n");
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(streetAddress);
        System.out.println("\n");
//        Game of thrones
        String gameChar = faker.gameOfThrones().character();
        String gameDragon = faker.gameOfThrones().dragon();
        String gameQuote = faker.gameOfThrones().quote();

        System.out.println(gameChar);
        System.out.println(gameDragon);
        System.out.println(gameQuote);




    }
}
