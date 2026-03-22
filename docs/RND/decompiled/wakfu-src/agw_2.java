/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aGw
 */
final class agw_2
extends agq_2 {
    private static final String dLp = "getActions";
    private static final String dLq = "Retourne des infos (uid, instigatorId, targetId) sur les actions du groupe";
    private static final afe_1[] dLr = new afe_1[]{new afe_1("actionType", null, aff_2.dJy, false), new afe_1("actionId", null, aff_2.dJy, false)};
    private static final afe_1[] dLs = new afe_1[]{new afe_1("actions", null, aff_2.dJC, false)};

    agw_2(LuaState luaState, afw_2 afw_22) {
        super(luaState, afw_22);
    }

    @Override
    public String getName() {
        return dLp;
    }

    @Override
    public afe_1[] bBg() {
        return dLr;
    }

    @Override
    public afe_1[] bBh() {
        return dLs;
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        this.L.newTable();
        int n4 = 1;
        for (aft_2 aft_22 : this.dKW.caZ()) {
            if (aft_22.avZ() != n3 || aft_22.caP() != n2) continue;
            this.L.pushNumber((double)n4++);
            this.L.newTable();
            this.L.pushString("uid");
            this.L.pushNumber((double)aft_22.caO());
            this.L.setTable(-3);
            this.L.pushString("from");
            this.L.pushNumber((double)aft_22.caQ());
            this.L.setTable(-3);
            this.L.pushString("target");
            this.L.pushNumber((double)aft_22.Qy());
            this.L.setTable(-3);
            this.L.setTable(-3);
        }
        ++this.dHR;
    }

    @Override
    public String getDescription() {
        return dLq;
    }
}

