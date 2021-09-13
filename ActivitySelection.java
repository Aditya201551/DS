//Greedy

public class ActivitySelection {

    int activity(int start[], int finish[], int n)
    {
        int lastActivity=0, done=0;

        System.out.print(lastActivity+" ");

        for(int current=1;current<n;current++)
            if(start[current]>=finish[lastActivity])
            {
                done++;
                System.out.print(current+" ");
                lastActivity=current;
            }

            return done;
    }

    public static void main(String[] args) {
        ActivitySelection ob=new ActivitySelection();
        int start[]={1,3,0,5,8,5};
        int finish[]={2,4,6,7,9,9};
        int n=6;
        System.out.print("\n"+ob.activity(start, finish, n));
    }
}
