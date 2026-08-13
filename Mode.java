import java.util.Scanner ;

class Mode
{
static float  findMode(int z[ ])
{
int mode = z[0];
int maxCount = 0;

for(int i = 0; i<z.length; i++)
{
int count = 0;
for(int j = 0; j<z.length; j++)
{
if(z[i] == z[j])
{
count++;
}
}
if(count >maxCount)
{
maxCount = count;
mode = z[i];
}
} 
return mode ;
}
public static void main(String args[ ])
{
Scanner sc = new Scanner(System.in); 

System.out.println("Enter size of array:");
int n = sc.nextInt();

int z[ ] = new int[n];

System.out.println("Enter array values:");

for(int i = 0; i < n; i++)
{
z[i] = sc.nextInt();
}

System.out.println("Mode = " + findMode(z));
}
}