import java.util.*;     
class RemoveDuplicates {     
    static void removeDuplicate(char s1[], int length)   
    {   
        int c = 0;          
        for (int i = 0; i < length; i++)   
        {
            int j;
            for (j = 0; j < i; j++)    
            {   
                if (s1[i] == s1[j])   
                {   
                    break;   
                }   
            }     
            if (j == i)    
            {   
                s1[c++] = s1[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(s1, c)));   
    }
    public static void main(String[] args)   
    {   
        String s = "averyhappyweather";  
        char s1[] = s.toCharArray();  
        int len =s1.length;   
        removeDuplicate(s1, len);   
    }   
}  
