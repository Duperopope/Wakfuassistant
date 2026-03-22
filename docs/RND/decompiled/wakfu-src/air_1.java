/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aiR
 */
public final class air_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] czX = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("equipmentFileId", null, aff_2.dJz, false)};

    public air_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "applyEquipment";
    }

    @Override
    public String getDescription() {
        return "Apply equipment parts from a file to a mobile";
    }

    @Override
    public afe_1[] bBg() {
        return czX;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        adj_0 adj_02 = this.fM(l);
        if (adj_02 == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist", false);
            return;
        }
        int n2 = this.xp(1);
        adj_02.qS(n2);
    }
}

