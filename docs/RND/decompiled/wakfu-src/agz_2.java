/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aGz
 */
final class agz_2
extends agq_2 {
    private static final String dLB = "getNextActionsTargets";
    private static final String dLC = "Retourne un tableau contenant les ids des cibles des prochaines actions du groupe dont le type est l'id sont pass?s en param?tre";
    private static final afe_1[] dLD = new afe_1[]{new afe_1("actionType", null, aff_2.dJy, false), new afe_1("actionId", null, aff_2.dJy, false)};
    private static final afe_1[] dLE = new afe_1[]{new afe_1("targetId", null, aff_2.dJB, false)};

    agz_2(LuaState luaState, afw_2 afw_22) {
        super(luaState, afw_22);
    }

    @Override
    public String getName() {
        return dLB;
    }

    @Override
    public afe_1[] bBg() {
        return dLD;
    }

    @Override
    public afe_1[] bBh() {
        return dLE;
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
            this.L.pushObjectValue((Object)aft_22.Qy());
            this.L.setTable(-3);
        }
        ++this.dHR;
    }

    @Override
    public String getDescription() {
        return dLC;
    }
}

