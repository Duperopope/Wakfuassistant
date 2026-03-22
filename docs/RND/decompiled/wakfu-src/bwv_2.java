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
 * Renamed from bWv
 */
final class bwv_2
extends bwo_2 {
    private static final Logger ltz = Logger.getLogger(bwv_2.class);
    private static final String ltA = "getCasterSex";
    private static final String ltB = "Permet de r?cup?rer l'id du sexe du lanceur de l'action";
    private static final afe_1[] ltC = new afe_1[]{new afe_1("sex", null, aff_2.dJy, false)};

    bwv_2(LuaState luaState, aUT aUT2) {
        super(luaState, aUT2);
    }

    @Override
    public String getName() {
        return ltA;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return ltC;
    }

    @Override
    protected void ss(int n) {
        bgy bgy2 = bgg_0.dlO().ju(this.lta.caQ());
        if (bgy2 == null) {
            this.a(ltz, "CharacterInfo introuvable : " + this.lta.caQ());
            this.cah();
            return;
        }
        this.xC(bgy2.aWO());
    }

    @Override
    public String getDescription() {
        return ltB;
    }
}

