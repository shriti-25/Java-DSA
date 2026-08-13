class Thread1 extends Thread
{
Thread1(String s)
{
super(s);
// start();
}
public void run()
{
for (int i =1; i<=5; i++)
{

// System.out.println(getName());
System.out.println(Thread.currentThread().getName());
// System.out.println("chai");

try
{
 Thread.sleep(1000);
}
catch(Exception e)
{ }

}
System.out.println("Thread1 class run completed");
}
}


class Thread2 extends Thread
{
Thread2(String s)
{
super(s);
// start();
}

public void run()
{
for(int i=1; i<=10; i++)
{
System.out.println(Thread.currentThread().getName());
// System.out.println("Hay");
try
{ 
 Thread.sleep(1000);
}
catch(Exception e)
{ }
}

System.out.println("Thread2 class run completed");
}
}


class Thread3 extends Thread
{
Thread3(String s)
{
super(s);
// start();
}

public void run()
{
for(int i=1; i<=15; i++)
{
System.out.println(Thread.currentThread().getName());
// System.out.println("Hay");
try
{ 
 Thread.sleep(1000);
}
catch(Exception e)
{ }
}

System.out.println("Thread3 class run completed");
}
}


class CallRun
{
public static void main(String s[ ])
{
Thread t1 = new Thread1("Thread1"); 
Thread t2 = new Thread2("Thread2"); 
Thread t3 = new Thread3("Thread3"); 


t1.run();
t2.run();
t3.run();

for(int i =1; i<=20; i++)
{
System.out.println(Thread.currentThread().getName());
// System.out.println("Tata");

try
{ 
 Thread.sleep(1000);
}
catch(Exception e)
{ }
}

System.out.println(Thread.currentThread().getName() +"dead");
}
}













