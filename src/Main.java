import java.io.IOException;
import java.math.BigDecimal;
import java.io.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args)throws IOException {

        /*
        BigDecimal one = new BigDecimal("9999940061511120721.3167147");
        BigDecimal two = new BigDecimal("9999979042610222349.9571994");
        BigDecimal three = new BigDecimal("9999952112804225816.4383926");
        BigDecimal four = new BigDecimal("9999934043111100207.5748700");
        BigDecimal five = new BigDecimal("9999954051211020843.6487154");
        BigDecimal six = new BigDecimal("9999914031705020140.1976463");
        BigDecimal seven = new BigDecimal("9999957070606233252.7449048");
        BigDecimal eight = new BigDecimal("9999911022206142321.6713183");
        BigDecimal nine = new BigDecimal("9999943091510194202.3189813");
        BigDecimal ten = new BigDecimal("9999925090502110228.4410136");
        BigDecimal eleven = new BigDecimal("9999981030809010214.7368465");
        BigDecimal twelve = new BigDecimal("9999975020608142818.9374912");
        BigDecimal thirteen = new BigDecimal("9999969040908025852.8302417");
        BigDecimal fourteen = new BigDecimal("9999937101712232821.3372653");
        BigDecimal fifteen = new BigDecimal("9999937052508174017.9875347");
        BigDecimal sixteen = new BigDecimal("9999967031610185050.4465547");
        BigDecimal seventeen = new BigDecimal("9999959100605144148.7933347");
        BigDecimal eighteen = new BigDecimal("9999974041402140410.1590631");
        BigDecimal ninteen = new BigDecimal("9999933061604120205.5669348");
        BigDecimal twenty = new BigDecimal("9999964042210211228.2375853");
        BigDecimal twentyOne = new BigDecimal("9999965112801233743.9495840");
        BigDecimal twentyTwo = new BigDecimal("9999925090409163108.9694424");
        BigDecimal twentyThree = new BigDecimal("9999918021306124208.9905857");
        BigDecimal twentyFour = new BigDecimal("9999905112307132630.3457459");
        BigDecimal twentyFive = new BigDecimal("9999972011704035652.5822255");
        BigDecimal twentySix = new BigDecimal("9999917060605211131.4144880");
        BigDecimal twentySeven = new BigDecimal("9999944112203131803.4935262");
        BigDecimal twentyEight = new BigDecimal("9999937060711084830.6574620");
        */

        BigDecimal small1 = new BigDecimal("15");
        BigDecimal small2 = new BigDecimal("1");
        BigDecimal small3 = new BigDecimal("3");
        BigDecimal small4 = new BigDecimal("56");
        BigDecimal small5 = new BigDecimal("74");

        BigDecimal small6 = new BigDecimal("23");
        BigDecimal small7 = new BigDecimal("76");
        BigDecimal small8 = new BigDecimal("36");
        BigDecimal small9 = new BigDecimal("90");
        BigDecimal small10 = new BigDecimal("34");

        BigDecimal small11 = new BigDecimal("55");
        BigDecimal small12 = new BigDecimal("17");
        BigDecimal small13 = new BigDecimal("57");
        BigDecimal small14 = new BigDecimal("98");
        BigDecimal small15 = new BigDecimal("49");

        BigDecimal small16 = new BigDecimal("30");
        BigDecimal small17 = new BigDecimal("35");
        BigDecimal small18 = new BigDecimal("97");
        BigDecimal small19 = new BigDecimal("81");
        BigDecimal small20 = new BigDecimal("79");



        //Part of unused and unfinished data generator.

        //int numberOfStudies = 50;
        //String ExampleFileName = "testData.txt";
        //FileMaker dataMaker = new FileMaker(numberOfStudies, ExampleFileName);

        Tree ohBoy = new Tree();


        ohBoy.insert(ohBoy.root, small1);
        ohBoy.insert(ohBoy.root, small2);
        ohBoy.insert(ohBoy.root, small3);
        ohBoy.insert(ohBoy.root, small4);
        ohBoy.insert(ohBoy.root, small5);

        ohBoy.insert(ohBoy.root, small6);
        ohBoy.insert(ohBoy.root, small7);
        ohBoy.insert(ohBoy.root, small8);
        ohBoy.insert(ohBoy.root, small9);
        ohBoy.insert(ohBoy.root, small10);

        ohBoy.insert(ohBoy.root, small11);
        ohBoy.insert(ohBoy.root, small12);
        ohBoy.insert(ohBoy.root, small13);
        ohBoy.insert(ohBoy.root, small14);
        ohBoy.insert(ohBoy.root, small15);

        ohBoy.insert(ohBoy.root, small16);
        ohBoy.insert(ohBoy.root, small17);
        ohBoy.insert(ohBoy.root, small18);
        ohBoy.insert(ohBoy.root, small19);
        ohBoy.insert(ohBoy.root, small20);


        //For example purposes
        //COMMENT OUT NEXT LINE TO STOP EXAMPLE FROM APPEARING AT START OF PROGRAM
        ohBoy.displayTree(ohBoy.root, 0);


        /*
        ohBoy.insert(ohBoy.root, one);
        ohBoy.insert(ohBoy.root, two);
        ohBoy.insert(ohBoy.root, three);
        ohBoy.insert(ohBoy.root, four);
        ohBoy.insert(ohBoy.root, five);

        ohBoy.insert(ohBoy.root, six);
        ohBoy.insert(ohBoy.root, seven);
        ohBoy.insert(ohBoy.root, eight);
        ohBoy.insert(ohBoy.root, nine);
        ohBoy.insert(ohBoy.root, ten);

        ohBoy.insert(ohBoy.root, eleven);
        ohBoy.insert(ohBoy.root, twelve);
        ohBoy.insert(ohBoy.root, thirteen);
        ohBoy.insert(ohBoy.root, fourteen);
        ohBoy.insert(ohBoy.root, fifteen);

        ohBoy.insert(ohBoy.root, sixteen);
        ohBoy.insert(ohBoy.root, seventeen);
        ohBoy.insert(ohBoy.root, eighteen);
        ohBoy.insert(ohBoy.root, ninteen);
        ohBoy.insert(ohBoy.root, twenty);

        ohBoy.insert(ohBoy.root, twentyOne);
        ohBoy.insert(ohBoy.root, twentyTwo);
        ohBoy.insert(ohBoy.root, twentyThree);
        ohBoy.insert(ohBoy.root, twentyFour);
        ohBoy.insert(ohBoy.root, twentyFive);

        ohBoy.insert(ohBoy.root, twentySix);
        ohBoy.insert(ohBoy.root, twentySeven);
        ohBoy.insert(ohBoy.root, twentyEight);
        */



        Tree actualTree = new Tree();
        Scanner kb = new Scanner(System.in);
        String userInput;

        System.out.println("Hello and Welcome to the program");
        System.out.println("Please input the name of the file you would like to load into the tree: ");
        userInput = kb.nextLine();


        BigDecimal temp;

        try{
            FileInputStream fstream = new FileInputStream(userInput);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null)   {
                temp = new BigDecimal(strLine);
                actualTree.insert(actualTree.root, temp);
                //System.out.println (strLine);
            }
            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        //This is for testing each value from file against the tree that was created

        /*

        try{
            FileInputStream fstream = new FileInputStream(userInput);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null)   {
                temp = new BigDecimal(strLine);
                System.out.println(actualTree.checkSearch(actualTree.root, temp));
                //System.out.println (strLine);
            }
            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        */

        String otherinput;
        BigDecimal inputDecimal;
        Helper datagetter;


        while(!userInput.equals("")){
            System.out.println("Please enter 's' for search, 'd' to display tree or 'i' to insert another value or hit enter to quit: ");
            userInput = kb.nextLine();
            if (userInput.equals("i")){
                System.out.println("please enter a key to insert: ");
                otherinput = kb.nextLine();
                inputDecimal = new BigDecimal(otherinput);
                if(actualTree.checkSearch(actualTree.root, inputDecimal)){
                    System.out.println("That key is already in the tree");
                } else {
                    actualTree.insert(actualTree.root, inputDecimal);

                }
            } else if (userInput.equals("s")){
                System.out.println("please enter a key to search for");
                otherinput = kb.nextLine();
                inputDecimal = new BigDecimal(otherinput);
                datagetter = actualTree.BTreeSearch(actualTree.root, inputDecimal);
                if (datagetter == null){
                    System.out.println(otherinput + " is not a key in this tree.");
                } else {
                    System.out.println("value of " + datagetter.theNode.keys[datagetter.theIndex] + " is present in the tree.");
                }
            } else if (userInput.equals("d")){
                actualTree.displayTree(actualTree.root, 0);
            } else if (!userInput.equals("")){
                System.out.println("That is not a valid entry.");
            }
        }



        kb.close();

    }


}
