/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 */
import com.google.common.base.Function;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

abstract class FC {
    public static final Function<FC, Iterable<Fy>> aBG = new FD();
    public static final Function<FC, Iterable<FC>> aBH = new FE();
    private final Set<Fy> aBI = Sets.newLinkedHashSet();

    FC() {
    }

    public boolean c(Fy fy) {
        return this.aBI.add(fy);
    }

    public Set<Fy> aLd() {
        return ImmutableSet.copyOf(this.aBI);
    }
}

