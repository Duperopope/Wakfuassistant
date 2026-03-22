/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Strings;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class baq {
    private static final Logger hyS = Logger.getLogger(baq.class);

    protected static void cZh() {
        aqb_1.bGD().a(new aoe_0(), aoe_02 -> {
            int n = aoe_02.d();
            fdK fdK2 = fdK.fTX().Un(n).Uo(aoe_02.clf()).a(eIx.qwB).Up(0).a(baq.a(aoe_02.cxH())).b(baq.a(aoe_02.cxI())).mU(aoe_02.cxF()).aX(baq.a(aoe_02.cxJ())).aY(baq.a(aoe_02.cxK(), n)).aZ(baq.a(aoe_02.cxL(), n)).i(baq.kY(aoe_02.cxG())).fUc();
            fda_0.rWI.a(fdK2);
        });
    }

    @Nullable
    private static ang_2 kY(@Nullable String string) {
        if (Strings.isNullOrEmpty((String)string)) {
            return null;
        }
        try {
            return ehu_0.rY(string);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static List<fdq_0> a(aOI[] aOIArray, int n) {
        if (aOIArray == null || aOIArray.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.stream(aOIArray).map(aOI2 -> fdq_0.fUg().Uu(aOI2.d()).Uv(aOI2.cxR()).Uw(aOI2.cxS()).bb(baq.a(aOI2.cxV(), n)).ba(baq.a(aOI2.cxU(), n)).fUj()).collect(Collectors.toList());
    }

    private static List<fdo_0> a(aoh_0[] aoh_0Array, int n) {
        if (aoh_0Array == null || aoh_0Array.length == 0) {
            return Collections.emptyList();
        }
        azz_1<fdo_0> azz_12 = new azz_1<fdo_0>(Comparator.comparingInt(fdo_0::aYs));
        for (aoh_0 aoh_02 : aoh_0Array) {
            int n2 = aoh_02.d();
            int n3 = aoh_02.azv();
            int n4 = aoh_02.cnN();
            int n5 = aoh_02.cxQ();
            if (n3 <= 0) {
                hyS.error((Object)("[DATA][STELE] Stele reward " + n2 + " from stele " + n + " uses a bad item " + n3));
                continue;
            }
            @Nullable ffV ffV2 = fgD.fXh().Ve(n3);
            if (ffV2 == null) {
                hyS.error((Object)("[DATA][STELE] Stele reward from stele " + n + " uses item " + n3 + " that doesn't exist"));
                continue;
            }
            azz_12.add(fdo_0.fUe().Uq(n2).Ur(n3).Us(n4).Ut(n5).fUf());
        }
        return azz_12;
    }

    private static List<fdM> a(aof_0[] aof_0Array) {
        if (aof_0Array == null || aof_0Array.length == 0) {
            hyS.warn((Object)"[DATA][STELE] A stele is loaded without difficulties");
            return Collections.emptyList();
        }
        return Arrays.stream(aof_0Array).map(aof_02 -> new fdM(aof_02.d(), aof_02.aXY(), aof_02.LR())).collect(Collectors.toList());
    }

    private static fdn_0 a(aog_0[] aog_0Array) {
        if (aog_0Array == null) {
            return new fdn_0(new HashMap<Integer, Integer>(), 0L);
        }
        long l = 0L;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (aog_0 aog_02 : aog_0Array) {
            l += aog_02.cxO();
            hashMap.merge(aog_02.cxM(), aog_02.cxN(), Integer::sum);
        }
        return new fdn_0(hashMap, l);
    }
}

