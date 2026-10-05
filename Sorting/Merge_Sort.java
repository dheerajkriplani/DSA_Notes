package Sorting;

import java.util.ArrayList;
import java.util.List;

public class Merge_Sort {//O(nlogn)
    public static void main(String[] args) {
        int arr[]={5,10,2,77,53,20};
        int n=arr.length;
        int ans[]=sort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int [] sort(int arr[],int s,int e){
        if(s==e){//base condition
            int a[]=new int[1];
            a[0]=arr[s];
            return a;
        }
        int mid=s+(e-s)/2;
        int a1[]=sort(arr,s,mid);
        int a2[]=sort(arr,mid+1,e);
        return merge(a1,a2);//merging of two arrays
    }
    public static int [] merge(int a1[],int a2[]){
        List<Integer> l=new ArrayList<>();
        int i=0,j=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]<a2[j]){
                l.add(a1[i]);
                i++;
            }
            else{
                l.add(a2[j]);
                j++;
            }
        }
        while(i<a1.length){
            l.add(a1[i++]);
        }
        while(j<a2.length){
            l.add(a2[j++]);
        }
        int ans[]=new int[l.size()];
        for(int k=0;k<l.size();k++){
            ans[k]=l.get(k);
        }
        return ans;
    }
}
