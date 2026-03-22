/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aoV
 */
public class aov_1
extends aou_1
implements Iterable<aou_1> {
    private final aou_1[] cNf;

    public aov_1(String string, aou_1 ... aou_1Array) {
        super(string);
        this.cNf = aou_1Array;
    }

    @Override
    @NotNull
    public Iterator<aou_1> iterator() {
        return new azh_1<aou_1>(this.cNf, false);
    }
}

