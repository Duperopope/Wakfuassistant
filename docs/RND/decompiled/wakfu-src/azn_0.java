/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from aZn
 */
public class azn_0
implements afl {
    public void a(WL wL) {
        aqb_1.bGD().a(new aml_0(), aml_02 -> {
            int[] nArray = Arrays.stream(aml_02.coL()).mapToInt(aMO::coQ).toArray();
            bxa_0 bxa_02 = new bxa_0(aml_02.d(), aml_02.blh(), aml_02.coK(), aml_02.rI(), aml_02.coNN(), aml_02.cmZ(), nArray);
            bwz_0.jAA.a(aml_02.d(), bxa_02);
        });
        wL.b(this);
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.infiniteWaves", new Object[0]);
    }
}

