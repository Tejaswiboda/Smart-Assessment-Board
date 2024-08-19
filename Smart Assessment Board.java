import java.util.*;

public class SmartAssessmentBoard {
    private static Map<String, String> statesAndCapitals = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int score = 0;

    public static void main(String[] args) {
        initializeData();
        System.out.println("Welcome to the States and Capitals Quiz Competition!");
        conductQuiz();
        System.out.println("Quiz completed! Your final score is: " + score + "/" + statesAndCapitals.size());
    }

    private static void initializeData() {
        statesAndCapitals.put("Andhra Pradesh", "Amaravati");
        statesAndCapitals.put("Assam", "Dispur");
        statesAndCapitals.put("Bihar", "Patna");
        statesAndCapitals.put("Goa", "Panaji");
        statesAndCapitals.put("Gujarat", "Gandhinagar");
        statesAndCapitals.put("Haryana", "Chandigarh");
        statesAndCapitals.put("Karnataka", "Bengaluru");
        statesAndCapitals.put("Kerala", "Thiruvananthapuram");
        statesAndCapitals.put("Madhya Pradesh", "Bhopal");
        statesAndCapitals.put("Maharashtra", "Mumbai");
        statesAndCapitals.put("Odisha", "Bhubaneswar");
        statesAndCapitals.put("Punjab", "Chandigarh");
        statesAndCapitals.put("Rajasthan", "Jaipur");
        statesAndCapitals.put("Tamil Nadu", "Chennai");
        statesAndCapitals.put("Telangana", "Hyderabad");
        statesAndCapitals.put("Uttar Pradesh", "Lucknow");
        statesAndCapitals.put("West Bengal", "Kolkata");
    }
    private static void conductQuiz() {
        List<String> states = new ArrayList<>(statesAndCapitals.keySet());
        Collections.shuffle(states);
        for (String state : states) {
            System.out.print("What is the capital of " + state + "? ");
            String userAnswer = scanner.nextLine().trim();

            if (userAnswer.equalsIgnoreCase(statesAndCapitals.get(state))) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is " + statesAndCapitals.get(state) + ".");
            }
        }
    }
}
