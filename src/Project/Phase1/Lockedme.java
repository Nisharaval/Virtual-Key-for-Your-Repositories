
package Project.Phase1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lockedme {
	
	Lockedme(){
		System.out.println("Welcome To LockedMe.com");
		System.out.println("========================================");
		System.out.println("Application name   :    \t LockersApp");
		System.out.println("Developed by       :     \t Nisha G ");
		System.out.println("App description    :     \t The prototype of the application");
		System.out.println("========================================");
	
	}

	public static void main(String[] args) throws IOException {
		Lockedme lk =new Lockedme();
		

		String path = "E:\\Project-Phase-1\\";
	    boolean running =false;
	    
	
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.println("Please select the options to perform  \n 0.display \n 1.file operations \n 2.exit  ");
			int choice = sc.nextInt();

			switch(choice) {
			case 0:
				System.out.println("Displaying the files in this path" +path);
				File fd=new File(path);//assigning the path to fd1
				File f2 []=fd.listFiles();// Fetching the list of files from the path
				// Retrieving the file names in an ascending order(using for-each loop)
				for(File ff:f2) {
					System.out.println( ff.getName());
				}
				break;
			case 1:
				
				System.out.println(" Select the task to perform 4.add 5.delete 6.search 7.exit");
				int choice1=sc.nextInt();
				switch(choice1) {
				case 4:
					System.out.println(" Creating / Adding a file in this floder" +path);
					System.out.println("enter the file name");
					String filecreate=sc.next();
					File create=new File(path+filecreate);
					//create/add new file
					boolean b=create.createNewFile();
					if(b!=true)
					{
						System.out.println(" Sorry file has not created");
					}
					else
					{
						System.out.println("The File created in the " +path);
					}
					break;   

					// case a
				case 5:
					System.out.println(" Deleting a file in this floder" +path);
					System.out.println("enter the file name");
					String filedelete=sc.next();
					File delete=new File(path+filedelete);
					//create/add new file
					boolean c=delete.delete();
					if(c!=true)
					{
						System.out.println(" Sorry file has been not deleted");
					}
					else
					{
						System.out.println("The File has been deleted from the  " +path);
					}
					break; 

					//case b
				case 6:
					System.out.println("enter the file naem to search a particular file");
					String filesearch=sc.next();
					File search=new File(path);
					File F2[]=search.listFiles();
					boolean flag = false;
					// using for each for Iteration
					for(File fr:F2) {
						if(fr.getName().equals(filesearch)) {
							flag =true;
							break;
						}
						else {
							flag=false;
							}
					}
					if(flag==true)
					{
						System.out.println("file found");
					}
					else
					{
						System.out.println("file not found");
					}
					break;//case c

				case 7:
					if(running =true ) {
					System.out.println("File Operations task exited successfully.");}
					
					break;
				
				}// sub switch
		
				
			case 2:
				if(running !=true) {
				System.out.println("Logged of from Application");
				System.exit(choice);
				}
				break;
				
			}
	}
		}
	}
