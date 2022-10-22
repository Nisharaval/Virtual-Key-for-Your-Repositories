package Project.Phase1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lockedme {

        static void operations(int choose) throws IOException
{
    switch(choose)
  {
  case 0:
     {  
     String path= "E:\\Project-Phase-1\\"; // path where project files are available
		Scanner sc = new Scanner(System.in);// taking input from the user
		System.out.println("Path of the file" +path);
		System.out.println("Displaying the files in this path");
		File fd=new File(path);//assigning the path to fd1
		File f2 []=fd.listFiles();// Fetching the list of files from the path
		// Retrieving the file names in an ascending order(using for-each loop)
		for(File ff:f2) {
		     System.out.println( ff.getName());
		}
		break;
		}
  
        case 1:// adding new file to path
      {
        String path = "D:\\FSD\\Files\\";
		Scanner sc = new Scanner(System.in);
		System.out.println("path of file" +path);
		System.out.println("enter the file name");
		String filename=sc.next();
		File f=new File(path+filename);
		//create/add new file
		boolean b=f.createNewFile();
		if(b!=true)
		{
		System.out.println("not created");
		}
		else
		 {
		System.out.println("The File created in the " +path);
		}
          break;      
   
        }
    
        case 2:// deleting a file from the path
      
        {
        String path = "D:\\FSD\\Files\\";
		Scanner sc = new Scanner(System.in);
		System.out.println("path of file" +path);
		System.out.println("enter the file name to delete from this path");
		String filenames=sc.next();
		File f1=new File(path+filenames);
		//create/add new file
		boolean c=f1.delete();
				if(c!=true)
		{
		System.out.println("not created");
		}
		else
		 {
		System.out.println("The File created in the " +path);
		}
		break;
        }
        
        case 3:// to search a file from given the given path 
        { 
        String path = "D:\\FSD\\Files\\";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the file naem to search a particular file");
		String fs=sc.next();
		File f3= new File(path);
		File Fa[]=f3.listFiles();
		boolean flag = false;
		// using for each for Iteration

		for(File fr:Fa) {
				if(fr.getName().equals(fs)) {
								flag =true;
		                           break;
											}
					else {flag=false;}
                      }
				if(flag==true)
								{
								System.out.println("file found");
								}
					else
						{System.out.println("file not found");}
						break;
        
	    }
	    case 4:// exit
	    {
	    System.out.println("return to the main context");
	    }
	    
	    case 5:
	    System.exit(choose);
}}
	public static void main(String[] args) throws IOException {
		/*String path= "E:\\Project-Phase-1\\"; // path where project files are available
		Scanner sc = new Scanner(System.in);// taking input from the user
		System.out.println("Path of the file" +path);
		System.out.println("Displaying the files in this path");
		File fd1=new File(path);//assigning the path to fd1
		File f2 []=fd1.listFiles();// Fetching the list of files from the path
		// Retrieving the file names in an ascending order(using for-each loop)
		for(File ff:f2) {
			System.out.println( ff.getName());
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the following options to carry out ");
		System.out.println("0. Retrieving the file names in an ascending order");
		System.out.println("Please select the Business-level operations");
		System.out.println("1.Option to add a user specified file to the application");// select this option to add a file
		System.out.println("2.Option to delete a user specified file from the application");// select this for deleting a file
        System.out.println("3.Option to search a user specified file from the application");//select this for searching a file
        System.out.println("4.Navigation option to close the current execution context and return to the main context");////select this for close a file from the current execution context 
		
		int select = sc.nextInt();
		operations(select);
	}

}
