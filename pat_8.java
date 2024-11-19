public class pat_8 {
    public static void main(String[] args) {
         for(int i = 5;i>=1;i--){
            for(int j = 1;j<i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i == 1 || i == 5){
                for(int j = 1;j<4;j++){
                    System.out.print("*");
                }
                System.out.print("*");
            }else{
                for(int j = 1;j<4;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
         }
    }
}
