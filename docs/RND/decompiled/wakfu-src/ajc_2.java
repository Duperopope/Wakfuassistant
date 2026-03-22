/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajc
 */
public final class ajc_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAr = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};
    private static final afe_1[] cAs = new afe_1[]{new afe_1("height", null, aff_2.dJy, false)};

    public ajc_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getMobileHeight";
    }

    @Override
    public String getDescription() {
        return "Return the height of the mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cAr;
    }

    @Override
    public afe_1[] bBh() {
        return cAs;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        if (zC == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist", false);
            this.cah();
            return;
        }
        this.xC(zC.aKu());
    }
}

