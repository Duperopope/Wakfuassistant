/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bqX
 */
public class bqx_0
extends bqq_0 {
    public static final aox_1 jbK = new brw_0(new brv_0("sp\u00e9cifie l'id du script \u00e0 executer", new aoz_1("id du script", amz_1.cJy)));
    private int egP;

    public bqx_0(int n) {
        super(n);
    }

    @Override
    public void bGy() {
        afs_1.can().hV("events/" + Integer.toString(this.egP) + ".lua");
    }

    @Override
    protected void D(ArrayList<amx_1> arrayList) {
        int n = arrayList.size();
        if (n != 1) {
            jbv.error((Object)("Nombre de param\u00e8tres invalides pour une action RunScript id=" + this.d() + " paramCount=" + n));
            return;
        }
        this.egP = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
    }

    @Override
    public aox_1 bEt() {
        return jbK;
    }
}

