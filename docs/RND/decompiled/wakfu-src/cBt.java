/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public abstract class cBt<SS extends cbc_0>
implements cbc_0 {
    private int o;
    private String p;
    private final ArrayList<cbp_0> mxy = new ArrayList();
    protected final ArrayList<SS> mxz = new ArrayList();
    protected cBt mxA;
    private float czn = -1.0f;
    private float cnK = -1.0f;

    @Override
    public boolean isValid() {
        for (int i = this.mxy.size() - 1; i >= 0; --i) {
            if (this.mxy.get(i).isValid()) continue;
            return false;
        }
        return true;
    }

    public void a(cbp_0 cbp_02) {
        this.mxy.add(cbp_02);
    }

    public void a(SS SS) {
        this.mxz.add(SS);
        SS.a(this);
    }

    public ArrayList<SS> eIn() {
        return this.mxz;
    }

    @Override
    public int d() {
        return this.o;
    }

    public void lK(int n) {
        this.o = n;
    }

    public String getName() {
        return this.p;
    }

    public void setName(String string) {
        this.p = string;
    }

    @Override
    public cBt eIo() {
        return this.mxA;
    }

    @Override
    public void a(cBt cBt2) {
        this.mxA = cBt2;
    }

    public cCz eIp() {
        cCz cCz2 = new cCz();
        this.c(cCz2);
        return cCz2;
    }

    protected void c(cCz cCz2) {
        cCz2.o = this.o;
        cCz2.mAp.addAll(this.mxy);
        cCz2.p = this.p;
    }

    protected void b(cBt cBt2) {
        cBt2.o = this.o;
        cBt2.p = this.p;
        cBt2.mxA = this.mxA;
        cBt2.czn = this.czn;
        cBt2.cnK = this.cnK;
    }

    public float bBt() {
        if (this.czn != -1.0f) {
            return this.czn;
        }
        if (this.mxA != null) {
            return this.mxA.bBt();
        }
        return 1.0f;
    }

    public void cI(float f2) {
        this.czn = f2;
    }

    public float bwE() {
        if (this.cnK != -1.0f) {
            return this.cnK;
        }
        if (this.mxA != null) {
            return this.mxA.bwE();
        }
        return -1.0f;
    }

    public void dQ(float f2) {
        this.cnK = f2;
    }

    protected boolean eIq() {
        if (this.mxA != null) {
            return this.mxA.eIq();
        }
        return false;
    }
}

