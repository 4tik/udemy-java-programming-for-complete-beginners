public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Switch Statement...........");
        String text = "run";
        switch (text) {
            case "run":
                System.out.println("programming is runnning.......");
                break;
            case "stop":
                System.out.println("programm is stop");
                break;
            default:
                System.out.println("no case found for this value");
                break;
        }
    }
}
