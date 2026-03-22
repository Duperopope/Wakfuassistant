/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVx
 */
class bvx_2
extends afk_1 {
    bvx_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setState";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("elementId", null, aff_2.dJw, false), new afe_1("state", null, aff_2.dJy, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        short s = (short)this.xp(1);
        ni_1 ni_12 = bzj_2.eqi().my(l);
        if (ni_12 == null) {
            bvc_2.lrR.error((Object)("L'?l?ment interactif " + l + "n'existe pas"));
            return;
        }
        ni_12.ac(s);
        ni_12.bev();
        ni_12.aVQ();
    }
}

