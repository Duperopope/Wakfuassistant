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
 * Renamed from bXM
 */
public class bxm_1
extends afk_1 {
    private static final Logger lxi = Logger.getLogger(bxm_1.class);

    public bxm_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "isCellInFight";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("worldX", null, aff_2.dJy, false), new afe_1("worldY", null, aff_2.dJy, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("cellIsInFight", null, aff_2.dJA, false)};
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        bsS bsS2 = bsU.dHk().Ft(this.cai().bha());
        if (bsS2 == null) {
            this.a(lxi, "No fight found");
            this.cah();
            return;
        }
        this.dK(bsS2.bag().T(n2, n3));
    }
}

