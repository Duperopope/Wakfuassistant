/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXJ
 */
public class bxj_1
extends afk_1 {
    private static final Logger lxd = Logger.getLogger(bxj_1.class);

    public bxj_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "invokeAtLocalFightEnd";
    }

    @Override
    public String getDescription() {
        return "Invoke a method when fight end (/!\\ executed at call if no fight found)";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("func", null, aff_2.dJx, false), new afe_1("params", null, aff_2.dJC, true)};
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        afx_1 afx_12 = this.cai();
        String string = this.xu(0);
        afq_2[] afq_2Array = this.cP(1, n);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.djT()) {
            afx_12.cau();
            bsj_0 bsj_02 = bgt_02.dkZ();
            bsj_02.a(new bxk_1(this, afx_12, string, afq_2Array));
        } else {
            afx_12.a(string, afq_2Array, new afp_2[0]);
        }
    }
}

