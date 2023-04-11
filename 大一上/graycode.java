public class graycode{
	int count=1;
	public static  String[] GrayCode(int n){
		// 生成 2^n個儲存空間用於儲存生成格雷碼的種類
		String[] grayCode = new String[(int)Math.pow(2, n)];
		
		//如果是生成一位的格雷碼,那麼就是直接 返回 兩種情況
		if(n ==1){
			grayCode[0] = "0";
			grayCode[1] = "1";
			return grayCode;
		}
		//求取n-1 位的格雷碼
        System.out.println("-------------------" );
		String[] last = GrayCode(n-1);
		
		//拼接字串,因為格雷碼除去最高位為0或者為1 外,其餘的都是對稱的。所以 
		//後面的才有 grayCode[grayCode.length-1-i] = "1" + alst[i];
		for(int i = 0; i < last.length; ++i){
			grayCode[i] = "0" + last[i];
			grayCode[grayCode.length -1 -i] = "1" + last[i];
		}
		return grayCode;		
	}
	
	public static void  main(String[] args){
		String[] arr = GrayCode(3);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
