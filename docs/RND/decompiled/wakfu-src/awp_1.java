/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.kernel.core.maths.Matrix44;

/*
 * Renamed from awP
 */
public final class awp_1
extends awn_1 {
    private final acr_1 dnl = new acr_1();
    private final acr_1 dnm;
    private final ach_1 dnn = new ach_1();
    private final Matrix44 dno;
    private boolean cSL;

    public awp_1() {
        this.dnm = new acr_1();
        this.dno = Matrix44.bWp();
        this.bPx();
    }

    @Override
    public void bPx() {
        this.dnl.y(1.0f, 1.0f, 1.0f, 1.0f);
        this.dnm.y(0.0f, 0.0f, 0.0f, 1.0f);
        this.dnn.bPx();
        this.dnk.bPx();
        this.dno.bPx();
        this.cSL = false;
    }

    @Override
    public Matrix44 bIT() {
        this.aPc();
        return this.dnk;
    }

    @Override
    public float aIQ() {
        return this.dnm.aPY;
    }

    @Override
    public float aIR() {
        return this.dnm.aPZ;
    }

    @Override
    public float aRH() {
        return this.dnl.aPY;
    }

    @Override
    public float aRI() {
        return this.dnl.aPZ;
    }

    public void c(acr_1 acr_12) {
        this.dnm.a(acr_12);
        this.cSL = true;
    }

    @Override
    public void A(float f2, float f3, float f4) {
        this.dnm.m(f2, f3, f4);
        this.cSL = true;
    }

    public void d(acr_1 acr_12) {
        this.dnm.m(acr_12);
        this.cSL = true;
    }

    public void C(float f2, float f3, float f4) {
        this.dnm.z(f2, f3, f4, 0.0f);
        this.cSL = true;
    }

    public acr_1 bPy() {
        return new acr_1(this.dnm);
    }

    public acr_1 bPz() {
        return this.dnm;
    }

    public void a(ach_1 ach_12) {
        this.dnn.a(ach_12);
        this.cSL = true;
    }

    public void b(ach_1 ach_12) {
        this.dnn.f(ach_12);
        this.cSL = true;
    }

    public ach_1 bPA() {
        return new ach_1(this.dnn);
    }

    public ach_1 bPB() {
        return this.dnn;
    }

    public void e(acr_1 acr_12) {
        this.dnl.a(acr_12);
        this.cSL = true;
    }

    @Override
    public void B(float f2, float f3, float f4) {
        this.dnl.m(f2, f3, f4);
        this.cSL = true;
    }

    public void f(acr_1 acr_12) {
        this.dnl.m(acr_12);
        this.cSL = true;
    }

    public acr_1 bPC() {
        return new acr_1(this.dnl);
    }

    public acr_1 bPD() {
        return this.dnl;
    }

    public Matrix44 bPE() {
        return this.dno;
    }

    public void bPv() {
        this.cSL = true;
    }

    private void aPc() {
        if (!this.cSL) {
            return;
        }
        this.dnk.c(this.dnn);
        if (!this.dno.bWq()) {
            this.dnk.e(this.dno);
        }
        this.dnk.c(this.dnm);
        this.dnk.e(this.dnl);
        this.cSL = false;
    }

    public void a(awp_1 awp_12) {
        this.dnn.a(awp_12.dnn);
        this.dnl.a(awp_12.dnl);
        this.dnm.a(awp_12.dnm);
        this.dnk.c(awp_12.dnk);
        this.dno.c(awp_12.dno);
        this.cSL = awp_12.cSL;
    }
}

