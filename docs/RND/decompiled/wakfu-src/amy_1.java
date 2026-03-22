/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Lists
 *  org.jetbrains.annotations.Unmodifiable
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import java.util.List;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from amY
 */
class amy_1
implements Function<Criterion, List<amz_1[]>> {
    amy_1() {
    }

    public @Unmodifiable List<amz_1[]> a(Criterion criterion) {
        return Lists.newArrayList((Object[])criterion.signatures()).stream().map(signature -> (amz_1[])Lists.newArrayList((Object[])signature.params()).stream().map(parameter -> amz_1.a(parameter.type())).toArray(amz_1[]::new)).toList();
    }

    public /* synthetic */ @Unmodifiable Object apply(Object object) {
        return this.a((Criterion)object);
    }
}

