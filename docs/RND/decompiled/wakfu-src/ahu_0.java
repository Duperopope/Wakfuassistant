/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ahU
 */
class ahu_0
extends afk_1 {
    ahu_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "createBloomPostProcess";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("startDuration", null, aff_2.dJz, true), new afe_1("midDuration", null, aff_2.dJz, true), new afe_1("endDuration", null, aff_2.dJz, true), new afe_1("minValue", null, aff_2.dJz, true), new afe_1("red", null, aff_2.dJz, true), new afe_1("green", null, aff_2.dJz, true), new afe_1("blue", null, aff_2.dJz, true), new afe_1("alpha", null, aff_2.dJz, true), new afe_1("blurX", null, aff_2.dJz, true), new afe_1("blurY", null, aff_2.dJz, true)};
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
        float f5 = 0.7f;
        float f6 = 0.3f;
        float f7 = 0.3f;
        float f8 = 0.3f;
        float f9 = 1.0f;
        int n2 = 16;
        int n3 = 16;
        if (n >= 1) {
            f2 = (float)this.xq(0);
        }
        if (n >= 2) {
            f3 = (float)this.xq(1);
        }
        if (n >= 3) {
            f4 = (float)this.xq(2);
        }
        if (n >= 4) {
            f5 = (float)this.xq(3);
        }
        if (n >= 5) {
            f6 = (float)this.xq(4);
        }
        if (n >= 6) {
            f7 = (float)this.xq(5);
        }
        if (n >= 7) {
            f8 = (float)this.xq(6);
        }
        if (n >= 8) {
            f9 = (float)this.xq(7);
        }
        if (n >= 9) {
            n2 = this.xp(8);
        }
        if (n == 10) {
            n3 = this.xp(9);
        }
        this.xC(asa_1.cYY);
        throw new UnsupportedOperationException("TODO: post process Bloom");
    }
}

