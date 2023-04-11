public class selection_sort{
    public static void main(String [] arge){
        int n = 10;
	    int []v = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.printf("origin: ");
	    for(int i = 0; i < n; i++){
		    System.out.printf("%d ", v[i]);
	    }
        System.out.print("\n");
	    for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (v[j] < v[min]) min = j;
            }
            
            for(int j = 0; j < n; j++){
                System.out.printf("%d ", v[j]);
            }
            System.out.print("\n");

            int tmp;
            tmp = v[min];
            v[min] = v[i];
            v[i] = tmp;
            
            
            
        }
        
        
    }
    
}