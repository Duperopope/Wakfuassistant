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
 * Renamed from bXk
 */
class bxk_2
extends afk_1 {
    private static final Logger lww = Logger.getLogger(bxk_2.class);
    private static final String lwx = "hasState";
    private static final String lwy = "Renvoie true si le personnage dont l'id pass? en param porte l'?tat d'id et de niveau (optionnel) donn?";
    private static final afe_1[] lwz = new afe_1[]{new afe_1("characterId", null, aff_2.dJy, false), new afe_1("stateId", null, aff_2.dJy, false), new afe_1("stateLevel", null, aff_2.dJy, true)};
    private static final afe_1[] lwA = new afe_1[]{new afe_1("hasState", null, aff_2.dJA, false)};

    bxk_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return lwx;
    }

    @Override
    public afe_1[] bBg() {
        return lwz;
    }

    @Override
    public afe_1[] bBh() {
        return lwA;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            this.a(lww, "CharacterInfo introuvable : " + l);
            this.cah();
            return;
        }
        int n2 = this.xp(1);
        if (n == 2) {
            this.dK(bgy2.kW(n2));
        } else if (n == 3) {
            int n3 = this.xp(2);
            this.dK(bgy2.v(n2, n3));
        } else {
            this.a(lww, "Nombre de parametres invalides : " + n);
            this.cah();
        }
    }

    @Override
    public String getDescription() {
        return lwy;
    }
}

