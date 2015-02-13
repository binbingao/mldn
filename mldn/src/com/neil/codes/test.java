package com.neil.codes;
import java.io.*;
import java.math.*;
import java.util.*;
public class test {
	public static void main(String[] args){
		File f=new File("d:\\test.txt");
		BigInteger bi=null;
		bi=load(f);
		bi=bi.add(new BigInteger("1"));
		System.out.println(bi);
	}
	public static BigInteger load(File file){
		BigInteger count=null;
		try{
			if(file.exists()){
				Scanner scan=null;
				scan=new Scanner(new FileInputStream(file));
				if(scan.hasNext()){
					count=new BigInteger(scan.next());
				}
				scan.close();
			}else{
				count=new BigInteger("0");
				save(file,count);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return count;
	}
	public static void save(File file,BigInteger count){
		try{
			PrintStream ps=null;
			ps=new PrintStream(new FileOutputStream(file));
			ps.println(count);
			ps.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
