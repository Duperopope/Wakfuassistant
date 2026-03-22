/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajQ
 */
public final class ajq_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBI = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("walkStyle", "Movement style used for WALK (see MovementStyle.java)", aff_2.dJx, false), new afe_1("runStyle", "Movement style used for RUN (see MovementStyle.java)", aff_2.dJx, true), new afe_1("isUniqueUsage", "True to remove the style after a single movement (Default = True)", aff_2.dJA, true)};

    public ajq_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMobileMovementStyle";
    }

    @Override
    public String getDescription() {
        return "Set the movement style of the mobile (see MovementStyleManager.java)";
    }

    @Override
    public afe_1[] bBg() {
        return cBI;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        if (!(zC instanceof ads_0)) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist or is not a PathMobile", false);
            return;
        }
        String string = this.xu(1);
        String string2 = n > 2 ? this.xu(2) : string;
        boolean bl = n <= 3 || this.xx(3);
        ((ads_0)zC).a(bl, aea_0.valueOf(string), aea_0.valueOf(string2));
    }
}

