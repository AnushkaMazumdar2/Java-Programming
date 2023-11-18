import java.util.*;
public class Performance
{
int[] marks;
int highestmarks,leastmarks,c,maxc;
public Performance()
{
marks = new int[10];
}
void readMarks(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the marks for 10 students");
for (int i = 0; i< marks.length; i++)
{
    int a = sc.nextInt();
    while(a>100 || a<0)
    {
        System.out.println("Enter Valid Marks");
        a = sc.nextInt();
    }
    marks[i] = a;
}
}
int highestMark()
{
    highestmarks = marks[0];
    for (int i=0;i<marks.length; i++)
    {
        if(highestmarks<=marks[i])
        {
            highestmarks = marks[i];
        }
    }
    return highestmarks;
}
int leastMark()
{
    leastmarks = marks[0];
    for(int i=0;i<marks.length;i++)
    {
        if(leastmarks>=marks[i])
        {
            leastmarks = marks[i];
        }
    }
    return leastmarks;
}
ArrayList<Integer> getMode()
{
    ArrayList<Integer> maxval = new ArrayList<>(); 
    maxc = 0;
    for (int i=0;i<marks.length;i++)
    {
        c=0;
        for(int j = 0; j<marks.length;j++)
        {
            if(marks[i]==marks[j])
            {
                c=c+1;
            }
        }
            if(c>maxc)
            {
                maxc=c;
                maxval.clear();
                maxval.add(marks[i]);
            }
            else if (c==maxc && !maxval.contains(marks[i]))
            {
                maxval.add(marks[i]);
            }
    }
    return maxval;
}
int getFreqAtMode()
{
    ArrayList<Integer> m = getMode();
    int n = m.size();
    int[] mode = new int[n];
    int high = 0;
    for(int i=0;i<n;i++)
    {
        mode[i] = m.get(i);
    }
    for(int i = 0; i<marks.length;i++)
    {
        for (int j=0;j<mode.length;j++)
        {
        if(marks[i]==mode[j])
        {
          high++;  
        }
    }
    }
    return high/mode.length;
}
void display()
{
    System.out.println("The Highest Marks is"+highestMark());
    System.out.println("The Lowest Marks is"+leastMark());
    System.out.println("The Mode of the marks is"+getMode());
    System.out.println("The frequency of mode is"+getFreqAtMode());
}
public static void main(String[] args)
{
    Performance obj = new Performance();
    obj.readMarks();
    obj.display();
    }
}
