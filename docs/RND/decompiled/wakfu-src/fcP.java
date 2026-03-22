/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Table
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.Optional;

public final class fcP {
    public static final fcP rUw = new fcP();
    private final Table<Integer, Short, azn_2> rUx = HashBasedTable.create();

    public void a(int n, short s, int n2, short s2) {
        this.rUx.put((Object)n, (Object)s, (Object)new azn_2(n2, s2));
    }

    public Optional<azn_2> E(int n, short s) {
        return Optional.ofNullable((azn_2)this.rUx.get((Object)n, (Object)s));
    }
}

