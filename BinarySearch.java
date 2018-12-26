package counttheoccurance;

/**
 *
 * @author teva
 */
public class BinarySearch 
{
    static int BinarySearch(int[] arr, int k)
    {
        
        int low = 0; 
        
        int high = arr.length - 1;
       
        while(low <= high)
        {
            int mid = low + (high - low)/ 2; // TO AVOID INTEGER OVERFLOW
        
            if(arr[mid]==k)
            {
              return mid;       
            }
            else if(arr[mid] < k)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] array = new int[]{10, 10, 30, 56, 56, 56,  56, 78, 100, 200, 300, 300, 300, 300, 300};
        
        System.out.print(BinarySearch(array, 56));
        
    }   
    
}
