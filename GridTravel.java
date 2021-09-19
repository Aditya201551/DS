public class GridTravel {
    
    int travel(int m, int n)
    {
        if(m==1||n==1)
            return 1;
        if(m==0||n==0)
            return 0;

        return travel(m-1, n)+travel(m, n-1);
    }

    public static void main(String[] args) {
        GridTravel ob=new GridTravel();
        
        System.out.println(ob.travel(2,3));
    }
}
