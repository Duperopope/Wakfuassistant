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
 * Renamed from bWB
 */
final class bwb_2
extends bwo_2 {
    private static final Logger ltU = Logger.getLogger(bwb_2.class);
    private static final String ltV = "hasState";
    private static final String ltW = "Permet de savoir si le lanceur de l'action poss?de un ?tat optionnellement d'un certain niveau";
    private static final afe_1[] ltX = new afe_1[]{new afe_1("stateId", null, aff_2.dJy, false), new afe_1("stateLevel", null, aff_2.dJy, true)};
    private static final afe_1[] ltY = new afe_1[]{new afe_1("hasState", null, aff_2.dJA, false)};

    bwb_2(LuaState luaState, aUT aUT2) {
        super(luaState, aUT2);
    }

    @Override
    public String getName() {
        return ltV;
    }

    @Override
    public afe_1[] bBg() {
        return ltX;
    }

    @Override
    public afe_1[] bBh() {
        return ltY;
    }

    @Override
    protected void ss(int n) {
        bgy bgy2 = bgg_0.dlO().ju(this.lta.caQ());
        if (bgy2 == null) {
            this.a(ltU, "CharacterInfo introuvable : " + this.lta.caQ());
            this.cah();
            return;
        }
        int n2 = this.xp(0);
        if (n == 1) {
            this.dK(bgy2.kW(n2));
        } else if (n == 2) {
            int n3 = this.xp(1);
            this.dK(bgy2.v(n2, n3));
        } else {
            this.a(ltU, "Nombre de parametres invalides : " + n);
            this.cah();
        }
    }

    @Override
    public String getDescription() {
        return ltW;
    }
}

