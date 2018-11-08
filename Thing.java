public class Thing {
   private static int things = 0;
   private static final String ID_START = "no";
   private String id;

   public static int manyThings() {
       return things;
   }

   public Thing() {
      things++;
      id = ID_START + things;
   }

   public String giveId() {
      return id;
   }
}