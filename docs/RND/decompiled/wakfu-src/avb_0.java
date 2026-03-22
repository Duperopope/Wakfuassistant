/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVB
 */
public class avb_0
extends agb_1
implements ayz_2 {
    private bgy htb;
    private String bKc;
    private long bUm;
    private static final ayv_2 htk = new ayv_2(new avc_0());

    public static avb_0 a(int n, int n2, int n3, bgy bgy2, String string, int n4) {
        try {
            avb_0 avb_02 = (avb_0)htk.borrowObject();
            avb_02.xO(n);
            avb_02.xP(n2);
            avb_02.xQ(n3);
            avb_02.L(bgy2);
            avb_02.setAnimation(string);
            avb_02.iE(n4);
            return avb_02;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void aZp() {
        try {
            htk.returnObject(this);
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
        this.htb = null;
        this.bKc = null;
        this.bUm = 0L;
    }

    avb_0() {
        super(0, 0, 0);
    }

    @Override
    protected long cbk() {
        this.htb.ddI().dT(this.bKc);
        return this.bUm;
    }

    @Override
    protected void caV() {
        this.aZp();
    }

    public bgy cWO() {
        return this.htb;
    }

    public void L(bgy bgy2) {
        this.htb = bgy2;
    }

    public String bkI() {
        return this.bKc;
    }

    public void setAnimation(String string) {
        this.bKc = string;
    }

    public long bYU() {
        return this.bUm;
    }

    public void iE(long l) {
        this.bUm = l;
    }
}

