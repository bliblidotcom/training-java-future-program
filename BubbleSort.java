import java.util.Arrays;
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] nums = Arrays.asList(args).stream().mapToInt(Integer::parseInt).toArray();

        int len = nums.length;
        for(int i=0; i < len ; ++i){
          for(int j = i+1 ; j < len ; ++j){
            if(nums[i] > nums[j]){
              nums[i] ^= nums[j];
              nums[j] ^= nums[i];
              nums[i] ^= nums[j];
            }
          }
        }
        for(int i=0 ; i < len ; ++i){
          System.out.print(nums[i]+" ");
        }
        System.out.println();

    }

}
