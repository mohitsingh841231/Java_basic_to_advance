public class linearSearch {
    static int lsearch(int arr[],int key){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == key)return i;
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]  ={5,4,2,3,1};
        int key = 4;
        int  l = lsearch(arr, key);
        System.out.println(l);
    }
    
}
