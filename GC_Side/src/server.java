import java.util.*;
import java.lang.*;
import java.net.*;
import java.io.*;
import java.math.*;
import java.lang.Math.*;

class server {
	public static void main(String args[])throws Exception
	{
		long t1,t2,t3,t4;
		DatagramSocket ds=new DatagramSocket(1234);
		BigInteger p,q,d,a,g,l,r,u,v,k1,k2;
		BigInteger ea,eb,ex,ey,eq,er,ex1,ex2,ey1,ey2,zero;
		p=new BigInteger("7105152391649023");
		q=new BigInteger("597419368681");
		a=new BigInteger("366934943356");
		k1=new BigInteger("764365874318093");
		k2=new BigInteger("286431602915049");
		g=new BigInteger("632891092823657");
		
		
		ex2=new BigInteger("1");
		ex1=new BigInteger("0");
		ey2=new BigInteger("1");
		ey1=new BigInteger("0");
		zero=new BigInteger("0");
		d=q.add(a);
		l=k1.multiply(k2);
		t1=System.nanoTime();
		r=g.modPow(a,p);
		ea=d;
		eb=l;
		while(eb.compareTo(zero)>0)
		{
			eq=ea.divide(eb);
			er=ea.subtract(eq.multiply(eb));
			ex=ex2.subtract(eq.multiply(ex1));
			ey=ey2.subtract(eq.multiply(ey1));
			ea=eb; eb=er; ex2=ex1; ex1=ex; ey2=ey1; ey1=ey;
		}
		t2=System.nanoTime();
		System.out.println("r="+r);
		u=ex2; v=ey2;
		System.out.println("u.d+v.1=x=>"+u+"*"+d+"+"+v+"*"+1+"="+ea);
		String temp;
		temp=""+q;
		ds.send(new DatagramPacket(temp.getBytes(),temp.length(),InetAddress.getByName("227.0.0.1"),1235));
		temp=""+g;
		ds.send(new DatagramPacket(temp.getBytes(),temp.length(),InetAddress.getByName("227.0.0.1"),1235));
		temp=""+p;
		ds.send(new DatagramPacket(temp.getBytes(),temp.length(),InetAddress.getByName("227.0.0.1"),1235));
		temp=""+u;
		ds.send(new DatagramPacket(temp.getBytes(),temp.length(),InetAddress.getByName("227.0.0.1"),1235));
		temp=""+ea;
		ds.send(new DatagramPacket(temp.getBytes(),temp.length(),InetAddress.getByName("227.0.0.1"),1235));
		System.out.println("Packet Send");
		System.out.println("The Computation time for the Server: "+(t2-t1)+"nano sec");
	}
//764365874318093
}
