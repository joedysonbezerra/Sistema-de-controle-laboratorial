import controller.Fachada;
import view.TelaInicio;

public class Main {
   public static void main(String[] args) {
		Fachada fachada = new Fachada();
		TelaInicio inicio = new TelaInicio(fachada);

   }
}
