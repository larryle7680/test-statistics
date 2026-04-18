import java.util.Arrays;

public class TestStatisticsApp {

    public static void main(String[] args) {

        //Made an array with 10 test scores in it
        int[] testScores = {100, 89, 90, 85, 60, 97, 72, 69, 96, 75};
        int sum = 0;
        int average = 0;
        //For each loop
        for (int testScore : testScores){
            sum += testScore;
            average = sum / testScores.length;
        }
        System.out.println("The average of test scores are: " + average);

        //Sort the array, so its in chronological order
        Arrays.sort(testScores);
        //variables needed to find max
        int max = testScores[0];
        //Create a for loop
        for (int testScore : testScores){
            if(testScore > max){
                max = testScore;
            }
        }
        System.out.println("The highest grade is: " + max);

        //variable needed to find min
        int min = testScores[0];
        //create a loop to search for min
        for (int testScore : testScores){
            if(testScore < min){
                min = testScore;
            }

        }
        System.out.println("The lowest grade is: " + min);





    }



}
