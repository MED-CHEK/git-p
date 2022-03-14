class Animal{
    public static String getDefaultGreeting() {
        return "hello!";
    }
    public static String getBirdGreeting() {
        return "tweet!";
    }
    public static void main(String[] args) {
        String fullArgumants = args[0];
        String output = "";

        if (fullArgumants.equalsIgnoreCase("bird")) {
            output = getBirdGreeting();
        }
        else 
            output = getDefaultGreeting();
        System.out.println(output);
    }
}

