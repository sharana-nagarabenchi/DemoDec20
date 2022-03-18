package com.sgtesting.autoit;

public class ExecuteAutoITScriptDemo {

	public static void main(String[] args) {
		executeDemo();

	}
	
	public static void executeDemo()
	{
		try
		{
			String path = "C:\\Users\\Amar Dev Raj\\Desktop\\folder online class\\AutoIt\\demoDisplayMsg.exe";
			Runtime.getRuntime().exec(path);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
