/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aib
 */
class aib_1
extends afk_1 {
    aib_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "stopEffect";
    }

    @Override
    public String getDescription() {
        return "Arr\u00eate execution d'un effet";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("effectId", "L'id de l'effet", aff_2.dJz, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        if (n2 == asa_1.cYY || n2 == asa_1.cYZ) {
            return;
        }
        ass_1 ass_12 = ast_1.bJG().uo(n2);
        if (ass_12 != null) {
            ass_12.bX(false);
            ast_1.bJG().b(ass_12);
            ass_12.clear();
        }
    }
}

