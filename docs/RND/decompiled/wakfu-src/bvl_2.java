/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVl
 */
class bvl_2
extends afk_1 {
    bvl_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("elementId", null, aff_2.dJw, false)};
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("directionIndex", null, aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        afk_0 afk_02 = afh_0.bxU().fR(l);
        if (afk_02 != null) {
            this.xC(afk_02.bcB().dzy);
        } else {
            this.a(bvc_2.lrR, "l'element interactif d'id " + l + " n'existe pas...");
            this.cah();
        }
    }

    @Override
    public String getName() {
        return "getInteractiveElementDirection";
    }
}

