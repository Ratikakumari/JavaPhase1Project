package com.lockme.app;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class projectEx {
 public static void main(String[] args)throws IOException
 {   String path="D:\\";
	 Scanner sc=new Scanner(System.in);
	 char c;
	 System.out.println("\n     $$$$--Welcome To LockMe--$$$$     \n"+" \n   Created By   \n  "+"\n RATIKA \n");
	 do
	 {
		 System.out.println("Main Menu");
	 String menu=("1.Retrieve files in ascending order\n2.Business level Functional\n0.Exit");
	 System.out.println(menu);
	 int ch;
	 Scanner resource=new Scanner(System.in); 
		ch=resource.nextInt();
	
	 switch(ch)
		{
		 case 1:      
		              File f=new File(path);
			          File filename[]=f.listFiles();
			           for(File ff:filename)
			                {
				                     System.out.println(ff.getName());
			                }
		              break;
		 case 2:    String mainmenu=(""
		 		+ "Function MENU:\n"+"1.Add file\n"+"2.Delete file\n"+"3.Search file\n"+"4.Go to main menu\n"+"5.Exit from the application");
	                System.out.println(mainmenu);
	                int choice;
	                Scanner scan=new Scanner(System.in);
	                choice=scan.nextInt();
	                     switch(choice)
	                     	{      
	                     case 1:
	                           Scanner obj=new Scanner(System.in);
	                           ArrayList<String> al=new ArrayList<>();
	                           while(true) 
	                           {
	                        	   System.out.println("Enter The File Name To Create");
	                        	   String fname=obj.next();
	                        	   String finalname=path+fname;
	                        	   System.out.println(finalname);

	                     //create a file 

	                        	   File fi=new File(finalname);
	                        	   boolean b=fi.createNewFile();
	                        	   if(b!=true)
	                        	   {
	                        		   System.out.println("No File Created");
	                        	   }
	                        	   else 
	                        	   {
	                        		   al.add(fname);
	                        		   System.out.println("Created File Sucessfully");
	                        	   }

	                        	   System.out.println(" All Files Available "+ al);
	                        	   break;
	                     }
	                    	 break;
	                     case 2:	Scanner abc=new Scanner(System.in);
	                     			System.out.println("Type The File Name To Be Deleted");
	                     			String filname=abc.next();
	                     			String finalfile=path+filname;
	                     			File file=new File(finalfile);
	                     			file.delete();
	                     			System.out.println("Deleted");

	                    	 break;
	                     case 3:	File fi=new File(path);
	                     			Scanner scanf=new Scanner(System.in);
	                     			System.out.println("Type File Name to Search");
	                     			String filsearchname=scanf.next();
	                     			File filesname[]=fi.listFiles();
	                     			int flag=0;
	                     			for(File ff:filesname)
	                     			{
	                     				if(ff.getName().equals(filsearchname))
	                     				{
	                     					flag=1;
	                     					break;
	                     				}
	                     				else 
	                     				{
	                     					flag=0;
	                     				}
	                     			}
	                     			if(flag==1) 
	                     			{
	                     				System.out.println("File Found");
	                     			}
	                     			else 
	                     			{
	                     				System.out.println("No Files Found");
	                     			}
	                    	 break;
	                     case 4:	System.out.println(menu);
	                    	 break;
	                     case 5: System.exit(0);
	                    	 break;
	                    default:System.out.println("Enter The Correct Choice");
	                    	
	                     	}
	                     break;
		 case 3:   System.exit(0);
		 default:  System.out.println("Enter The Correct Choice");
		}
	 System.out.println("Do you want to continue(Y/N):");
	 c=sc.next().charAt(0);
 }while(c=='y'||c=='Y');
	 sc.close();
 }
}