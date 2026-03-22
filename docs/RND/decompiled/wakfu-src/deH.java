/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class deH
extends afk_1 {
    deH(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "displayWideScreenBand";
    }

    @Override
    public String getDescription() {
        return "Affiche/Masque les bandes noires pour faire un aspect cin?ma";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiC;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        aIs2.cm(this.xx(0));
        if (n > 1) {
            aIs2.cs(this.xp(1));
            if (n > 2) {
                aIs2.cu(1000.0f / (float)this.xp(2));
            }
        }
    }
}

