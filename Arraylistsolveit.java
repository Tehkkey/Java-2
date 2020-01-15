

public class SolveIt{

public static void main(String[] args)
      {
      ArrayList<Integer> list = new Arraylist<Integer>();
      list.add(2,6,1,8);
      
      mystery1();

      }
      
      public static void mystery1(ArrayList<Integer> list){
   for (int i=list.size() - 1; i>0;i--){
      if(list.get(i) < list.get(i-1)){
      int element = list.get(i);
      list.remove(i);
      list.add(0, element);
      }
     }
     System.out.println(list);
     }
     }