package fr.pcohen.view.swing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public abstract class Window extends JFrame {
	  
	private JPanel fullPan = new JPanel();
	private SearchBoxPan searchBoxPan = new SearchBoxPan();
	private JPanel mainPan = new JPanel();
	private JPanel footerPan = new JPanel();
	  
	  
	public Window(){

	    this.setTitle("DevGED");
	    this.setSize(600, 800);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	    
	    fullPan.setLayout(new BorderLayout());
	    fullPan.setBackground(new Color(51,51,51));
	
	    fullPan.add(searchBoxPan, BorderLayout.NORTH);
	    fullPan.add(mainPan, BorderLayout.CENTER);
	    fullPan.add(footerPan, BorderLayout.SOUTH);
	    
	    mainPan.setBackground(new Color(51,51,51));
	    
	    footerPan.setBackground(new Color(51,51,51));
	
	    this.setContentPane(fullPan);               
	
	    this.setVisible(true);

  	}
  
	public abstract void deleteAndReplace(JPanel newPanel);


	public JPanel getFullPan() {
		return fullPan;
	}
	
	
	public SearchBoxPan getSearchBoxPan() {
		return searchBoxPan;
	}
	
	
	public JPanel getMainPan() {
		return mainPan;
	}
	
	
	public JPanel getFooterPan() {
		return footerPan;
	}
	
	
	public void setFullPan(JPanel fullPan) {
		this.fullPan = fullPan;
	}
	
	
	public void setSearchBoxPan(SearchBoxPan searchBoxPan) {
		this.searchBoxPan = searchBoxPan;
	}
	
	
	public void setMainPan(JPanel mainPan) {
		this.mainPan = mainPan;
	}
	
	
	public void setFooterPan(JPanel footerPan) {
		this.footerPan = footerPan;
	}

}