/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.Timer;

/*
 * Renamed from aBC
 */
class abc_1
implements ActionListener {
    private final KeyEvent dyU;
    private Timer dyV;
    static final /* synthetic */ boolean dyW;
    final /* synthetic */ abb_1 dyX;

    abc_1(abb_1 abb_12, KeyEvent keyEvent, Timer timer) {
        this.dyX = abb_12;
        this.dyV = timer;
        this.dyU = keyEvent;
    }

    void cancel() {
        if (!dyW && !abb_1.bVz()) {
            throw new AssertionError();
        }
        this.dyV.stop();
        this.dyV = null;
        this.dyX.dyS.remove(this.dyU.getKeyCode());
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (!dyW && !abb_1.bVz()) {
            throw new AssertionError();
        }
        if (this.dyV == null) {
            return;
        }
        this.cancel();
        abe_1 abe_12 = new abe_1((Component)this.dyU.getSource(), this.dyU.getID(), this.dyU.getWhen(), this.dyU.getModifiers(), this.dyU.getKeyCode(), this.dyU.getKeyChar(), this.dyU.getKeyLocation());
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(abe_12);
    }

    static {
        dyW = !abb_1.class.desiredAssertionStatus();
    }
}

