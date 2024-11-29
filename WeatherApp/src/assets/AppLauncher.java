package assets;

import javax.swing.SwingUtilities;

public class AppLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new weatherAppGui().setVisible(true);
				
				//System.out.println(WeatherApp.getCurrentTime());
			}
			
		});
	}

}
