package com.autoit.pactices;

public class AutoltScript2 {

	public static void main(String[] args) {
		executeAutoITScript();
		}
		static void executeAutoITScript()
		{
			try
			{
				Runtime.getRuntime().exec("G:/AutoIt/DemoTestScript3.exe");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	

	}


