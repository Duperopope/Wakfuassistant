/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bQh
 */
public class bqh_2
extends bql_2 {
    private final List<bpt_1<?, ?>> kUp = new ArrayList();

    bqh_2(int n, bqk_2 bqk_22, @Unmodifiable List<bpt_1<?, ?>> list) {
        super(n, bqk_22);
        this.kUp.addAll(list);
    }

    @Override
    public List<bpt_1<?, ?>> ehT() {
        return this.kUp;
    }

    @Override
    public boolean aLB() {
        return true;
    }
}

