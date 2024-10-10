public class khan {

    public static void main(String[] args) {
        // Array of student answers
        char[][] studentanswers = {
            {'A', 'B', 'C', 'D', 'D', 'D', 'A', 'A', 'A', 'B'},
            {'A', 'A', 'A', 'B', 'C', 'A', 'C', 'A', 'C', 'C'},
            {'B', 'C', 'C', 'A', 'B', 'D', 'E', 'A', 'B', 'A'},
            {'D', 'D', 'A', 'A', 'C', 'A', 'C', 'A', 'C', 'A'},
            {'A', 'B', 'C', 'A', 'A', 'C', 'A', 'B', 'D', 'B'},
            {'A', 'A', 'A', 'B', 'D', 'D', 'A', 'A', 'C', 'A'},
            {'B', 'C', 'A', 'C', 'D', 'D', 'A', 'C', 'A', 'B'},
            {'A', 'C', 'A', 'B', 'C', 'A', 'C', 'A', 'B', 'C'}
        };
        
        // Correct answers for the test
        char[] correctanswers = {'A', 'B', 'C', 'D', 'D', 'A', 'C', 'A'};
        
        // Call the method to grade the tests
        gradetests(studentanswers, correctanswers);
    }

    // Method to grade the students' answers
    public static void gradetests(char[][] studentanswers, char[] correctanswers) {
        // Loop through each student's answers
        for (int i = 0; i < studentanswers.length; i++) {
            int score = 0;
            // Loop through each answer for the current student
            for (int j = 0; j < correctanswers.length; j++) {
                // Check if the student's answer matches the correct answer
                if (studentanswers[i][j] == correctanswers[j]) {
                    score++;
                }
            }
            // Print out the student's score
            System.out.println("Student " + (i + 1) + " score: " + score + "/" + correctanswers.length);
        }
    }
}
