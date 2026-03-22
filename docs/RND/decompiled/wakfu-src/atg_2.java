/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL2;

/*
 * Renamed from atg
 */
public final class atg_2
extends art_1 {
    public final ath_2 dbl = new ath_2();

    public atg_2() {
        this.cVz = (Matrix44)Matrix44.dAb.bSJ();
        this.cVA = (Matrix44)Matrix44.dAb.bSJ();
        this.cVz.bPx();
        this.cVA.bPx();
    }

    @Override
    public aru_2 bIm() {
        return aru_2.cVG;
    }

    @Override
    public awk_1 a(long l, String string, boolean bl) {
        return new ati_2(l, string, bl);
    }

    @Override
    public awk_1 a(long l, axc_2 axc_22, boolean bl) {
        return new ati_2(l, axc_22, bl);
    }

    @Override
    public awk_1 b(long l, int n, int n2, boolean bl) {
        return new ati_2(l, n, n2, false);
    }

    @Override
    public void a(Matrix44 matrix44) {
        if (!this.cVz.f(matrix44)) {
            this.cVz.c(matrix44);
            this.bIn();
        }
    }

    @Override
    public void b(Matrix44 matrix44) {
        if (!this.cVA.f(matrix44)) {
            this.cVA.c(matrix44);
            this.bIn();
        }
    }

    @Override
    public void a(awk_1 awk_12) {
        this.cVC = awk_12;
        if (awk_12 == null) {
            this.cVy.glBindFramebuffer(36160, 0);
        } else {
            ati_2 ati_22 = (ati_2)awk_12;
            this.cVy.glBindFramebuffer(36160, ati_22.bLc());
        }
    }

    @Override
    public void d(GL2 gL2) {
        super.d(gL2);
        this.dbl.e(gL2);
        int[] nArray = new int[1];
        gL2.glGetIntegerv(34018, nArray, 0);
        this.cVD = nArray[0];
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, int n) {
        ava_2.bMH().db(false);
        ava_2.bMH().h(this.cVy);
        this.a(Matrix44.dAe);
        this.b(Matrix44.dAe);
        this.cVy.glBegin(7);
        this.cVy.glColor4f(axb_2.vc(n), axb_2.vb(n), axb_2.va(n), axb_2.uZ(n));
        this.cVy.glVertex2f(f2, f3);
        this.cVy.glVertex2f(f2, f3 + f5);
        this.cVy.glVertex2f(f2 + f4, f3 + f5);
        this.cVy.glVertex2f(f2 + f4, f3);
        this.cVy.glEnd();
    }

    @Override
    public boolean bIr() {
        return avh_2.dhF.a(avg_2.dhg);
    }

    @Override
    public void bIn() {
        if (this.cVz.bWq() && this.cVA.bWq()) {
            this.cVB.bPx();
        } else {
            this.cVB.a(this.cVz, this.cVA);
        }
        ava_2.bMH().a(this.cVy, auy_2.dfY, this.cVB);
    }
}

