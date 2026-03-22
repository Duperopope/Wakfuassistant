/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from aPK
 */
public final class apk_0
extends Enum<apk_0> {
    public static final /* enum */ apk_0 eAq = new apk_0(1, 153, 147);
    public static final /* enum */ apk_0 eAr = new apk_0(3, 157, 151);
    public static final /* enum */ apk_0 eAs = new apk_0(17, 156, 150);
    public static final /* enum */ apk_0 eAt = new apk_0(18, 153, 147);
    public static final /* enum */ apk_0 eAu = new apk_0(22, 158, 152);
    public static final /* enum */ apk_0 eAv = new apk_0(101, 153, 147);
    public static final /* enum */ apk_0 eAw = new apk_0(102, 158, 152);
    private final int eAx;
    private final int eAy;
    private final int eAz;
    private static final /* synthetic */ apk_0[] eAA;

    public static apk_0[] values() {
        return (apk_0[])eAA.clone();
    }

    public static apk_0 valueOf(String string) {
        return Enum.valueOf(apk_0.class, string);
    }

    private apk_0(int n2, int n3, int n4) {
        this.eAx = n2;
        this.eAy = n3;
        this.eAz = n4;
    }

    public int d() {
        return this.eAx;
    }

    public int cBe() {
        return this.eAy;
    }

    public int cBf() {
        return this.eAz;
    }

    public static Optional<apk_0> mL(int n) {
        for (apk_0 apk_02 : apk_0.values()) {
            if (apk_02.eAx != n) continue;
            return Optional.of(apk_02);
        }
        return Optional.empty();
    }

    private static /* synthetic */ apk_0[] cBg() {
        return new apk_0[]{eAq, eAr, eAs, eAt, eAu, eAv, eAw};
    }

    static {
        eAA = apk_0.cBg();
    }
}

