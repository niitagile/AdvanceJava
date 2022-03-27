interface MyInterface {
    void calculateArea();
    interface MyInnerInterface {
       int id = 20;
       void print();     
    }
  }
  
 class NestedInterface implements MyInterface.MyInnerInterface {   
    public void print() {
       System.out.println("Print method of nested interface");
     }    
    public static void main(String args []) {
       NestedInterface obj = new NestedInterface();
       obj.print();
       System.out.println(obj.id);
    }
 }          