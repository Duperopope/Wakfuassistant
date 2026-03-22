/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVu
 */
class bvu_1
extends afk_1 {
    bvu_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setAnimation";
    }

    @Override
    public String getDescription() {
        return "Joue l'animation donn?e pour un element interactif";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("interactiveElementId", null, aff_2.dJw, false), new afe_1("animationName", null, aff_2.dJx, false), new afe_1("func", null, aff_2.dJx, true), new afe_1("params", null, aff_2.dJC, true)};
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        String string = this.xu(1);
        afk_0 afk_02 = afh_0.bxU().fR(l);
        if (afk_02 == null) {
            this.a(bvc_2.lrR, "Element ID " + l + " unknown");
            return;
        }
        afk_02.dT(string);
        if (n <= 2) {
            return;
        }
        afx_1 afx_12 = this.cai();
        String string2 = this.xu(2);
        afq_2[] afq_2Array = this.cP(3, n);
        int n2 = afx_12.a(string2, afq_2Array);
        afk_02.a(new bvv_2(this, afk_02, afx_12, n2));
    }
}

