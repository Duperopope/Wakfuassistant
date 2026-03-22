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
 * Renamed from dfw
 */
class dfw_0
extends afk_1 {
    dfw_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeParticle";
    }

    @Override
    public String getDescription() {
        return "Enl?ve un syst?me de particule sur un ?l?ment d'interface";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiy;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        fka_1 fka_12 = (fka_1)ddU.fcI().ojL.remove(n2);
        if (fka_12 != null) {
            try {
                fka_12.setTimeToLive(n == 2 ? this.xp(1) : 100);
            }
            catch (Exception exception) {
                ddU.ohA.error((Object)("Exception lev?e dans le removeParticle(" + n2 + ")"), (Throwable)exception);
            }
        } else {
            ddU.ohA.warn((Object)("Impossible de trouver la particle " + n2 + " pour la supprimer"));
        }
    }
}

