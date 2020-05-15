public boolean xyBalance(String str) {


  boolean result=true;; 
  
  for (int i=0; i<str.length(); i++){
    if(str.charAt(i)=='x') { 
      if (str.substring(i+1, str.length()).indexOf('y')==-1 )  
      {
        result=false; } else { result=true; 
          
        } 
}
}

return result;
}
