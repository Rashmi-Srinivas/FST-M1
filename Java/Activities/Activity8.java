package Activities;

public class Activity8 {
    public static void main(String[] args) throws CustomException {
       try {
           Activity8.exceptionTest("Rashmi");
           Activity8.exceptionTest(null);
       }
       catch (Exception e){
           System.out.println("Exception thrown is: "+e.getMessage());
       }
    }

    public static void exceptionTest(String msg) throws CustomException{
      if (msg == null){
          throw new CustomException("String value provided is null");
      }
      else{
          System.out.println("String is: "+msg);
      }
    }
}
