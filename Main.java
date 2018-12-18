import controller.ClienteController;
public class Main {
   public static void main(String[] args) {
      try {
         System.out.println("Hello World");
         ClienteController c1 = new ClienteController();
         c1.cadastrarCliente("06937424450","jo", 18, "Masculino",
                 "Pernambuco","Garanhuns","Santo Antonio","Ary",
                 49300490,"Cassi");
         c1.cadastrarCliente("06937424455","jb", 18, "Masculino",
                 "Pernambuco","Garanhuns","Santo Antonio","Ary",
                 49300490,"Cassi");
         System.out.println(c1.procuraCliente("06937424450").getNome());        
         c1.removeCliente("06937424455");
     }catch(Exception e) {
         System.out.println(e.getMessage());
     }
   }
}
