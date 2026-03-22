/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from abN
 */
public class abn_0
extends abc_0 {
    public abn_0() {
        super(new abo_0());
        this.cdH = 1.0f;
        this.aQr = 0.0f;
    }

    public void aI(float f2, float f3) {
        this.bX(true);
        this.cdH = f2;
        this.aQr = f3 * 0.001f;
        atg_2 atg_22 = aru_2.cVG.bIv();
        awk_1 awk_12 = awm_1.bPn().a((art_1)atg_22, -1296775008915292148L, arn_2.bIc().bIe() + "textures/raindrop.tga", false);
        this.cdI.a(0, awk_12);
    }

    @Override
    protected boolean bti() {
        return false;
    }

    @Override
    protected boolean btj() {
        return true;
    }

    @Override
    protected void a(abe_0 abe_02) {
        float f2 = this.bUu.bsf();
        float f3 = this.bUu.bsg();
        float f4 = this.bUu.getAltitude();
        abe_02.aPY = f2 + GC.b(this.cdV.bVG(), this.cdV.bVF());
        abe_02.aPZ = f3 + GC.b(this.cdV.bVI(), this.cdV.bVH());
        abe_02.aQa = f4 + this.cdV.bVK();
        abe_02.cei = 0.33f;
        abe_02.ceh = 0.0f;
        abe_02.axp = 1.0f;
        abe_02.axq = 1.0f;
        abe_02.axr = 1.0f;
        abe_02.ayP = 1.0f;
        abe_02.aAr = 0.0f;
        abe_02.aAs = 0.0f;
        abe_02.aAt = 1.0f;
        abe_02.aAu = 1.0f;
        float f5 = GC.b(7.0f, 11.0f);
        abe_02.brL = f5 * 2.0f;
        abe_02.cej = f5;
    }

    @Override
    protected void a(abe_0 abe_02, float f2) {
        abe_02.ca(f2);
    }
}

