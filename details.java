public class details {
    String name;
    int ID, Roll;

    void setName(String name)
    {
        this.name=name;
    }

    void setRoll(int Roll)
    {
        this.Roll=Roll;
    }

    void setID(int ID)
    {
        this.ID=ID;
    }

    String getName()
    {
        return this.name;
    }

    int getRoll()
    {
        return this.Roll;
    }

    int getID()
    {
        return this.ID;
    }

    void display()
    {
        System.out.println("Name: "+getName());
        System.out.println("Roll: "+getRoll());
        System.out.println("ID: "+getID());
    }
}
