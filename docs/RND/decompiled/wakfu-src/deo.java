/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class deo
extends afk_1 {
    deo(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "changeCursor";
    }

    @Override
    public String getDescription() {
        return "Change le curseur de la souris.";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiA;
    }

    @Override
    public afe_1[] bBh() {
        return ddU.oiB;
    }

    @Override
    protected void ss(int n) {
        fzo_0 fzo_02;
        String string = this.xu(0);
        try {
            fzo_02 = fzo_0.valueOf(string);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            if ("SPELL".equals(string)) {
                fzo_02 = fzo_0.tHU;
            }
            this.a(ddU.ohA, "Unknown cursor type: " + string);
            fzo_02 = fzo_0.tHq;
        }
        fhn_1.gzT().bYz();
        fhn_1.gzT().a(fzo_02, true);
        String string2 = "DEFAULT";
        this.hS("DEFAULT");
    }
}

