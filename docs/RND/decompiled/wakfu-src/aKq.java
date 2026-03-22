/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Collections;
import org.apache.log4j.Logger;

public class aKq
extends ake_0
implements aKs {
    private static final Logger eeh = Logger.getLogger(aKq.class);
    private static final String eei = "BeaconZoneEffect";
    private static final String eej = "BeaconZoneAdditionalEffect";
    private static final String eek = "BeaconRangeEffect";
    private static final String eel = "beaconRange.tga";
    private static final String eem = "beaconEffect.tga";
    private baz_0 een;
    private long[] eeo;
    private static final aKq eep = new aKq();

    public static aKq ciL() {
        return eep;
    }

    private aKq() {
        super(eek, aid_0.dUX, eei, aid_0.dUU, eej, aid_0.dUV, null, null, null, null, null, null);
    }

    public void a(baz_0 baz_02, bgy bgy2) {
        bsj_0 bsj_02 = bgy2.dkZ();
        if (bsj_02 == null) {
            return;
        }
        rh_0 rh_02 = bsj_02.bag();
        if (rh_02 == null) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (baz_02.bci() != bgt_02) {
            return;
        }
        this.een = baz_02;
        this.eeo = this.een.c((anu_1)bgy2);
        this.a(bgy2, rh_02);
        this.eeo = null;
        this.een = null;
    }

    private void a(bgy bgy2, rh_0 rh_02) {
        long[] lArray = this.eeo;
        if (lArray == null) {
            return;
        }
        if (this.een.a(etl_0.rnj)) {
            this.b(bgy2, rh_02);
        } else {
            this.a(bgy2, rh_02, lArray);
        }
    }

    private void b(bgy bgy2, rh_0 rh_02) {
        bmx_0 bmx_02 = cuk_2.eSS().eSR();
        if (bmx_02 == null) {
            return;
        }
        eNd eNd2 = bmx_02.dTh();
        ers_0 ers_02 = (ers_0)this.een.baz();
        for (QD qD : ers_02) {
            if (!qD.oF(this.a(eNd2))) continue;
            eNl eNl2 = (eNl)qD.bbf();
            this.efb.a(Collections.singletonList(eNl2), bgy2, this.een.aZw(), bgy2.dkZ(), rh_02, (enk_0)qD.bba(), eNl2.cmL());
        }
    }

    private void a(bgy bgy2, rh_0 rh_02, long[] lArray) {
        for (int i = 0; i < lArray.length; ++i) {
            long l = lArray[i];
            int n = anf_2.go(l);
            int n2 = anf_2.gp(l);
            short s = anf_2.gq(l);
            this.b(Collections.singletonList(this.een), bgy2, new acd_1(n, n2, rh_02.Z(n, n2)));
        }
    }

    private short a(eNd eNd2) {
        if (eNd2 == eNd.qOZ) {
            return 2101;
        }
        if (eNd2 == eNd.qPa) {
            return 2102;
        }
        if (eNd2 == eNd.qPb) {
            return 2103;
        }
        if (eNd2 == eNd.qPc) {
            return 2104;
        }
        return -1;
    }

    @Override
    protected akf_0 a(acd_1 acd_12, bgy bgy2) {
        return akf_0.efi;
    }

    @Override
    public void aPc() {
        try {
            String string = auc_0.cVq().bS("highLightGfxPath") + eem;
            this.eeY.a(string, agb_0.cum);
            string = auc_0.cVq().bS("highLightGfxPath") + eel;
            this.a(string, agb_0.cum);
        }
        catch (Exception exception) {
            eeh.error((Object)exception);
        }
    }
}

