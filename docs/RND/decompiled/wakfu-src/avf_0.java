/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aVF
 */
public class avf_0
extends agb_1
implements ayz_2 {
    private ArrayList<adi_1> htn;
    private static final ayv_2 hto = new ayv_2(new avg_0());

    public static avf_0 a(int n, int n2, int n3, ArrayList<adi_1> arrayList) {
        try {
            avf_0 avf_02 = (avf_0)hto.borrowObject();
            avf_02.xO(n);
            avf_02.xP(n2);
            avf_02.xQ(n3);
            avf_02.B(arrayList);
            return avf_02;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void aZp() {
        try {
            hto.returnObject(this);
        }
        catch (Exception exception) {
            dJP.error((Object)("Exception dans le release de " + this.getClass().toString() + "(normalement impossible)"));
        }
    }

    @Override
    public void aVI() {
    }

    @Override
    public void aVH() {
        this.htn = null;
    }

    avf_0() {
        super(0, 0, 0);
    }

    @Override
    protected long cbk() {
        for (adi_1 adi_12 : this.htn) {
            aue_0.cVJ().a(adi_12);
        }
        return 0L;
    }

    @Override
    protected void caV() {
        this.aZp();
    }

    public void B(ArrayList<adi_1> arrayList) {
        this.htn = arrayList;
    }
}

