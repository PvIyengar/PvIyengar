package DSA;
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    static List<List<Integer>> solve(int N){
        // initialize a matrix
        List<List<Integer>> matrix = new ArrayList<>();
        // create a loop to add zeroes
        for(int i=0; i<N; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<N; j++){
                row.add(0);
            }
            matrix.add(row);
        }
        // Define the boundaries
        int top=0, bottom=N-1;
        int left=0, right=N-1;
        // Initialize the starting value of matrix
        int value=1;
        // start the while loop using the base condition
        while(top<=bottom && left<=right){
            // filling left to right for top=0
            for(int i=left; i<=right; i++){
                matrix.get(top).set(i, value++);
            }
            top++;
            // filling top to bottom for right=n-1
            for(int i=top; i<=bottom; i++){
                matrix.get(i).set(right, value++);
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    matrix.get(bottom).set(i, value++);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    matrix.get(i).set(left, value++);
                }
                left++;
            }
        }
        return matrix;
    }
}

