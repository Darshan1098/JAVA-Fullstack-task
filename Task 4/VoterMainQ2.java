public class VoterMainQ2 {
    public static void main(String[] args) {
        try {
            VoterQ2 voter1 = new VoterQ2(1, "John Doe", 20);
            System.out.println("Voter 1 created successfully: " + voter1);
        } catch (InvalidAgeForVoterException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            VoterQ2 voter2 = new VoterQ2(2, "Jane Doe", 16);
            System.out.println("Voter 2 created successfully: " + voter2);
        } catch (InvalidAgeForVoterException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
