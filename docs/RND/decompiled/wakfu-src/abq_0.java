/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from abQ
 */
public class abq_0
extends abc_0 {
    private float aQt;
    private float ceT;
    private float ceU;
    private float ceV;
    private float ceW;
    private float ceX;
    private final String ceY;
    private float ceZ = 1.0f;
    private float bqF = 1.0f;
    private float cfa = 1.0f;
    private float cfb = 0.1f;
    private float cfc = 0.0f;

    public abq_0() {
        super(new abs_0());
        this.cdH = 128.0f;
        this.aQr = 100.0f;
        this.aQt = 300.0f;
        this.cfb = 0.25f;
        this.ceT = 40.0f;
        this.ceU = 60.0f;
        this.ceV = 0.0f;
        this.ceW = -1.5707964f;
        this.ceX = 0.31415927f;
        this.ceY = "textures/rain.tga";
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.bX(true);
        this.cdH = f2;
        this.aQr = f3 * 0.001f;
        this.aQt = f4 * 0.001f;
        this.ceT = f5;
        this.ceU = f6;
        this.ceV = f7;
        this.bto();
    }

    private void bto() {
        atg_2 atg_22 = aru_2.cVG.bIv();
        awk_1 awk_12 = awm_1.bPn().a((art_1)atg_22, -1296775008915292150L, arn_2.bIc().bIe() + this.ceY, false);
        this.cdI.a(0, awk_12);
    }

    public final void c(float f2, float f3, float f4, float f5, float f6) {
        this.ceZ = f2;
        this.bqF = f3;
        this.cfa = f4;
        this.cfb = f5;
        this.cfc = f6;
    }

    public void ce(float f2) {
        this.ceV = f2;
    }

    public final void aJ(float f2, float f3) {
        this.ceW = f2;
        this.ceX = f3;
    }

    @Override
    protected boolean bti() {
        return true;
    }

    @Override
    protected boolean btj() {
        return true;
    }

    @Override
    protected void a(abe_0 abe_02) {
        float f2 = GC.aNJ();
        float f3 = 1.0f;
        float f4 = 10.0f;
        float f5 = 1.0f + GC.G(f2 * f2 * 0.7853982f) * 9.0f;
        float f6 = GC.b(1.0f, f5);
        float f7 = (f6 - 1.0f) / 9.0f;
        float f8 = this.bUu.bsf();
        float f9 = this.bUu.bsg();
        float f10 = this.bUu.getAltitude();
        abe_02.aPY = this.cdV.bVG() + GC.aNJ() * this.cdV.bVL() + f8;
        abe_02.aPZ = this.cdV.bVI() + GC.aNJ() * this.cdV.bVM() + f9;
        abe_02.aQa = this.cdV.bVJ() + f10;
        abe_02.ceb = 0.0f;
        abe_02.cec = 0.0f;
        abe_02.ced = 0.1f * this.ceU * (1.0f + f7);
        abe_02.cee = 0.0f;
        abe_02.cef = 0.0f;
        abe_02.ceg = this.ceV;
        abe_02.cej = this.ceT * (2.0f + 2.0f * f7);
        abe_02.brL = f7 * 0.5f + 0.9f;
        abe_02.cei = this.aQt / (1.0f + f7);
        abe_02.ceh = 0.0f;
        abe_02.axp = this.ceZ;
        abe_02.axq = this.bqF;
        abe_02.axr = this.cfa;
        abe_02.ayP = this.cfb + f7 * this.cfc;
        abe_02.aAr = 0.0f;
        abe_02.aAs = 0.0f;
        abe_02.aAt = 1.0f;
        abe_02.aAu = 1.0f;
        abe_02.aQj = this.ceW + GC.b(-1.0f, 1.0f) * this.ceX;
        this.cdI.a(new abr_0(this));
    }

    @Override
    protected final void a(abe_0 abe_02, float f2) {
        abe_02.ca(f2);
    }
}

