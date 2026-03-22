/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class agf
extends agb
implements agm_1 {
    private static final Logger csT = Logger.getLogger((String)"camera");
    private boolean csU = true;
    private boolean csV;
    private final agg_0 csW = new agg_0();
    private final agh_0 csX = new agh_0();
    private float aAx;
    private float aAy;
    private float aPT;
    @NotNull
    private afW csY = new afU();
    private final agg csZ = new agg();
    private agn cta = new agp();
    private final aab_2<afY> ctb = new aab_2<afY>(afY::byA);
    private final acp_1 ctc = new acp_1();

    public agf(afV afV2) {
        this(afV2, true);
    }

    public agf(afV afV2, boolean bl) {
        super(afV2);
        this.cp(bl);
        this.csW.setSpeed(2.1f);
        this.csW.cF(0.01f);
        this.csX.cF(0.01f);
        this.csW.cG(1.2f);
    }

    @Override
    public void qy(int n) {
        this.reset();
        this.si(n);
        float f2 = this.csY.getWorldX();
        float f3 = this.csY.getWorldY();
        float f4 = this.csY.getAltitude();
        this.csZ.m(f2, f3, f4);
        acb_1 acb_12 = this.cta.a(this.csM, this);
        this.csX.aU(acb_12.aPY, acb_12.aPZ);
        boolean bl = this.csX.b(n, 1.0f / this.getZoomFactor(), this.csU);
        this.byT();
        if (bl) {
            this.byH();
        } else if (!this.csZ.ctg) {
            this.byS();
        }
        if (this.byG()) {
            this.byF();
        }
    }

    public boolean byO() {
        return this.csZ.ctg;
    }

    protected final void si(int n) {
        float f2 = this.csW.getValue();
        if (f2 != this.csW.sj(n)) {
            this.byH();
        }
    }

    public void a(agj_0 agj_02) {
        this.csX.b(agj_02);
    }

    public final void byP() {
        float f2 = this.csY.getWorldX();
        float f3 = this.csY.getWorldY();
        float f4 = this.csY.getAltitude();
        float f5 = this.csM.aM(f2, f3);
        float f6 = this.csM.j(f2, f3, f4);
        this.csX.aS(f5, f6);
        this.byT();
        this.byH();
        this.csZ.ctg = false;
    }

    public final void byQ() {
        this.byP();
        this.byF();
    }

    public float byw() {
        return this.csW.aSK();
    }

    public void cy(float f2) {
        this.csW.aS(GC.b(f2, aeQ.bwP().getMinZoom(), aeQ.bwP().getMaxZoom()));
    }

    public void cz(float f2) {
        this.csW.cG(f2);
        this.byF();
    }

    @Override
    public float getZoomFactor() {
        return this.csW.getValue();
    }

    @Override
    public float bsf() {
        return this.csM.k(this.csX.bzj(), this.csX.bzk(), this.csY.getAltitude());
    }

    @Override
    public float bsg() {
        return this.csM.l(this.csX.bzj(), this.csX.bzk(), this.csY.getAltitude());
    }

    @NotNull
    public afW byR() {
        return this.csY;
    }

    public void c(@NotNull afW afW2) {
        this.csY = afW2;
        this.csZ.ctg = false;
    }

    public void a(agn agn2) {
        this.cta = agn2;
    }

    public float[] a(agV agV2) {
        return agh.ctp;
    }

    public final void a(afY afY2) {
        this.ctb.aa(afY2);
    }

    public final void b(afY afY2) {
        this.ctb.ab(afY2);
    }

    private void byS() {
        this.csZ.ctg = true;
        this.ctb.bUe();
    }

    public final void cA(float f2) {
        if (!this.csV) {
            this.cy(this.byw() - f2);
        }
    }

    public final void co(boolean bl) {
        this.csV = bl;
    }

    public void cB(float f2) {
        this.csW.setSpeed(2.1f * f2);
    }

    public void cC(float f2) {
        this.csX.setSpeed(2.1f * f2);
    }

    public void aQ(float f2, float f3) {
        this.aR(this.aAx + f2, this.aAy + f3);
    }

    public void reset() {
        this.aR(0.0f, 0.0f);
        this.aPT = 0.0f;
    }

    private void aR(float f2, float f3) {
        if (this.aAx != f2 || this.aAy != f3) {
            this.aAx = f2;
            this.aAy = f3;
            this.byH();
        }
    }

    public final void cp(boolean bl) {
        this.csU = bl;
        this.csX.setSpeed(this.csU ? 10.0f : 2.1f);
    }

    private void byT() {
        float f2 = this.csY.getWorldX();
        float f3 = this.csY.getWorldY();
        float f4 = this.csY.getAltitude();
        this.ctc.m(f2 - f3, -(f2 + f3), f4 / 4.8f);
    }

    @Override
    public acp_1 byU() {
        return this.ctc;
    }

    @Override
    public float byV() {
        return this.byB();
    }

    @Override
    public int bqG() {
        return 0;
    }

    @Override
    public float bsh() {
        return this.csX.bzj() + this.aAx;
    }

    @Override
    public float bsi() {
        return this.csX.bzk() + this.aAy;
    }

    @Override
    public float aRX() {
        return this.aPT;
    }

    public float getWorldX() {
        return this.csY.getWorldX();
    }

    public float getWorldY() {
        return this.csY.getWorldY();
    }

    public float getAltitude() {
        return this.csY.getAltitude();
    }

    public int bcC() {
        return GC.A(this.getWorldX());
    }

    public int bcD() {
        return GC.A(this.getWorldY());
    }

    public short bcE() {
        return (short)GC.A(this.getAltitude());
    }

    public void cD(float f2) {
        this.aPT = f2;
    }

    public void byW() {
        if (this.csU) {
            this.csX.setSpeed(10.0f);
            return;
        }
        this.csX.setSpeed(2.1f);
    }
}

