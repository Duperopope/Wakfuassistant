/*
 * Decompiled with CFR 0.152.
 */
public class SE
implements RX {
    private final RX[] boU;

    public SE(RX ... rXArray) {
        this.boU = rXArray;
    }

    public boolean isValid(RT rT) {
        for (RX rX : this.boU) {
            if (rX.isValid(rT)) continue;
            return false;
        }
        return true;
    }
}

