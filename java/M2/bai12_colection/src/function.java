import java.util.List;

public  class function {
     void add(List<product> list,product a){
        list.add(a);
    }
    void update(int idm, List<product> list){
        product newProduct= new product(6,"samsung",100);
       list.set(idm,newProduct);
    }

    void delete(int id,List<product> list){
         list.remove(id);
    }
    void outPut(List<product> list){
         for(product pr:list){
             pr.toString();
             System.out.println();
         }
    }
    void find(String name, List<product> list){
         int kt=0;
         for (product pr:list){
             if(pr.name.equals(name)==true){
                 pr.toString();
             kt++;
             }
         }
         if(kt==0){
             System.out.println("not found!");
         }
    }
}
