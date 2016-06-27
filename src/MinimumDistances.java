import java.util.*;

public class MinimumDistances {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int A[] = new int[n];
	        for(int A_i=0; A_i < n; A_i++){
	            A[A_i] = in.nextInt();
	        }
	        */
	      //int A[] = {1,7,3,3,7,1};
	      
	      //int A[] = {1,2,3,4,5,6,7,8,9};
		//int A[] = {1,1,1,1,1,1,1};
		//int A[] = {1};
		int A[] = {};
	    
	        HashMap<Integer, List<Integer>> dups = new HashMap <>();
	        
	        for (int a = 0; a < A.length; a++){
	            int key = A[a];
	            if(dups.containsKey(key)){
	                List<Integer> list = dups.get(key);
	                list.add(a);
	                dups.put(key, list);
	            }else{
	                List <Integer> l = new ArrayList<>();
	                l.add(a);
	                dups.put(key, l);
	            }
	        }
	        
	        
	          Iterator i = dups.entrySet().iterator();
	        int smallest = -1;
	        
	        while(i.hasNext()){
	            Map.Entry p = (Map.Entry)i.next();            
	            List <Integer> list = (List<Integer>) p.getValue();   
	            
	            if(list.size() > 1){
	                  for (int b = 1; b < list.size(); b++){
	                	  //System.out.println(list.get(b-1) +"-"+ list.get(b)+" = " + Math.abs(list.get(b-1) - list.get(b)));
	                      int newSmall = Math.abs(list.get(b-1) - list.get(b));
	                      if(smallest != -1){
	                    	  if (smallest >= newSmall){
	                    		  smallest = newSmall;
	                    	  }
	                      }else{
	                    	  smallest = newSmall;
	                      }
	                        
	                    }
	            }
	        }
	        
	            System.out.printf("%s", smallest);
	      
	        

	}

}
