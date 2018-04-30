package facadetest;

public class AutomovilFacade {

	public static void arrancar() {
		ComprobarLiquidos comprobarLiquidos = new ComprobarLiquidos();
		ComprobarGasolina comprobarGasolina = new ComprobarGasolina();
		ComprobarEspejos comprobarEspejos = new ComprobarEspejos();
		ComprobarAsientos comprobarAsientos = new ComprobarAsientos();
		Arrancar arrancar = new Arrancar();
		
		comprobarLiquidos.comprobar();
		comprobarGasolina.comprobar();
		comprobarEspejos.comprobar();
		comprobarAsientos.comprobar();
		arrancar.encender();
		
		
		System.out.println("Arre con la que barre!!!");
	}
}
