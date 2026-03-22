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
 * Renamed from deG
 */
class deg_0
extends afk_1 {
    deg_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "displayTutorialMessage";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohG;
    }

    @Override
    public String getDescription() {
        return "Utilise le syst?me d'affichage popup pour afficher un message titr?";
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        if (!((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljD)) {
            return;
        }
        String string = aum_0.cWf().c(this.xu(0), new Object[0]);
        String string2 = aum_0.cWf().c(this.xu(1), new Object[0]);
        dcd dcd2 = new dcd(string, string2, biu_1.kiE);
        aaw_1.bUq().h(dcd2);
    }
}

