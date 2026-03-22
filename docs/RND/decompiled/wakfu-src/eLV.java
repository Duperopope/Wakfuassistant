/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class eLV
implements Qk<enk_0> {
    private List<enk_0> dvX;
    static final /* synthetic */ boolean qMg;

    public eLV(List<enk_0> list) {
        if (!qMg && (list == null || list.contains(null))) {
            throw new AssertionError();
        }
        this.dvX = list;
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
        return this.dvX.iterator();
    }

    static {
        qMg = !eLU.class.desiredAssertionStatus();
    }
}

