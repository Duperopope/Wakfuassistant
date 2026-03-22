/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bqR
 */
final class bqr_0
extends bqq_0 {
    public static final aox_1 jbx = new brw_0(new brv_0("event \u00e0 modifier", new aoz_1("id", amz_1.cJy), new aoz_1("activ\u00e9/d\u00e9sactiv\u00e9 (true/false)", amz_1.cJz)));
    private int asK;
    private boolean jby;

    bqr_0(int n) {
        super(n);
    }

    @Override
    public void bGy() {
        bql_0 bql_02 = bqm_0.jbp.Fi(this.asK);
        if (bql_02 == null) {
            jbv.error((Object)("Evenement d'id inconnnu " + this.asK));
            return;
        }
        bql_02.T(this.jby);
        bqo_0.c(bql_02);
    }

    @Override
    protected void D(ArrayList<amx_1> arrayList) {
        this.asK = 0;
        int n = arrayList.size();
        if (n != 2) {
            jbv.error((Object)("Nombre de param\u00e8tres invalide pour une action de type PetText id=" + this.d() + " paramCount=" + n));
            return;
        }
        this.asK = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
        this.jby = ((amz_2)arrayList.get(1)).a(null, null, null, null) == 0;
    }

    @Override
    public aox_1 bEt() {
        return jbx;
    }
}

