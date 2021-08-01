interface cube{
    public static int Find_cube(int n)
    {
        return n*n*n;
    }
}

class testing implements cube{
    void show()
    {
        System.out.print("Showing Cube: ");
    }
}

public class CubeInterfaceTest{
    public static void main(String[] args) {
        testing ob=new testing();
        ob.show();
        System.out.print(cube.Find_cube(2));
    }
}