/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class HA {
    private final JE aJl;

    public HA(JE jE) {
        this.aJl = jE;
    }

    public final HashSet<Integer> aPb() {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        List<kt_1> list = this.aJl.aPi().aPl().stream().filter(arg_0 -> HC.a(JI.aKZ).apply(arg_0)).map(arg_0 -> HC.aPd().apply(arg_0)).flatMap(jH -> StreamSupport.stream(((Iterable)HC.aPe().apply(jH)).spliterator(), false)).filter(arg_0 -> HC.a(JI.aLa).apply(arg_0)).map(arg_0 -> HC.aPf().apply(arg_0)).toList();
        for (kt_1 kt_12 : list) {
            hashSet.addAll(HA.a(kt_12));
        }
        return hashSet;
    }

    private static HashSet<Integer> a(kt_1 kt_12) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        kt_12.aPi().aPl().stream().filter(arg_0 -> HC.a(JI.aKG).apply(arg_0)).map(arg_0 -> HC.aPf().apply(arg_0)).filter(Objects::nonNull).map(km_1::aPA).collect(Collectors.toCollection(() -> hashSet));
        kt_12.aPi().aPl().stream().filter(arg_0 -> HC.a(JI.aKS).apply(arg_0)).map(arg_0 -> HC.aPf().apply(arg_0)).filter(Objects::nonNull).map(kn_1::aPA).collect(Collectors.toCollection(() -> hashSet));
        List<kt_1> list = kt_12.aPi().aPl().stream().filter(arg_0 -> HC.a(JI.aLa).apply(arg_0)).map(arg_0 -> HC.aPf().apply(arg_0)).toList();
        for (kt_1 kt_13 : list) {
            hashSet.addAll(HA.a(kt_13));
        }
        return hashSet;
    }
}

