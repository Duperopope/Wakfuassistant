/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aim
 */
class aim_2
extends afk_1 {
    aim_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setGlobalLightColor";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("lightId", null, aff_2.dJy, false), new afe_1("red", null, aff_2.dJz, false), new afe_1("green", null, aff_2.dJz, false), new afe_1("blue", null, aff_2.dJz, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        aaW aaW2 = aih_2.st(this.xp(0));
        if (aaW2 != null) {
            aaW2.setColor(this.xr(1), this.xr(2), this.xr(3));
        } else {
            this.a(aih_2.cyR, "La lumi?re n'existe pas");
        }
    }
}

