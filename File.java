import java.io.*;
class File{
    public static void main(String args[])
    {
        String file="C:\\Users\\Aditya Raj\\Desktop\\fileTest.txt";
        try{
        FileOutputStream fout=new FileOutputStream(file);
        fout.write(65);
        fout.write(66);
        fout.write(67);
        byte arr[]=new byte[2001];
        byte x=0;
        for(int i=0;i<2001;i++)
            arr[i]=x++;
        fout.write(arr);
        fout.close();
        System.out.println("Success");
        } catch(Exception e)
        {
            System.out.println("Error: "+e);
        }
    }
}