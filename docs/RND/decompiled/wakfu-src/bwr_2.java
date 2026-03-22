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
 * Renamed from bWr
 */
final class bwr_2
extends bwo_2 {
    private static final Logger lth = Logger.getLogger(bwr_2.class);
    private static final String lti = "getCasterBreed";
    private static final String ltj = "Permet de r?cup?rer l'id de la breed du lanceur";
    private static final afe_1[] ltk = new afe_1[]{new afe_1("breedId", null, aff_2.dJy, false)};

    bwr_2(LuaState luaState, aUT aUT2) {
        super(luaState, aUT2);
    }

    @Override
    public String getName() {
        return lti;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return ltk;
    }

    @Override
    protected void ss(int n) {
        bgy bgy2 = bgg_0.dlO().ju(this.lta.caQ());
        if (bgy2 == null) {
            this.a(lth, "CharacterInfo introuvable : " + this.lta.caQ());
            this.cah();
            return;
        }
        this.xC(bgy2.aWP());
    }

    @Override
    public String getDescription() {
        return ltj;
    }
}

