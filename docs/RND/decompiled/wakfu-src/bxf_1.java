/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXF
 */
public final class bxf_1
extends afk_1 {
    public bxf_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getPlayerPetId";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("localPlayerPetId", "Local player pet mobile ID", aff_2.dJw, false)};
    }

    @Override
    protected void ss(int n) {
        bjo_0 bjo_02 = aue_0.cVJ().cVK().dpe();
        if (bjo_02 != null) {
            this.hA(bjo_02.eam().Sn());
        } else {
            this.hA(0L);
        }
    }
}

