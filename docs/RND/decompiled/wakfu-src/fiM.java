/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.List;

class fiM
implements fhw {
    private final List<fhv> ssX;
    private final short ssY;

    fiM(fiN fiN2) {
        this.ssX = fiN2.fXW();
        this.ssY = fiN2.cyv();
    }

    @Override
    public int aVo() {
        return this.ssX.size();
    }

    @Override
    public fhv Vl(int n) {
        return this.ssX.get(n);
    }

    @Override
    public short cyv() {
        return this.ssY;
    }

    @Override
    public List<fhv> fXW() {
        return Collections.unmodifiableList(this.ssX);
    }

    public String toString() {
        return "LootListDefinition{m_loots=" + this.ssX.size() + "}";
    }
}

