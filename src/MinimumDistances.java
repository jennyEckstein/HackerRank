import java.util.*;

public class MinimumDistances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int A[] = new int[n];
	        for(int A_i=0; A_i < n; A_i++){
	            A[A_i] = in.nextInt();
	        }
	      /*  
	        int result = -1;
	        
	        
	        HashMap<Integer, Integer> map = new HashMap <>();
	        
	        
	        for (int i = 0; i < A.length; i++){
	            int key = A[i];
	            
	            if(map.containsKey(key)){
	                int realKey = map.get(key);
	                map.put(key, realKey+1);
	                System.out.print(realKey);
	            }else{
	                map.put(A[i], 1);
	            }
	        }
	        //remove all non duplicated
	        Iterator iter = map.entrySet().iterator();
	        
	        while(iter.hasNext()){
	            Map.Entry pair = (Map.Entry)iter.next();            
	            Integer numOccured = (Integer) pair.getValue();          
	            if(numOccured <= 1){
	                iter.remove();
	            }
	        }
	        
	        */
	        //System.out.println("=========================================");
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
	           // System.out.print(p.getKey() + " - ");
	            //for (List<Integer> l: list){
	            //    System.out.print (l + ", ");
	            //}
	            
	            //for (int b = 0; b < list.size(); b++){
	            //    System.out.print (list.get(b) + ", ");
	           // }
	           // System.out.print("\n");
	            
	            if(list.size() > 1){
	                  for (int b = 1; b < list.size(); b++){
	                        //System.out.print (list.get(b) + ", ");
	                      int newSmall = Math.abs(list.get(b-1) - list.get(b));
	                      if(smallest != -1 && smallest >= newSmall){
	                          smallest = newSmall;
	                      }
	                        
	                    }
	            }
	        }
	        
	        
	        //Empty map
	        //if(map.isEmpty()){
	            System.out.printf("%s", smallest);
	       // }
	        

	}

}
