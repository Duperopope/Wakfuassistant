/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.EnumMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public final class aZI
implements afl {
    private static final Logger hyr = Logger.getLogger(aZI.class);

    public void a(WL wL) {
        aqb_1.bGD().a(new ann_0(), ann_02 -> {
            bjz_1 bjz_12 = aZI.a(ann_02);
            bja_1.drJ().e(bjz_12);
        });
        wL.b(this);
    }

    private static bjz_1 a(ann_0 ann_02) {
        short s = (short)ann_02.d();
        bjz_1 bjz_12 = aZI.a(ann_02, s);
        aZI.a(ann_02, s, bjz_12);
        aZI.a(ann_02, bjz_12);
        aZI.c(ann_02);
        aZI.d(ann_02);
        return bjz_12;
    }

    private static bjz_1 a(ann_0 ann_02, short s) {
        int n = ann_02.csf() != 0 ? ann_02.csf() : 30000;
        EnumMap<exx_2, azx_1<Integer, Float>> enumMap = aZI.b(ann_02);
        sm_0 sm_02 = sm_0.pf(ann_02.crR());
        sm_0 sm_03 = sm_0.pf(ann_02.crS());
        fiN fiN2 = new fiN();
        for (aNr aNr2 : ann_02.csd()) {
            fiL fiL2 = new bju_2().A(aNr2.csr()).gn(aNr2.css()).Wc(aNr2.azv()).gI(aNr2.cso()).fg(aNr2.cqi()).fh(aNr2.cqj()).gJ((byte)aNr2.csp()).nv(aNr2.cqk()).ff(aNr2.csq()).ac(aNr2.cmK());
            fiN2.a(fiL2.drr());
        }
        bjz_1 bjz_12 = new bjz_1(s, ann_02.cqy(), ann_02.crI(), ann_02.cqz(), ann_02.cqA(), enumMap, ann_02.aGs(), ann_02.csk(), ann_02.crO(), ann_02.crN(), ann_02.csg(), ann_02.cse(), ann_02.ckM(), ann_02.crK(), ann_02.crL(), (byte)ann_02.crM(), ann_02.crQ(), n, sm_02, sm_03, ann_02.crT(), ann_02.crU(), frz_0.ZJ(ann_02.csb()), ann_02.cqC(), fiN2.gae());
        bjz_12.Dq(ann_02.crZ());
        bjz_12.b(aZI.e(ann_02));
        bjz_12.OQ(ann_02.csc());
        bjz_12.lN(ann_02.csl());
        for (aNw aNw2 : ann_02.crP()) {
            bjz_12.ds(aNw2.d(), aNw2.tL());
        }
        return bjz_12;
    }

    private static EnumMap<exx_2, azx_1<Integer, Float>> b(ann_0 ann_02) {
        EnumMap<exx_2, azx_1<Integer, Float>> enumMap = new EnumMap<exx_2, azx_1<Integer, Float>>(exx_2.class);
        enumMap.put(exx_2.rGi, new azx_1<Integer, Float>(ann_02.ckx(), Float.valueOf(ann_02.cqM())));
        enumMap.put(exx_2.rGj, new azx_1<Integer, Float>(ann_02.cky(), Float.valueOf(ann_02.cqO())));
        enumMap.put(exx_2.rGk, new azx_1<Integer, Float>(ann_02.ckz(), Float.valueOf(ann_02.cqP())));
        enumMap.put(exx_2.rGl, new azx_1<Integer, Float>(ann_02.ckA(), Float.valueOf(ann_02.cqN())));
        enumMap.put(exx_2.rGq, new azx_1<Integer, Float>(ann_02.cqD(), Float.valueOf(ann_02.cqQ())));
        enumMap.put(exx_2.rGI, new azx_1<Integer, Float>(ann_02.ckB(), Float.valueOf(ann_02.cqR())));
        enumMap.put(exx_2.rHl, new azx_1<Integer, Float>(ann_02.cqG(), Float.valueOf(ann_02.cqU())));
        enumMap.put(exx_2.rGo, new azx_1<Integer, Float>(ann_02.cqH(), Float.valueOf(ann_02.cqV())));
        enumMap.put(exx_2.rGp, new azx_1<Integer, Float>(ann_02.cqK(), Float.valueOf(ann_02.cqY())));
        enumMap.put(exx_2.rGm, new azx_1<Integer, Float>(ann_02.crc(), Float.valueOf(ann_02.crt())));
        enumMap.put(exx_2.rGn, new azx_1<Integer, Float>(ann_02.crl(), Float.valueOf(ann_02.crC())));
        enumMap.put(exx_2.rHm, new azx_1<Integer, Float>(ann_02.cqF(), Float.valueOf(ann_02.cqT())));
        enumMap.put(exx_2.rGC, new azx_1<Integer, Float>(ann_02.crh(), Float.valueOf(ann_02.cry())));
        enumMap.put(exx_2.rGD, new azx_1<Integer, Float>(ann_02.cri(), Float.valueOf(ann_02.crz())));
        enumMap.put(exx_2.rGE, new azx_1<Integer, Float>(ann_02.crj(), Float.valueOf(ann_02.crA())));
        enumMap.put(exx_2.rGF, new azx_1<Integer, Float>(ann_02.crk(), Float.valueOf(ann_02.crB())));
        enumMap.put(exx_2.rGz, new azx_1<Integer, Float>(ann_02.crf(), Float.valueOf(ann_02.crw())));
        enumMap.put(exx_2.rGA, new azx_1<Integer, Float>(ann_02.crg(), Float.valueOf(ann_02.crx())));
        enumMap.put(exx_2.rGx, new azx_1<Integer, Float>(ann_02.crd(), Float.valueOf(ann_02.cru())));
        enumMap.put(exx_2.rGy, new azx_1<Integer, Float>(ann_02.cre(), Float.valueOf(ann_02.crv())));
        enumMap.put(exx_2.rGs, new azx_1<Integer, Float>(ann_02.cqL(), Float.valueOf(0.0f)));
        return enumMap;
    }

    private static void a(ann_0 ann_02, short s, bjz_1 bjz_12) {
        for (aNu aNu2 : ann_02.crW()) {
            int n = aNu2.d();
            ang_2 ang_22 = null;
            try {
                ang_22 = ehu_0.rY(aNu2.clB());
            }
            catch (Exception exception) {
                hyr.error((Object)("Could not compile criterion \"" + aNu2.clB() + "\" of collect action " + aNu2.csy() + " of breed " + bjz_12.aWP()));
            }
            bmt_1 bmt_12 = new bmt_1(0, 0);
            bmv_2 bmv_22 = new bmv_2(n, s, aNu2.cks(), aNu2.csx(), 1, aNu2.getDuration(), aNu2.csA(), aNu2.csy(), ang_22, false, -1, 0, bmt_12, aNu2.csC(), aNu2.csB(), aNu2.cmu());
            bjz_12.a(bmv_22);
        }
    }

    private static void a(ann_0 ann_02, bjz_1 bjz_12) {
        for (ans_0 ans_02 : ann_02.crV()) {
            int n = ans_02.d();
            byte by = ans_02.aFW();
            eio_0 eio_02 = eio_0.PW(by);
            if (eio_02 == null) {
                hyr.error((Object)("Unknown monster action " + by));
                continue;
            }
            ang_2 ang_22 = null;
            try {
                ang_22 = ehu_0.rY(ans_02.clB());
            }
            catch (Exception exception) {
                hyr.error((Object)("Could not compile criterion \"" + ans_02.clB() + "\" of action " + n + " of breed " + bjz_12.aWP()));
            }
            fqy_0 fqy_02 = fqz_0.giz().YY(ans_02.clf());
            bjo_2 bjo_22 = bjs_1.a(n, by, ang_22, ans_02.cst(), fqy_02, ans_02.cbt(), ans_02.getDuration(), ans_02.csv(), ans_02.csu());
            bjz_12.a(bjo_22);
        }
    }

    private static void c(ann_0 ann_02) {
        for (aNt aNt2 : ann_02.crX()) {
            int n = aNt2.d();
            int n2 = aNt2.aeV();
            int n3 = aNt2.cbt();
            boolean bl = aNt2.csw();
            bjy_1.drw().a(ann_02.d(), new bjx_1(n, n2, n3, bl));
        }
    }

    private static void d(ann_0 ann_02) {
        for (anv_0 anv_02 : ann_02.crY()) {
            int n = anv_02.d();
            int n2 = anv_02.cbt();
            short s = (short)anv_02.xT();
            bjc_2 bjc_22 = new bjc_2(n, s, n2);
            bjd_2.drM().a(bjc_22);
        }
    }

    @Nullable
    public static bjf_2 e(ann_0 ann_02) {
        bjh_2[] bjh_2Array = aZI.a(ann_02.csj());
        bji_2[] bji_2Array = aZI.a(ann_02.csi());
        bjj_2[] bjj_2Array = aZI.a(ann_02.csh());
        if (bjj_2Array != null || bji_2Array != null || bjh_2Array != null) {
            bjf_2 bjf_22 = new bjf_2();
            bjf_22.a(bjh_2Array);
            bjf_22.a(bji_2Array);
            bjf_22.a(bjj_2Array);
            return bjf_22;
        }
        return null;
    }

    @Nullable
    private static bjh_2[] a(ano_0[] ano_0Array) {
        if (ano_0Array == null || ano_0Array.length == 0) {
            return null;
        }
        bjh_2[] bjh_2Array = new bjh_2[ano_0Array.length];
        for (int i = 0; i < ano_0Array.length; ++i) {
            bjh_2Array[i] = new bjh_2(ano_0Array[i].csm(), ano_0Array[i].getAnimName());
        }
        return bjh_2Array;
    }

    @Nullable
    private static bji_2[] a(anp_0[] anp_0Array) {
        if (anp_0Array == null || anp_0Array.length == 0) {
            return null;
        }
        bji_2[] bji_2Array = new bji_2[anp_0Array.length];
        for (int i = 0; i < anp_0Array.length; ++i) {
            bji_2Array[i] = new bji_2(anp_0Array[i].csn(), (axb_2)new awx_2(anp_0Array[i].AM()));
        }
        return bji_2Array;
    }

    @Nullable
    private static bjj_2[] a(anq_0[] anq_0Array) {
        if (anq_0Array == null || anq_0Array.length == 0) {
            return null;
        }
        bjj_2[] bjj_2Array = new bjj_2[anq_0Array.length];
        for (int i = 0; i < anq_0Array.length; ++i) {
            bjj_2Array[i] = new bjj_2(anq_0Array[i].ccQ(), anq_0Array[i].aYl());
        }
        return bjj_2Array;
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.monsters", new Object[0]);
    }
}

