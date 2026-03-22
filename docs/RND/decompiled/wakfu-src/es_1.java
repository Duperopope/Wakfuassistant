/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.function.Supplier;

/*
 * Renamed from ES
 */
public final class es_1
extends Enum<es_1> {
    public static final /* enum */ es_1 azj = new es_1(1, el_1::new);
    public static final /* enum */ es_1 azk = new es_1(2, eo_1::new);
    public static final /* enum */ es_1 azl = new es_1(3, eq_1::new);
    public static final /* enum */ es_1 azm = new es_1(4, en_1::new);
    public static final /* enum */ es_1 azn = new es_1(5, ep_1::new);
    public static final /* enum */ es_1 azo = new es_1(6, ej_1::new);
    public static final /* enum */ es_1 azp = new es_1(7, ek_1::new);
    public static final /* enum */ es_1 azq = new es_1(8, em_1::new);
    public static final /* enum */ es_1 azr = new es_1(9, ei_2::new);
    public static final /* enum */ es_1 azs = new es_1(10, er_1::new);
    private final byte azt;
    private final Supplier<? extends eh_2> azu;
    private static final /* synthetic */ es_1[] azv;

    public static es_1[] values() {
        return (es_1[])azv.clone();
    }

    public static es_1 valueOf(String string) {
        return Enum.valueOf(es_1.class, string);
    }

    private es_1(byte by, Supplier<? extends eh_2> supplier) {
        this.azt = by;
        this.azu = supplier;
    }

    public byte aJr() {
        return this.azt;
    }

    public Supplier<? extends eh_2> aJs() {
        return this.azu;
    }

    public static Optional<es_1> j(byte by) {
        es_1[] es_1Array;
        for (es_1 es_12 : es_1Array = es_1.values()) {
            if (es_12.azt != by) continue;
            return Optional.of(es_12);
        }
        return Optional.empty();
    }

    private static /* synthetic */ es_1[] aJt() {
        return new es_1[]{azj, azk, azl, azm, azn, azo, azp, azq, azr, azs};
    }

    static {
        azv = es_1.aJt();
    }
}

