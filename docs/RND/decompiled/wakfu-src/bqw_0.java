/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bqW
 */
public class bqw_0
extends bqq_0 {
    public static final aox_1 jbI = new brw_0(new brv_0("sp\u00e9cifie l'id de la qu\u00eate \u00e0 activer", new aoz_1("id de la qu\u00eate", amz_1.cJy)));
    private int jbJ;

    public bqw_0(int n) {
        super(n);
    }

    @Override
    public void bGy() {
        bcd_2 bcd_22 = aue_0.cVJ().cVK().dpy();
        if (bcd_22.om(this.jbJ)) {
            bcd_22.Ba(this.jbJ);
        }
    }

    @Override
    protected void D(ArrayList<amx_1> arrayList) {
        int n = arrayList.size();
        if (n != 1) {
            jbv.error((Object)("Nombre de param\u00e8tres invalides pour une action ClientEventActionRequestQuestActivation id=" + this.d() + " paramCount=" + n));
            return;
        }
        this.jbJ = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
    }

    @Override
    public aox_1 bEt() {
        return jbI;
    }
}

