/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 */
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from awK
 */
public abstract class awk_1
extends axc_2 {
    private static final ayl_2 dmz = ayl_2.dtT;
    protected long dmA;
    protected String aCH;
    protected boolean dmB;
    protected boolean aCx;
    protected avf_2 dmC;
    protected boolean dmD;
    protected boolean dmE;
    protected final boolean dmF;
    protected boolean dmG;
    protected int dmH;
    private static final short dmI = 500;
    private short cRG;
    protected awl_1 dmJ = awl_1.dmL;

    protected awk_1(long l, String string, boolean bl) {
        this.b(l, string, bl);
        this.dmF = false;
    }

    protected awk_1(long l, axc_2 axc_22, boolean bl) {
        super(axc_22);
        this.b(l, null, bl);
        this.dmF = false;
    }

    protected awk_1(long l, int n, int n2, boolean bl) {
        super(dmz, new axj_2(n, n2, 32, null, Bv.auq));
        this.ve(0).bsI();
        this.b(l, null, false);
        this.dmF = true;
        this.dmG = bl;
    }

    public void dm(boolean bl) {
        this.dmE = bl;
    }

    public final long bPb() {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        return this.dmA;
    }

    public final String bPc() {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        return this.aCH;
    }

    public final boolean gB(String string) {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        return this.gE(string.concat(this.aCH));
    }

    public final boolean dn(boolean bl) {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        if (bl) {
            return this.gE(this.aCH);
        }
        return this.gF(this.aCH);
    }

    public final boolean bPd() {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        return this.dmB;
    }

    public final void do(boolean bl) {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        this.dmB = bl;
    }

    @Override
    public void a(int n, axj_2 axj_22) {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        super.a(n, axj_22);
        this.aCx = false;
    }

    public final boolean bPe() {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        return this.aCx && !this.cSL;
    }

    public final void bPf() {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        for (int i = 0; i < this.bQq(); ++i) {
            axj_2 axj_22 = this.ve(i);
            if (axj_22 == doA) continue;
            axj_22.bQK();
        }
    }

    public final avf_2 bPg() {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        return this.dmC;
    }

    public final void b(avf_2 avf_22) {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        this.dmC = avf_22;
    }

    public final boolean bPh() {
        return this.dmF;
    }

    public abstract boolean b(GL var1);

    public abstract void f(GL2 var1);

    public abstract void g(GL var1);

    public abstract void h(art_1 var1);

    public abstract void i(art_1 var1);

    public abstract boolean aPj();

    public abstract boolean c(GL var1);

    public float bPi() {
        float f2 = (float)(GC.mV(this.vf(0).bWx()) * GC.mV(this.vf(0).bWy()) * 4) / 1024.0f;
        if (this.dmG) {
            f2 *= 2.0f;
        }
        if (this.aPj()) {
            f2 /= 4.0f;
        }
        return f2;
    }

    public int auH() {
        int n = 0;
        if (this.dmH == 0) {
            n = 32;
        } else if (this.dmH < 256) {
            n = (int)((double)n + (32.0 - 4.0 * Math.log(this.dmH)));
        }
        n = this.bPj() < -1000 ? (n += 34) : (n += -this.bPj() * 34 / 1000);
        float f2 = this.bPi();
        n = f2 >= 1024.0f ? (n += 34) : (int)((float)n + f2 * 34.0f / 1024.0f);
        return n;
    }

    @Override
    public final void bGY() {
        super.bGY();
        this.cRG = (short)500;
    }

    public final short bPj() {
        return this.cRG;
    }

    public final void bPk() {
        if (this.bSW() == 0 && this.cRG > Short.MIN_VALUE) {
            this.cRG = (short)(this.cRG - 1);
        }
    }

    @Override
    protected void bPl() {
        super.bPl();
    }

    private void b(long l, String string, boolean bl) {
        this.dmA = l;
        this.aCH = string;
        this.dmB = false;
        this.dmC = avf_2.dhd;
        this.dmD = bl;
        this.cRG = (short)500;
    }
}

