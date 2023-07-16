                                                                                                                            NAME:R.Priyadharshni


1.Which of the following lines will compile without warning or error.
option : 5. int i=5;


2.What will happen if you try to compile and run the following code
public class MyClass {
public static void main(String arguments[]) {
amethod(arguments);
}
public void amethod(String[] arguments) {
System.out.println(arguments);
System.out.println(arguments[1]);
}
}
option: 1) Can't make static reference to void amethod.


3.Which of the following will compile without error
option: 2 and 3 will compile without error.
2)
package MyPackage;
import java.awt.*;
class MyClass{}
3)
/*This is a comment */
package MyPackage;
import java.awt.*;
class MyClass{}


4.A byte can be of what size
option: 1) 1) -128 to 127

5.What will be printed out if this code is run with the following command line?
java myprog good morning
public class myprog{
public static void main(String argv[])
{
System.out.println(argv[2])
}
}
option: 4) Exception raised: "java.lang.ArrayIndexOutOfBoundsException: 2"


6.Which of the following are keywords or reserved words in Java?
option: 3.goto is reserved keyword in java


7.Which of the following are legal identifiers
option:4) _3_


8.What will happen when you compile and run the following code?
public class MyClass{
static int i;
public static void main(String argv[]){
System.out.println(i);
}
}
option:4) 0
1) Error Variable i may not have been initialized


9.What will happen if you try to compile and run the following code?
public class Q {
public static void main(String argv[]){
int anar[]=new int[]{1,2,3};
System.out.println(anar[1]);
}
}
option:3) 2


10.What will happen if you try to compile and run the following code?
public class Q {
public static void main(String argv[]){
int anar[]=new int[5];
System.out.println(anar[0]);
}
}
option:3) 0


11.What will be the result of attempting to compile and run the following code?
abstract class MineBase {
abstract void amethod();
static int i;
}
public class Mine extends MineBase {
public static void main(String argv[]){
int[] ar=new int[5];
for(i=0;i < ar.length;i++)
System.out.println(ar[i]);
}
}
option:3) Error Mine must be declared abstract


12.What will be printed out if you attempt to compile and run the following code ?
int i=1;
switch (i) {
case 0:
System.out.println("zero");
break;
case 1:
System.out.println("one");
case 2:
System.out.println("two");
default:
System.out.println("default");
}
option:3) one, two, default


13.What will be printed out if you attempt to compile and run the following code?
int i=9;
switch (i) {
default:
System.out.println("default");
case 0:
System.out.println("zero");
break;
case 1:
System.out.println("one");
case 2:
System.out.println("two");
}
option:2) default, zero


14.which of the following lines of code will compile without error
option: 2 and 3 is correct
2)
boolean b=true;
boolean b2=true;
if(b==b2) {
System.out.println("So true");
}
3)
int i=1;
int j=2;
if(i==1|| j==2)
System.out.println("OK");


16.Which of the following statements are true?
1) Methods cannot be overriden to be more private
2) Static methods cannot be overloaded
3) Private methods cannot be overloaded
4) An overloaded method cannot throw exceptions not checked in the base class

17.What will happen if you attempt to compile and run the following code?
class Base {}
class Sub extends Base {}
class Sub2 extends Base {}
public class CEx{
public static void main(String argv[]){
Base b=new Base();
Sub s=(Sub) b;
}
}
option: 3) Runtime Exception


21.What will be output by the following code?
public class MyFor{
public static void main(String argv[]){
int i;
int j;
outer:
for (i=1;i <3;i++)
inner:
for(j=1; j<3; j++) {
if (j==2)
continue outer;
System.out.println("Value for i=" + i + " Value for j=" +j);
}
}
}
option: 1) Value for i=1 value for j=1
        2) Value for i=2 value for j=1



23.Which of the following methods can be legally inserted in place of the comment //Method Here ?
class Base{
public void amethod(int i) { }
}
public class Scope extends Base{
public static void main(String argv[]){
}
//Method Here
}
option: 2) void amethod(long i)throws Exception {}
        4) public void amethod(int i) throws Exception {}


26.If you run the code below, what gets printed out?
String s=new String("Bicycle");
int iBegin=1;
char iEnd=3;
System.out.println(s.substring(iBegin,iEnd));
option: 2) ic


