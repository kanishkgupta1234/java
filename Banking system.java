import java.io.*; //package import
//Hi

class bank

{
	static String hnm[]=new String[50];

	static int an[]=new int[50];

	static String at[]=new String[50];

	static int amt[]=new int[50];
	static int i=0;



public  static void display()throws IOException

{
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));


System.out.println("1 New Account\n2. Deposit Account\n3. Withdraw Amount\n4. Balance Enquiry\n5. All Account holder details\n6. Modify an Account\n7. Exit");
int op=Integer.parseInt(in.readLine());

select(op);

}

public static void select(int se)throws IOException

{

switch(se)

 {

case 1:
 newAccount();
break;

case 2:
depAccount();
break;

case 3:
withAccount();
break;

case 4:
balEnq();
break;

case 5:
acDetai();
break;

case 6:
mAcc();
break;

case 7:
exi();
break;

default:

System.out.println("Invalid option");

display();

break;

 }
}


public static void newAccount()throws IOException
{

BufferedReader n=new BufferedReader(new InputStreamReader(System.in));



System.out.println("Enter Account Number");

an[i]=Integer.parseInt(n.readLine());

System.out.println("Enter Account Holder Name");

hnm[i]=n.readLine();

System.out.println("Account type \n s for savings and c for current");

at[i]=n.readLine();

System.out.println("Enter amount to be deposited");

amt[i]=Integer.parseInt(n.readLine());
i++;

System.out.println("Thanks for update");

//Thread.sleep(2000);
display();

}

public static void depAccount()throws IOException

{

BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter account number");

int t=-1;

int s=Integer.parseInt(ob.readLine());

for(int se=0;se<50;se++)

  {
if(s==an[se])

t=se;
  }

if(t!=-1)
  {
System.out.println("Enter amount to be deposited");

int a=Integer.parseInt(ob.readLine());

amt[t]=amt[t]+ a;

System.out.println("Updated");

//Thread.sleep(2000);
display();
  }

else
{
System.out.println("Account not found");

depAccount();

}
}
public static void withAccount()throws IOException

{

BufferedReader w=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter account number");

int t=-1;

int s=Integer.parseInt(w.readLine());

for(int se=0;se<50;se++)

{

if(s==an[se]) {

t=se;}

}
if(t!=-1)

{
System.out.println("Enter amount to be withdrawn");

int a=Integer.parseInt(w.readLine());
 
if(amt[t]>=a)
 
 {
amt[t]=amt[t]- a;

System.out.println("Updated");


display();
 
 }
else
 
{
System.out.println("Insfficient Balance enter new amount to be withdrawn");

a=Integer.parseInt(w.readLine());

amt[t]=amt[t]-a;

 }}

else{
System.out.println("Account not found");


withAccount();
}}

public static void balEnq()throws IOException
{
BufferedReader q=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter account number");

int be=Integer.parseInt(q.readLine());

int f=-1;

for(int as=0;as<50;as++)

{
if(an[as]==be)

{

System.out.println("Account NUmber ="+an[as]+"\nHolder Name ="+hnm[as]+"\nBalance ="+amt[as]);

f=1;
}

}

if(f==-1)

{

System.out.println("Account not found");


balEnq();

}
display();

}

public static void acDetai()throws IOException
{

System.out.println("Name \t A/c Number \t A/c Type \t Balance---");

for(int p=0;p<50;p++)

{

if(amt[p]!=0)

System.out.println(hnm[p]+"\t\t"+an[p]+"\t\t"+at[p]+"\t\t"+amt[p]);

}

System.out.println("\n\n\nDetails Displayed\n\n");


display();
}

public static void mAcc()throws IOException

{

BufferedReader ac=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter Account Number of holder");

int mh=Integer.parseInt(ac.readLine());

int mf=-1;
for(int c=0;c<50;c++)
{

if(mh==an[c])

{
mf=c;
System.out.println(c);
}

}

if(mf!=-1)

{

System.out.println("Enter name to be changed");

String ca=ac.readLine();

hnm[mf]=ca;

System.out.println("\n\n\nDetails Updated");


display();

}

else

{

System.out.println("\n\n Account Not found\n\n");

mAcc();

}

}

public static void exi()

{

System.out.println("\n\n\nThankyou For Using our Services");

}

public static void main(String args[])throws IOException,InterruptedException

{

BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
  
{


for(int p=0;p<50;p++)
   {

hnm[p]="";
amt[p]=0;
at[p]="";
an[p]=0;
   }
System.out.println("Enter ID and Password of banking Authority");
String id=in.readLine();
String pass=in.readLine();
try{
	if(id.equalsIgnoreCase("admin")&&pass.equals("1234")) 
{


int op;

display();
}else
	throw new NumberFormatException("INVALID");
  }
catch(NumberFormatException e)
                   {
	System.out.println("Login failed");
	
                  }
             }
           }
  }
