/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

public class bDq {
    public static void C(int ... nArray) {
        Optional<fnu> optional = bbs_2.a(eva_1.owB);
        if (optional.isEmpty()) {
            return;
        }
        optional.ifPresent(fnu2 -> {
            for (int n : nArray) {
                fnu2.Xl(n);
            }
        });
    }

    public static boolean Gj(int n) {
        Optional optional = bbs_2.a(eva_1.owB);
        return optional.isPresent() && ((fnu)optional.get()).Xn(n);
    }

    public static String x(Collection<Integer> collection) {
        return collection.stream().map(n -> aum_0.cWf().a(15, (long)n.intValue(), new Object[0])).collect(Collectors.joining(", "));
    }
}

