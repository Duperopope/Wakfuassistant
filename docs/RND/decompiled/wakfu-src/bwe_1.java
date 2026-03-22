/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWe
 */
class bwe_1
extends afk_1 {
    bwe_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getResourceAtCoordinates";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("x", null, aff_2.dJy, false), new afe_1("y", null, aff_2.dJy, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("resourceId", null, aff_2.dJw, false)};
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        bKV bKV2 = bLe.ecw().dQ(n2, n3);
        if (bKV2 == null) {
            this.hA(1L);
            return;
        }
        this.hA(bKV2.Sn());
    }
}

