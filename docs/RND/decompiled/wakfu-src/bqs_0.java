/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bqS
 */
public class bqs_0
extends bqq_0 {
    public static final aox_1 jbz = new brw_0(new brv_0("", new aoz_1("guideId", amz_1.cJy)));
    private int ekI;

    public bqs_0(int n) {
        super(n);
    }

    @Override
    public void bGy() {
        dae_0 dae_02 = new dae_0(18218);
        dae_02.sY(this.ekI);
        aaw_1.bUq().h(dae_02);
    }

    @Override
    protected void D(ArrayList<amx_1> arrayList) {
        int n = arrayList.size();
        if (n != 1) {
            jbv.error((Object)("Wrong parameter count for ClientEventActionLaunchGuide id=" + this.d() + " paramCount=" + n));
            return;
        }
        this.ekI = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
    }

    @Override
    public aox_1 bEt() {
        return jbz;
    }
}

