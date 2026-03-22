/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from cSf
 */
public final class csf_1
extends Enum<csf_1> {
    public static final /* enum */ csf_1 nEX = new csf_1("allOf");
    public static final /* enum */ csf_1 nEY = new csf_1("todo");
    public static final /* enum */ csf_1 nEZ = new csf_1("terminated.pl");
    public static final /* enum */ csf_1 nFa = new csf_1("achievements.hidden");
    public static final List<csf_1> nFb;
    public static final List<csf_1> nFc;
    private final String nFd;
    private static final /* synthetic */ csf_1[] nFe;

    public static csf_1[] values() {
        return (csf_1[])nFe.clone();
    }

    public static csf_1 valueOf(String string) {
        return Enum.valueOf(csf_1.class, string);
    }

    private csf_1(String string2) {
        this.nFd = string2;
    }

    public String toString() {
        return aum_0.cWf().c(this.nFd, csc_1.nEJ.eNI() ? 2 : 1);
    }

    private static /* synthetic */ csf_1[] eNS() {
        return new csf_1[]{nEX, nEY, nEZ, nFa};
    }

    static {
        nFe = csf_1.eNS();
        nFb = List.of(nEX, nEY, nEZ, nFa);
        nFc = List.of(nEX, nEY, nEZ);
    }
}

