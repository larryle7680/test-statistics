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


    }



}
