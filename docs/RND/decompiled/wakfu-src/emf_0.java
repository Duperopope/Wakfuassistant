/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eMf
 */
public class emf_0
extends eLT<Qk<enk_0>> {
    private final fhc_0 qMp;
    private final ffV qMq;
    private final boolean qMr;

    public emf_0(fhc_0 fhc_02, ffV ffV2, ema_0 ema_02) {
        this(fhc_02, ffV2, ffV2 != null ? ffV2.cmL() : fhc_02.cmL(), ema_02);
    }

    public emf_0(fhc_0 fhc_02, ffV ffV2, short s, ema_0 ema_02) {
        super(ema_02.c(fhc_02, ffV2), 0, s, true, null, null, ema_02.fAe(), 0);
        this.qMp = fhc_02;
        this.qMq = ffV2;
        this.qMr = ema_02.fAd();
    }

    @Override
    public void Z(@NotNull ArrayList<String> arrayList) {
    }

    @Override
    public String k(@NotNull String string, @NotNull enk_0 enk_02) {
        if (this.qMr && enk_02.fAt() || !this.qMr && !enk_02.fAt()) {
            return "";
        }
        return string;
    }

    public ffV fAg() {
        return this.qMq;
    }
}

