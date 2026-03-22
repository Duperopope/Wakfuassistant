/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajk
 */
public final class ajk_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAG = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("deltaZ", "The value is added to the current deltaZ (can be negative)", aff_2.dJy, false)};

    public ajk_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "incrementMobileDeltaZ";
    }

    @Override
    public String getDescription() {
        return "Add or Subtract the value to the mobile current deltaZ. Two mobiles on the same cell will be filtered based on their deltaZ. The highest deltaZ will be at the front";
    }

    @Override
    public afe_1[] bBg() {
        return cAG;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        if (zC == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist", false);
            return;
        }
        int n2 = this.xp(1);
        zC.qR(zC.bpv() + n2);
    }
}

