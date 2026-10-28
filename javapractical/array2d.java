import java.util.Arrays;
public class array2d {
    public static void main(String [] args){
        int [][] m ={{9,3,6},{2,4,8},{5,10,15}};

        for(int i=0; i<m.length;i++){
            Arrays.sort(m[i]);
        }

        for(int i=0;i<m.length;i++ ){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
