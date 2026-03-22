/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Sets
 *  com.google.inject.Module
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.inject.Module;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

class FQ {
    private final FK aCl;
    private final Set<FC> aCm = Sets.newHashSet();

    public List<Set<Module>> aLu() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add(this.aI(this.c(this.aCl.aLm())));
        for (Fy fy : this.aCl.aLo()) {
            builder.add(this.aI(this.c(fy.aLb())));
        }
        return builder.build();
    }

    private Set<Module> aI(Iterable<FM> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false).map(FM.aCc).collect(Collectors.toSet());
    }

    FQ(FK fK) {
        this.aCl = fK;
    }

    private Set<FM> c(FC fC) {
        HashSet hashSet = Sets.newHashSet();
        this.a(hashSet, fC);
        return hashSet;
    }

    private void a(Set<FM> set, FC fC) {
        if (this.aCm.contains(fC)) {
            return;
        }
        if (fC instanceof FM) {
            set.add((FM)fC);
        }
        this.aCm.add(fC);
        for (Fy fy : fC.aLd()) {
            if (fy.aKZ() != FB.aBD) continue;
            this.a(set, fy.aLb());
        }
    }
}

