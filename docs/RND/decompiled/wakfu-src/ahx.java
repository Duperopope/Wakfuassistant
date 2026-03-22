/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class ahx
extends WindowAdapter {
    final /* synthetic */ ahv cxW;

    ahx(ahv ahv2) {
        this.cxW = ahv2;
    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {
        if (this.cxW.cxR != null) {
            this.cxW.cxR.bu(true);
        }
    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {
        if (this.cxW.cxR != null) {
            this.cxW.cxR.bu(false);
        }
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
        if (this.cxW.cxR != null) {
            this.cxW.cxR.bmZ();
        }
        System.exit(0);
    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {
        if (this.cxW.cxR != null) {
            this.cxW.cxR.bv(false);
        }
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
        if (this.cxW.cxR != null) {
            this.cxW.cxR.bv(true);
        }
    }
}

