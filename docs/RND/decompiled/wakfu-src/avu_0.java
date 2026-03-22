/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVu
 */
public class avu_0
extends agb_1
implements ayz_2 {
    private acv_0 hsX;
    private static final ayv_2 hsY = new ayv_2(new aVv());

    public static avu_0 a(int n, int n2, int n3, acv_0 acv_02) {
        try {
            avu_0 avu_02 = (avu_0)hsY.borrowObject();
            avu_02.xO(n);
            avu_02.xP(n2);
            avu_02.xQ(n3);
            avu_02.hsX = acv_02;
            return avu_02;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void aZp() {
        try {
            hsY.returnObject(this);
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
        this.hsX = null;
    }

    avu_0() {
        super(0, 0, 0);
    }

    @Override
    protected long cbk() {
        if (this.hsX != null) {
            acq_0.cge.a(this.hsX);
        }
        return 100L;
    }

    @Override
    protected void caV() {
        this.aZp();
    }
}

