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
 * Renamed from dfm
 */
class dfm_0
extends afk_1 {
    dfm_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "pushStaticProtector";
    }

    @Override
    public String getDescription() {
        return "Initialise et affiche les interfaces de protecteur avec les informations d'un protecteur donn? (static)";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oje;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        if (n < 1) {
            ddU.ohA.warn((Object)"On utilise pushStaticProtector sans argument !");
            return;
        }
        int n2 = this.xp(0);
        cxe_1 cxe_12 = cxe_1.eXq();
        if (bTl.lnl.ctn() != -1) {
            ddU.ohA.warn((Object)"Attention, on push un protecteur static au-dessus d'un autre protecteur !");
        }
        bTl.lnl.Ck(n2);
        if (!aue_0.cVJ().c(cxe_12)) {
            aue_0.cVJ().a(cxe_12);
        }
    }
}

