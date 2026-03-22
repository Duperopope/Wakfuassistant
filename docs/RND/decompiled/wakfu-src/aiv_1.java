/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aiV
 */
public final class aiv_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAd = new afe_1[]{new afe_1("startX", null, aff_2.dJz, false), new afe_1("startY", null, aff_2.dJz, false), new afe_1("destX", null, aff_2.dJz, false), new afe_1("destY", null, aff_2.dJz, false)};
    private static final afe_1[] cAe = new afe_1[]{new afe_1("direction8", null, aff_2.dJy, false)};

    public aiv_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getDirection8To";
    }

    @Override
    public String getDescription() {
        return "Return the direction 8 between start and end coordinates. Return 0 on error";
    }

    @Override
    public afe_1[] bBg() {
        return cAd;
    }

    @Override
    public afe_1[] bBh() {
        return cAe;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        int n4 = this.xp(2);
        int n5 = this.xp(3);
        int n6 = n4 - n2;
        int n7 = n5 - n3;
        abi_1 abi_12 = abi_1.cB(GC.a(n6, -1, 1), GC.a(n7, -1, 1));
        if (abi_12 == null) {
            this.a(this.bBx(), "Can't find direction for coords : " + n2 + ", " + n3 + " to " + n4 + ", " + n5);
            this.xC(0);
        } else {
            this.xC(abi_12.dzy);
        }
    }
}

