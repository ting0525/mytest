public class homework1{
    public static void Bidirectional_BubbleSort(int []arr, int len){
        int left = 0;
        int right = len-1;
        boolean is_change = false;
        while(true){
            for(int i = left; i < right; i++){
                if(arr[i] > arr[i+1]){    //從左比到右 左大右小就交換
                    arr[i] += arr[i+1];
                    arr[i+1] = arr[i]-arr[i+1];
                    arr[i] = arr[i] -arr[i+1];
                    is_change = true; 
                }
            }
            if(!is_change) break;  //沒交換過表示已經排序完成
            right--;               //最右邊的已經到達正確位置
            is_change = false;   

            for(int i = right; i > left; i--){
                if(arr[i] < arr[i-1]){       //右小左大就交換
                    arr[i] += arr[i-1];
                    arr[i-1] = arr[i]-arr[i-1];
                    arr[i] = arr[i] -arr[i-1];
                    is_change = true;
                }
            }
            if(!is_change) break; //沒交換過表示已經排序完成
            left++;               //最左邊的已經到達正確位置
            is_change = false;
        }
    }
    
    public static void main(String[] args){
        int []arr = {5, 9, 4, 3, 6};
        int len = 5;
        //homework1 func = new homework1();
        //func.Bidirectional_BubbleSort(arr, len);
        Bidirectional_BubbleSort(arr, len);
        for(int i = 0; i < len; i++){
            System.out.printf("%d ", arr[i]);
        }
    }
}
