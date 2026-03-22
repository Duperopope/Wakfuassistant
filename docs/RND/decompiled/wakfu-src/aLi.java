/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public class aLi
implements aqz_2 {
    protected int o;
    protected alj_0[] ehA;
    protected alj_0[] ehB;
    protected alk_0 ehC;
    protected alk_0 ehD;
    protected HashMap<Short, Byte> ehE;
    protected HashMap<Short, Byte> ehF;

    public int d() {
        return this.o;
    }

    public alj_0[] ckQ() {
        return this.ehA;
    }

    public alj_0[] ckR() {
        return this.ehB;
    }

    public alk_0 ckS() {
        return this.ehC;
    }

    public alk_0 ckT() {
        return this.ehD;
    }

    public HashMap<Short, Byte> ckU() {
        return this.ehE;
    }

    public HashMap<Short, Byte> ckV() {
        return this.ehF;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ehA = null;
        this.ehB = null;
        this.ehC = null;
        this.ehD = null;
        this.ehE = null;
        this.ehF = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        int n2;
        int n3;
        this.o = aqh_12.bGI();
        int n4 = aqh_12.bGI();
        this.ehA = new alj_0[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            this.ehA[n3] = new alj_0();
            this.ehA[n3].a(aqh_12);
        }
        n3 = aqh_12.bGI();
        this.ehB = new alj_0[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.ehB[n2] = new alj_0();
            this.ehB[n2].a(aqh_12);
        }
        this.ehC = new alk_0();
        this.ehC.a(aqh_12);
        this.ehD = new alk_0();
        this.ehD.a(aqh_12);
        n2 = aqh_12.bGI();
        this.ehE = new HashMap(n2);
        for (n = 0; n < n2; ++n) {
            short s = aqh_12.bGG();
            byte by = aqh_12.aTf();
            this.ehE.put(s, by);
        }
        n = aqh_12.bGI();
        this.ehF = new HashMap(n);
        for (int i = 0; i < n; ++i) {
            short s = aqh_12.bGG();
            byte by = aqh_12.aTf();
            this.ehF.put(s, by);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oAA.d();
    }
}

