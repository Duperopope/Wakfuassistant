/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

class eLY
implements Qk<enk_0> {
    private final ffV qMh;

    eLY(ffV ffV2) {
        this.qMh = ffV2;
    }

    @Override
    public int bab() {
        return 0;
    }

    @Override
    public long QF() {
        return 0L;
    }

    @Override
    @NotNull
    public Iterator<enk_0> iterator() {
        return new emg_0(this.qMh.fWc());
    }

    public String toString() {
        return "ItemAllEffectsIterator{m_item=" + String.valueOf(this.qMh) + "}";
    }
}

