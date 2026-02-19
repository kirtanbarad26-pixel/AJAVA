import java.net.*; //required for InetAddress Class 
public class InetDemo{  
public static void main(String[] args){  
try{  
InetAddress ip 
=InetAddress.getByName("www.gmit.edu.in");  
System.out.println("Host Name: "+ip.getHostName());  
System.out.println("IP Address:"+ip.getHostAddress());  
}
catch(Exception e){System.out.println(e);}  
}  
}