/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from evV
 */
public final class evv_1
extends Enum<evv_1> {
    public static final /* enum */ evv_1 owY = new evv_1(0);
    public static final /* enum */ evv_1 owZ = new evv_1(2);
    public static final /* enum */ evv_1 oxa = new evv_1(3);
    public static final /* enum */ evv_1 oxb = new evv_1(5);
    public static final /* enum */ evv_1 oxc = new evv_1(6);
    public static final /* enum */ evv_1 oxd = new evv_1(7);
    public static final /* enum */ evv_1 oxe = new evv_1(8);
    public static final /* enum */ evv_1 oxf = new evv_1(9);
    public static final /* enum */ evv_1 oxg = new evv_1(10);
    public static final /* enum */ evv_1 oxh = new evv_1(11);
    public static final /* enum */ evv_1 oxi = new evv_1(12);
    public static final /* enum */ evv_1 oxj = new evv_1(13);
    public static final /* enum */ evv_1 oxk = new evv_1(14);
    public static final /* enum */ evv_1 oxl = new evv_1(15);
    public static final /* enum */ evv_1 oxm = new evv_1(17);
    public static final /* enum */ evv_1 oxn = new evv_1(20);
    public static final /* enum */ evv_1 oxo = new evv_1(21);
    public static final /* enum */ evv_1 oxp = new evv_1(22);
    public static final /* enum */ evv_1 oxq = new evv_1(23);
    public static final /* enum */ evv_1 oxr = new evv_1(24);
    public static final /* enum */ evv_1 oxs = new evv_1(25);
    public static final /* enum */ evv_1 oxt = new evv_1(26);
    public static final /* enum */ evv_1 oxu = new evv_1(26);
    public static final /* enum */ evv_1 oxv = new evv_1(26);
    public static final /* enum */ evv_1 oxw = new evv_1(26);
    public final int oxx;
    private static final /* synthetic */ evv_1[] oxy;

    public static evv_1[] values() {
        return (evv_1[])oxy.clone();
    }

    public static evv_1 valueOf(String string) {
        return Enum.valueOf(evv_1.class, string);
    }

    private evv_1(int n2) {
        this.oxx = n2;
    }

    public static evv_1 Or(int n) {
        for (evv_1 evv_12 : evv_1.values()) {
            if (evv_12.oxx != n) continue;
            return evv_12;
        }
        return owY;
    }

    public String toString() {
        return "SubscriptionRight{name=" + this.name() + ", m_id=" + this.oxx + "}";
    }

    private static /* synthetic */ evv_1[] feF() {
        return new evv_1[]{owY, owZ, oxa, oxb, oxc, oxd, oxe, oxf, oxg, oxh, oxi, oxj, oxk, oxl, oxm, oxn, oxo, oxp, oxq, oxr, oxs, oxt, oxu, oxv, oxw};
    }

    static {
        oxy = evv_1.feF();
    }
}

