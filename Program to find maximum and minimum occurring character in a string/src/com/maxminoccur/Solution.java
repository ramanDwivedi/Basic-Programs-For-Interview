package com.maxminoccur;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Solution {
public static void Frequency(String str)
{
char []ch=str.toCharArray();
Map<Character,Integer>map=new HashMap<Character,Integer>();
for(int i=0;i<ch.length;i++) {
if(!map.containsKey(ch[i])) {
map.put(ch[i], 1);
}
else {
map.put(ch[i],map.get(ch[i])+1);
}
}
int minFre=map.get(ch[0]),maxFre=map.get(ch[0]);
for(int i=1;i<str.length();i++) {
if(minFre>map.get(ch[i]))
minFre=map.get(ch[i]);
if(maxFre< map.get(ch[i]))
maxFre=map.get(ch[i]);
}
System.out.print(minFre+" "+maxFre);
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
System.out.println("Enter the String");
String str=sc.next();
Frequency(str);
}
}
