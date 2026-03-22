/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXL
 */
public class bxl_1
extends afk_1 {
    private static final Logger lxh = Logger.getLogger(bxl_1.class);

    public bxl_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "isCellBlockedByObstacle";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("worldX", null, aff_2.dJy, false), new afe_1("worldY", null, aff_2.dJy, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("cellBlockedByObstacle", null, aff_2.dJA, false)};
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        bsS bsS2 = bsU.dHk().Ft(this.cai().bha());
        if (bsS2 == null) {
            this.a(lxh, "No fight found");
            this.cah();
            return;
        }
        rj_0 rj_02 = bsS2.bag().X(n2, n3);
        this.dK(rj_02 != null);
    }
}

