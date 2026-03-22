/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Renamed from bNd
 */
public class bnd_1 {
    private bnd_1() {
    }

    public static String Dm(int n) {
        return aum_0.cWf().a(157, (long)n, new Object[0]);
    }

    public static int a(fdK fdK2, int n) {
        for (fdq_0 fdq_02 : fdK2.fUb()) {
            if (fdq_02.d() != n) continue;
            return fdq_02.cxS();
        }
        return 0;
    }

    public static int a(fdK fdK2, zu_2 zu_22) {
        int n = 0;
        for (int n2 : zu_22.ayU()) {
            fdM fdM2 = bnd_1.c(fdK2.dPN(), n2);
            if (fdM2 == null) continue;
            n += fdM2.aXY();
        }
        return n;
    }

    private static fdM c(List<fdM> list, int n) {
        for (fdM fdM2 : list) {
            if (fdM2.d() != n) continue;
            return fdM2;
        }
        return null;
    }

    public static int a(fdK fdK2, List<Integer> list) {
        return fdK2.dPN().stream().filter(fdM2 -> list.contains(fdM2.d())).map(fdM::aXY).mapToInt(Integer::intValue).sum();
    }

    public static Map<Integer, Integer> a(fdK fdK2, List<bng_2> list, List<Integer> list2) {
        return bnd_1.a(bnd_1.a(fdK2, list2), list).filter(bng_22 -> bnd_1.a(fdK2, bng_22.ayj()) > bng_22.efu().size()).collect(Collectors.toMap(bng_2::ayj, bng_22 -> bnd_1.a(bng_22, fdK2), (n, n2) -> n2));
    }

    private static int a(bng_2 bng_22, fdK fdK2) {
        return bnd_1.a(fdK2, bng_22.ayj()) - bng_22.efu().size();
    }

    public static Stream<bng_2> a(int n, List<bng_2> list) {
        return list.stream().filter(bng_22 -> bng_22.ayr() <= n);
    }
}

