public class Dome {
    public static boolean findNum(int[][] a,int n){
        if(a==null)
            return false;
        else {
            //row 表示多少行 cow 表示多少列
            int row=a.length;
            int j=a[0].length-1;
            int i=0;
            while(i<row&&j>=0){
                if(n==a[i][j])
                    return true;
                else if(n<a[i][j]){
                    j--;
                }else i++;
            }
            return false;
        }
    }
   public static int NumberOf1(int n){
        int count=0;
        while(n!=0){
            ++count;
            n=(n-1)&n;
        }
        return count;
    }
}
