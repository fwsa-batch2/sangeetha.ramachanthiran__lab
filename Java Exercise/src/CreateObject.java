
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
<<<<<<< HEAD
//          System.out.println(args.getClass().getSimpleName());
=======

>>>>>>> b2364b9a7bbb28060183dbeb78dde1475e7433be
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