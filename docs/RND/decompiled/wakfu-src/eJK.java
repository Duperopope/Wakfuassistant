/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public final class eJK
extends Enum<eJK> {
    public static final /* enum */ eJK qAn = new eJK(null);
    public static final /* enum */ eJK qAo = new eJK(fhc.snA);
    public static final /* enum */ eJK qAp = new eJK(fhc.snw);
    public static final /* enum */ eJK qAq = new eJK(null);
    public static final /* enum */ eJK qAr = new eJK(fhc.snz);
    public static final /* enum */ eJK qAs = new eJK(null);
    public static final /* enum */ eJK qAt = new eJK(fhc.snv);
    public static final /* enum */ eJK qAu = new eJK(fhc.snM);
    public static final /* enum */ eJK qAv = new eJK(fhc.snB);
    public static final /* enum */ eJK qAw = new eJK(fhc.snz);
    public static final /* enum */ eJK qAx = new eJK(fhc.snn);
    public static final /* enum */ eJK qAy = new eJK(fhc.snq);
    @Nullable
    private final fhc qAz;
    private static final /* synthetic */ eJK[] qAA;

    public static eJK[] values() {
        return (eJK[])qAA.clone();
    }

    public static eJK valueOf(String string) {
        return Enum.valueOf(eJK.class, string);
    }

    private eJK(fhc fhc2) {
        this.qAz = fhc2;
    }

    @Nullable
    public fhc fxo() {
        return this.qAz;
    }

    private static /* synthetic */ eJK[] fxp() {
        return new eJK[]{qAn, qAo, qAp, qAq, qAr, qAs, qAt, qAu, qAv, qAw, qAx, qAy};
    }

    static {
        qAA = eJK.fxp();
    }
}

