/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZW
 */
public class bzw_2
extends cad_2 {
    private fpa lEY;

    @Override
    public void b(afb_0 afb_02) {
        bJr bJr2 = bzw_2.d(afb_02);
        if (bJr2 == null) {
            return;
        }
        this.lEY = new bzx_2(this, afb_02);
        bJr2.a(this.lEY);
        this.lEY.a(bJr2, bJr2.gfR());
    }

    @Override
    public void c(afb_0 afb_02) {
        bJr bJr2 = bzw_2.d(afb_02);
        if (bJr2 == null) {
            return;
        }
        bJr2.b(this.lEY);
        this.lEY = null;
    }

    private static bJr d(afb_0 afb_02) {
        bJK bJK2 = bJJ.kmp.dN(afb_02.bcC(), afb_02.bcD());
        if (bJK2 == null) {
            lFg.error((Object)("Aucun Territoire d\u00e9fini pour l'\u00e9l\u00e9ment " + String.valueOf(afb_02)));
            return null;
        }
        return (bJr)bJK2.doW();
    }
}

