/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaException
 */
import org.keplerproject.luajava.LuaException;

/*
 * Renamed from bXQ
 */
class bxq_1
implements pu_0 {
    final /* synthetic */ String lxl;
    final /* synthetic */ boolean lxm;
    final /* synthetic */ exf_2 lxn;
    final /* synthetic */ bxp_1 lxo;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bxq_1(bxp_1 bxp_12, String string, boolean bl, exf_2 exf_22) {
        this.lxo = bxp_12;
        this.lxl = string;
        this.lxm = bl;
        this.lxn = exf_22;
    }

    @Override
    public void a(pr_0 pr_02) {
        try {
            bxp_1.a(this.lxo).hZ(this.lxl);
            if (this.lxm) {
                this.lxn.b(this);
            }
        }
        catch (LuaException luaException) {
            bxp_1.lxk.error((Object)"Exception raised", (Throwable)luaException);
        }
    }
}