27.If you wanted to find out where the position of the letter v (ie return 2) in the string s containing "Java", which of the following could you use?
option: 3) s.indexOf('v');


28.Given the following declarations
String s1=new String("Hello")
String s2=new String("there");
String s3=new String();
Which of the following are legal operations?
option: 1) s3=s1 + s2;


29.What is the result of the following operation?
System.out.println(4 | 3);
option: 4) 7


30.public class MyClass1 {
public static void main(String argv[]){ }
/*Modifier at XX */ class MyInner {}
}
What modifiers would be legal at XX in the above code?
option: 1,2 and 3
1) public
2) private 
3) static


35.What will be the result when you attempt to compile and run the following code?
public class Conv{
public static void main(String argv[]){
Conv c=new Conv();
String s=new String("ello");
c.amethod(s);
}
public void amethod(String s){
char c='H';
c+=s;
System.out.println(c);}}
option: 4) Compile time error


36.Given the following code, what test would you need to put in place of the
comment line?
to result in an output of Equal
public class EqTest{
public static void main(String argv[]){
EqTest e=new EqTest();
}
EqTest(){
String s="Java";
String s2="java";
//place test here {
System.out.println("Equal");
}else
{
System.out.println("Not equal");
}
}
}
optiom: 3) if(s.equalsIgnoreCase(s2))



40.Given the following code how could you invoke the Base constructor that will print out the string "base constructor";
class Base{
Base(int i){
System.out.println("base constructor");
}
Base(){
}
}
public class Sup extends Base{
public static void main(String argv[]){
Sup s= new Sup();
}
Sup()
{
}
public void derived()
{
}
}
option: 3) On the line After //Two put super(10);



41.Given the following code what will be output?
public class Pass{
static int j=20;
public static void main(String argv[]){
int i=10;
Pass p = new Pass();
p.amethod(i);
System.out.println(i);
System.out.println(j);
}
public void amethod(int x){
x=x*2;
j=j*2;
}
}
option: 3) 10 and 40


42.What code placed after the comment //For loop would populate the elements of the
array ia[] with values of the variable i.?
public class Lin{
public static void main(String argv[]){
Lin l = new Lin();
l.amethod();
}
public void amethod(){
int ia[] = new int[4];
//Start For loop
{
ia[i]=i;
System.out.println(ia[i]);
}
}
}
option: 4) for(int i=0; i< ia.length;i++)


43.What will be the result when you try to compile and run the following code?
private class Base{
Base(){
int i = 100;
System.out.println(i);
}
}
public class Pri extends Base{
static int i = 200;
public static void main(String argv[]){
Pri p = new Pri();
System.out.println(i);
}
}
option: 1) Error at compile time


44.What will the following code print out?
public class Oct{
public static void main(String argv[]){
Oct o = new Oct();
o.amethod();
}
public void amethod(){
int oi= 012;
System.out.println(oi);
}
}
option: 3)10


45.What will happen when you try compiling and running this code?
public class Ref{
public static void main(String argv[]){
Ref r = new Ref();
r.amethod(r);
}
public void amethod(Ref r){
int i=99;
multi(r);
System.out.println(i);
}
public void multi(Ref r){
r.i = r.i*2;
}
}
option: 1) Error at compile time


51.What will happen when you compile and run the following code?
public class Scope{
private int i;
public static void main(String argv[]){
Scope s = new Scope();
s.amethod();
}
public static void amethod(){
System.out.println(i);
}
}
option: 3) A compile time error


58.You have these files in the same directory. What will happen when you attempt to
compile and run Class1.java if you have not already compiled Base.java
package Base;
class Base{
protected void amethod(){
System.out.println("amethod");
}}
package Class1;
public class Class1 extends Base{
public static void main(String argv[]){
Base b = new Base();
b.amethod();
}}
option: 4)Compile error: Superclass Class1.Base of class Class1.Class1 not found


59.What will happen when you attempt to compile and run the following code
class Base{
private void amethod(int iBase){
System.out.println("Base.amethod");
}
}
class Over extends Base{
public static void main(String argv[]){
Over o = new Over();
int iBase=0;
o.amethod(iBase);
}
public void amethod(int iOver){
System.out.println("Over.amethod");
}
}
option: 4) Output of "Over.amethod"



