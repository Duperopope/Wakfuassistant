/*
 * Decompiled with CFR 0.152.
 */
public class fdX
extends ffz_0<fgd_0, RL<ffV, uy_1>> {
    protected static final fdX rZC = new fdX();

    protected fdX() {
    }

    @Override
    public int a(fgd_0 fgd_02, short s, RL<ffV, uy_1> rL, short s2, ffV ffV2, qu_0 qu_02, qm_0 qm_02) {
        return -1;
    }

    @Override
    public int a(fgd_0 fgd_02, RL<ffV, uy_1> rL, ffV ffV2, qu_0 qu_02, qm_0 qm_02) {
        int n = fgd_02.beR().b(fgd_02, ffV2);
        int n2 = rL.beR().a(rL, ffV2);
        short s = fgd_02.e(ffV2);
        if (n >= 0 && n2 >= 0) {
            if (!this.a(ffV2, fgd_02)) {
                // empty if block
            }
            if (fgd_02.beR().a(fgd_02, qu_02, qm_02)) {
                if (!rL.b(ffV2)) {
                    return 1;
                }
                return 0;
            }
            try {
                this.a(ffV2, fgd_02, s);
            }
            catch (SD sD) {
                return 1;
            }
            return 1;
        }
        return 1;
    }

    public int a(fgd_0 fgd_02, RL<ffV, uy_1> rL, short s, ffV ffV2, qu_0 qu_02, qm_0 qm_02) {
        ffV ffV3 = rL.ai(s);
        if (s >= 0 && ffV3 != null && !ffV2.n(ffV3)) {
            return 1;
        }
        int n = fgd_02.beR().b(fgd_02, ffV2);
        int n2 = rL.beR().a(rL, ffV2);
        short s2 = fgd_02.e(ffV2);
        if (n < 0 || n2 < 0) {
            return 1;
        }
        if (!this.a(ffV2, fgd_02)) {
            return 1;
        }
        boolean bl = false;
        try {
            bl = s >= 0 ? (ffV3 != null ? rL.b(ffV3.LV(), ffV2.bfd()) : rL.a(ffV2, s)) : rL.b(ffV2);
        }
        catch (Exception exception) {
            sfF.trace((Object)"Impossible d'ajouter l'objet a la position donn\u00e9", (Throwable)exception);
        }
        if (bl) {
            return 0;
        }
        try {
            this.a(ffV2, fgd_02, s2);
        }
        catch (SD sD) {
            sfF.error((Object)"Impossible de remettre l'objet a sa position d'origine", (Throwable)sD);
        }
        return 1;
    }

    public static fdX fUr() {
        return rZC;
    }
}

