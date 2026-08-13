/*
import java.awt.*;
class Calculator
{
 public static void main(String s[ ])
 {
  Frame f=new Frame("Calculator");
  TextArea ta=new TextArea();
  f.setLayout(new FlowLayout());
  f.add(ta);
  String a[ ]={"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "C", "="};
  for(int i=0;i<a.length;i++)
   f.add(new Button(a[i]));
  f.setSize(300,400);
  f.setVisible(true);
 }
}
*/


import java.awt.*;
class Demo {
 public static void main(String s[]) {
  Frame f=new Frame("Calculator");
  TextArea ta=new TextArea(2,20);
  Panel p=new Panel();
  p.setLayout(new GridLayout(4,4));
  String a[]={"7","8","9","/","4","5","6","*","1","2","3","-","0","C","=","+"};
  for(String x:a) p.add(new Button(x));
  f.add(ta,BorderLayout.NORTH);
  f.add(p,BorderLayout.CENTER);
  f.setSize(300,400);
  f.setVisible(true);
 }
}