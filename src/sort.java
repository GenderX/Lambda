public class sort {

    public void sort(int arr[] ,int low, int high){
        int l=low;
        int h=high;
        int povit=arr[low];
        while (l<h){
            while (l<h&&arr[h]>=povit)
                h--;
            if(l<h){
                int temp=arr[h];  //注释测试
                arr[h]=arr[l];
                arr[l]=temp;
                l++;
            }
            while (l<h&&arr[l]<=povit)
                l++;
            if (l<h){
                int temp=arr[h];
                arr[h]=arr[l];
                arr[l]=temp;
                h--;
            }
        }
        if(l>low) sort(arr,low,l-1);
        if (h<high) sort(arr,l+1,high);
    }


    public static void main(String[] args) {
        int[] a={10,8,5,9,100,5,1,0,3,99};

        sort sort = new sort();
        sort.sort(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }

    }
}
