import java.util.*;
public class AlphabetWarGame
{
Scanner sc = new Scanner(System.in);
public AlphabetWarGame(String word)
{

int c=0,e=0;
for(int i=0;i<word.length();i++)
{
if (word.charAt(i)=='w')
{
c = c+4;
}
else if(word.charAt(i) == 'p')
{
c = c+3;
}
else if(word.charAt(i) == 'b')
{
c = c+2;
}
else if(word.charAt(i) == 's')
{
c = c+1;
}
else if(word.charAt(i) == 'm')
{
    e = e+4;
}
else if(word.charAt(i) == 'q')
{
    e = e+3;
}
else if(word.charAt(i) == 'd')
{
    e = e+2;
}
else if(word.charAt(i) == 'z')
{
    e = e+1;
}
}
if (c>e)
{
    System.out.println("Left Side Wins!");
}
else if(c<e)
{
    System.out.println("Right Side Wins!");
}
else if(c==e)
{
    System.out.println("Lets fight again!");
}
}
public AlphabetWarGame(String word, int sw, int  sp, int sb, int sd, int sz, int sq, int sm, int ss)
{
int c=0,e=0;
for(int i=0;i<word.length();i++)
{
if (word.charAt(i)=='w')
{
c = c+sw;
}
else if(word.charAt(i) == 'p')
{
c = c+sp;
}
else if(word.charAt(i) == 'b')
{
c = c+sb;
}
else if(word.charAt(i) == 's')
{
c = c+ss;
}
else if(word.charAt(i) == 'm')
{
    e = e+sm;
}
else if(word.charAt(i) == 'q')
{
    e = e+sq;
}
else if(word.charAt(i) == 'd')
{
    e = e+sd;
}
else if(word.charAt(i) == 'z')
{
    e = e+sz;
}
}
if (c>e)
{
    System.out.println("Left Side Wins!");
}
else if(c<e)
{
    System.out.println("Right Side Wins!");
}
else if(c==e)
{
    System.out.println("Lets fight again!");
}
}
void Alphabet(String s)
{
int c=0,e=0;
for(int i=0;i<s.length();i++)
{
if (s.charAt(i)=='w')
{
c = c+4;
}
else if(s.charAt(i) == 'p')
{
c = c+3;
}
else if(s.charAt(i) == 'b')
{
c = c+2;
}
else if(s.charAt(i) == 's')
{
c = c+1;
}
else if(s.charAt(i) == 'm')
{
    e = e+4;
}
else if(s.charAt(i) == 'q')
{
    e = e+3;
}
else if(s.charAt(i) == 'd')
{
    e = e+2;
}
else if(s.charAt(i) == 'z')
{
    e = e+1;
}
}
if (c>e)
{
    System.out.println("Left Side Wins!");
}
else if(c<e)
{
    System.out.println("Right Side Wins!");
}
else if(c==e)
{
    System.out.println("Lets fight again!");
}
}
void Alphabet(String left, String right)
{
int c=0,e=0;
for(int i=0;i<left.length();i++)
{
if (left.charAt(i)=='w')
{
c = c+4;
}
else if(left.charAt(i) == 'p')
{
c = c+3;
}
else if(left.charAt(i) == 'b')
{
c = c+2;
}
else if(left.charAt(i) == 's')
{
c = c+1;
}
}
for (int i=0;i<right.length();i++)
{
if(right.charAt(i) == 'm')
{
    e = e+4;
}
else if(right.charAt(i) == 'q')
{
    e = e+3;
}
else if(right.charAt(i) == 'd')
{
    e = e+2;
}
else if(right.charAt(i) == 'z')
{
    e = e+1;
}
}
System.out.println("The score for the left word"+c);
System.out.println("The score for the right word is:"+e);
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a word");
String words = sc.next();
int w,p,b,s,m,q,d,z;
String l, r;
AlphabetWarGame obj1 = new AlphabetWarGame(words);
AlphabetWarGame obj2 = new AlphabetWarGame(words, 3,5,2,1,5,1,3,2);
obj1.Alphabet(words);
System.out.println("Enter a left string consisting of w,p,b,s");
l = sc.next();
System.out.println("Enter a right string m,q,d,z");
r = sc.next();
obj1.Alphabet(l,r);
}
}