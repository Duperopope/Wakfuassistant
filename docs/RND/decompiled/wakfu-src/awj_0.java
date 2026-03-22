/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWJ
 */
public class awj_0
extends agb_1
implements ayz_2 {
    private long eCJ;
    private static final ayv_2 hvC = new ayv_2(new aWK());

    public static awj_0 a(int n, int n2, int n3, long l) {
        try {
            awj_0 awj_02 = (awj_0)hvC.borrowObject();
            awj_02.xO(n);
            awj_02.xP(n2);
            awj_02.xQ(n3);
            awj_02.eCJ = l;
            return awj_02;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut sur un UpdateWalletAction : ", exception);
        }
    }

    @Override
    public void aZp() {
        try {
            hvC.returnObject(this);
        }
        catch (Exception exception) {
            dJP.error((Object)("Exception dans le release de " + this.getClass().toString() + "(normalement impossible)"));
        }
    }

    @Override
    public void aVI() {
        this.eCJ = 0L;
    }

    @Override
    public void aVH() {
    }

    awj_0() {
        super(0, 0, 0);
    }

    @Override
    protected long cbk() {
        aUQ.cWp().ts(this.eCJ);
        return 0L;
    }

    @Override
    protected void caV() {
        this.aZp();
    }
}

