public class quick_sort{
    
    private static void qsort(int[] v, int left, int right) {
        int pivot, i, j;
        if (left >= right) return;
        pivot = v[left];

        i = left + 1;
        j = right;
        for(int x = 0; x < 10; x++){
            System.out.printf("%d ", v[x]);
        }
        System.out.printf("\n");
        while(true){
            while(i <= right){
                if(v[i] > pivot) break;
                i = i + 1;
            }

            while(j > left){
                if(v[j] < pivot) break;
                j = j - 1;
            }

            if (i > j) break; 
            
            int tmp;
            tmp = v[i];
            v[i] = v[j];
            v[j] = tmp;
        }

        int tmp;
        tmp = v[left];
        v[left] = v[j];
        v[j] = tmp;

        qsort(v, left, j - 1);
        qsort(v, j + 1, right);
    }

       
    
    public static void main(String[] arge){
        int []v = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int left = 0, right = 9;
        qsort(v, left, right);
        for(int i = 0; i < 10; i++){
            System.out.printf("%d ", v[i]);
        }
    }
} 

