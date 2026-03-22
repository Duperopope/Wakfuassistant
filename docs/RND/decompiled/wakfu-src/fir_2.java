/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from fIR
 */
class fir_2
extends fmz_1 {
    final /* synthetic */ fik_2 uCP;
    final /* synthetic */ fil_2 uCQ;
    final /* synthetic */ Optional uCR;

    fir_2(fik_2 fik_22, fil_2 fil_22, Optional optional) {
        this.uCP = fik_22;
        this.uCQ = fil_22;
        this.uCR = optional;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        fiq_2.a(this.uCP, this.uCQ, (Optional<fdu_1>)this.uCR);
        return false;
    }
}

