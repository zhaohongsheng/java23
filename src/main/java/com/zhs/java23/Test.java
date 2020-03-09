package com.zhs.java23;

import java.util.HashMap;
import java.util.Map;

public class Test {

	
	public static void main(String[] args) {
		Map<Integer, Integer> saveIndex = new HashMap<Integer, Integer>();
		int[] nums={8,2,3,4,5};
		int target = 7;
		findIndex(nums,target,saveIndex);
		System.out.println(saveIndex.toString());
		int c = 0;
		System.out.println(c);
	}
	
	public static void findIndex(int[] nums,int target,Map<Integer, Integer> saveIndex){
		for(int i=0;i<nums.length;i++){
			if(nums[i] <= target){
				for(int j=i;j<nums.length;j++){
					if(nums[i]+nums[j] == target){
						saveIndex.put(i,j);
					}
				}
			}
		}
	}

}
class NULL {
    public static void haha() {
        System.out.println("haha");
    }
    public static void main(String[] args) {
        ((NULL) null).haha();
    }
}