//Unpacking Code

import java.io.*;
import java.util.*;

class program614
{
    public static void main(String A[]) throws Exception
    {
        //Variable Creation
        int FileSize=0;
        int i=0;
        int iRet=0;

        byte key=0x11;

        Scanner sobj= null;
        String FileName=null;

        File fpackobj=null;
        File fobj=null;

        FileInputStream fiobj=null;
        FileOutputStream foobj=null;

        byte bHeader[] = new byte[100];
        byte Buffer[]=null;
        String Header=null;
        String Tokens[]=null;

        sobj=new Scanner(System.in);

        System.out.println("Enter The Name of Packed File : ");
        FileName = sobj.nextLine();
        

        fpackobj= new File(FileName);

        if(fpackobj.exists() == false)
        {
            System.out.println("Error :There is no such pack File.");
            return;
        }

        fiobj= new FileInputStream(fpackobj);

        //Read the Header
        while ((iRet =fiobj.read(bHeader,0,100)) != -1) 
        {

            Header=new String(bHeader);

            Header=Header.trim();

            Tokens=Header.split(" ");
            System.out.println("File Name : "+Tokens[0]);
            System.out.println("File Size : "+Tokens[1]);

            fobj=new File(Tokens[0]);

            fobj.createNewFile();

            foobj=new FileOutputStream(fobj);

            FileSize=Integer.parseInt(Tokens[1]);

            //Buffer for reading the Data
            Buffer=new byte[FileSize];

            //Read from packed File
            fiobj.read(Buffer, 0, FileSize);
        
            //Decrypt the Data
            for(i=0;i<FileSize;i++)
            {
                Buffer[i]=(byte)(Buffer[i]^key);
            }
            //Write into Extracted File
            foobj.write(Buffer,0,FileSize);
        }
        
    }
}