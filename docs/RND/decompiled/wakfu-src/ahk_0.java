/*
 * Decompiled with CFR 0.152.
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Renamed from ahK
 */
class ahk_0
extends JPanel {
    final ahm_0 cyq;
    private final JButton cyr;
    private final JButton cys;
    private final JButton cyt;
    private final ahp_0 cyu;
    private final JLabel cyv;
    private boolean cyw = false;

    ahk_0(ahm_0 ahm_02, ahp_0 ahp_02) {
        super(new BorderLayout(1, 3));
        this.cyq = ahm_02;
        this.setFocusable(false);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setOpaque(true);
        this.setDoubleBuffered(true);
        JPanel jPanel = new JPanel(new FlowLayout(3, 8, 4));
        jPanel.setOpaque(false);
        this.add((Component)jPanel, "Before");
        this.cyv = new JLabel();
        this.cyv.setFont(new Font(null, 1, 12));
        this.cyv.setForeground(Color.WHITE);
        jPanel.add(this.cyv);
        JPanel jPanel2 = new JPanel(new FlowLayout(4, 0, 0));
        jPanel2.setOpaque(false);
        this.add((Component)jPanel2, "After");
        this.cyr = ahk_0.bI(ahp_02.bAk().getIconWidth(), ahp_02.bAk().getIconHeight());
        jPanel2.add(this.cyr);
        if (this.cyq != null) {
            this.cyr.addActionListener(actionEvent -> this.cyq.bAY());
        }
        this.cys = ahk_0.bI(ahp_02.bAk().getIconWidth(), ahp_02.bAk().getIconHeight());
        jPanel2.add(this.cys);
        if (this.cyq != null) {
            this.cys.addActionListener(actionEvent -> this.cyq.bAX());
        }
        this.cyt = ahk_0.bI(ahp_02.bAe().getIconWidth(), ahp_02.bAe().getIconHeight());
        jPanel2.add(this.cyt);
        this.cyt.addActionListener(actionEvent -> {
            if (this.cyq != null) {
                this.cyq.bAW();
            } else {
                System.exit(0);
            }
        });
        Container container = new Container();
        container.setSize(new Dimension(2, 1));
        container.setMinimumSize(new Dimension(2, 1));
        container.setMaximumSize(new Dimension(2, 1));
        container.setPreferredSize(new Dimension(2, 1));
        jPanel2.add(container);
        if (this.cyq != null) {
            this.addMouseListener(new ahl_0(this));
        }
        this.cyu = ahp_02;
    }

    public void cv(boolean bl) {
        this.cyw = bl;
        this.bBa();
    }

    private static JButton bI(int n, int n2) {
        Dimension dimension = new Dimension(n, n2);
        JButton jButton = new JButton();
        jButton.setBorder(BorderFactory.createEmptyBorder());
        jButton.setBorderPainted(false);
        jButton.setFocusable(false);
        jButton.setFocusPainted(false);
        jButton.setMinimumSize(dimension);
        jButton.setSize(dimension);
        jButton.setPreferredSize(dimension);
        jButton.setMaximumSize(dimension);
        jButton.setContentAreaFilled(false);
        return jButton;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        if (this.cyu == null) {
            return;
        }
        int n = this.getHeight();
        int n2 = this.getWidth();
        graphics.drawImage(this.cyu.bAd(), 0, 0, n2, n, null);
    }

    void bBa() {
        if (this.cyw) {
            this.cys.setIcon(this.cyu.bAn());
            this.cys.setRolloverIcon(this.cyu.bAo());
            this.cys.setPressedIcon(this.cyu.bAp());
        } else {
            this.cys.setIcon(this.cyu.bAh());
            this.cys.setRolloverIcon(this.cyu.bAi());
            this.cys.setPressedIcon(this.cyu.bAj());
        }
        this.cyr.setIcon(this.cyu.bAk());
        this.cyr.setRolloverIcon(this.cyu.bAl());
        this.cyr.setPressedIcon(this.cyu.bAm());
        this.cyt.setIcon(this.cyu.bAe());
        this.cyt.setRolloverIcon(this.cyu.bAf());
        this.cyt.setPressedIcon(this.cyu.bAg());
        this.repaint();
    }

    public void eQ(String string) {
        this.cyv.setText(string);
    }
}

