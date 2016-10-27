public class Test01 { 
    public static void main(String args[]) { 
    label: 
      {
        for (int i = 0; i < 5; ++i) {
           for (int j = 0; j < 5; ++j) { 
                if (i > 2) break label; 
                System.out.print(j); 
            } 
            System.out.println("----"); 
        }
      System.out.println("End");  
      }
      int k, l;
      k = 10;
      l = k++;
      System.out.println(k);
      System.out.println(l);  
    } 
}