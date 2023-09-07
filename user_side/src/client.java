import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;
import java.net.*;

class client {

	public static void main(String[] args)throws Exception
	{
		long t3,t4;
		MulticastSocket ds=new MulticastSocket(1235);
		DatagramPacket dp;
		ds.joinGroup(InetAddress.getByName("227.0.0.1"));
		BigInteger q,g,u,p,t1,r,d,k,ea;
		String temp;
		Scanner scan=new Scanner(System.in);
		byte by0[]=new byte[1024];
		dp=new DatagramPacket(by0,1024);
		ds.receive(dp);
		temp=new String(dp.getData());
		q=new BigInteger(temp.trim());
		
		byte by1[]=new byte[1024];
		dp=new DatagramPacket(by1,1024);
		ds.receive(dp);
		temp=new String(dp.getData());
		g=new BigInteger(temp.trim());
		
		byte by2[]=new byte[1024];
		dp=new DatagramPacket(by2,1024);
		ds.receive(dp);
		temp=new String(dp.getData());
		p=new BigInteger(temp.trim());
		
		byte by3[]=new byte[1024];
		dp=new DatagramPacket(by2,1024);
		ds.receive(dp);
		temp=new String(dp.getData());
		u=new BigInteger(temp.trim());
		
		byte by4[]=new byte[1024];
		dp=new DatagramPacket(by2,1024);
		ds.receive(dp);
		temp=new String(dp.getData());
		ea=new BigInteger(temp.trim());
		System.out.println("(g,p,u):"+g+""+p+""+u);
		System.out.println("Enter the Private key");
		k=new BigInteger(scan.nextLine().trim());
		BigInteger a1,a2,a3,b1,b2,b3,one,temp1,temp2,temp3,zero,q1;
		a1=new BigInteger("1");
		a2=new BigInteger("0");
		b1=new BigInteger("0");
		b2=new BigInteger("1");
		one=new BigInteger("1");
		zero=new BigInteger("0");
		t3=System.nanoTime();
		t1=u.mod(k);
		a3=k;
		b3=t1;
		while(b3.compareTo(one)!=0)
		{
			q1=a3.divide(b3);
			temp1=b1;temp2=b2;temp3=b3;
			b1=a1.subtract(q1.multiply(b1));
			b2=a2.subtract(q1.multiply(b2));
			b3=a3.subtract(q1.multiply(b3));
			a1=temp1;
			a2=temp2;
			a3=temp3;
		}
		
		if(b2.compareTo(zero)<0)
			d=b2.add(k);
		else
			d=b2;
		r=g.modPow((ea.multiply(d)).subtract(q),p);
		t4=System.nanoTime();
		System.out.println("The value of r,d is "+r+" "+d);
		System.out.println("The Computation time for the CLIENT:"+(t4-t3)+"nano sec");
	

	}

}

