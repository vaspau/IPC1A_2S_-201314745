package Recepcion;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImagen extends JPanel{
	ImageIcon imagen;
	String url;
	public PanelImagen(String url){
		this.url=url;
	}
	public void paint (Graphics g){
		Dimension t =getSize();
		imagen = new ImageIcon(getClass().getResource(url));
		g.drawImage(imagen.getImage(),0,0,t.width,t.height, null);
		setOpaque(false);
		super.paint(g);
	}

}
