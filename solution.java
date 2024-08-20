import java.util.*;
public class Solution{
  public static void print(int[] arr){
    for(int ele:arr)
       System.out.print(ele+" ");
     System.out.println();
  }
  public static void main(String[] args){
    Scanner Sc=new Scanner(System.in);
    System.out.print("Enter size of Array: ");
    int n=Sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter elements of Array:");
    for(int i=0;i<n;i++)
      arr[i]=Sc.nextInt();
    System.out.println("Entered Array is:");
    print(arr);
    MergeSort(int[] arr);
    System.out.println("Sorted Array is:");
    print(arr);
  }
  static void MergerSort(int[] arr){
    int n=arr.length;

    //base case for recursion
    if(n==1)
      return;

    //copying and pasting
    int[] a=new int[n/2];
    int[] b=new int[n-n/2];
    for(int i=0;i<n/2;i++)
      a[i]=arr[i];
    for(int i=0;i<n-n/2;i++)
      b[i]=arr[n/2+i];

    //recursive calls
    MergeSort(a);
    MergeSort(b);

    //Merging a & b to form
    Merging(arr,a,b);
  }
  static void Merging(int[] arr,int[] a,int[] b){
    int i=0,j=0,k=0;
    while(i<a.length && j<b.length){
      if(a[i]<=b[j])
        arr[k++]=a[i++];
      else
        arr[k++]=b[j++];
    }
     while(i<a.length)
       arr[k++]=a[i++];
  
    while(j<b.length)
       arr[k++]=b[j++];
  }
}
