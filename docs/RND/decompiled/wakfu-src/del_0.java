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
 * Renamed from deL
 */
class del_0
extends afk_1 {
    del_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "miniMapMarker";
    }

    @Override
    public String getDescription() {
        return "Applique le marqueur de boussole sur la map et la minimap ? une position sp?cifi?e";
    }

    @Override
    public final afe_1[] bBg() {
        return ddU.oja;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public final void ss(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        int n4 = this.xp(2);
        bif_2.dYO().a((float)n2, (float)n3, (float)n4, aue_0.cVJ().cVK().aqZ(), "", (Object)this, bit_2.kgo, aid_0.dUO);
    }
}

