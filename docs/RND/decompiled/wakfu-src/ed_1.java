/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;

/*
 * Renamed from ED
 */
public class ed_1
extends eb_1 {
    private final int[] ayF;

    public ed_1(int ... nArray) {
        this.ayF = (int[])nArray.clone();
    }

    @Override
    public final int read() {
        return this.ayF[this.ayD++];
    }

    @Override
    public List<Integer> aII() {
        return Lists.newArrayList((Object[])Bn.b(this.ayF));
    }
}

