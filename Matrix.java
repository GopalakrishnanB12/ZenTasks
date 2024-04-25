public class Matrix {
    public static void main(String[] args) {
        int[][] a=new int[5][5];
        Matrix1(5,5);
    }
    public static int Matrix1(int rows,int cols){
        int i,j;
        
    for(i=1; i<=rows; i++)
    {
        for(j=cols; j>cols-i; j--)
        {
            System.out.print(j+" ");
        }

        for(j=1; j<=cols-i; j++)
        {
            System.out.print( (rows - i + 1)+" ");
        }

        System.out.println();
    }

    return 0;
}
    
    
}
