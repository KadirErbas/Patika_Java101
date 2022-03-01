public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ali",11,  200,85,65);
        Fighter f2 = new Fighter("Mike",15,240,100,40);

        Match match = new Match(f1,f2,80,100);
        match.start();



    }
}
