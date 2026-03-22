/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfM
extends afk_1 {
    dfM(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setStaticProtectorInterval";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojf;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        boz_2 boz_22;
        if (n < 4) {
            ddU.ohA.warn((Object)"On utilise setStaticProtectorInterval avec trop peu d'arguments !");
            return;
        }
        if (bTl.lnl.ctn() == -1) {
            ddU.ohA.error((Object)"On ajoute un interval de volont? au protecteur static qui n'existe pas");
            return;
        }
        boolean bl = this.xx(0);
        int n2 = this.xp(1);
        int n3 = this.xp(2);
        int n4 = this.xp(3);
        if (n4 < n3) {
            ddU.ohA.error((Object)"On ajoute un interval de volont? dont la borne max est inf?rieure ? la borne min au protecteur static !");
            return;
        }
        boz_2 boz_23 = boz_22 = bl ? boc_2.eht().IE(n2) : bod_1.ehw().IF(n2);
        if (boz_22 == null) {
            ddU.ohA.error((Object)"Impossible de retrouver la famille de ressource pour laquelle on cherche ? ajouter un interval de volont? de mdc");
            return;
        }
        abm_1 abm_12 = new abm_1(n3, n4);
        boz_22.a(abm_12);
        bTl.lnl.b(n2, abm_12);
    }
}

