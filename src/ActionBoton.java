import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

/**
 * Clase que implementa el listener de los botones del Buscaminas.
 * De alguna manera tendrá que poder acceder a la ventana principal.
 * Se puede lograr pasando en el constructor la referencia a la ventana.
 * Recuerda que desde la ventana, se puede acceder a la variable de tipo ControlJuego
 * @author Ivan Moran Garcia
 *
 */
public class ActionBoton implements ActionListener{

	JLabel resultado;
	VentanaPrincipal ventana=new VentanaPrincipal();
	ControlJuego juego=new ControlJuego();
	int iboton;
	int jboton;
	
	
	
	public ActionBoton(VentanaPrincipal ventana, ControlJuego juego, int i, int j) {
		this.ventana = ventana;
		this.juego = juego;
		this.iboton = i;
		this.jboton = j;
	}



	/**
	 *Acción que ocurrirá cuando pulsamos uno de los botones.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(juego.abrirCasilla(iboton, jboton)){
			ventana.getJuego().getMinasAlrededor(iboton, iboton);
			ventana.mostrarNumMinasAlrededor(iboton, iboton);
		}
	}

}
