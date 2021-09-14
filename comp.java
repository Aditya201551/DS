import java.util.*;

public class comp {
    public static void main(String[] args) {
        ArrayList<dataSet> arr=new ArrayList<>();
        arr.add(new dataSet(50, 'a'));
        arr.add(new dataSet(10, 'b'));
        arr.add(new dataSet(10, 'b'));
        arr.add(new dataSet(5, 'd'));
        arr.add(new dataSet(10, 'b'));
        arr.add(new dataSet(2, 'f'));

        /* Collections.sort(arr, new sortByFreq());
                    OR*/
        arr.sort(new sortByFreq());
        System.out.println(arr);

    }
}


class dataSet{
    int freq;
    char ch;

    dataSet(int freq, char ch)
    {
        this.freq=freq;
        this.ch=ch;
    }

    public String toString()
    {
        return ch+" "+freq;
    }
}


class sortByFreq implements Comparator<dataSet>
{
    public int compare(dataSet a, dataSet b)
    {
        return a.freq-b.freq;
    }
}