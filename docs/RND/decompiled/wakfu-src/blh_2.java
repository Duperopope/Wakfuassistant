/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteObjectIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TByteObjectIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;

/*
 * Renamed from bLH
 */
public class blh_2
implements aeh_2 {
    private static final Logger kug = Logger.getLogger(blh_2.class);
    public static final String kuh = "currentShortcutBarType";
    public static final String kui = "selectedShortcutBar";
    public static final String kuj = "selectedShortcutBar1";
    public static final String kuk = "selectedShortcutBar2";
    public static final String kul = "selectedShortcutBar3";
    public static final String kum = "selectedShortcutBar4";
    public static final String kun = "currentShortcutBarNumber";
    public static final String kuo = "currentShortcutBarNumberText";
    public static final String kup = "leftHandWeaponShortcut";
    public static final String kuq = "rightHandWeaponShortcut";
    public static final String kur = "closedShortcutBars";
    public static final String kus = "shortcutBar1";
    public static final String kut = "shortcutBar2";
    public static final String kuu = "shortcutBar3";
    public static final String kuv = "shortcutBar4";
    public static final String kuw = "worldShortcutBarCount";
    public static final String kux = "backgroundStyle";
    public static final String kuy = "indicatorBar1";
    public static final String kuz = "indicatorBar2";
    public static final String kuA = "indicatorBar3";
    public static final String kuB = "indicatorBar4";
    public static final String kuC = "displaySymbiotBar";
    public static final String[] kuD = new String[]{"currentShortcutBarType", "selectedShortcutBar", "currentShortcutBarNumber", "currentShortcutBarNumberText", "leftHandWeaponShortcut", "rightHandWeaponShortcut", "closedShortcutBars", "displaySymbiotBar"};
    public static final String kuE = "stairsFightShortcutBar";
    public static final String kuF = "fightShortcutBar";
    public static final String kuG = "worldShortcutBar";
    private blg_2[] kuH;
    private boolean kuI = false;
    private byte kuJ = 0;
    private byte kuK = 0;
    private int kuL = 1;
    private byte[] kuM;
    private byte[] kuN;
    private final blb_2 kuO;
    private final blb_2 kuP;
    private fqt_0 kuQ = fqt_0.sTc;
    private final ArrayList<blj_2> kuR = new ArrayList();
    private long aXv;

    public void dC(long l) {
        this.aXv = l;
    }

    public blh_2() {
        int n = fqt_0.gin();
        this.kuH = new blg_2[n];
        byte by = 0;
        for (fqt_0 n5 : fqt_0.values()) {
            int n2 = n5.fnx();
            blg_2[] blg_2Array = new blg_2[n2];
            for (int i = 0; i < n2; ++i) {
                blg_2Array[i] = n5 == fqt_0.sTe ? new blo_2(by) : new blg_2(n5, by);
                this.kuH[by] = blg_2Array[i];
                by = (byte)(by + 1);
            }
        }
        Object r = fgD.fXh().Vd(2145);
        if (r != null) {
            this.kuP = blb_2.a(fqu_0.sTt, -1L, ((fhc_0)r).d(), ((fhc_0)r).aVt());
            this.kuO = blb_2.a(fqu_0.sTt, -1L, -1, 0);
        } else {
            this.kuP = null;
            this.kuO = null;
        }
        int n3 = 0;
        int n4 = 0;
        this.kuM = new byte[fqt_0.sTd.fnx()];
        this.kuN = new byte[fqt_0.sTc.fnx()];
        for (int n5 = 0; n5 < this.kuH.length; n5 = (int)((byte)(n5 + 1))) {
            if (this.kuH[n5].ecS() == fqt_0.sTd) {
                int n6 = n3;
                n3 = (byte)(n3 + 1);
                this.kuM[n6] = n5;
                continue;
            }
            if (this.kuH[n5].ecS() != fqt_0.sTc) continue;
            int n7 = n4;
            n4 = (byte)(n4 + 1);
            this.kuN[n7] = n5;
        }
        if (this.kuN.length > 0) {
            this.kuJ = this.kuN[0];
        }
        if (this.kuM.length > 0) {
            this.kuK = this.kuM[0];
        }
    }

    public void a(fqP<bmx_0> fqP2) {
        ArrayList<bmx_0> arrayList = fqP2.b(rT -> true);
        this.aL(arrayList);
    }

    public void aL(Iterable<bmx_0> iterable) {
        this.edh();
        blg_2 blg_22 = this.ck((byte)0);
        blg_2 blg_23 = this.ck((byte)1);
        blg_22.clean();
        blg_23.clean();
        this.a(iterable, blg_22, blg_23);
        blg_22.ecY();
        blg_23.ecY();
        this.dlH();
    }

    private void a(Iterable<bmx_0> iterable, blg_2 blg_22, blg_2 blg_23) {
        Iterator<bmx_0> iterator = iterable.iterator();
        int n = 0;
        while (iterator.hasNext() && n < 12) {
            bmx_0 bmx_02 = iterator.next();
            if (bmx_02 == null) {
                ++n;
                continue;
            }
            if (((bmt_0)bmx_02.giP()).eeY()) continue;
            if (n < 6) {
                blg_22.a(blb_2.a(fqu_0.sTq, bmx_02.LV(), bmx_02.avr(), bmx_02.aVt()), (short)n);
            } else {
                blg_23.a(blb_2.a(fqu_0.sTq, bmx_02.LV(), bmx_02.avr(), bmx_02.aVt()), (short)(n % 6));
            }
            ++n;
        }
    }

    public void aZp() {
        if (this.kuP != null) {
            this.kuP.aZp();
        }
        if (this.kuO != null) {
            this.kuO.aZp();
        }
        Arrays.stream(this.kuH).forEach(blg_2::aZp);
        this.kuH = null;
    }

    public void T(boolean bl) {
        cgw_2.mYX = bl;
    }

    public void a(fqt_0 fqt_02) {
        for (int i = this.kuR.size() - 1; i >= 0; --i) {
            this.kuR.get(i).c(fqt_02);
        }
    }

    public void a(blj_2 blj_22) {
        if (!this.kuR.contains(blj_22)) {
            this.kuR.add(blj_22);
        }
    }

    public void b(blj_2 blj_22) {
        this.kuR.remove(blj_22);
    }

    public fqt_0 ede() {
        return this.kuQ;
    }

    public blo_2 edf() {
        return (blo_2)this.kuH[fqt_0.sTe.eFS()];
    }

    public void edg() {
        if (!this.kuI) {
            this.kuI = true;
            this.b(fqt_0.sTe);
            this.edF();
            fse_1.gFu().a((aef_2)this, kuC);
        }
    }

    public void edh() {
        if (this.kuI) {
            this.kuI = false;
            this.b(fqt_0.sTd);
            this.edF();
            fse_1.gFu().a((aef_2)this, kuC);
        }
    }

    public void c(eIm eIm2) {
        for (blg_2 blg_22 : this.kuH) {
            blg_22.edd().forEach(blb_22 -> {
                if (blb_22.gih() != fqu_0.sTv) {
                    return;
                }
                int n = blb_22.avr();
                eIj eIj2 = eIm2.PR(n);
                if (eIj2 == null) {
                    return;
                }
                blb_22.HX(eIj2.ws());
            });
        }
    }

    public void a(Map<Integer, eks_0> map, bgt_0 bgt_02) {
        for (blg_2 blg_22 : this.kuH) {
            blg_22.edd().forEach(blb_22 -> {
                if (blb_22.gih() != fqu_0.sTw) {
                    return;
                }
                int n = blb_22.avr();
                eks_0 eks_02 = (eks_0)map.get(n);
                if (eks_02 == null) {
                    return;
                }
                blb_22.HX(bjf_1.a(eks_02.BL(), bgt_02));
            });
        }
    }

    public void b(fqt_0 fqt_02) {
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        this.a(fqt_02, true, (byte)bsg_12.d(fqt_02 == fqt_0.sTd ? bsn_1.liE : bsn_1.liF));
    }

    public void a(fqt_0 fqt_02, boolean bl) {
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        this.a(fqt_02, bl, (byte)bsg_12.d(fqt_02 == fqt_0.sTd ? bsn_1.liE : bsn_1.liF));
    }

    public void b(fqt_0 fqt_02, byte by) {
        this.a(fqt_02, true, by);
    }

    public void a(fqt_0 fqt_02, boolean bl, byte by) {
        if (this.kuI && fqt_02 != fqt_0.sTe) {
            return;
        }
        if (this.kuQ == fqt_02) {
            return;
        }
        this.a(fqt_02);
        fqt_0 fqt_03 = this.kuQ;
        this.kuQ = fqt_02;
        this.p(by != -1 ? by : (byte)this.kuQ.eFS(), false);
        if (bl) {
            this.edF();
        }
        cxx_2.eXH().d(fqt_03);
        if (fqt_02.efP()) {
            ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.liD, this.kuQ.name());
        }
        fse_1.gFu().a((aef_2)this, kus, kut, kuu, kuv);
    }

    private boolean cf(byte by) {
        for (byte by2 : this.kuN) {
            if (by2 != by) continue;
            return true;
        }
        return false;
    }

    private boolean cg(byte by) {
        for (byte by2 : this.kuM) {
            if (by2 != by) continue;
            return true;
        }
        return false;
    }

    public blg_2 edi() {
        if (this.kuK < 0 || this.kuK >= this.kuH.length) {
            return null;
        }
        return this.kuH[this.kuK];
    }

    public byte edj() {
        return this.kuK;
    }

    public String edk() {
        return String.valueOf(this.edj() - this.edi().ecS().eFS() + 1);
    }

    public void ch(byte by) {
        this.n(by, true);
    }

    private void n(byte by, boolean bl) {
        if (this.kuK != by && this.cg(by)) {
            this.kuK = by;
            ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.liE, this.kuK);
            if (bl) {
                this.edF();
            }
        }
    }

    public void HZ(int n) {
        this.kuL = n;
        this.edD();
    }

    public int edl() {
        return this.kuL;
    }

    public Function<bmx_0, Short> edm() {
        return bmx_02 -> bmx_02 == null ? (short)Short.MAX_VALUE : this.a(bmx_02.avr(), fqt_0.sTd);
    }

    public blg_2 edn() {
        if (this.kuJ < 0 || this.kuJ >= this.kuH.length) {
            return null;
        }
        return this.kuH[this.kuJ];
    }

    public byte edo() {
        return this.kuJ;
    }

    public String edp() {
        return String.valueOf(this.edo() - this.edn().ecS().eFS() + 1);
    }

    public void ci(byte by) {
        this.o(by, true);
    }

    private void o(byte by, boolean bl) {
        if (this.kuJ != by && this.cf(by)) {
            this.kuJ = by;
            ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.liF, this.kuJ);
            if (bl) {
                this.edF();
            }
        }
    }

    public int a(blg_2 blg_22) {
        for (int i = 0; i < this.kuH.length; ++i) {
            if (this.kuH[i] != blg_22) continue;
            return i;
        }
        return -1;
    }

    private void edq() {
        int n = -1;
        for (int i = 0; i < this.kuM.length; ++i) {
            if (this.kuM[i] != this.kuK) continue;
            n = i;
            break;
        }
        if (n != -1) {
            this.ch(this.kuM[(n + 1) % this.kuM.length]);
        }
    }

    private void edr() {
        int n = -1;
        for (int i = 0; i < this.kuM.length; ++i) {
            if (this.kuM[i] != this.kuK) continue;
            n = i;
            break;
        }
        if (n != -1) {
            this.ch(this.kuM[(n - 1 + this.kuM.length) % this.kuM.length]);
        }
    }

    private void eds() {
        int n = -1;
        for (int i = 0; i < this.kuN.length; ++i) {
            if (this.kuN[i] != this.kuJ) continue;
            n = i;
            break;
        }
        if (n != -1) {
            this.ci(this.kuN[(n + 1) % this.kuN.length]);
        }
    }

    private void edt() {
        int n = -1;
        for (int i = 0; i < this.kuN.length; ++i) {
            if (this.kuN[i] != this.kuJ) continue;
            n = i;
            break;
        }
        if (n != -1) {
            this.ci(this.kuN[(n - 1 + this.kuN.length) % this.kuN.length]);
        }
    }

    public void edu() {
        if (this.kuQ == fqt_0.sTd) {
            this.edq();
        } else if (this.kuQ == fqt_0.sTc) {
            this.eds();
        }
        fse_1.gFu().a((aef_2)this, kur);
    }

    public void edv() {
        if (this.kuQ == fqt_0.sTd) {
            this.edr();
        } else if (this.kuQ == fqt_0.sTc) {
            this.edt();
        }
        fse_1.gFu().a((aef_2)this, kur);
    }

    public blg_2 cj(byte by) {
        return this.c(fqt_0.sTc, by);
    }

    public blg_2 ck(byte by) {
        return this.c(fqt_0.sTd, by);
    }

    public blg_2 cl(byte by) {
        return this.c(this.kuQ, by);
    }

    public blg_2 c(fqt_0 fqt_02, byte by) {
        if (by < 0 || by > fqt_02.fnx()) {
            kug.error((Object)("On essaye de r\u00e9cup\u00e9rer une ShortCutBar de type " + String.valueOf((Object)fqt_02) + " de num\u00e9ro " + by));
            return null;
        }
        if (this.kuH.length <= by + fqt_02.eFS()) {
            return null;
        }
        return this.kuH[by + fqt_02.eFS()];
    }

    public ArrayList<blg_2> hY(boolean bl) {
        if (this.kuQ == fqt_0.sTd) {
            return this.hZ(bl);
        }
        if (this.kuQ == fqt_0.sTc) {
            return this.ia(bl);
        }
        return null;
    }

    public ArrayList<blg_2> hZ(boolean bl) {
        return this.a(fqt_0.sTd, this.edj(), bl);
    }

    public ArrayList<blg_2> ia(boolean bl) {
        return this.a(fqt_0.sTc, this.edo(), bl);
    }

    private ArrayList<blg_2> a(fqt_0 fqt_02, byte by, boolean bl) {
        short s = fqt_02.eFS();
        ArrayList<blg_2> arrayList = new ArrayList<blg_2>();
        for (int i = 0; i < fqt_02.fnx(); ++i) {
            int n = i + s;
            if (bl && n == by) continue;
            arrayList.add(this.kuH[n]);
        }
        return arrayList;
    }

    public blg_2 cm(byte by) {
        assert (by >= 0 && by < this.kuH.length) : "On essaye de r\u00e9cup\u00e9rer la shortcutBar de num\u00e9ro " + by;
        return this.kuH[by];
    }

    private byte a(fqt_0 fqt_02, blb_2 blb_22) {
        int n = -1;
        byte by = -1;
        byte by2 = -1;
        for (byte by3 = 0; by3 < fqt_02.fnx(); by3 = (byte)(by3 + 1)) {
            byte by4 = (byte)(by3 + fqt_02.eFS());
            short s = this.kuH[by4].a(blb_22);
            if (s != -1) {
                by = by4;
                n = by;
                break;
            }
            if (!this.kuH[by4].b(blb_22)) continue;
            by2 = by4;
            n = by2;
            break;
        }
        if (n != -1) {
            switch (fqt_02) {
                case sTc: {
                    this.ci(by);
                    break;
                }
                case sTd: {
                    this.ch(by);
                }
            }
        }
        return by2;
    }

    public boolean a(blb_2 blb_22, int n, short s) {
        if (n == -1) {
            fqt_0 fqt_02 = this.ede();
            if (fqt_02 == fqt_0.sTd) {
                if (!this.edi().isFull()) {
                    n = this.edj();
                }
            } else if (!this.edn().isFull()) {
                n = this.edo();
            }
            if (n == -1) {
                n = this.a(fqt_02, blb_22);
            }
        }
        if (n == -1) {
            return false;
        }
        blg_2 blg_22 = this.cm((byte)n);
        boolean bl = blg_22.a(blb_22, s);
        if (bl && s == -1) {
            switch (blg_22.ecS()) {
                case sTc: {
                    this.ci((byte)n);
                    break;
                }
                case sTd: {
                    this.ch((byte)n);
                }
            }
        }
        return bl;
    }

    public void a(int n, fqu_0 fqu_02, boolean bl) {
        for (blg_2 blg_22 : this.kuH) {
            blg_22.a(n, fqu_02, bl);
        }
    }

    public void n(long l, boolean bl) {
        for (blg_2 blg_22 : this.kuH) {
            blg_22.n(l, bl);
        }
    }

    public boolean b(int n, short s, boolean bl) {
        return this.cm((byte)n).a(s, bl);
    }

    public void b(blb_2 blb_22, int n, short s) {
        this.cm((byte)n).b(blb_22, s);
    }

    public void edw() {
        if (this.kuH == null) {
            return;
        }
        cjd_0 cjd_02 = null;
        int n = 0;
        for (blg_2 blg_22 : this.kuH) {
            if (blg_22.ecS() == fqt_0.sTd) {
                blg_22.ecU();
            }
            if (blg_22.ecT()) {
                if (cjd_02 == null) {
                    cjd_02 = new cjd_0(this.aXv);
                }
                byte by = (byte)(n - blg_22.ecS().eFS());
                TByteObjectIterator<blb_2> tByteObjectIterator = blg_22.ecV();
                while (tByteObjectIterator.hasNext()) {
                    tByteObjectIterator.advance();
                    cjd_02.a((byte)blg_22.ecS().ordinal(), by, tByteObjectIterator.key(), (blb_2)tByteObjectIterator.value());
                }
                tByteObjectIterator = blg_22.ecW();
                while (tByteObjectIterator.hasNext()) {
                    tByteObjectIterator.advance();
                    cjd_02.c((byte)blg_22.ecS().ordinal(), by, tByteObjectIterator.key());
                }
                tByteObjectIterator = blg_22.ecX();
                while (tByteObjectIterator.hasNext()) {
                    tByteObjectIterator.advance();
                    cjd_02.c((byte)blg_22.ecS().ordinal(), by, tByteObjectIterator.key());
                }
                blg_22.ecU();
            }
            n = (byte)(n + 1);
        }
        if (cjd_02 != null) {
            aue_0.cVJ().etu().d(cjd_02);
        }
    }

    public boolean Ia(int n) {
        for (blg_2 blg_22 : this.kuH) {
            if (blg_22.HY(n) == null) continue;
            return true;
        }
        return false;
    }

    public short a(int n, fqt_0 fqt_02) {
        for (blg_2 blg_22 : this.a(fqt_02, (byte)-1, false)) {
            blb_2 blb_22 = blg_22.HY(n);
            if (blb_22 == null) continue;
            return (short)(blg_22.a(blb_22) + blg_22.deO() * fqt_02.gik());
        }
        return Short.MAX_VALUE;
    }

    public void edx() {
        this.d(this.kuO);
    }

    public void edy() {
        this.d(this.kuP);
    }

    private void d(blb_2 blb_22) {
        byte by;
        ffV ffV2;
        Object object;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        Optional<ffV> optional = bgt_02.dnP().B(blb_22.LV());
        if (optional.isEmpty()) {
            if (blb_22.avr() != 2145) {
                return;
            }
            object = fgD.fXh().Vd(2145);
            ffV ffV3 = new ffV(-1L);
            ffV3.l((fhc_0)object);
            ffV3.ak((short)1);
            ffV2 = ffV3;
            by = ffS.sgQ.shb;
        } else {
            ffV2 = optional.get();
            object = bgt_02.dmL().tz(ffV2.LV());
            if (object == null) {
                return;
            }
            by = ((ffS)object).aJr();
        }
        if (ffV2.apo()) {
            object = new dbm();
            ((dbm)object).j(ffV2, by);
            ((ama_1)object).lK(16492);
            aaw_1.bUq().h((aam_2)object);
        }
    }

    public void a(byte by, short s) {
        cgw_2.useItem(null, this.cm(by).cc(s), false);
    }

    public void bb(ffV ffV2) {
        int n = ffV2.avr();
        for (blg_2 blg_22 : this.kuH) {
            ArrayList<blb_2> arrayList = blg_22.pd(n);
            if (arrayList == null) continue;
            for (int i = arrayList.size() - 1; i >= 0; --i) {
                blb_2 blb_22 = arrayList.get(i);
                fse_1.gFu().a((aef_2)blb_22, "quantity", "usable");
            }
        }
    }

    public void bo(ffV ffV2) {
        if (ffV2 == null) {
            return;
        }
        Set set = Stream.of(this.kuH).flatMap(blg_22 -> blg_22.pd(ffV2.avr()).stream()).collect(Collectors.toSet());
        for (blb_2 blb_22 : set) {
            blb_22.bi((byte)(ffV2.isUsable() && ffV2.apo() ? 2 : 3));
        }
    }

    public void a(ffV ffV2, ffV ffV3) {
        byte by;
        if (ffV3 != null) {
            by = ffV3.isUsable() && ffV3.apo() ? (byte)2 : 3;
            this.kuO.b(fqu_0.sTs, ffV3.LV(), ffV3.avr(), ffV3.aVt());
            this.kuO.bi(by);
        } else {
            this.kuO.b(fqu_0.sTt, -1L, -1, 0);
        }
        if (ffV2 != null) {
            by = ffV2.isUsable() && ffV2.apo() ? (byte)2 : 3;
            this.kuP.b(fqu_0.sTs, ffV2.LV(), ffV2.avr(), ffV2.aVt());
            this.kuP.bi(by);
        } else {
            Object r = fgD.fXh().Vd(2145);
            this.kuP.b(fqu_0.sTt, -1L, ((fhc_0)r).d(), ((fhc_0)r).aVt());
        }
        fse_1.gFu().a((aef_2)this, kup, kuq);
    }

    public void a(ffV ffV2, Sn sn) {
        try {
            if (sn.bfE() == ffS.sgQ.shb || sn.bfE() == ffS.sgR.aJr()) {
                int n;
                boolean bl = false;
                int n2 = 0;
                int n3 = n = ffV2.isUsable() && ffV2.apo() ? 2 : 3;
                if (sn.bfE() == ffS.sgR.shb) {
                    this.kuO.b(fqu_0.sTs, ffV2.LV(), ffV2.avr(), ffV2.aVt());
                    this.kuO.bi((byte)n);
                    bl = true;
                } else {
                    this.kuP.b(fqu_0.sTs, ffV2.LV(), ffV2.avr(), ffV2.aVt());
                    this.kuP.bi((byte)n);
                    n2 = 1;
                }
                if (bl) {
                    fse_1.gFu().a((aef_2)this, kup);
                }
                if (n2 != 0) {
                    fse_1.gFu().a((aef_2)this, kuq);
                }
            }
            if (ffV2.isUsable() && ffV2.apo()) {
                for (blg_2 blg_22 : this.kuH) {
                    try {
                        ArrayList<blb_2> arrayList = blg_22.pd(ffV2.avr());
                        for (blb_2 blb_22 : arrayList) {
                            blb_22.bi((byte)2);
                        }
                    }
                    catch (Exception exception) {
                        kug.error((Object)("Erreur a la modification d'un shortcut " + String.valueOf(exception)));
                    }
                }
            } else {
                for (blg_2 blg_23 : this.kuH) {
                    try {
                        ArrayList<blb_2> arrayList = blg_23.pd(ffV2.avr());
                        for (blb_2 blb_23 : arrayList) {
                            blb_23.bi((byte)3);
                        }
                    }
                    catch (Exception exception) {
                        kug.error((Object)("Erreur a la modification d'un shortcut " + String.valueOf(exception)));
                    }
                }
            }
            this.dlH();
        }
        catch (Exception exception) {
            kug.error((Object)("Erreur a l'ajout d'un shortcut " + String.valueOf(exception)));
        }
    }

    public void ai(ffV ffV2) {
        boolean bl = false;
        boolean bl2 = false;
        if (ffV2.LV() == this.kuO.LV()) {
            this.kuO.b(fqu_0.sTt, -1L, -1, 0);
            bl = true;
        } else if (ffV2.LV() == this.kuP.LV()) {
            this.kuP.b(fqu_0.sTt, -1L, -1, 0);
            bl2 = true;
        }
        if (this.kuO.avr() == -1 && this.kuP.avr() == -1) {
            Object r = fgD.fXh().Vd(2145);
            this.kuP.b(fqu_0.sTt, -1L, ((fhc_0)r).d(), ((fhc_0)r).aVt());
            bl2 = true;
        }
        if (bl) {
            fse_1.gFu().a((aef_2)this, kup);
        }
        if (bl2) {
            fse_1.gFu().a((aef_2)this, kuq);
        }
        for (blg_2 blg_22 : this.kuH) {
            try {
                ArrayList<blb_2> arrayList = blg_22.pd(ffV2.avr());
                for (blb_2 blb_22 : arrayList) {
                    if (ffV2.dOg().v(ffS.sgQ) || ffV2.dOg().v(ffS.sgR)) {
                        blb_22.bi((byte)5);
                        continue;
                    }
                    blb_22.bi((byte)0);
                }
            }
            catch (Exception exception) {
                kug.error((Object)("Erreur a la modification d'un shortcut " + String.valueOf(exception)));
            }
        }
        this.dlH();
    }

    public void a(fqu_0 fqu_02, int n, int n2) {
        for (blg_2 blg_22 : this.kuH) {
            for (blb_2 blb_22 : blg_22.edd()) {
                if (blb_22 == null || blb_22.gih() != fqu_02 || blb_22.avr() != n) continue;
                blb_22.HX(n2);
            }
        }
    }

    @Override
    public String[] bxk() {
        return kuD;
    }

    @Override
    public Object eu(String string) {
        switch (string) {
            case "currentShortcutBarType": {
                return this.kuQ.ordinal();
            }
            case "selectedShortcutBar": 
            case "selectedShortcutBar1": {
                return this.edC();
            }
            case "selectedShortcutBar2": {
                return this.co((byte)1);
            }
            case "selectedShortcutBar3": {
                return this.co((byte)2);
            }
            case "selectedShortcutBar4": {
                return this.co((byte)3);
            }
            case "currentShortcutBarNumber": {
                return this.edB();
            }
            case "currentShortcutBarNumberText": {
                return this.edA();
            }
            case "leftHandWeaponShortcut": {
                return this.kuO == null || this.kuO.avr() == -1 ? null : this.kuO;
            }
            case "rightHandWeaponShortcut": {
                return this.kuP.avr() != -1 ? this.kuP : null;
            }
            case "displaySymbiotBar": {
                return this.kuI;
            }
            case "shortcutBar1": {
                return this.cl((byte)0);
            }
            case "shortcutBar2": {
                return this.cl((byte)1);
            }
            case "shortcutBar3": {
                return this.cl((byte)2);
            }
            case "shortcutBar4": {
                return this.cl((byte)3);
            }
            case "backgroundStyle": {
                return this.dBE();
            }
            case "worldShortcutBarCount": {
                return this.kuL;
            }
            case "indicatorBar1": {
                return this.cn((byte)0);
            }
            case "indicatorBar2": {
                return this.cn((byte)1);
            }
            case "indicatorBar3": {
                return this.cn((byte)2);
            }
            case "indicatorBar4": {
                return this.cn((byte)3);
            }
        }
        return null;
    }

    private String dBE() {
        if (this.kuQ == fqt_0.sTd) {
            bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
            boolean bl = bsg_12.a(bsn_1.lkr);
            blg_2 blg_22 = this.cl((byte)2);
            blg_2 blg_23 = this.cl((byte)3);
            int n = 4;
            if (blg_23.aJG()) {
                --n;
            }
            if (blg_22.aJG()) {
                --n;
            }
            return bl ? kuE + n : kuF + n;
        }
        if (this.kuQ == fqt_0.sTc) {
            return kuG + this.kuL;
        }
        return "worldShortcutBar1";
    }

    private boolean cn(byte by) {
        if (this.kuQ != fqt_0.sTc) {
            return false;
        }
        int n = by + this.kuQ.eFS();
        byte by2 = this.edC().deO();
        if (by2 <= n && n < by2 + this.kuL) {
            return true;
        }
        int n2 = by + this.kuQ.eFS() + fqt_0.sTc.fnx();
        return by2 <= n2 && n2 < by2 + this.kuL;
    }

    public boolean edz() {
        return this.kuI;
    }

    public String edA() {
        if (this.kuQ == fqt_0.sTd) {
            return this.edk();
        }
        if (this.kuQ == fqt_0.sTc) {
            return this.edp();
        }
        return null;
    }

    public byte edB() {
        if (this.kuQ == fqt_0.sTd) {
            return this.edj();
        }
        if (this.kuQ == fqt_0.sTc) {
            return this.edo();
        }
        return -1;
    }

    public void p(byte by, boolean bl) {
        if (this.kuQ == fqt_0.sTd) {
            this.n(by, bl);
        } else if (this.kuQ == fqt_0.sTc) {
            this.o(by, bl);
        }
    }

    public blg_2 edC() {
        if (this.kuI) {
            return this.edf();
        }
        if (this.kuQ == fqt_0.sTd) {
            return this.edi();
        }
        if (this.kuQ == fqt_0.sTc) {
            return this.edn();
        }
        return null;
    }

    public blg_2 co(byte by) {
        if (this.kuQ == fqt_0.sTd) {
            byte by2 = (byte)((this.kuK + by) % fqt_0.sTd.fnx());
            return this.c(fqt_0.sTd, by2);
        }
        if (this.kuQ == fqt_0.sTc) {
            byte by3 = (byte)((this.kuJ + by) % fqt_0.sTc.fnx());
            return this.c(fqt_0.sTc, by3);
        }
        return null;
    }

    public void edD() {
        fse_1.gFu().a((aef_2)this, kuw, kuy, kuz, kuA, kuB, kux);
    }

    public void edE() {
        fse_1.gFu().a((aef_2)this, kux);
    }

    public void edF() {
        fse_1.gFu().a((aef_2)this, kuh, kui, kun, kuo, kuj, kuk, kul, kum, kuy, kuz, kuA, kuB, kux, kur);
        this.edG();
    }

    public void edG() {
        fse_1.gFu().a((aef_2)this, kuq, kup);
    }

    public void edH() {
        for (blg_2 blg_22 : this.kuH) {
            blg_22.ecZ();
        }
    }

    public void dlH() {
        int n;
        int n2 = this.kuQ.fnx() + n;
        for (n = this.kuQ.eFS(); n < n2; ++n) {
            this.kuH[n].ecY();
        }
        fse_1.gFu().a((aef_2)this, kup, kuq);
    }

    public void a(sd_1 sd_12) {
        int n;
        int n2 = sd_12.XU.size();
        fqt_0[] fqt_0Array = fqt_0.values();
        int[] nArray = new int[fqt_0Array.length];
        boolean[] blArray = new boolean[fqt_0.gin()];
        Arrays.fill(nArray, 0);
        Arrays.fill(blArray, false);
        fqt_0[] fqt_0Array2 = fqt_0Array;
        int n3 = fqt_0Array2.length;
        for (int i = 0; i < n3; ++i) {
            fqt_0 fqt_02 = fqt_0Array2[i];
            nArray[fqt_02.ordinal()] = fqt_02.eFS();
        }
        for (n = 0; n < n2; ++n) {
            byte by = sd_12.XU.get((int)n).XX.Us;
            nArray[by] = nArray[by] + 1;
            blArray[n3] = true;
            if (this.kuH[n3].a(sd_12.XU.get((int)n).XX)) continue;
            kug.error((Object)("Impossible de r\u00e9cup\u00e9rer l'inventaire de shortcut #" + n));
        }
        for (n = 0; n < blArray.length; ++n) {
            if (blArray[n]) continue;
            this.kuH[n].clean();
        }
    }

    public blb_2 edI() {
        return this.kuO;
    }

    public blb_2 edJ() {
        return this.kuP;
    }
}

