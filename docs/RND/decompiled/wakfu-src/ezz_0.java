/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.ImmutableList
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ezZ
 */
public class ezz_0 {
    public static boolean a(ezy_0 ezy_02, exu_0 exu_02) {
        ewo_0 ewo_02 = ezy_02.fns();
        ArrayList<String> arrayList = ewo_02.m(ewr_0.oCK);
        for (String string : arrayList) {
            if (!string.equals(exu_02.getName())) continue;
            return true;
        }
        return false;
    }

    public static ImmutableList<vb_0> a(ezy_0 ezy_02) {
        return ezz_0.a(ezy_02, (Predicate<vb_0>)Predicates.alwaysTrue());
    }

    public static ImmutableList<vb_0> a(ezy_0 ezy_02, @NotNull Predicate<vb_0> predicate) {
        Preconditions.checkNotNull(predicate);
        ewo_0 ewo_02 = ezy_02.fns();
        boolean bl = !ewo_02.k(ewr_0.oCy);
        ArrayList<vb_0> arrayList = new ArrayList<vb_0>();
        if (bl) {
            for (vb_0 vb_02 : vb_0.values()) {
                if (!predicate.apply((Object)vb_02)) continue;
                arrayList.add(vb_02);
            }
            return ImmutableList.copyOf(arrayList);
        }
        List<Long> list = ewo_02.o(ewr_0.oCz);
        if (!list.isEmpty()) {
            for (Long l : list) {
                vb_0 vb_03 = vb_0.pS(l.intValue());
                if (!predicate.apply((Object)vb_03)) continue;
                arrayList.add(vb_03);
            }
            return ImmutableList.copyOf(arrayList);
        }
        List<Long> list2 = ewo_02.o(ewr_0.oCA);
        for (vb_0 vb_04 : vb_0.values()) {
            if (list2.contains(vb_04.d()) || !predicate.apply((Object)vb_04)) continue;
            arrayList.add(vb_04);
        }
        return ImmutableList.copyOf(arrayList);
    }
}

