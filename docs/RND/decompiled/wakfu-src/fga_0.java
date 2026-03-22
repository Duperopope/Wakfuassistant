/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.Nullable
 */
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fgA
 */
public class fga_0 {
    private static final Logger sjO = Logger.getLogger(fga_0.class);

    public static byte @Nullable [] cJ(ffV ffV2) {
        if (ffV2 == null) {
            return null;
        }
        return fga_0.cK(ffV2).aer().toByteArray();
    }

    public static kY d(uy_1 uy_12) {
        ffV ffV2 = new ffV();
        ffV2.c(uy_12);
        return fga_0.cK(ffV2);
    }

    @Contract(value="null -> null")
    public static kY cK(ffV ffV2) {
        Object object;
        GeneratedMessageV3.Builder builder;
        Object object2;
        if (ffV2 == null) {
            sjO.fatal((Object)"Trying to serialize a null item", (Throwable)new IllegalStateException(""));
            return null;
        }
        kY kY2 = kW.ael();
        kY2.aX(ffV2.LV()).gX(ffV2.avr()).gY(ffV2.bfd());
        if (ffV2.adO()) {
            object2 = ffV2.ead();
            builder = ly_1.agX();
            object = object2.getName();
            builder.hl(object2.geL().d()).Q((String)(object == null ? "" : object)).hm(object2.agI()).hn(object2.agK()).ho(object2.agM()).hp(object2.agN()).aZ(object2.geN().bjB()).ba(object2.geO().bjB()).hq(object2.agT()).bb(object2.geP().bjB());
            kY2.a((la_0)builder);
        }
        if (ffV2.pe()) {
            if (ffV2.fVV().fZF() != null) {
                kY2.a(lq_1.agj().hj(ffV2.fVV().fZF().d()).aY(ffV2.fVV().pf()));
            } else {
                kY2.a(lq_1.agj().hj(ffV2.dOg().fYx()).aY(0L));
            }
        }
        if (ffV2.dXg()) {
            kY2.a(fga_0.cL(ffV2));
        }
        if (ffV2.adW()) {
            kY2.a(kS.adD().aW(ffV2.fWw().pf()));
        }
        if (ffV2.adZ()) {
            object2 = ffV2.fUY();
            kY2.a(kZ.aeZ().ha(object2.fXu().aJr()).Q(object2.eBm()));
        }
        if (ffV2.fWv()) {
            object2 = ffV2.eAX();
            kY2.a(ld_0.afq().hb(((fgy_0)object2).Vh(enf_0.qPQ.d())).hc(((fgy_0)object2).Vh(enf_0.qPR.d())));
        }
        if ((object2 = ffV2.fWy()) != null) {
            builder = lu_1.agw();
            object = ((fhz)object2).fba();
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                ffV ffV3 = (ffV)iterator.next();
                if (ffV3 == null) {
                    sjO.fatal((Object)"Null item to save on a set, we skip it");
                    continue;
                }
                builder.e(fga_0.cK(ffV3));
            }
            kY2.a((lw_1)builder);
        }
        if (ffV2.fUX() > 0) {
            kY2.gZ(ffV2.fUX());
        }
        return kY2;
    }

    @Nullable
    public static le_0 cL(ffV ffV2) {
        if (!ffV2.dXg()) {
            return null;
        }
        return fga_0.b(ffV2.eAZ());
    }

    @Nullable
    public static le_0 b(fhi_0 fhi_02) {
        Object object;
        if (fhi_02 == null) {
            return null;
        }
        le_0 le_02 = lc_0.ahE();
        Map<Byte, fhn_0> map = fhi_02.dTS();
        if (map != null) {
            object = map.entrySet().iterator();
            while (object.hasNext()) {
                Map.Entry entry = (Map.Entry)object.next();
                byte by = (Byte)entry.getKey();
                fhn_0 fhn_02 = (fhn_0)entry.getValue();
                ll_1 ll_12 = lj_0.aix().hG(by);
                if (fhn_02 != null) {
                    ll_12.hG(by).hH(fhn_02.air()).hI(fhn_02.dBe().aJr()).hJ(fhn_02.dSU());
                }
                le_02.a(ll_12);
            }
        }
        if ((object = fhi_02.fYP()) != null) {
            for (Map.Entry entry : object.entrySet()) {
                le_02.a(lF.aie().hE(((fgg_0)entry.getKey()).d()).hF((Integer)entry.getValue()));
            }
        }
        le_02.hB(fhi_02.ahy());
        le_02.hC(fhi_02.ahA());
        le_02.hD(fhi_02.fYJ());
        return le_02;
    }

    public static kL b(ffV ffV2, ffs_0 ffs_02) {
        if (ffV2 == null) {
            return null;
        }
        return fga_0.h(ffV2, ffs_02.cr(ffV2));
    }

    public static kL h(ffV ffV2, int n) {
        if (ffV2 == null) {
            return null;
        }
        kY kY2 = fga_0.cK(ffV2);
        return kJ.acW().c(kY2).gR(n);
    }

    public static kI i(ffs_0 ffs_02) {
        kI kI2 = kG.acA();
        kI2.aU(ffs_02.Lx()).gM(ffs_02.avr()).gN(ffs_02.eDo()).gQ(ffs_02.fVc().aJr()).gO(ffs_02.bfa());
        RL<ffV, uy_1> rL = ffs_02.fVb();
        rL.a(new fgb_0(kI2, ffs_02));
        ffs_02.fVb().beN().forEach(kI2::aV);
        return kI2;
    }

    public static byte[] a(fft_0 fft_02) {
        kQ kQ2 = kO.adm();
        for (ffs_0 ffs_02 : fft_02.fVh()) {
            kQ2.a(fga_0.i(ffs_02));
        }
        return kQ2.adt().toByteArray();
    }

    public static ffV eM(byte[] byArray) {
        kW kW2;
        try {
            kW2 = kW.bG(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            sjO.fatal((Object)"Error unserializing an item", (Throwable)invalidProtocolBufferException);
            return null;
        }
        return fga_0.w(kW2);
    }

    public static ffV w(kW kW2) {
        List<kW> list;
        Object object;
        Object r = fgD.fXh().Vd(kW2.acs());
        if (r == null) {
            sjO.error((Object)("Can't unserialize item with uniqueId " + kW2.LV() + " and refId " + kW2.acs() + " : unable to find a reference item (proto item=" + BH.de(kW2.toByteArray()) + ")"), new Throwable());
            return null;
        }
        ffV ffV2 = ffV.a(kW2.LV(), r);
        if (ffV2 == null) {
            sjO.error((Object)("Can't unserialize item with uniqueId" + kW2.LV() + " and refId " + kW2.acs() + " : unable to create a new instance."));
            return null;
        }
        try {
            ffV2.ak(GC.cu(kW2.aaD()));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            sjO.error((Object)("Unable to set correct quantity for item " + kW2.acs() + ", qty : " + kW2.aaD() + ", skip it"));
            if (kW2.aaD() > ffV2.bfe()) {
                sjO.fatal((Object)("Player lost some quantity of " + kW2.acs() + ", qty : " + (kW2.aaD() - ffV2.bfe()) + ", set max stack height, uid : " + kW2.LV()));
                ffV2.ak(ffV2.bfe());
            }
            return null;
        }
        if (kW2.adO()) {
            object = fno_0.sKx.f(kW2.adP());
            if (object == null) {
                sjO.error((Object)("Invalid pet data : " + String.valueOf(kW2.adP())));
                return null;
            }
            ffV2.f((fnl_0)object);
        }
        if (kW2.pe()) {
            object = new fir_0(fin_0.srJ.VL(kW2.adR().agf()));
            ((fir_0)object).ij(kW2.adR().agh());
            ffV2.a((fir_0)object);
        }
        if (kW2.adT()) {
            ffV2.a(fga_0.x(kW2));
        }
        if (kW2.adW()) {
            ffV2.a(new fgX(kW2.adX().pf()));
        }
        if (kW2.adZ()) {
            object = kW2.aea();
            list = new fgu_0(fgW.go((byte)((kZ)object).aeV()), ((kZ)object).aeX());
            ffV2.a((fgr_0)((Object)list));
        }
        if (kW2.aec()) {
            object = kW2.aed();
            list = new fgy_0();
            fgy_0.a((fgy_0)((Object)list), (byte)((ld_0)object).afm(), enf_0.qPQ.d());
            fgy_0.a(list, (byte)((ld_0)object).afo(), enf_0.qPR.d());
            ffV2.a((fgy_0)((Object)list));
        } else {
            ffV2.a((fgy_0)null);
        }
        if (kW2.aef()) {
            object = new fhz();
            list = kW2.aeg().ot();
            for (kW kW3 : list) {
                ((fhz)object).cf(fga_0.w(kW3));
            }
            ffV2.a((fhz)object);
        }
        if (kW2.aei()) {
            ffV2.UX(kW2.aej());
        }
        ffV2.fWg();
        return ffV2;
    }

    @Nullable
    public static fhi_0 x(kW kW2) {
        if (!kW2.adT()) {
            return null;
        }
        return fga_0.f(kW2.adU());
    }

    public static fhi_0 f(lc_0 lc_02) {
        fhi_0 fhi_02 = fhk_0.g(lc_02);
        if (fhi_02 == null) {
            return null;
        }
        List<lF> list = lc_02.ahu();
        for (lF lF2 : list) {
            fgg_0 fgg_02 = fgg_0.UZ(lF2.aic());
            if (fgg_02 == null) {
                sjO.fatal((Object)("Saved an item with unknown propertyId : " + lF2.aic()));
                continue;
            }
            fhi_02.a(fgg_02, lF2.acs());
        }
        return fhi_02;
    }

    public static ffV f(kJ kJ2) {
        try {
            return fga_0.w(kJ2.aaA());
        }
        catch (Exception exception) {
            sjO.error((Object)("Error unserializing item " + String.valueOf(kJ2) + ", skip it"), (Throwable)exception);
            return null;
        }
    }

    public static ffs_0 a(ffs_0 ffs_02, kG kG2) {
        short s = ffn_0.sgo.UW(kG2.acs());
        int n = kG2.acu();
        ffs_0 ffs_03 = ffs_02.dRf();
        ffs_03.di(kG2.LV());
        ffs_03.UI(kG2.acs());
        ffs_03.dC((byte)kG2.Lz());
        ffs_03.a(fgW.go((byte)kG2.acy()));
        ffs_03.eS(s > n ? s : (short)n);
        ffs_03.b(ffl_0.sgm);
        List<kJ> list = kG2.ot();
        for (kJ kJ2 : list) {
            ffV ffV2 = fga_0.f(kJ2);
            if (ffV2 == null) continue;
            try {
                ffs_03.i(ffV2, (short)kJ2.Lz());
            }
            catch (SD | Sz | sa_0 sb_02) {
                sjO.fatal((Object)("[Proto] Could not add item " + ffV2.fWz() + " when unserializing proto bag " + BH.de(kG2.toByteArray())), (Throwable)sb_02);
            }
        }
        ffs_03.fVa();
        ffs_03.fVb().h(kG2.acv());
        return ffs_03;
    }

    public static fft_0 a(fft_0 fft_02, ffs_0 ffs_02, byte[] byArray) {
        kO kO2;
        try {
            kO2 = kO.bE(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            sjO.fatal((Object)"Error unserializing bags", (Throwable)invalidProtocolBufferException);
            return null;
        }
        return fga_0.a(fft_02, ffs_02, kO2);
    }

    private static fft_0 a(fft_0 fft_02, ffs_0 ffs_02, kO kO2) {
        for (kG kG2 : kO2.adi()) {
            fft_02.f(fga_0.a(ffs_02, kG2));
        }
        return fft_02;
    }
}

