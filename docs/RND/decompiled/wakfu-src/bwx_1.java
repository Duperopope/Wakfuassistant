/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWX
 */
final class bwx_1
extends bxo_2 {
    private static final Logger lvG = Logger.getLogger(bwx_1.class);
    private static final String lvH = "getBreedId";
    private static final String lvI = "Retourne l'id de la breed du personnage pass\u00e9 en param\u00e8tre";
    private static final afe_1[] lvJ = new afe_1[]{new afe_1("characterId", null, aff_2.dJw, false)};
    private static final afe_1[] lvK = new afe_1[]{new afe_1("breedId", null, aff_2.dJy, false)};

    bwx_1(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return lvJ;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return lvK;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            this.a(lvG, "CharacterInfo introuvable : " + l);
            this.cah();
            return;
        }
        this.xC(bgy2.aWP());
    }

    @Override
    public String getDescription() {
        return lvI;
    }

    @Override
    public String getName() {
        return lvH;
    }
}

