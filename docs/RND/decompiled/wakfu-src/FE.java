/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Iterables
 */
import com.google.common.base.Function;
import com.google.common.collect.Iterables;

class FE
implements Function<FC, Iterable<FC>> {
    FE() {
    }

    public Iterable<FC> a(FC fC) {
        return Iterables.transform(fC.aLd(), Fy.aBy);
    }

    public /* synthetic */ Object apply(Object object) {
        return this.a((FC)object);
    }
}

