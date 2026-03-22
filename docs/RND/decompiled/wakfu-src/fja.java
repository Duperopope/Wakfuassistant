/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class fja
extends Enum<fja> {
    public static final /* enum */ fja svl = new fja(0);
    public static final /* enum */ fja svm = new fja(1, exx_2.rGi, enf_0.qRR, enf_0.qRZ);
    public static final /* enum */ fja svn = new fja(2, exx_2.rGj, enf_0.qRU, enf_0.qSb);
    public static final /* enum */ fja svo = new fja(3, exx_2.rGk, enf_0.qRV, enf_0.qSd);
    public static final /* enum */ fja svp = new fja(4, exx_2.rGl, enf_0.qRW, enf_0.qSe);
    public static final /* enum */ fja svq = new fja(5, exx_2.rGw, enf_0.qQb, enf_0.qRj);
    public static final /* enum */ fja svr = new fja(6, exx_2.rGx, List.of(enf_0.qQb, enf_0.qQc), List.of(enf_0.qRj, enf_0.qRk));
    public static final /* enum */ fja svs = new fja(7, exx_2.rGx, List.of(enf_0.qQb, enf_0.qQc, enf_0.qPQ), List.of(enf_0.qRj, enf_0.qRk));
    public static final /* enum */ fja svt = new fja(8, exx_2.rGz, List.of(enf_0.qQb, enf_0.qQd), List.of(enf_0.qRj, enf_0.qRl));
    public static final /* enum */ fja svu = new fja(9, exx_2.rGz, List.of(enf_0.qQb, enf_0.qQd, enf_0.qPQ), List.of(enf_0.qRj, enf_0.qRl));
    public static final /* enum */ fja svv = new fja(10, exx_2.rGy, List.of(enf_0.qQb, enf_0.qQe), List.of(enf_0.qRj, enf_0.qRm));
    public static final /* enum */ fja svw = new fja(11, exx_2.rGy, List.of(enf_0.qQb, enf_0.qQe, enf_0.qPQ), List.of(enf_0.qRj, enf_0.qRm));
    public static final /* enum */ fja svx = new fja(12, exx_2.rGA, List.of(enf_0.qQb, enf_0.qQf), List.of(enf_0.qRj, enf_0.qRn));
    public static final /* enum */ fja svy = new fja(13, exx_2.rGA, List.of(enf_0.qQb, enf_0.qQf, enf_0.qPQ), List.of(enf_0.qRj, enf_0.qRn));
    public static final /* enum */ fja svz = new fja(14, exx_2.rGR, enf_0.qQt, enf_0.qRA);
    public static final /* enum */ fja svA = new fja(15, exx_2.rGt, enf_0.qQq, enf_0.qRx);
    public static final /* enum */ fja svB = new fja(16, exx_2.rHz, enf_0.qQk, enf_0.qRr);
    public static final /* enum */ fja svC = new fja(17, exx_2.rHA, enf_0.qQl, enf_0.qRt);
    public static final /* enum */ fja svD = new fja(18, exx_2.rHD, enf_0.qQn, enf_0.qRu);
    public static final /* enum */ fja svE = new fja(19, exx_2.rGB, enf_0.qPV, enf_0.qQY);
    public static final /* enum */ fja svF = new fja(20, exx_2.rGC, List.of(enf_0.qPV, enf_0.qPW), List.of(enf_0.qQY, enf_0.qRa));
    public static final /* enum */ fja svG = new fja(21, exx_2.rGC, List.of(enf_0.qPV, enf_0.qPW, enf_0.qPR), List.of(enf_0.qQY, enf_0.qRa));
    public static final /* enum */ fja svH = new fja(22, exx_2.rGE, List.of(enf_0.qPV, enf_0.qPY), List.of(enf_0.qQY, enf_0.qQZ));
    public static final /* enum */ fja svI = new fja(23, exx_2.rGE, List.of(enf_0.qPV, enf_0.qPY, enf_0.qPR), List.of(enf_0.qQY, enf_0.qQZ));
    public static final /* enum */ fja svJ = new fja(24, exx_2.rGD, List.of(enf_0.qPV, enf_0.qPX), List.of(enf_0.qQY, enf_0.qRb));
    public static final /* enum */ fja svK = new fja(25, exx_2.rGD, List.of(enf_0.qPV, enf_0.qPX, enf_0.qPR), List.of(enf_0.qQY, enf_0.qRb));
    public static final /* enum */ fja svL = new fja(26, exx_2.rGF, List.of(enf_0.qPV, enf_0.qPZ), List.of(enf_0.qQY, enf_0.qRc));
    public static final /* enum */ fja svM = new fja(27, exx_2.rGF, List.of(enf_0.qPV, enf_0.qPZ, enf_0.qPR), List.of(enf_0.qQY, enf_0.qRc));
    public static final /* enum */ fja svN = new fja(28, exx_2.rHs, enf_0.qQu, enf_0.qRB);
    public static final /* enum */ fja svO = new fja(29, exx_2.rGu, enf_0.qQr, enf_0.qRy);
    public static final /* enum */ fja svP = new fja(30, exx_2.rGv, enf_0.qPS, enf_0.qQV);
    public static final /* enum */ fja svQ = new fja(31, exx_2.rGo, enf_0.qQs, enf_0.qRz);
    public static final /* enum */ fja svR = new fja(32, exx_2.rHm, enf_0.qQz, enf_0.qRC);
    public static final /* enum */ fja svS = new fja(33, exx_2.rGI, enf_0.qQE, enf_0.qRH);
    public static final /* enum */ fja svT = new fja(34, exx_2.rGq, enf_0.qQB, enf_0.qRD);
    public static final /* enum */ fja svU = new fja(35, exx_2.rGn, enf_0.qQG, enf_0.qRJ);
    public static final /* enum */ fja svV = new fja(36, exx_2.rGm, enf_0.qQF, enf_0.qRI);
    public static final /* enum */ fja svW = new fja(38, exx_2.rHl, enf_0.qQH, enf_0.qRK);
    public static final /* enum */ fja svX = new fja(39, exx_2.rHQ, enf_0.qQI, enf_0.qRL);
    public static final /* enum */ fja svY = new fja(40, exx_2.rHR, enf_0.qQJ, enf_0.qRM);
    private static final Map<Integer, Map<Integer, Integer>> svZ;
    public static final Map<fja, fja> swa;
    public static final List<fja> swb;
    public static final List<fja> swc;
    public static final Map<Integer, List<Integer>> swd;
    public static final Map<Integer, List<Integer>> swe;
    public static final Set<Integer> swf;
    public static final Map<exx_2, fja> swg;
    private final int swh;
    private final exx_2 swi;
    private final int[] swj;
    private final int[] swk;
    private static final /* synthetic */ fja[] swl;

    public static fja[] values() {
        return (fja[])swl.clone();
    }

    public static fja valueOf(String string) {
        return Enum.valueOf(fja.class, string);
    }

    private fja(int n2) {
        this.swh = n2;
        this.swi = null;
        this.swj = new int[0];
        this.swk = new int[0];
    }

    private fja(int n2, exx_2 exx_22, eNg eNg2, eNg eNg3) {
        this(n2, exx_22, List.of(eNg2), List.of(eNg3));
    }

    private fja(int n2, exx_2 exx_22, List<eNg> list, List<eNg> list2) {
        int n3;
        this.swh = n2;
        this.swi = exx_22;
        this.swj = new int[list.size()];
        for (n3 = 0; n3 < list.size(); ++n3) {
            this.swj[n3] = list.get(n3).d();
        }
        this.swk = new int[list2.size()];
        for (n3 = 0; n3 < list2.size(); ++n3) {
            this.swk[n3] = list2.get(n3).d();
        }
    }

    public static fja Wp(int n) {
        for (fja fja2 : fja.values()) {
            if (fja2.swh != n) continue;
            return fja2;
        }
        return svl;
    }

    public static fja Wq(int n) {
        exx_2 exx_22 = exx_2.c((byte)n);
        for (fja fja2 : fja.values()) {
            if (fja2.swi != exx_22) continue;
            return fja2;
        }
        return svl;
    }

    @Nullable
    public static Map<Integer, Integer> Wr(int n) {
        return svZ.get(n);
    }

    @Generated
    public int d() {
        return this.swh;
    }

    @Generated
    public exx_2 gaB() {
        return this.swi;
    }

    @Generated
    public int[] gaC() {
        return this.swj;
    }

    @Generated
    public int[] gaD() {
        return this.swk;
    }

    private static /* synthetic */ fja[] gaE() {
        return new fja[]{svl, svm, svn, svo, svp, svq, svr, svs, svt, svu, svv, svw, svx, svy, svz, svA, svB, svC, svD, svE, svF, svG, svH, svI, svJ, svK, svL, svM, svN, svO, svP, svQ, svR, svS, svT, svU, svV, svW, svX, svY};
    }

    static {
        swl = fja.gaE();
        AbstractMap abstractMap = new HashMap();
        for (fja fja2 : fja.values()) {
            for (int n : fja2.swj) {
                if (!abstractMap.containsKey(n)) {
                    abstractMap.put(n, new HashMap());
                }
                ((Map)abstractMap.get(n)).put(fja2.swh, 1);
            }
            for (int n : fja2.swk) {
                if (!abstractMap.containsKey(n)) {
                    abstractMap.put(n, new HashMap());
                }
                ((Map)abstractMap.get(n)).put(fja2.swh, -1);
            }
        }
        svZ = Collections.unmodifiableMap(abstractMap);
        swa = Map.of(svr, svs, svt, svu, svv, svw, svx, svy, svF, svG, svH, svI, svJ, svK, svL, svM);
        swb = List.of(svr, svt, svv, svx);
        swc = List.of(svF, svH, svJ, svL);
        swd = Map.of(Integer.valueOf(eNd.qOZ.aJr()), List.of(Integer.valueOf(fja.svq.swh), Integer.valueOf(fja.svr.swh), Integer.valueOf(fja.svs.swh)), Integer.valueOf(eNd.qPa.aJr()), List.of(Integer.valueOf(fja.svq.swh), Integer.valueOf(fja.svv.swh), Integer.valueOf(fja.svw.swh)), Integer.valueOf(eNd.qPb.aJr()), List.of(Integer.valueOf(fja.svq.swh), Integer.valueOf(fja.svt.swh), Integer.valueOf(fja.svu.swh)), Integer.valueOf(eNd.qPc.aJr()), List.of(Integer.valueOf(fja.svq.swh), Integer.valueOf(fja.svx.swh), Integer.valueOf(fja.svy.swh)));
        swe = Map.of(Integer.valueOf(eNd.qOZ.aJr()), List.of(Integer.valueOf(fja.svE.swh), Integer.valueOf(fja.svF.swh), Integer.valueOf(fja.svG.swh)), Integer.valueOf(eNd.qPa.aJr()), List.of(Integer.valueOf(fja.svE.swh), Integer.valueOf(fja.svJ.swh), Integer.valueOf(fja.svK.swh)), Integer.valueOf(eNd.qPb.aJr()), List.of(Integer.valueOf(fja.svE.swh), Integer.valueOf(fja.svH.swh), Integer.valueOf(fja.svI.swh)), Integer.valueOf(eNd.qPc.aJr()), List.of(Integer.valueOf(fja.svE.swh), Integer.valueOf(fja.svL.swh), Integer.valueOf(fja.svM.swh)));
        swf = Stream.concat(swd.values().stream(), swe.values().stream()).flatMap(Collection::stream).collect(Collectors.toUnmodifiableSet());
        abstractMap = new EnumMap(exx_2.class);
        for (fja fja2 : fja.values()) {
            if (fja2.swi == null || abstractMap.containsKey(fja2.swi)) continue;
            abstractMap.put(fja2.swi, fja2);
        }
        swg = Collections.unmodifiableMap(abstractMap);
    }
}

