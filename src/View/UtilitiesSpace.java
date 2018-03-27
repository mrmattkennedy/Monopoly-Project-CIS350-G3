package View;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UtilitiesSpace extends JPanel {

  /**
   * A final int to track the width of a space.
   */
  private static final int WIDTH = 200;

  /**
   * A final int to track the height of a space.
   */
  private static final int HEIGHT = 400;

  private static Image utilitiesImg;

  private JLabel name;

  private static JLabel price = new JLabel("$150");

  private Dimension dimension;

  private boolean waterworks;

  public UtilitiesSpace(boolean waterworks) throws IOException {
    this.waterworks = waterworks;

    if (waterworks) {
      dimension = new Dimension(WIDTH, HEIGHT);
      utilitiesImg = ImageIO.read(new File("res/waterWorks.png"));
      name = new JLabel("Water Works");
    } else {
      dimension = new Dimension(HEIGHT, WIDTH);
      //Todo: Find a Better image.
      utilitiesImg = ImageIO.read(new File("res/electricCompany.jpg"));
      name = new JLabel("Electric Company");
    }
    setLayout(new GridBagLayout());
    drawLabels();
  }

  private void drawLabels() {
    GridBagConstraints g = new GridBagConstraints();
    g.gridx = 0;
    g.gridy = 0;
    g.anchor = GridBagConstraints.NORTH;
    g.weighty = 2;
    add(name, g);

    g = new GridBagConstraints();
    g.gridx = 0;
    g.gridy = 2;
    g.anchor = GridBagConstraints.SOUTH;
    add(price, g);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (waterworks) {
      g.drawImage(utilitiesImg, 130, 30, 110, 110, null);
    } else {
      g.drawImage(utilitiesImg, 25, 40, 130, 250, null);
    }
  }

  /********************************************************************
   * The getPreferredSize method is used to Lock the size of the Panel
   * to the correct size.
   * @return The dimensions of the UtilitiesSpace.
   *******************************************************************/
  @Override
  public Dimension getPreferredSize() {
    return dimension;
  }

  /********************************************************************
   * The getMinimumSize method refers to the getPreferredSize method
   * to lock the size of the panel.
   * @return getPreferredSize the dimensions of the UtilitiesSpace.
   *******************************************************************/
  @Override
  public Dimension getMinimumSize() {
    return getPreferredSize();
  }

  /********************************************************************
   * The getMaximumSize method refers to the getPreferredSize method
   * to lock the size of the panel.
   * @return getPreferredSize the dimensions of the UtilitiesSpace.
   *******************************************************************/
  @Override
  public Dimension getMaximumSize() {
    return getPreferredSize();
  }
}
