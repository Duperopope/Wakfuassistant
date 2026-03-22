/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

class XS {
    private final agg_0 bTg = new agg_0();
    final XO bTh;

    XS(XO xO) {
        this.bTh = xO;
        this.bTg.setSpeed(1.0f);
        this.bTg.cF(0.001f);
        this.bTg.cG(0.0f);
    }

    public void bJ(float f2) {
        this.bTg.aS(f2);
    }

    public void qF(int n) {
        this.bTg.sj(n);
        this.bTh.qF(n);
    }

    public void a(ArrayList<XU> arrayList) {
        float f2 = this.bnY();
        ArrayList<XU> arrayList2 = this.bTh.bnR();
        int n = arrayList2.size();
        for (int i = 0; i < n; ++i) {
            XU xU = arrayList2.get(i);
            xU.bK(f2);
            arrayList.add(xU);
        }
    }

    public final float bnY() {
        return this.bTg.getValue();
    }
}

