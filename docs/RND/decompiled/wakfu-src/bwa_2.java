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
 * Renamed from bWA
 */
final class bwa_2
extends bwo_2 {
    private static final Logger ltP = Logger.getLogger(bwa_2.class);
    private static final afe_1[] ltQ = new afe_1[]{new afe_1("effectId", null, aff_2.dJy, false)};
    private static final afe_1[] ltR = new afe_1[]{new afe_1("hasEffect", null, aff_2.dJA, false)};
    private static final String ltS = "hasEffect";
    private static final String ltT = "Permet de savoir si le lanceur de l'action poss?de un effet d'id donn?";

    bwa_2(LuaState luaState, aUT aUT2) {
        super(luaState, aUT2);
    }

    @Override
    public String getName() {
        return ltS;
    }

    @Override
    public afe_1[] bBg() {
        return ltQ;
    }

    @Override
    public afe_1[] bBh() {
        return ltR;
    }

    @Override
    protected void ss(int n) {
        bgy bgy2 = bgg_0.dlO().ju(this.lta.caQ());
        if (bgy2 == null) {
            this.a(ltP, "CharacterInfo introuvable : " + this.lta.caQ());
            this.cah();
            return;
        }
        int n2 = this.xp(0);
        if (n == 1) {
            this.dK(bgy2.OG(n2));
        } else {
            this.a(ltP, "Nombre de parametres invalides : " + n);
            this.cah();
        }
    }

    @Override
    public String getDescription() {
        return ltT;
    }
}

