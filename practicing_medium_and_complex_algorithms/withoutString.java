package practicing_medium_and_complex_algorithms;


public class withoutString {
	
public withoutString()
{}

public String withoutString_(String base, String remove) 
{
 //Given two strings, base and remove, 
 //return a version of the base string 
 //where all instances of the remove string 
 //have been removed (not case sensitive). 
 //You may assume that the remove string is 
 //length 1 or more. Remove only non-overlapping instances, 
 //so with "xxx" removing "xx" leaves "x".
  
  base = base.replaceAll(remove.toLowerCase(), "");
  base = base.replaceAll(remove.toUpperCase(), "");
  return base.replaceAll(remove, "");
  
}
}