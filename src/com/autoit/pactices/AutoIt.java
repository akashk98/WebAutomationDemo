package com.autoit.pactices;

public class AutoIt {
	public static void main(String[] args) {
		executeAutoITScript();
	}
	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("G:/AutoIt/DemoTestScript2.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

