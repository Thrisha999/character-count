import java.util.*; 
class Chcount1 
{ 
public static void main(String args[]) 
{ 
int n; 
int a[]=new int[20]; 
int sum=0; 
int k=0,p=1,i,j,x=0; 
Scanner s=new Scanner(System.in); 
System.out.println("enter the number of numbers"); 
n=s.nextInt(); 
System.out.println("enter the numbers"); 
for(i=0;i<n;i++) 
a[i]=s.nextInt(); 
for(i=0;i<n;i++) 
{ 
k=a[i]; 
i=i+k-1; 
sum=sum+k; 
} 
if(n!=sum) 
{ 
System.out.println("ERROR"); 
System.exit(0); 
} 
for(i=0;i<n;i++) 
{ 
k=a[i]; 
System.out.println("Frame:"+p); 
for(j=i;j<k+i;j++) 
System.out.println(a[j]); 
i=i+k-1; 
p++; 
} 
} 
}