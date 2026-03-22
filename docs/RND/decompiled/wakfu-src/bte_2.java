/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTE
 */
class bte_2
extends afk_1 {
    bte_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addSpellToSpellDeck";
    }

    @Override
    public String getDescription() {
        return "Add a spell on the current player's deck.";
    }

    @Override
    public afe_1[] bBg() {
        return btd_2.lqt;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        int n4 = bgt_02.djx();
        frb frb2 = new frb();
        boolean bl = frb2.a(bgt_02.Sn(), n2, n4, n3);
        if (bl) {
            cnX cnX2 = new cnX(bgt_02.Sn(), n2, n4, n3);
            aue_0.cVJ().etu().d(cnX2);
        } else {
            this.a(btd_2.dok(), "Le sort " + n2 + " ne peut pas \u00eatre ajout\u00e9 au deck (mauvais sort ou slot non d\u00e9bloqu\u00e9)");
        }
    }
}

