/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bqC
 */
final class bqc_1
extends bqd_1 {
    private final short @NotNull [] jav;
    private final boolean jaw;
    private final String jax;

    bqc_1(bqf_1 bqf_12) {
        super(bqf_12);
        this.jav = bqf_12.dEu();
        this.jaw = bqc_1.m(this.jav);
        this.jax = bqc_1.n(this.jav);
    }

    private static boolean m(short @NotNull [] sArray) {
        Set<Long> set = bwz_0.jAA.dNa();
        for (short s : sArray) {
            if (set.contains(s)) continue;
            return false;
        }
        return set.size() == sArray.length;
    }

    private static String n(short @NotNull [] sArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (short s : sArray) {
            stringBuilder.append(bqa_1.bJ(s));
            stringBuilder.append('\n');
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    @Override
    protected String dEn() {
        if (this.jaw) {
            return aum_0.cWf().c("encyclopedia.everywhere.except.rifts", new Object[0]);
        }
        return aum_0.cWf().c("encyclopedia.everywhere.except.zones", this.jav.length);
    }

    @Override
    protected Optional<String> dEo() {
        return Optional.of(this.jax);
    }

    @Override
    protected int aYs() {
        return 1;
    }
}

