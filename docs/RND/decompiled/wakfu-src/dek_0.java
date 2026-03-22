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
 * Renamed from dek
 */
class dek_0
extends afk_1 {
    dek_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addReward";
    }

    @Override
    public String getDescription() {
        return "[DONJON SHUKRUTE] Ajoute une r?compense ? l'interface de r?compenses du donjon";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojy;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        Object object;
        String string = null;
        if (n >= 2) {
            object = this.xu(1);
            if (n == 2) {
                string = aum_0.cWf().c((String)object, new Object[0]);
            } else {
                String[] stringArray = new String[n - 2];
                for (int i = 2; i < n; ++i) {
                    String string2;
                    stringArray[i - 2] = string2 = this.xw(i);
                }
                string = aum_0.cWf().c((String)object, stringArray);
            }
        }
        object = new cyh_1(this.xp(0), string);
        cya_2.eXM().a((cyh_1)object);
    }
}

