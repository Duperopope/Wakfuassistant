/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

class FK {
    private final ImmutableSet<FC> aBS;
    private final FC aBT;
    private final ImmutableList<Fy> aBU;

    FK(Set<FC> set, FC fC, Iterable<Fy> iterable) {
        this.aBT = fC;
        this.aBS = ImmutableSet.copyOf(set);
        this.aBU = ImmutableList.copyOf(iterable);
    }

    public FC aLm() {
        return this.aBT;
    }

    public ImmutableSet<FC> aLn() {
        return this.aBS;
    }

    public ImmutableList<Fy> aLo() {
        return this.aBU;
    }
}

