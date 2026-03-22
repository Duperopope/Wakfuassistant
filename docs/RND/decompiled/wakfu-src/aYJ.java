/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2DoubleOpenHashMap
 */
import it.unimi.dsi.fastutil.ints.Int2DoubleOpenHashMap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public final class aYJ
implements afl {
    public void a(WL wL) {
        aqb_1.bGD().a(new aot_0(), aot_02 -> {
            double d3 = Arrays.stream(aot_02.cyy()).mapToDouble(aOU::cmK).sum();
            List<aYK> list = Arrays.stream(aot_02.cyy()).map(aOU2 -> new aYK(aOU2.cqk(), aOU2.azv(), aOU2.cmK() / d3)).toList();
            ArrayDeque<aYK> arrayDeque = new ArrayDeque<aYK>(list);
            Int2DoubleOpenHashMap int2DoubleOpenHashMap = new Int2DoubleOpenHashMap();
            while (!arrayDeque.isEmpty()) {
                aYK aYK2 = (aYK)arrayDeque.pop();
                if (!aYK2.cqk()) {
                    int2DoubleOpenHashMap.merge(aYK2.hxV, aYK2.hxW, Double::sum);
                    continue;
                }
                fhw fhw2 = fiJ.ssM.Wb(aYK2.cYt());
                fhw2.s(fhv2 -> arrayDeque.add(new aYK(fhv2.cqk(), fhv2.avr(), fhv2.cmK())));
            }
            int2DoubleOpenHashMap.forEach((n, d2) -> {
                bqf_1 bqf_12 = new bqf_1(n, d2 * aot_02.cmK(), aot_02.cqz(), aot_02.cqA(), aot_02.cyw(), aot_02.cyx(), !aot_02.clB().isBlank());
                bqg_1.dEw().a(bqf_12);
            });
        });
        wL.b(this);
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.worldLootLists", new Object[0]);
    }
}

