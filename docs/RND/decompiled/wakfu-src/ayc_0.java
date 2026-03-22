/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

/*
 * Renamed from aYc
 */
public class ayc_0
implements afl {
    private static final Logger hxs = Logger.getLogger(ayc_0.class);

    public void a(WL wL) {
        aqb_1.bGD().a(new alh_0(), alh_02 -> {
            int n = alh_02.d();
            eym eym2 = eym.OR(n);
            if (eym2 == null) {
                hxs.error((Object)("Tentative d'initialiser une breed inconnue " + n));
                return;
            }
            eym2.a(ayc_0.a(alh_02));
            bft_2.dgp().di(eym2.aWP(), alh_02.ckw());
        });
        aqb_1.bGD().a(new aLi(), aLi2 -> {
            int n = aLi2.d();
            bft_2.dgp().a(new bfr_2(n, 0, aLi2.ckS().cla(), aLi2.ckS().ckZ(), this.a(n, aLi2.ckQ(), aLi2.ckU())));
            bft_2.dgp().a(new bfr_2(n, 1, aLi2.ckT().cla(), aLi2.ckT().ckZ(), this.a(n, aLi2.ckR(), aLi2.ckV())));
        });
        bfq_2.dge().dgh();
        wL.b(this);
    }

    private Map<Short, bfs_2> a(int n, alj_0[] alj_0Array, HashMap<Short, Byte> hashMap) {
        Map<Short, List<alj_0>> map = Arrays.stream(alj_0Array).collect(Collectors.groupingBy(alj_0::ckY));
        HashMap<Short, bfs_2> hashMap2 = new HashMap<Short, bfs_2>();
        for (Map.Entry<Short, List<alj_0>> entry : map.entrySet()) {
            short s = entry.getKey();
            List<alj_0> list = entry.getValue();
            bfu_2 bfu_22 = new bfu_2();
            block12: for (alj_0 alj_02 : list) {
                arx_1 arx_12 = arx_1.tP(alj_02.ckW());
                switch (arx_12) {
                    case cTs: {
                        bfu_22.BQ(ayc_0.a(alj_02));
                        bfu_22.fx(alj_02.ckX() == 1);
                        continue block12;
                    }
                    case cTt: {
                        bfu_22.BR(ayc_0.a(alj_02));
                        bfu_22.fy(alj_02.ckX() == 1);
                        continue block12;
                    }
                    case cTz: {
                        bfu_22.BS(ayc_0.a(alj_02));
                        bfu_22.fz(alj_02.ckX() == 1);
                        continue block12;
                    }
                    case cTB: {
                        bfu_22.BT(ayc_0.a(alj_02));
                        continue block12;
                    }
                    case cTC: {
                        bfu_22.BU(ayc_0.a(alj_02));
                        continue block12;
                    }
                    case cTD: {
                        bfu_22.BV(ayc_0.a(alj_02));
                        continue block12;
                    }
                    case cTE: {
                        bfu_22.BW(ayc_0.a(alj_02));
                        continue block12;
                    }
                    case cTF: {
                        bfu_22.BX(ayc_0.a(alj_02));
                        continue block12;
                    }
                    case cTG: {
                        bfu_22.BY(ayc_0.a(alj_02));
                        continue block12;
                    }
                }
                hxs.warn((Object)("Wrong data : default color for part " + arx_12.name() + " id=" + alj_02.ckW() + " defined for breed=" + n + " clothIndex=" + s));
            }
            hashMap2.put(s, new bfs_2(hashMap.get(s), bfu_22));
        }
        return hashMap2;
    }

    private static int a(alj_0 alj_02) {
        return axb_2.x(alj_02.aIU(), alj_02.aIV(), alj_02.aIW(), alj_02.aIX());
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.ground", new Object[0]);
    }

    private static eyo a(alh_0 alh_02) {
        int n = alh_02.ckJ();
        float[] fArray = alh_02.ckL();
        byte[] byArray = alh_02.ckK();
        short[] sArray = alh_02.ckM();
        eyo eyo2 = new eyo(n, fArray, byArray, sArray);
        eyo2.a(exx_2.rGi, alh_02.ckx());
        eyo2.a(exx_2.rGj, alh_02.cky());
        eyo2.a(exx_2.rGk, alh_02.ckz());
        eyo2.a(exx_2.rGI, alh_02.ckB());
        eyo2.a(exx_2.rGo, alh_02.ckC());
        eyo2.a(exx_2.rGp, alh_02.ckD());
        eyo2.a(exx_2.rGJ, alh_02.ckE());
        eyo2.a(exx_2.rGm, alh_02.ckF());
        eyo2.a(exx_2.rGn, alh_02.ckG());
        eyo2.a(exx_2.rGH, alh_02.ckH());
        eyo2.a(exx_2.rGl, alh_02.ckA());
        eyo2.a(exx_2.rGs, alh_02.ckI());
        eyo2.J(alh_02.ckN());
        eyo2.o(alh_02.ckO());
        eyo2.do(alh_02.ckP());
        return eyo2;
    }
}

