/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import org.apache.log4j.Logger;

class XR {
    protected static final Logger bTb = Logger.getLogger(XR.class);
    private final XV bTc = new XV();
    private final ArrayList<XS> bTd = new ArrayList();
    private final TIntArrayList bTe = new TIntArrayList();
    private final ArrayList<XU> bTf = new ArrayList();

    XR() {
    }

    void qF(int n) {
        int n2;
        this.bTf.clear();
        this.bTe.resetQuick();
        int n3 = this.bTd.size();
        for (n2 = 0; n2 < n3; ++n2) {
            XS xS = this.bTd.get(n2);
            xS.qF(n);
            xS.a(this.bTf);
            if (xS.bnY() != 0.0f) continue;
            this.bTe.add(n2);
        }
        for (n2 = this.bTe.size() - 1; n2 >= 0; --n2) {
            this.bTd.remove(this.bTe.getQuick(n2));
        }
        ArrayList<za_0> arrayList = this.bTc.b(this.bTf);
        int n4 = arrayList.size();
        for (n3 = 0; n3 < n4; ++n3) {
            arrayList.get(n3).boS();
        }
    }

    void a(XO xO) {
        XS xS = this.qI(xO.d());
        if (xS == null) {
            xS = new XS(xO);
            this.bTd.add(xS);
        }
        xS.bJ(1.0f);
    }

    void b(XO xO) {
        XS xS = this.qI(xO.d());
        if (xS != null) {
            xS.bJ(0.0f);
        }
    }

    private XS qI(int n) {
        for (int i = this.bTd.size() - 1; i >= 0; --i) {
            XS xS = this.bTd.get(i);
            if (xS.bTh.d() != n) continue;
            return xS;
        }
        return null;
    }

    void a(Yd yd, aaj_0 aaj_02) {
        this.bTc.a(yd, aaj_02);
    }

    void clear() {
        this.bTf.clear();
        this.bTd.clear();
        this.bTc.boe();
    }

    public void reset() {
        this.bTc.bof();
    }
}

