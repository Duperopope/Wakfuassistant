/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collection;
import java.util.Collections;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bjA
 */
public class bja_1
extends eyg_0<bjz_1> {
    private static final bja_1 ioO = new bja_1();
    private final aqd_1<ann_0> ioP = new aqe_1<ann_0>(new ann_0());

    public static bja_1 drJ() {
        return ioO;
    }

    private bja_1() {
        eyu.a(this);
    }

    @Nullable
    public bjz_1 bC(short s) {
        if (s <= 0) {
            return null;
        }
        return (bjz_1)this.pht.get(s);
    }

    public Collection<bjz_1> drK() {
        return Collections.unmodifiableCollection(this.pht.values());
    }

    @Override
    @Nullable
    public /* synthetic */ eyp bD(short s) {
        return this.bC(s);
    }
}

