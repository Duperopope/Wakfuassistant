/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXI
 */
public final class bxi_1
extends afk_1 {
    public bxi_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getZ";
    }

    @Override
    public String getDescription() {
        return "Return list of walkable Z for a provided position (desc order)";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("worldX", "Position x", aff_2.dJy, false), new afe_1("worldY", "Position y", aff_2.dJy, false), new afe_1("worldZ", "Position z", aff_2.dJy, true)};
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("worldZ", "List of walkable Z", aff_2.dJC, true)};
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        if (n == 3) {
            int n4 = this.xp(2);
            if (n4 == Short.MIN_VALUE) {
                this.xC(n4);
            } else {
                this.xC(wa_0.w(n2, n3, (short)n4));
            }
            return;
        }
        short[] sArray = wa_0.aS(n2, n3);
        for (int i = 0; i < sArray.length; ++i) {
            this.xC(sArray[i]);
        }
    }
}

