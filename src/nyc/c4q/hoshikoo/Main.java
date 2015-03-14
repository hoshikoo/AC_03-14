package nyc.c4q.hoshikoo;

public class Main {

    public static void main(String[] args) {
        int k =5;
/*
	 while(k <5){
         k++;
         System.out.println(k);
     }
*/
        while(terminate(k)){
            System.out.println(terminate(k));
            k++;
            System.out.println(k);
        }
        System.out.println(k);
        System.out.println(terminate(k));
    }

    public static boolean terminate(int j){

        if(j<13){
            return true;
        }else{
            return false;
        }
    }
}
