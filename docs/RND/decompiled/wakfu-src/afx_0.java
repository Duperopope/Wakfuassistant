/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import org.apache.log4j.Logger;

/*
 * Renamed from afx
 */
public class afx_0
extends JPanel {
    private static final Logger cqu = Logger.getLogger(afx_0.class);
    private final String cqv = "debugBar.properties";
    private static final int cqw = 38;
    private static final Border cqx = new EmptyBorder(0, 0, 0, 0);
    private final WL cqy;
    private final Vector<afy_0> cqz = new Vector();
    private final JPanel cqA;
    private final Vector<Class<? extends afy_0>> cqB = new Vector();

    public afx_0(WL wL) {
        super(new BorderLayout(0, 0), true);
        this.cqy = wL;
        this.setIgnoreRepaint(true);
        Dimension dimension = new Dimension(-1, 38);
        this.setMaximumSize(dimension);
        this.setMinimumSize(dimension);
        this.setPreferredSize(dimension);
        this.cqA = new JPanel(new FlowLayout(0, 0, 0));
        this.cqA.setMaximumSize(dimension);
        this.cqA.setMinimumSize(dimension);
        this.cqA.setPreferredSize(dimension);
        this.add((Component)this.cqA, "Center");
    }

    public void n(Class<? extends afy_0> clazz) {
        afy_0 afy_02;
        for (afy_0 object2 : this.cqz) {
            if (!object2.getClass().getCanonicalName().equals(clazz.getCanonicalName())) continue;
            cqu.debug((Object)(clazz.toString() + " component already present"));
            return;
        }
        try {
            afy_02 = clazz.newInstance();
        }
        catch (Exception exception) {
            cqu.info((Object)("Unable to instanciate a " + String.valueOf(clazz) + " DebugComponent"));
            return;
        }
        this.cqz.add(afy_02);
        afy_02.b(this.cqy);
        if (this.cqA.getComponentCount() > 0) {
            this.cqA.add(new afz_0(8, 38));
        }
        JComponent jComponent = afy_02.bxL();
        jComponent.setBorder(cqx);
        this.cqA.add(jComponent);
        this.cqA.validate();
    }

    public void o(Class<? extends afy_0> clazz) {
        this.cqB.add(clazz);
    }

    private void p(Class<? extends afy_0> clazz) {
        for (afy_0 afy_02 : this.cqz) {
            if (afy_02.getClass() != clazz) continue;
            this.a(afy_02);
            break;
        }
    }

    private boolean a(afy_0 afy_02) {
        int n = this.cqA.getComponentZOrder(afy_02.bxL());
        if (n == -1) {
            return false;
        }
        this.cqz.remove(afy_02);
        this.cqA.remove(afy_02.bxL());
        if (this.cqA.getComponentCount() > 0) {
            if (n > 0) {
                this.cqA.remove(n - 1);
            } else {
                this.cqA.remove(n);
            }
        }
        afy_02.c(this.cqy);
        this.cqA.validate();
        return true;
    }

    @Override
    public void removeAll() {
        this.bxM();
    }

    private void bxM() {
        while (this.cqz.size() > 0) {
            afy_0 afy_02 = this.cqz.get(0);
            if (this.a(afy_02)) continue;
            cqu.error((Object)("Error while deleting DebugComponent " + String.valueOf(afy_02)));
            this.cqz.remove(0);
        }
        if (this.cqA.getComponentCount() != 0) {
            cqu.error((Object)"Encore des composants de pr\u00e9sent alors qu'on vient de tous les supprimer");
        }
        if (this.cqz.size() != 0) {
            cqu.error((Object)"Encore des debugcomposants de pr\u00e9sent alors qu'on vient de tous les supprimer");
        }
    }

    public void reset() {
        this.bxM();
    }
}

