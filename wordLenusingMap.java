public Map<String, Integer> wordLen(String[] strings) 
{
  
  /*
  
  Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.


  wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
  wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
  
  */
  
  Map<String, Integer> map= new HashMap();
  
  for ( int i = 0; i < strings.length; i++ ) 
  {
    if (!map.containsKey(strings[i])) 
    {
    
      map.put(strings[i], strings[i].length()); 
      
    }
    
    
  }
  
  return map;
 
  
}
