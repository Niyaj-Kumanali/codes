package CodingBat;

public class CatDog {
    public boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for(int i=0; i<str.length()-2; i++){
            String s = ""+str.charAt(i)+str.charAt(i+1)+str.charAt(i+2);
            if(s.equals("cat")){
                cat++;
            }
            else if(s.equals("dog")){
                dog++;
            }
        }
        return cat == dog;
    }

}
