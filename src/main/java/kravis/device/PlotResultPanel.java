package kravis.device;

import javax.swing.*;
import java.awt.*;

/**
 * @author Holger Brandl
 */
public class PlotResultPanel {
    private JButton lastButton;
    private JButton nextButton;
    private JButton clearHistoryButton;
    private JButton exportButton;
    private JButton copyButton;
    private JPanel contentPanel;
    private JPanel mainPanel;


    public ImagePanel imagePanel;


    public PlotResultPanel() {
        $$$setupUI$$$();
        lastButton.addActionListener(e -> System.out.println("clicked next"));

        nextButton.addActionListener(e -> System.out.println("clicked next"));

        // todo implement last/next https://stackoverflow.com/questions/5654926/implementing-back-forward-buttons-in-swing
        imagePanel = new ImagePanel();
        contentPanel.add(imagePanel);
    }


    public JPanel getMainPanel() {
        return mainPanel;
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }


    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(0, 0));
        final JToolBar toolBar1 = new JToolBar();
        mainPanel.add(toolBar1, BorderLayout.NORTH);
        lastButton = new JButton();
        lastButton.setText("<");
        toolBar1.add(lastButton);
        nextButton = new JButton();
        nextButton.setText(">");
        toolBar1.add(nextButton);
        clearHistoryButton = new JButton();
        clearHistoryButton.setText("Clear History");
        toolBar1.add(clearHistoryButton);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(0, 0));
        toolBar1.add(panel1);
        exportButton = new JButton();
        exportButton.setText("Export...");
        toolBar1.add(exportButton);
        copyButton = new JButton();
        copyButton.setText("Copy");
        toolBar1.add(copyButton);
        contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout(0, 0));
        contentPanel.setEnabled(true);
        mainPanel.add(contentPanel, BorderLayout.CENTER);
    }


    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }
}


