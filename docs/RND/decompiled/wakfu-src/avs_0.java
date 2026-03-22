/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVs
 */
public class avs_0
extends agb_1
implements ayz_2 {
    private String aCL;
    private static final ayv_2 hsW = new ayv_2(new avt_0());

    public static avs_0 a(int n, int n2, int n3, String string) {
        try {
            avs_0 avs_02 = (avs_0)hsW.borrowObject();
            avs_02.xO(n);
            avs_02.xP(n2);
            avs_02.xQ(n3);
            avs_02.co(string);
            return avs_02;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void aZp() {
        try {
            hsW.returnObject(this);
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
        this.aCL = null;
    }

    avs_0() {
        super(0, 0, 0);
    }

    @Override
    protected long cbk() {
        dgw.fcT().a(new dgv(dgx.okL, aum_0.cWf().c(this.aCL, new Object[0]), 3000));
        return 200L;
    }

    @Override
    protected void caV() {
        this.aZp();
    }

    public String getMessage() {
        return this.aCL;
    }

    public void co(String string) {
        this.aCL = string;
    }
}

