import java.io.*;
class File{
    public static void main(String args[])
    {
        String location="C:\\Users\\Aditya Raj\\Desktop\\fileTest.txt";
        File ob=new File();
        ob.write(location);
        ob.read(location);
    }
    void write(String location)
    {
        try {
            FileOutputStream fout = new FileOutputStream(location);
            for (int i = 1; i <= (255); i++)
                fout.write(i);
            System.out.println("Success");
            fout.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }   
    }

    void read(String location)
    {
        try{
            FileInputStream fin=new FileInputStream(location);
            int i=0;
            while((i=fin.read())!=-1)
                System.out.print((char)i);
                fin.close();
        } catch(Exception e)
        {
            System.out.println("Error: "+e);
        }
    }

}