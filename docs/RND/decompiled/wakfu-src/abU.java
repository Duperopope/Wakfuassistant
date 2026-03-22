/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class abU
extends abc_0 {
    private final Random cfg = new Random();
    private float aQt;
    private float cfh;
    private float bMl;
    private final float cfi;
    private final float cfj;
    private final float cfk;
    private final float cfl = 1.0f;
    private final float cfm = 1.0f;
    private final float cfn = 1.0f;
    private float cfb = 0.2f;

    public abU() {
        super(new abV());
        this.cdH = 10.0f;
        this.aQr = 0.3f;
        this.aQt = 15.0f;
        this.cfh = 1.0f;
        this.cfi = 0.5f;
        this.cfj = 0.5f;
        this.cfk = -3.0f;
    }

    public void i(float f2, float f3, float f4, float f5) {
        this.bX(true);
        this.cdH = f2;
        this.aQr = f3 * 0.001f;
        this.aQt = f4 * 0.001f;
        this.cfh = f5;
        this.bto();
    }

    public void bto() {
        String string = "textures/snow.tga";
        atg_2 atg_22 = aru_2.cVG.bIv();
        awk_1 awk_12 = awm_1.bPn().a((art_1)atg_22, -1296775008915292151L, arn_2.bIc().bIe() + "textures/snow.tga", false);
        this.cdI.a(0, awk_12);
    }

    public void cf(float f2) {
        this.bMl = f2;
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
        abe_02.aPY = this.cdV.bVG() + GC.aNJ() * this.cdV.bVL() + f2;
        abe_02.aPZ = this.cdV.bVI() + GC.aNJ() * this.cdV.bVM() + f3;
        abe_02.aQa = this.cdV.bVJ() - GC.aNJ() * ((this.cdV.bVJ() + this.cdV.bVK()) * 0.5f) + f4;
        abe_02.ceb = 0.0f;
        abe_02.cec = 0.0f;
        abe_02.ced = 0.0f;
        abe_02.cei = this.aQt;
        abe_02.ceh = 0.0f;
        abe_02.axp = 1.0f;
        abe_02.axq = 1.0f;
        abe_02.axr = 1.0f;
        abe_02.ayP = 0.75f + this.cfg.nextFloat() * 0.25f;
        abe_02.brL = abe_02.cej = this.cfh + this.cfh * GC.aNJ() * 1.5f;
        abe_02.aAr = 0.0f;
        abe_02.aAs = 0.0f;
        abe_02.aAt = 1.0f;
        abe_02.aAu = 1.0f;
        abT abT2 = (abT)abe_02;
        abT2.cfd = this.cfi + GC.aNJ() * this.cfj;
        abT2.cfe = false;
        abT2.bMl = this.bMl;
        abT2.cff = this.cfk;
    }

    @Override
    protected final void a(abe_0 abe_02, float f2) {
        abT abT2 = (abT)abe_02;
        if (abe_02.aQa <= this.bUu.getAltitude() + 0.1f) {
            abT2.cfe = true;
        }
        abT2.bMl += this.bMl;
        abe_02.ca(f2);
    }
}

