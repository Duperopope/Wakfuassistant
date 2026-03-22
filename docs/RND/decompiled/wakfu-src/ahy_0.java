/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ahY
 */
class ahy_0
extends afk_1 {
    ahy_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "createHeatPostProcess";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("startDuration", null, aff_2.dJz, true), new afe_1("midDuration", null, aff_2.dJz, true), new afe_1("endDuration", null, aff_2.dJz, true), new afe_1("strength", null, aff_2.dJz, true)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("effectId", null, aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        float f2 = 1000.0f;
        float f3 = 2000.0f;
        float f4 = 1000.0f;
        float f5 = 1.0f;
        if (n >= 1) {
            f2 = (float)this.xq(0);
        }
        if (n >= 2) {
            f3 = (float)this.xq(1);
        }
        if (n >= 3) {
            f4 = (float)this.xq(2);
        }
        if (n == 4) {
            f5 = (float)this.xq(3);
        }
        this.xC(asa_1.cYZ);
        throw new UnsupportedOperationException("TODO: post process Heat");
    }
}

