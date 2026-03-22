/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bjd
 */
public final class bjd_1
extends Enum<bjd_1> {
    public static final /* enum */ bjd_1 inb = new bjd_1("skin", arx_1.cTs, (bhJ2, n) -> bhJ2.v((int)n, true), bhJ2 -> bhJ2.dph().sC(), bhJ2 -> bhJ2.v(bft_2.dgp().c((int)bhJ2.aWP(), bhJ2.aWO(), (short)bhJ2.dlz()), true), bhJ2 -> bft_2.dgp().g(bhJ2.aWP(), bhJ2.aWO()));
    public static final /* enum */ bjd_1 inc = new bjd_1("hair", arx_1.cTt, (bhJ2, n) -> bhJ2.w((int)n, true), bhJ2 -> bhJ2.dph().sE(), bhJ2 -> bhJ2.w(bft_2.dgp().d(bhJ2.aWP(), bhJ2.aWO(), bhJ2.dlz()), true), bhJ2 -> bft_2.dgp().h(bhJ2.aWP(), bhJ2.aWO()));
    public static final /* enum */ bjd_1 ind = new bjd_1("pupil", arx_1.cTz, (bhJ2, n) -> bhJ2.x((int)n, true), bhJ2 -> bhJ2.dph().sG(), bhJ2 -> bhJ2.x(bft_2.dgp().e(bhJ2.aWP(), bhJ2.aWO(), bhJ2.dlz()), true), bhJ2 -> bft_2.dgp().dgr());
    public static final /* enum */ bjd_1 ine = new bjd_1("costumeColor1", arx_1.cTB, (bhJ2, n) -> bhJ2.a(arx_1.cTB, (int)n, true), bhJ2 -> bhJ2.dph().sI(), bhJ2 -> bhJ2.a(arx_1.cTB, bft_2.dgp().f(bhJ2.aWP(), bhJ2.aWO(), bhJ2.dlz()), true), bhJ2 -> bft_2.dgp().dgs());
    public static final /* enum */ bjd_1 inf = new bjd_1("costumeColor2", arx_1.cTC, (bhJ2, n) -> bhJ2.a(arx_1.cTC, (int)n, true), bhJ2 -> bhJ2.dph().sK(), bhJ2 -> bhJ2.a(arx_1.cTC, bft_2.dgp().g(bhJ2.aWP(), bhJ2.aWO(), bhJ2.dlz()), true), bhJ2 -> bft_2.dgp().dgt());
    public static final /* enum */ bjd_1 ing = new bjd_1("costumeColor3", arx_1.cTD, (bhJ2, n) -> bhJ2.a(arx_1.cTD, (int)n, true), bhJ2 -> bhJ2.dph().sM(), bhJ2 -> bhJ2.a(arx_1.cTD, bft_2.dgp().h(bhJ2.aWP(), bhJ2.aWO(), bhJ2.dlz()), true), bhJ2 -> bft_2.dgp().dgu());
    public static final /* enum */ bjd_1 inh = new bjd_1("costumeColor4", arx_1.cTE, (bhJ2, n) -> bhJ2.a(arx_1.cTE, (int)n, true), bhJ2 -> bhJ2.dph().sO(), bhJ2 -> bhJ2.a(arx_1.cTE, bft_2.dgp().i(bhJ2.aWP(), bhJ2.aWO(), bhJ2.dlz()), true), bhJ2 -> bft_2.dgp().dgv());
    public static final /* enum */ bjd_1 ini = new bjd_1("costumeColor5", arx_1.cTF, (bhJ2, n) -> bhJ2.a(arx_1.cTF, (int)n, true), bhJ2 -> bhJ2.dph().sQ(), bhJ2 -> bhJ2.a(arx_1.cTF, bft_2.dgp().j(bhJ2.aWP(), bhJ2.aWO(), bhJ2.dlz()), true), bhJ2 -> bft_2.dgp().dgw());
    public static final /* enum */ bjd_1 inj = new bjd_1("costumeColor6", arx_1.cTG, (bhJ2, n) -> bhJ2.a(arx_1.cTG, (int)n, true), bhJ2 -> bhJ2.dph().sS(), bhJ2 -> bhJ2.a(arx_1.cTG, bft_2.dgp().k(bhJ2.aWP(), bhJ2.aWO(), bhJ2.dlz()), true), bhJ2 -> bft_2.dgp().dgx());
    private static final bjd_1[] ink;
    private final String inl;
    private final arx_1 inm;
    private final BiConsumer<bhJ, Integer> inn;
    private final Function<bhJ, Integer> ino;
    private final Consumer<bhJ> inp;
    private final Function<bhJ, String> inq;
    private static final /* synthetic */ bjd_1[] inr;

    public static bjd_1[] values() {
        return (bjd_1[])inr.clone();
    }

    public static bjd_1 valueOf(String string) {
        return Enum.valueOf(bjd_1.class, string);
    }

    private bjd_1(String string2, arx_1 arx_12, BiConsumer<bhJ, Integer> biConsumer, Function<bhJ, Integer> function, Consumer<bhJ> consumer, Function<bhJ, String> function2) {
        this.inl = string2;
        this.inm = arx_12;
        this.inn = biConsumer;
        this.ino = function;
        this.inp = consumer;
        this.inq = function2;
    }

    public String getName() {
        return this.inl;
    }

    public arx_1 dqZ() {
        return this.inm;
    }

    public void a(bhJ bhJ2, int n) {
        this.inn.accept(bhJ2, n);
    }

    public int r(bhJ bhJ2) {
        return this.ino.apply(bhJ2);
    }

    public void s(bhJ bhJ2) {
        this.inp.accept(bhJ2);
    }

    public String t(bhJ bhJ2) {
        return this.inq.apply(bhJ2);
    }

    public static Optional<bjd_1> lL(String string) {
        for (bjd_1 bjd_12 : ink) {
            if (!bjd_12.inl.equalsIgnoreCase(string)) continue;
            return Optional.of(bjd_12);
        }
        return Optional.empty();
    }

    public static Optional<bjd_1> d(@NotNull arx_1 arx_12) {
        for (bjd_1 bjd_12 : ink) {
            if (bjd_12.inm != arx_12) continue;
            return Optional.of(bjd_12);
        }
        return Optional.empty();
    }

    private static /* synthetic */ bjd_1[] dra() {
        return new bjd_1[]{inb, inc, ind, ine, inf, ing, inh, ini, inj};
    }

    static {
        inr = bjd_1.dra();
        ink = bjd_1.values();
    }
}

