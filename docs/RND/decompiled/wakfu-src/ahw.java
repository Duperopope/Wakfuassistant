/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class ahw
extends ComponentAdapter {
    final /* synthetic */ ahv cxV;

    ahw(ahv ahv2) {
        this.cxV = ahv2;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        if (this.cxV.cxR != null) {
            this.cxV.cxR.a(this.cxV.bAI());
        }
    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {
        if (this.cxV.cxR != null) {
            this.cxV.cxR.b(this.cxV.bAI());
        }
    }

    @Override
    public void componentShown(ComponentEvent componentEvent) {
        if (this.cxV.cxR != null) {
            this.cxV.cxR.c(this.cxV.bAI());
        }
    }
}

