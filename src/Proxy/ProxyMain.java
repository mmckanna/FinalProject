package Proxy;

import java.net.*;
import javax.swing.*;
import java.util.*;

public class ProxyMain {
	
	CharacterComponent characterComponent;
	JFrame frame = new JFrame("Character Viewer");
	JMenuBar menuBar;
	JMenu menu;
	Hashtable<String, String> character = new Hashtable<String, String>();

	public static void main (String[] args) throws Exception {
		ProxyMain testDrive = new ProxyMain();
	}

	public ProxyMain() throws Exception{
		character.put("Stormtrooper","https://images-na.ssl-images-amazon.com/images/I/71llLVCMuQL._SX466_.jpg");
		character.put("Sithlord","https://www.shioktoys.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/s/t/star-war-darth-vader-premium-format-figure-sideshow-300541-01_thumbnail.jpg");
		character.put("Jedi","https://vignette.wikia.nocookie.net/star-wars-canon-extended/images/2/2c/Luke_Sky7.jpg/revision/latest?cb=20180123070942");
		character.put("Rebel Soldier","https://i.pinimg.com/originals/49/ac/fc/49acfc0d57ee167910d21be3e9fe7a18.jpg");
				
		URL initialURL = new URL((String)character.get("Rebel Soldier"));
		menuBar = new JMenuBar();
		menu = new JMenu("Stormtrooper");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);

		for (Enumeration<String> e = character.keys(); e.hasMoreElements();) {
			String name = (String)e.nextElement();
			JMenuItem menuItem = new JMenuItem(name);
			menu.add(menuItem); 
			menuItem.addActionListener(event -> {
				characterComponent.setIcon(new CharacterProxy(getStromtrooperURL(event.getActionCommand())));
				frame.repaint();
			});
		}

		// set up frame and menus
		Icon icon = new CharacterProxy(initialURL);
		characterComponent = new CharacterComponent(icon);
		frame.getContentPane().add(characterComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,1100);
		frame.setVisible(true);

	}

	URL getStromtrooperURL(String name) {
		try {
			return new URL((String)character.get(name));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
