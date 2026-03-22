/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from fLU
 */
public class flu_2
extends fiq_1 {
    private final String uJp;

    public flu_2(fdu_1 fdu_12, String string) {
        this.uBe = fdu_12;
        this.uJp = string;
    }

    @Override
    public fzq_0 gBy() {
        return fzq_0.tKj;
    }

    @Override
    public String toString() {
        return String.format("%s{type=%s,target=%s,text=%s}", new Object[]{this.getClass(), this.gBy(), this.gBE(), this.getText()});
    }

    @Generated
    public String getText() {
        return this.uJp;
    }
}

