/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bqV
 */
public class bqv_0
extends bqq_0 {
    public static final aox_1 jbG = new brw_0(new brv_0("", new aoz_1("text", amz_1.cJx)), new brv_0("avec for\u00e7age", new aoz_1("text", amz_1.cJx), new aoz_1("forced", amz_1.cJz)));
    private String bKP;
    private boolean cfs;
    private long cwe;
    private bjb_0 jbH;

    public bqv_0(int n) {
        super(n);
    }

    @Override
    public void bGy() {
        cye_1.eYk().a(aum_0.cWf().c(this.bKP, new Object[0]), this.cfs, this.cwe, this.jbH);
    }

    @Override
    protected void D(ArrayList<amx_1> arrayList) {
        this.jbH = bjb_0.kkb;
        this.cfs = false;
        this.cwe = 0L;
        int n = arrayList.size();
        if (n < 1 || n > 4) {
            jbv.error((Object)("Nombre de param\u00e8tres invalide pour une action de type PetText id=" + this.d() + " paramCount=" + n));
            return;
        }
        this.bKP = ((anh_2)arrayList.get(0)).getValue();
        if (n > 1) {
            this.cfs = ((amz_2)arrayList.get(1)).a(null, null, null, null) == 0;
        }
    }

    @Override
    public aox_1 bEt() {
        return jbG;
    }
}

