
 class CreateObject {
      int a;
      CreateObject(int in){
          a = in;
          System.out.println(a);
      }
      public static void main(String[] args) {
//        CreateObject objectName = new CreateObject();
//        System.out.println(objectName.a);
//        System.out.println("hasan");
//         add();
//          System.out.println(args.getClass().getSimpleName());
    }
       int add() {
        System.out.println("Duke Ji");
          return a;
    }
}
class dummy{
    public static void main(String[] args) {
        CreateObject ob = new CreateObject(4);
    }
}