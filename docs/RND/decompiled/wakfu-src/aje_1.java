/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aje
 */
public final class aje_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAv = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};
    private static final afe_1[] cAw = new afe_1[]{new afe_1("posX", null, aff_2.dJy, false), new afe_1("posY", null, aff_2.dJy, false), new afe_1("posZ", null, aff_2.dJy, false)};

    public aje_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getMobilePosition";
    }

    @Override
    public String getDescription() {
        return "Return the coordinates of the mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cAv;
    }

    @Override
    public afe_1[] bBh() {
        return cAw;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        if (zC == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist", false);
            this.cah();
            this.cah();
            this.cah();
            return;
        }
        this.xC(zC.bcC());
        this.xC(zC.bcD());
        this.xC((int)zC.getAltitude());
    }
}

