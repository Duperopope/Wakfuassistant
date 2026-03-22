/*
 * Decompiled with CFR 0.152.
 */
public final class QB
extends Enum<QB>
implements aoq_1 {
    public static final /* enum */ QB bgj = new QB(0, "Aucune \u00e9coute");
    public static final /* enum */ QB bgk = new QB(1, "Trigger qui se d\u00e9clenche quand le porteur est le lanceur de l'effet d\u00e9clencheur");
    public static final /* enum */ QB bgl = new QB(2, "Trigger qui se d\u00e9clenche quand le porteur est la cible de l'effet d\u00e9clencheur");
    public static final /* enum */ QB bgm = new QB(3, "Trigger qui se d\u00e9clenche lorsque l'\u00e9coute survient de quelque mani\u00e8re que ce soit");
    private final byte bgn;
    private final String bgo;
    private static final /* synthetic */ QB[] bgp;

    public static QB[] values() {
        return (QB[])bgp.clone();
    }

    public static QB valueOf(String string) {
        return Enum.valueOf(QB.class, string);
    }

    private QB(byte by, String string2) {
        this.bgn = by;
        this.bgo = string2;
    }

    @Override
    public String aXA() {
        return Byte.toString(this.bgn);
    }

    @Override
    public String aXB() {
        return this.name();
    }

    @Override
    public String aXC() {
        return this.bgo;
    }

    public byte aJr() {
        return this.bgn;
    }

    public static QB K(byte by) {
        QB[] qBArray = QB.values();
        for (int i = 0; i < qBArray.length; ++i) {
            QB qB = qBArray[i];
            if (qB.bgn != by) continue;
            return qB;
        }
        return null;
    }

    private static /* synthetic */ QB[] baV() {
        return new QB[]{bgj, bgk, bgl, bgm};
    }

    static {
        bgp = QB.baV();
    }
}

