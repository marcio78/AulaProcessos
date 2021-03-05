package view;

import controller.ProcessosController;

public class Principal {

	public static void main(String[] args) {
		
		
		ProcessosController procController = new ProcessosController();
		
		//String os = procController.os();
		//System.out.println();
		
		String process = "C:\\Windows\\regedit.exe";
		procController.callProcess(process);
		
		
        //String process = "PING -t10 www.google.com.br";
		//procController.readProcess(process);
		}

} 
