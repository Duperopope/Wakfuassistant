/*
 * Decompiled with CFR 0.152.
 */
public class bJv
extends foG {
    private bTp klT;

    public bJv(foP foP2) {
        super(foP2);
    }

    public void Hs(int n) {
        this.a(foR.sMI, n);
    }

    public void Ht(int n) {
        this.a(foR.sMJ, n);
    }

    public void Hu(int n) {
        this.a(foR.sMK, n);
    }

    public void Hv(int n) {
        this.a(foR.sML, n);
    }

    public void Hw(int n) {
        this.a(foR.sMM, n);
    }

    public void Hx(int n) {
        this.a(foR.sMN, n);
    }

    @Override
    public boolean a(exP exP2, int n) {
        return true;
    }

    @Override
    public boolean b(exP exP2, int n) {
        return true;
    }

    @Override
    public boolean Hy(int n) {
        return false;
    }

    @Override
    public boolean Hz(int n) {
        return false;
    }

    private void a(foR foR2, int n) {
        cnF cnF2 = new cnF();
        cnF2.Ck(this.sMd.d());
        cnF2.dI(foR2.aJr());
        cnF2.Lh(n);
        aie_0.cfn();
        aie_0.cfo().etu().d(cnF2);
    }

    public bTp eaN() {
        if (this.klT == null) {
            this.klT = new bTp(this.sMd);
        }
        return this.klT;
    }
}

