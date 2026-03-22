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
 * Renamed from bXv
 */
public class bxv_2
extends afk_1 {
    private static final Logger lwY = Logger.getLogger(bxv_2.class);

    public bxv_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getDistanceFromLocalPlayer";
    }

    @Override
    public String getDescription() {
        return "Return the distance between local player and given character";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("characterId", "characterId", aff_2.dJw, false)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("distance", null, aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            lwY.error((Object)("On veut recup la distance s?parant le joueur d'un personnage inexistant :" + l));
            this.cah();
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        this.xC(bgy2.aZw().A(bgt_02.aZw()));
    }
}

