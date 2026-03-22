/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ahJ
 */
public abstract class ahj_0
extends ahv
implements aby_1,
ahm_0,
WindowListener,
WindowStateListener {
    private ahp_0 cym;
    protected JFrame bXt;
    protected JComponent cyn;
    protected JPanel cyo;
    private ahk_0 cyp;
    private boolean crD = false;

    protected ahj_0() {
    }

    public void a(ahp_0 ahp_02) {
        this.cym = ahp_02;
    }

    public ahp_0 bAV() {
        return this.cym;
    }

    @Override
    protected JFrame bAv() {
        JFrame.setDefaultLookAndFeelDecorated(false);
        this.bXt = new JFrame();
        this.bXt.setUndecorated(true);
        this.bXt.setFocusable(false);
        Container container = this.bXt.getContentPane();
        container.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 1;
        gridBagConstraints.insets = new Insets(0, 0, 0, 0);
        Insets insets = this.cym.bAq();
        Dimension dimension = new Dimension(-1, Math.max(1, insets.top));
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        this.cyp = new ahk_0(this, this.cym);
        ahj_0.a(this.cyp, dimension);
        this.cyp.eQ(this.bAD());
        container.add((Component)this.cyp, gridBagConstraints);
        gridBagConstraints.fill = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.weightx = 1.0;
        this.cyn = new JPanel(new BorderLayout(), true);
        container.add((Component)this.cyn, gridBagConstraints);
        this.cyo = new JPanel(new ahN(), true);
        aho_0 aho_02 = new aho_0(1.0f, 1.0f, 1);
        aho_02.cw(true);
        this.cyo.add((Component)((Object)this.bAy()), aho_02);
        this.cyn.add((Component)this.cyo, "Center");
        this.cyp.addMouseListener(new ahs(this.bXt));
        this.bXt.addWindowStateListener(this);
        this.bXt.addWindowListener(this);
        this.bmE().a(this, false);
        this.crD = true;
        return this.bXt;
    }

    private static void a(Component component, Dimension dimension) {
        component.setMinimumSize(dimension);
        component.setSize(dimension);
        component.setPreferredSize(dimension);
        component.setMaximumSize(dimension);
    }

    private void cu(boolean bl) {
        for (Component component : this.bXt.getContentPane().getComponents()) {
            if (component == this.cyn) continue;
            component.setVisible(bl);
        }
    }

    @Override
    protected boolean a(int n, int n2, int n3, int n4, @Nullable String string) {
        boolean bl = super.a(n, n2, n3, n4, string);
        if (bl) {
            this.cu(false);
        }
        return bl;
    }

    @Override
    protected void eS(@Nullable String string) {
        this.cu(false);
        super.eS(string);
    }

    @Override
    protected void a(int n, int n2, @Nullable String string, int n3, int n4, boolean bl) {
        this.cu(true);
        super.a(n, n2, string, n3, n4, bl);
    }

    @Override
    public boolean a(FocusEvent focusEvent) {
        return false;
    }

    @Override
    public boolean b(FocusEvent focusEvent) {
        Component component;
        if (ady_1.bZa() && !focusEvent.isTemporary() && (component = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner()) != this.bAy()) {
            this.bAy().requestFocus();
        }
        return false;
    }

    @Override
    public void bAW() {
        this.close();
    }

    @Override
    public void bAX() {
        this.bXt.setExtendedState(this.bXt.getExtendedState() == 6 ? 0 : 6);
    }

    @Override
    public void bAY() {
        int n = this.bXt.getExtendedState() & 6;
        this.bXt.setExtendedState(1 | n);
    }

    @Override
    public void b(afx_0 afx_02) {
        Rectangle rectangle = new Rectangle(this.bXt.getBounds());
        this.cyn.add((Component)afx_02, "South");
        afx_02.setVisible(true);
        this.bXt.pack();
        this.bXt.setBounds(rectangle);
    }

    @Override
    public void bAx() {
        Rectangle rectangle = new Rectangle(this.bXt.getBounds());
        for (Component component : this.cyn.getComponents()) {
            if (!(component instanceof afx_0)) continue;
            this.cyn.remove(component);
        }
        this.bXt.pack();
        this.bXt.setBounds(rectangle);
    }

    @Override
    public void windowStateChanged(WindowEvent windowEvent) {
        int n = windowEvent.getNewState();
        this.sr(n);
    }

    @Override
    public void sr(int n) {
        boolean bl = (n & 6) != 0;
        this.cyp.cv(bl);
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
        this.cym.a(ahq_0.cxp);
        this.cyp.bBa();
    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {
        this.cym.a(ahq_0.cxs);
        this.cyp.bBa();
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {
    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {
    }

    public JPanel bAZ() {
        return this.cyo;
    }

    public boolean blc() {
        return this.crD;
    }

    @Override
    public void cs(boolean bl) {
        super.cs(bl);
        if (!EventQueue.isDispatchThread()) {
            return;
        }
        this.cyo.validate();
    }

    @Override
    public void eQ(String string) {
        super.eQ(string);
        if (this.cyp != null) {
            this.cyp.eQ(string);
        }
    }
}

