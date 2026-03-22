/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVx
 */
public class avx_0
extends agb_1
implements ayz_2 {
    private Iterable<bgy> hta;
    private bgy htb;
    private bgy htc;
    private static final ayv_2 htd = new ayv_2(new avy_0());

    public static avx_0 a(int n, int n2, int n3, Iterable<bgy> iterable, bgy bgy2) {
        try {
            avx_0 avx_02 = (avx_0)htd.borrowObject();
            avx_02.xO(n);
            avx_02.xP(n2);
            avx_02.xQ(n3);
            avx_02.hta = iterable;
            avx_02.htb = bgy2;
            return avx_02;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    public static avx_0 a(int n, int n2, int n3, bgy bgy2, bgy bgy3) {
        try {
            avx_0 avx_02 = (avx_0)htd.borrowObject();
            avx_02.xO(n);
            avx_02.xP(n2);
            avx_02.xQ(n3);
            avx_02.htc = bgy2;
            avx_02.htb = bgy3;
            return avx_02;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void aZp() {
        try {
            htd.returnObject(this);
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
        this.hta = null;
        this.htb = null;
        this.htc = null;
    }

    avx_0() {
        super(0, 0, 0);
    }

    @Override
    protected long cbk() {
        acd_1 acd_12 = this.htb.aZw();
        if (this.hta != null) {
            for (bgy bgy2 : this.hta) {
                avx_0.b(acd_12, bgy2);
            }
        }
        if (this.htc != null) {
            avx_0.b(acd_12, this.htc);
        }
        return 100L;
    }

    private static void b(acd_1 acd_12, bgy bgy2) {
        acd_1 acd_13 = bgy2.aZw();
        bgy2.a(acp_1.bp(acd_12.getX() - acd_13.getX(), acd_12.getY() - acd_13.getY()));
    }

    @Override
    protected void caV() {
        this.aZp();
    }
}

