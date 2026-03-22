/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bup
 */
public class bup_0
extends eyv_0 {
    private static final ayv_2 jpd = new ayv_2(new buq_0());

    public static bup_0 dIT() {
        try {
            return (bup_0)jpd.borrowObject();
        }
        catch (Exception exception) {
            por.error((Object)("Erreur lors de la sortie d'un " + bup_0.class.getName() + " du pool"), (Throwable)exception);
            return new bup_0();
        }
    }

    protected bup_0() {
    }

    @Override
    public void a(tl_1 tl_12) {
    }

    @Override
    public void b(tl_1 tl_12) {
        throw new UnsupportedOperationException("Le client ne s\u00e9rialise pas les brocantes");
    }

    public long Xi() {
        return this.flK();
    }

    @Override
    public void aZp() {
        try {
            jpd.returnObject(this);
        }
        catch (Exception exception) {
            por.error((Object)("Erreur lors du retour d'un " + bup_0.class.getName() + " au pool"), (Throwable)exception);
            this.aVH();
        }
    }
}

