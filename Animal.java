class Animal{
    public static String getDefaultGreeting() {
        return "hello!";
    }
    public static String getBirdGreeting() {
        return "tweet!";
    }
    public static String getCatGreeting() {
        return "Meao!";
    }
    public static void main(String[] args) {
        String fullArgumants = args[0];
        String output = "";

        if (fullArgumants.equalsIgnoreCase("bird")) {
            output = getBirdGreeting();
        }
        else if (fullArgumants.equalsIgnoreCase("cat")) {
            output = getCatGreeting();
        }
        else 
            output = getDefaultGreeting();

        System.out.println(output);
    }
}

