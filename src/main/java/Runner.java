import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
// SCOTTISH ISLANDS
        System.out.println("SCOTTISH ISLANDS SECTION: ");
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Tiree"); // 2. Add "Tiree" to the start of the list
        scottishIslands.add("Jura");
        scottishIslands.add("Islay"); // 3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");
        scottishIslands.add("Coll"); // 1. Add "Coll" to the end of the list

        int skyeIndex = scottishIslands.indexOf("Skye");
        System.out.println("The index position of Skye is " + skyeIndex + "."); // 4. Print out the index position of "Skye"

        scottishIslands.remove("Tresco"); // 5. Remove "Tresco" from the list by name

        System.out.println("The index position of Arran is " + scottishIslands.indexOf("Arran") +".");
        scottishIslands.remove(5); // 6. Remove "Arran" from the list by index

        System.out.println("The number of islands in my ArrayList is " + scottishIslands.size() + "."); // 7. Print the number of islands in your arraylist

        Collections.sort(scottishIslands); // 8. Sort the list alphabetically

        System.out.println("List of all islands:");
        for (int i = 0; i < scottishIslands.size(); i++) {
            System.out.println(scottishIslands.get(i));
        } // 9. Print out all the islands using a for loop


// NUMBERS
        System.out.println("NUMBERS SECTION:");
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("Numbers: " + numbers);

// 1. Print out a list of the even integers
        System.out.println("List of even integers:");
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i)%2==0){
                System.out.println (numbers.get(i));
            }
        }

// 2. Print the difference between the largest and smallest value
        // 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7
        int largestValue = numbers.get(0); // indicating the starting place for the comparison operation below, index 0 value (1 in this case).
        int smallestValue = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > largestValue) { // numbers.get(i) is cycling though all the numbers in order, slotting the bigger one at any point into largestValue, then repeating for the next number, checking if it's greater than the next numbers.get(i) value in the list.
                largestValue = numbers.get(i);
            } else if (numbers.get(i) < smallestValue) {
                smallestValue = numbers.get(i);
            }
        }
        System.out.println("Difference between largest and smallest value is " + (largestValue-smallestValue) + ".");


// 3. Print True if the list contains a 1 next to a 1 somewhere.
        System.out.println("Does the list contain a 1 and 1 next to each other:");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 1 && (numbers.get(i + 1) == 1)) {
                System.out.println("True");
            }
        }
// 4. Print the sum of the numbers
        int runningTotal = numbers.get(0);
        for (int number : numbers) { // What does the colon do?
            runningTotal += number;
            System.out.println(runningTotal);
        } // How to only show last result?

        int runningTotal3 = numbers.get(0);
        for (int i = 0; i < numbers.get(i); i++) { 
            runningTotal3 += numbers.get(i+1);
            System.out.println(runningTotal3);

// 5. Print the sum of the numbers...
//  ...except the number 13 is unlucky, so it does not count...
    //  ...and numbers that come immediately after a 13 also do not count.
        int runningTotal2 = numbers.get(0);
            for (int number : numbers) {
            runningTotal2 += number;
            if (numbers.get(i) == 13 || (numbers.get(i)+1 == 13)) {
                continue;
            }
        System.out.println(runningTotal2);
    }
//  So [2, 7, 13, 2] would have sum of 9.
}
