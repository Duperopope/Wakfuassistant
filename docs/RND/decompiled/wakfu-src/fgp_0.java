/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from fgp
 */
public final class fgp_0
extends Enum<fgp_0>
implements aoq_1 {
    public static final /* enum */ fgp_0 sjp = new fgp_0(0, "Classique (pas de contour)", awx_2.dnC, 1);
    public static final /* enum */ fgp_0 sjq = new fgp_0(1, "Relique (Cuivre)", new awx_2(0.89f, 0.45f, 0.175f, 1.0f), 2);
    public static final /* enum */ fgp_0 sjr = new fgp_0(2, "Wakfu (Bleu Wakfu)", new awx_2(0.24f, 0.9f, 0.9f, 1.0f), 3);
    public static final /* enum */ fgp_0 sjs = new fgp_0(3, "Stasis (Violet Stasis)", new awx_2(0.5f, 0.0f, 0.9f, 0.72f), 4);
    public static final /* enum */ fgp_0 sjt = new fgp_0(4, "Event (Violet)", new awx_2(1.0f, 0.6f, 0.6f, 1.0f), 5);
    private final int sju;
    private final String sjv;
    final byte sjw;
    private final axb_2 sjx;
    private static final Comparator<fgp_0> sjy;
    private static final /* synthetic */ fgp_0[] sjz;

    public static fgp_0[] values() {
        return (fgp_0[])sjz.clone();
    }

    public static fgp_0 valueOf(String string) {
        return Enum.valueOf(fgp_0.class, string);
    }

    private fgp_0(int n2, String string2, axb_2 axb_22, int n3) {
        this.sju = n2;
        this.sjv = string2;
        this.sjx = axb_22;
        this.sjw = (byte)n3;
    }

    @Override
    public String aXA() {
        return this.toString();
    }

    @Override
    public String aXB() {
        return this.sjv;
    }

    @Override
    public String aXC() {
        return null;
    }

    public axb_2 getColor() {
        return this.sjx;
    }

    public byte fWK() {
        return this.sjw;
    }

    public static Comparator<fgp_0> dcC() {
        return sjy;
    }

    private static /* synthetic */ fgp_0[] fXb() {
        return new fgp_0[]{sjp, sjq, sjr, sjs, sjt};
    }

    static {
        sjz = fgp_0.fXb();
        sjy = new fgq_0();
    }
}

