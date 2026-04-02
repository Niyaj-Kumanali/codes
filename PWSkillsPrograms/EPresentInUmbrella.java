public class EPresentInUmbrella {
    public static void main(String[] args) {
        String str = "Umbrella";
        char ch = 'e';
        boolean flag = false;
        for(int i=0; i<str.length(); i++){
            if(ch == str.charAt(i))
                flag = true;
        }
        if(flag)
            System.out.println("Letter 'e' is present");
        else
            System.out.println("Letter 'e' is not present");
    }
}
