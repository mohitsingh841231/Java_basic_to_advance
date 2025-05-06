public class binarySearch {
    static int bsearch(int arr[],int key){
        int st =0,end = arr.length-1;
        for(int i=0;i<end;i++){
            int mid = st+(end-st)/2;
            if(arr[mid]==key)return mid;
            else if(arr[mid]>key)end=mid-1;
            else st = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int key = 7;
        System.out.println(bsearch(arr, key));
    }
    
}
