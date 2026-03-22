/*
 * Decompiled with CFR 0.152.
 */
public class ePw
extends ero_0 {
    private static final aox_1 rdy = new enz_0(new eny_0("Absorbe des d\u00e9g\u00e2ts subis et les convertit en perte de Kamas", new enx_0("Kamas perdus par point de d\u00e9g\u00e2t annul\u00e9", eNA.qYC), new enx_0("% des d\u00e9g\u00e2ts absorb\u00e9s", eNA.qYC), new enx_0("Perte de Kamas maximale pour 1 source de d\u00e9g\u00e2ts", eNA.qYC), new enx_0("Perte de Kamas minimale pour 1 source de d\u00e9g\u00e2ts", eNA.qYC)));
    private float rdz;
    private int rdA;
    private int rdB;
    private int rdC;

    @Override
    public aox_1 bEt() {
        return rdy;
    }

    public ePw fEc() {
        return new ePw();
    }

    @Override
    public boolean bbA() {
        return false;
    }

    @Override
    public boolean bbB() {
        return true;
    }

    @Override
    public boolean bbC() {
        return false;
    }

    @Override
    public void E(QD qD) {
        short s = this.fHf();
        this.rdz = ((enk_0)this.bgC).x(0, s);
        this.rdA = ((enk_0)this.bgC).a(1, s, ene_0.qPu);
        this.rdB = (int)Math.floor(((enk_0)this.bgC).x(2, s) / this.rdz);
        this.rdC = ((enk_0)this.bgC).a(3, s, ene_0.qPu);
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (qD != null && bl) {
            this.H(qD);
        }
        this.mk(true);
    }

    void H(QD qD) {
        qu_0 qu_02 = qD.bbd();
        if (!(qu_02 instanceof exP)) {
            return;
        }
        exP exP2 = (exP)qu_02;
        long l = exP2.dmi();
        if (l < (long)this.rdC) {
            return;
        }
        int n = (int)Math.floor((float)l / this.rdz);
        int n2 = this.bt((float)(qD.getValue() * this.rdA) / 100.0f);
        if (n2 > this.rdB) {
            n2 = this.rdB;
        }
        if (n2 > n) {
            n2 = n;
        }
        int n3 = Math.max((int)Math.ceil((float)n2 * this.rdz), this.rdC);
        exP2.jw(n3);
        fes.a("KamaShield", fet.bS(exP2), null, fet.sJ(n3), fet.aB(exP2.aqZ(), this.aZH()));
        qD.a(1, -n2, false);
    }

    protected int bt(float f2) {
        return VJ.bt(f2);
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fEc();
    }
}

