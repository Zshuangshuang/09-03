/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-03
 * Time:16:49
 **/
public class TestDemo {
    public static int search(int[] array,int length,int x){
        int left = 0;
        int right = length-1;
        int tmp = -1;
        int i = 0;
        int j = 0;
        while(left <= right){
            int middle = (left+right)/2;
            if (array[middle] == x){
                tmp = middle;
            }
            if (array[middle] < x){
              left = middle+1;
            }
            else {
                right = middle-1;
            }
        }
        if (tmp == -1){
            i = right;
            j = left;
        }else {
            i = tmp;
            j = i;
        }
        System.out.println("i的值为："+i +" \n"+"j的值为："+j);
        return 0;
    }
    public static void main(String[] args) {
        int[] array  ={1,3,4,5,6,7,8,9};
        int ret = search(array,array.length,80);
        System.out.println(ret);
    }
}
