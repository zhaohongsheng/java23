package com.zhs.data.struct;

import java.util.Arrays;

public class 选择 {
	
	
	public static void main(String[] args) {
		//找到最大的放到最后面，继续下一次操作
		Integer[] arr = new Integer[]{11,95,55,62,55,46};
		More(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void More(Integer[] arr){
		for(int i=0;i<arr.length-1;i++){
			int max = arr.length-1-i;
			for(int j=0;j<arr.length-i;j++){
				
				if(arr[max]<arr[j]){
					max = j;
				}
			}
			if(max != arr.length-1){
				Integer temp = arr[arr.length-1-i];
				arr[arr.length-1-i] = arr[max];
				arr[max] = temp;
			}
			
		}
	}
	
	public void swap(){
		
	}

}
