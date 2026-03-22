/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Collection;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXw
 */
public class bxw_2
extends afk_1 {
    private static final Logger lwZ = Logger.getLogger(bxw_2.class);

    public bxw_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getFighterId";
    }

    @Override
    public String getDescription() {
        return "Return mobile ID if present on X Y or nil if no mobile is on";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("worldX", null, aff_2.dJy, false), new afe_1("worldY", null, aff_2.dJy, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        int n4 = this.cai().bha();
        bsS bsS2 = bsU.dHk().Ft(n4);
        if (bsS2 == null) {
            lwZ.error((Object)("fight inconnu " + n4));
            this.cah();
            return;
        }
        Collection collection = bsS2.dGs();
        for (bgy bgy2 : collection) {
            if (bgy2.bcC() != n2 || bgy2.bcD() != n3) continue;
            this.hA(bgy2.Sn());
            return;
        }
        this.cah();
    }
}

