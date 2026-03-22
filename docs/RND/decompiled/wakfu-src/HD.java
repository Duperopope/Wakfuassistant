/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Sets
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

class HD
implements Predicate<kh_1> {
    final /* synthetic */ JI[] aJt;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    HD(JI[] jIArray) {
        this.aJt = jIArray;
    }

    public boolean a(kh_1 kh_12) {
        return Iterables.contains((Iterable)Sets.newHashSet((Object[])this.aJt), (Object)((Object)kh_12.aPp().aPr()));
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((kh_1)object);
    }
}

