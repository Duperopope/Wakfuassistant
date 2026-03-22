/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from arM
 */
public class arm_2 {
    private final fb_1 cVb;

    public arm_2(fb_1 fb_12) {
        this.cVb = fb_12;
    }

    public void e(ef_2 ef_22, ef_2 ef_23) {
        ef_23.av(!ef_22.aIK() && ef_22.aIS());
        if (ef_22.aIS()) {
            ef_23.c(this.cVb.aIM());
            ef_23.e(this.cVb.aIO());
            ef_23.d(this.cVb.aIN());
            ef_23.f(this.cVb.aIP());
        } else {
            ef_23.c(this.cVb.aIM() * ef_22.aIM() + this.cVb.aIN() * ef_22.aIO());
            ef_23.d(this.cVb.aIM() * ef_22.aIN() + this.cVb.aIN() * ef_22.aIP());
            ef_23.e(this.cVb.aIO() * ef_22.aIM() + this.cVb.aIP() * ef_22.aIO());
            ef_23.f(this.cVb.aIO() * ef_22.aIN() + this.cVb.aIP() * ef_22.aIP());
        }
        ef_23.aw(!ef_22.aIL() && ef_22.aIT());
        if (ef_22.aIT()) {
            ef_23.g(this.cVb.aIQ() + ef_22.aIQ());
            ef_23.h(this.cVb.aIR() + ef_22.aIR());
        } else {
            ef_23.g(this.cVb.aIQ() * ef_22.aIM() + this.cVb.aIR() * ef_22.aIO() + ef_22.aIQ());
            ef_23.h(this.cVb.aIQ() * ef_22.aIN() + this.cVb.aIR() * ef_22.aIP() + ef_22.aIR());
        }
        ef_23.i(ef_22.aIU() * this.cVb.aKk() + this.cVb.aKg());
        ef_23.j(ef_22.aIV() * this.cVb.aKl() + this.cVb.aKh());
        ef_23.k(ef_22.aIW() * this.cVb.aKm() + this.cVb.aKi());
        ef_23.setAlpha(ef_22.aIX() * this.cVb.aKn() + this.cVb.aKj());
    }
}

