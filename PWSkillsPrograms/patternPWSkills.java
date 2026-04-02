public class patternPWSkills {
    public static void main(String[] args) {
        int n = 10;
        for(int i=0; i<n-1; i++){
            //P
            for (int j = 0; j < n/2; j++) {
                if(i == 0 || j==0 || (i == (n-1)/2 && j == j) || (j == (n-1)/2) && i < j){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            //W
            for (int j = 0; j < n; j++) {
                if(j==0){
                    System.out.print("*");
                }
            }
            for (int j = n-1; j >= (n-1)/2; j--) {
                if(i == j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for (int j = (n-1)/2; j < n; j++) {
                if(i == j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for (int j = n; j >= 0; j--) {
                if(j == n){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("");
                }
            }

            //S
            for (int j = 0; j < n/2; j++) {
                if(i == 0 || i == (n-1)/2 || i == n-2 || (j == 0 && i <= (n-1)/2) || (j == (n-1)/2 && i >= (n-1)/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            //K
            for(int j=0; j<n/2; j++){
                if(j==0 || i==n-1 || i+j == (n-1)/2 || i-j == (n-1)/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            //I
            for(int j=0; j<n/2; j++){
                if(i ==0 || i == n-2 || j == (n-1)/4){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            //L
            for (int j = 0; j < n/2; j++) {
                if(j == 0 || i == n-2 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            //L
            for (int j = 0; j < n/2; j++) {
                if(j == 0 || i == n-2 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            //S
            for (int j = 0; j < n/2; j++) {
                if(i == 0 || i == (n-1)/2 || i == n-2 || (j == 0 && i <= (n-1)/2) || (j == (n-1)/2 && i >= (n-1)/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}


