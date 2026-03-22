/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from bqE
 */
final class bqe_1
extends bqd_1 {
    private final short jaK;

    bqe_1(bqf_1 bqf_12, short s) {
        super(bqf_12);
        this.jaK = s;
    }

    @Override
    protected String dEn() {
        return bqa_1.bJ(this.jaK);
    }

    @Override
    protected Optional<Short> dEp() {
        return Optional.of(this.jaK);
    }

    @Override
    protected int aYs() {
        return 2;
    }
}

