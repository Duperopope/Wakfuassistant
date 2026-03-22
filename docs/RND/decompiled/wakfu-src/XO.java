/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class XO {
    private final int bSQ;
    private final ArrayList<XU> bSR = new ArrayList();

    public XO() {
        this(0);
    }

    public XO(int n) {
        this.bSQ = n;
    }

    public int d() {
        return this.bSQ;
    }

    public final void a(XT xT) {
        if (xT != null) {
            this.bSR.add(new XU(xT, this.bSQ));
        }
    }

    ArrayList<XU> bnR() {
        return this.bSR;
    }

    public final int bnS() {
        return this.bSR.size();
    }

    public String toString() {
        return "[ Ambiance : " + this.bnS() + " effect(s)";
    }

    public void qF(int n) {
        for (int i = 0; i < this.bSR.size(); ++i) {
            this.bSR.get(i).qK(n);
        }
    }
}

