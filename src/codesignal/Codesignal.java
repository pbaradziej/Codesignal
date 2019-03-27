package codesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Codesignal {

    public static void main(String[] args) {
        
        
    }
    
        int firstDuplicate(int[] a) {
    for(int i=0;i<a.length;i++)
        if(a[Math.abs(a[i])-1]<0)
            return Math.abs(a[i]);
        else{
            a[Math.abs(a[i])-1]=-a[Math.abs(a[i])-1];
        }
    return -1;
    }

 char firstNotRepeatingCharacter(String s) {
    char[] c=s.toCharArray();
for(int i=0;i<s.length();i++){
    if(s.indexOf(c[i])==s.lastIndexOf(c[i]))
        return c[i];
}
    return '_';
}
 
 int[][] rotateImage(int[][] a) {
     
        for(int i=0;i<a.length/2;i++){
        for(int j=i;j<a.length-i-1;j++){
        int temp = a[i][j];
        a[i][j]=a[a.length-j-1][i];
        a[a.length-j-1][i]=a[a.length-i-1][a.length-j-1];
        a[a.length-i-1][a.length-j-1]=a[j][a.length-i-1];
        a[j][a.length-i-1]=temp;
        }
            
        }
return a;    
}
 
 boolean sudoku2(char[][] grid) {
        Set<String> set = new HashSet<String>();
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid.length;j++){
        if(grid[i][j]!='.' && !set.add(grid[i][j]+"dl"+i))
        return false;
        
        if(grid[i][j]!='.' && !set.add(grid[i][j]+"ws"+j))
        return false;
        
        if(grid[i][j]!='.' && !set.add(grid[i][j]+"kw"+i/3+","+j/3))
            return false;
                }
        }
        return true;
}
 
 boolean isCryptSolution(String[] crypt, char[][] solution) {
    for(char[] arr : solution){
        for(int i = 0; i < crypt.length; i++){
            crypt[i]=crypt[i].replace(arr[0],arr[1]);
            
        }
        System.out.println(Arrays.toString(crypt));
        
    }
    
    for(int j = 0; j<crypt.length;j++){
        if(!crypt[j].equals("0") && crypt[j].startsWith("0"))
        return false;
           }
    System.out.println(Integer.parseInt(crypt[0])+Integer.parseInt(crypt[1]));
    
  return Integer.parseInt(crypt[0])+Integer.parseInt(crypt[1])==Integer.parseInt(crypt[2]);  
}
 
}

























