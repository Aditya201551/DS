public class ArrrayException {
    public static void main(String[] args) {
        boolean arr[]=new boolean[2];
        try{
            int x=20/0;
            arr[52]=true;
            if(true)
            {
                try{
                    int y=70/0;
                } catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            if(e.toString().equals("java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2"))
                System.out.println(true);
            else
                System.out.println(false);
        }
        catch(Exception e)
        {
            System.out.println("General exception "+e.getMessage());

            try{
                int a=0/10;
            } catch(Exception f){
                System.out.println("ERRRRRRRRRRRRRR");
            }
        }
        finally{
            System.out.println("This is to be executed no matter what!");
        }
    }
}