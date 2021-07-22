package com.louis.mango.backup;

public class film {

	public static void main(String[] args) {
		System.out.println("name:"+System.getProperty("user.home"));
		System.out.println("name:"+System.getProperty("os.name"));
		String path=System.getProperty("os.name");
		if(path.toLowerCase().startsWith("win")){
			System.out.println("匹配成功");	
		}else{
			System.out.println("匹配失败");
		}
	}

}
