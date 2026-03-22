/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from bGy
 */
final class bgy_2
implements fhl {
    private final bnx_1 jVS;

    bgy_2(bnx_1 bnx_12) {
        this.jVS = bnx_12;
    }

    @Override
    public void a(ffS ffS2, Long l) {
        Optional<ffV> optional = this.jVS.egd().dnP().B(l);
        optional.ifPresent(ffV2 -> this.jVS.c((ffV)ffV2, ffS2.aJr()));
    }

    @Override
    public void b(ffS ffS2, Long l) {
        this.jVS.cB(ffS2.aJr());
    }

    @Override
    public void b(fhk fhk2) {
    }
}

