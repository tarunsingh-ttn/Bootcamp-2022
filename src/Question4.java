//Create a two dimensional array of integers and display:
//
//        sum of all elements of each column
//        sum of all elements of each row


public class Question4 {

    public static  void main (String[] args){
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        // for rows
        System.out.println("   for rows ");
        for(int i=0;i<4;i++){
            int sum=0;
            for(int j=0;j<4;j++){
                sum=sum+matrix[i][j];
            }
            System.out.println("row "+i+":"+sum);
        }
         System.out.println("   for columns ");
        //for columns
        for(int j=0;j<4;j++){
            int sum=0;
            for(int i=0;i<4;i++){
                sum=sum+matrix[i][j];
            }
            System.out.println("col "+j+":"+sum);
        }



    }
}
