package com.zhs.data.struct;

import java.util.Arrays;

public class 冒泡 {
	
	
	public static void main(String[] args) {
		//比较相邻两个数据，大的往后放
		//最优时间复杂度：O(n) （表示遍历一次发现没有任何可以交换的元素，排序结束。）
		//最坏时间复杂度：O(n2)
		//稳定性：稳定
		Integer[] arr = new Integer[]{11,95,55,62,55,46};
		More(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void More(Integer[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	
	public void swap(){
		
	}

}
