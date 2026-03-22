/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from fLq
 */
public class flq_2
extends fiq_1 {
    private final String uIo;

    public flq_2(fdu_1 fdu_12, String string) {
        this.uBe = fdu_12;
        this.uIo = string;
    }

    @Override
    public fzq_0 gBy() {
        return fzq_0.tKk;
    }

    @Override
    public String toString() {
        return String.format("%s{type=%s,target=%s,oldText=%s}", new Object[]{this.getClass(), this.gBy(), this.gBE(), this.gDw()});
    }

    @Generated
    public String gDw() {
        return this.uIo;
    }
}

