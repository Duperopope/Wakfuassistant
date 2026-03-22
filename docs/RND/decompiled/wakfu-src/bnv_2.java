/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TByteArrayList
 *  gnu.trove.list.array.TShortArrayList
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TByteArrayList;
import gnu.trove.list.array.TShortArrayList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bnv
 */
public class bnv_2
implements aef_2,
aaB,
aan_0 {
    protected static final Logger iHP = Logger.getLogger(bnv_2.class);
    public static final String iHQ = "selectedName";
    public static final String iHR = "fleaList";
    public static final String iHS = "currentFlea";
    public static final String iHT = "selectedRoom";
    public static final String iHU = "room0";
    public static final String iHV = "room1";
    public static final String iHW = "room2";
    public static final String iHX = "room3";
    public static final String iHY = "room4";
    public static final String iHZ = "room5";
    public static final String iIa = "room6";
    public static final String iIb = "room7";
    public static final String iIc = "room8";
    public static final String[] iId = new String[]{"selectedName", "fleaList", "currentFlea", "selectedRoom", "room0", "room1", "room2", "room3", "room4", "room5", "room6", "room7", "room8"};
    private final bnp_2 iIe;
    bez_1 iIf;
    private final bnn_1 iIg;
    private final int[][] iIh = new int[18][18];
    private boolean iIi = true;
    private boolean iIj = false;
    private int iIk = 0;
    private String iIl = "";
    private String iIm = "";
    private short bkc;
    private final int iIn;
    private final int iIo;
    private short iIp;
    private final TShortArrayList iIq = new TShortArrayList(3);
    private final TByteArrayList iIr = new TByteArrayList(3);
    private final TByteArrayList iIs = new TByteArrayList(3);
    private final ArrayList<bnp_1> iIt = new ArrayList();
    private final ArrayList<bea_0> iIu = new ArrayList();

    public static String a(fnA fnA2) {
        return aum_0.cWf().c("dimensionalBag.gem.error." + fnA2.name(), new Object[0]);
    }

    public bnv_2() {
        this.iIg = new bnn_1();
        this.iIe = new bnp_2();
        this.iIe.a(new bnw_2(this));
        this.iIn = 0;
        this.iIo = 0;
        this.iIp = 0;
    }

    public void dyJ() {
        this.a((ffc_0)null);
    }

    void a(ffc_0 ffc_02) {
        if (ffc_02 == null || ffc_02.equals(this.iIf)) {
            csf_2.eOo().eOp();
            this.iIf = null;
        }
        fse_1.gFu().a((aef_2)this, iHR, iHS);
    }

    public boolean dyK() {
        iHP.debug((Object)"DimensionalBag.initializeToEnter()");
        this.aPc();
        return true;
    }

    private void aPc() {
        wy_0 wy_02 = wa_0.l((short)0, (short)0);
        this.iIg.b(wy_02);
        ajo_0 ajo_02 = (ajo_0)adk.buy().x((short)0, (short)0);
        this.iIg.a(ajo_02);
        aaa_0.brC().brE();
        this.dyY();
    }

    public void a(tg_1 tg_12) {
        if (tg_12 != null) {
            this.b(tg_12);
            this.aPc();
        }
    }

    public void Ey(int n) {
        this.iIg.Xo(n);
    }

    public int dyL() {
        return this.iIg.gex();
    }

    public int aqT() {
        return this.iIn;
    }

    public int aqV() {
        return this.iIo;
    }

    public short bsy() {
        return this.iIp;
    }

    public void bF(short s) {
        this.iIp = s;
    }

    public short bdM() {
        return this.bkc;
    }

    public void V(short s) {
        this.bkc = s;
    }

    public ArrayList<bea_0> dyM() {
        return this.iIu;
    }

    @Override
    public void e(String string, Object object) {
    }

    @Override
    public String[] bxk() {
        return iId;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(iHQ)) {
            return this.dyR();
        }
        if (string.equals(iHR)) {
            ArrayList<bez_1> arrayList = new ArrayList<bez_1>();
            TLongObjectIterator tLongObjectIterator = this.iIe.fVx();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                arrayList.add((bez_1)tLongObjectIterator.value());
            }
            return arrayList;
        }
        if (string.equals(iHS)) {
            return this.iIf;
        }
        if (string.equals(iHU)) {
            return this.iIt.get(0);
        }
        if (string.equals(iHV)) {
            return this.iIt.get(1);
        }
        if (string.equals(iHW)) {
            return this.iIt.get(2);
        }
        if (string.equals(iHX)) {
            return this.iIt.get(3);
        }
        if (string.equals(iHY)) {
            return this.iIt.get(4);
        }
        if (string.equals(iHZ)) {
            return this.iIt.get(5);
        }
        if (string.equals(iIa)) {
            return this.iIt.get(6);
        }
        if (string.equals(iIb)) {
            return this.iIt.get(7);
        }
        if (string.equals(iIc)) {
            return this.iIt.get(8);
        }
        return null;
    }

    @Override
    public boolean hP(String string) {
        return string.equals(iHQ);
    }

    @Override
    public void d(String string, Object object) {
    }

    @Override
    public void c(String string, Object object) {
        if (string.equals(iHQ) && object != null) {
            this.mf(object.toString());
        }
    }

    public anp_2 a(exP exP2, anp_2 anp_22) {
        int n;
        Object object;
        int n2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        boolean bl = exP2.Sn() == this.iIg.KU();
        int n3 = anp_22.bDU();
        for (n2 = 0; n2 < n3; ++n2) {
            fnp fnp2;
            object = anp_22.tj(n2);
            n = object[0];
            short s = (short)object[1];
            if (n >= 0 && n < 18 && s < 0 && !bl) break;
            if (n >= 0 && n < 18 && s >= 0 && s <= 18 && (fnp2 = this.iIg.dyU().gd(n, s)) instanceof fnz) {
                fnz fnz2 = (fnz)fnp2;
                ffV ffV2 = fnz2.nF(true);
                if (ffV2 == null) break;
                if (!this.iIg.a(exP2, fnz2.geC().orElse(null))) {
                    iHP.info((Object)("[Checkpath] Room access is forbidden for player with id " + exP2.Sn()));
                    break;
                }
            }
            arrayList.add(object);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        n2 = arrayList.size();
        object = new anp_2(n2);
        for (n = 0; n < n2; ++n) {
            ((anp_2)object).a(n, (int[])arrayList.get(n));
        }
        return object;
    }

    public void gH(boolean bl) {
        this.iIi = bl;
    }

    public void gI(boolean bl) {
        this.iIj = bl;
    }

    public void Ez(int n) {
        this.iIk = n;
    }

    public boolean dyN() {
        return this.iIi;
    }

    public boolean dyO() {
        return this.iIj;
    }

    public int dyP() {
        return this.iIk;
    }

    public String dyQ() {
        return this.iIl;
    }

    public void me(String string) {
        this.iIl = string;
    }

    public String dyR() {
        return this.iIm;
    }

    public void mf(String string) {
        this.iIm = string;
    }

    public long Xi() {
        return this.iIg.KU();
    }

    public bhJ dyS() {
        return (bhJ)bgg_0.dlO().ju(this.Xi());
    }

    public String dyT() {
        return this.iIg.dyT();
    }

    public fgj_0 cWp() {
        return this.iIg.cWp();
    }

    public fno dyU() {
        return this.iIg.dyU();
    }

    public bnn_1 dyV() {
        return this.iIg;
    }

    public boolean b(tg_1 tg_12) {
        boolean bl = this.iIg.b(tg_12);
        this.dyW();
        return bl;
    }

    public boolean a(tp_2 tp_22) {
        this.iIg.fr(tp_22.aba);
        this.iIg.db(tp_22.Ut);
        this.iIg.sQ(tp_22.abb);
        this.iIg.jQ(tp_22.TL);
        this.iIg.Xo(tp_22.abf);
        this.iIq.reset();
        this.iIr.reset();
        this.iIs.reset();
        this.iIu.clear();
        for (ts_2 gs_02 : tp_22.abG) {
            bea_0 bea_02 = new bea_0();
            bea_02.a(gs_02.abP);
            this.iIu.add(bea_02);
        }
        for (tq_1 tq_12 : tp_22.abH) {
            this.iIq.add((short)tq_12.abI);
            this.iIr.add(tq_12.abJ);
            this.iIs.add(tq_12.abK);
        }
        return true;
    }

    private void dyW() {
        this.iIt.clear();
        fno fno2 = this.iIg.dyU();
        byte by = fno2.gei();
        for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
            this.iIt.add(new bnp_1((fnz)fno2.gZ(by2)));
        }
    }

    public void bv(byte by) {
        bnp_1 bnp_12 = this.iIt.get(by);
        if (bnp_12 != null) {
            bnp_12.dhh();
        }
    }

    public bnp_2 dyX() {
        return this.iIe;
    }

    public boolean C(short s, short s2) {
        return this.iIg.C(s, s2);
    }

    public fnz bw(byte by) {
        return (fnz)this.iIg.dyU().gZ(by);
    }

    private Optional<fnB> D(short s, short s2) {
        fnp fnp2 = this.iIg.dyU().gd(s, s2);
        if (fnp2 instanceof fnz) {
            ffV ffV2 = ((fnz)fnp2).nF(true);
            if (ffV2 != null) {
                return Optional.ofNullable(fnB.Xq(ffV2.avr()));
            }
            return Optional.empty();
        }
        return Optional.empty();
    }

    @Override
    public void bsb() {
        this.dyY();
    }

    @Override
    public void brT() {
        this.dyY();
    }

    private void dyY() {
        Optional<fnB> optional;
        DisplayedScreenElement displayedScreenElement;
        short s;
        short s2;
        GC.setSeed(this.Xi());
        aaa_0 aaa_02 = aaa_0.brC();
        boolean[][] blArray = new boolean[19][19];
        bng_0[][] bng_0Array = new bng_0[19][19];
        fno fno2 = this.iIg.dyU();
        for (s2 = 0; s2 <= 18; s2 = (short)((short)(s2 + 1))) {
            for (s = 0; s <= 18; s = (short)(s + 1)) {
                displayedScreenElement = aaa_02.e(s2, s, 0, abd.ccX);
                if (displayedScreenElement == null) {
                    blArray[s2][s] = true;
                    continue;
                }
                optional = this.D(s2, s);
                if (optional.isEmpty()) {
                    blArray[s2][s] = true;
                    if (s2 >= 18 || s >= 18) continue;
                    displayedScreenElement.bT(false);
                    continue;
                }
                blArray[s2][s] = false;
                fnB fnB2 = (fnB)optional.get();
                bng_0 bng_02 = bne_0.a(fnB2);
                if (bng_02 == null) {
                    iHP.error((Object)("No pattern for room of type " + String.valueOf(fnB2) + ". Picking default pattern"));
                    bng_02 = bne_0.dzu();
                }
                displayedScreenElement.bT(true);
                bng_0Array[s2][s] = bng_02;
                int n = bng_02.E(s2, s);
                displayedScreenElement.re(n);
            }
        }
        for (s2 = 0; s2 <= 18; s2 = (short)((short)(s2 + 1))) {
            for (s = 0; s <= 18; s = (short)(s + 1)) {
                boolean bl;
                boolean bl2;
                int n;
                Object object;
                displayedScreenElement = aaa_02.e(s2, s, -4, abd.ccX);
                if (displayedScreenElement != null) {
                    displayedScreenElement.bT(false);
                }
                if ((optional = aaa_02.e(s2, s, -3, abd.ccX)) == null) continue;
                ((DisplayedScreenElement)((Object)optional)).bT(false);
                boolean bl3 = s % 6 == 0;
                boolean bl4 = s2 % 6 == 0;
                @Nullable fnz fnz2 = (fnz)fno2.gd(s2, s);
                Optional<Object> optional2 = fnz2 == null ? Optional.empty() : fnz2.geC();
                @Nullable fnz fnz3 = (fnz)fno2.gd(s2, s - 1);
                @Nullable fnz fnz4 = (fnz)fno2.gd(s2 - 1, s);
                @Nullable fnz fnz5 = (fnz)fno2.gd(s2 + 1, s);
                @Nullable fnz fnz6 = (fnz)fno2.gd(s2 - 1, s - 1);
                int n2 = 0;
                if (bl4 && bl3) {
                    boolean bl5;
                    object = fnz6 == null ? Optional.empty() : fnz6.geC();
                    n = fnz4 != null && fnz4.geC().isPresent() ? 1 : 0;
                    bl2 = fnz3 != null && fnz3.geC().isPresent();
                    bl = n != 0 || bl2;
                    boolean bl6 = optional2.isPresent() && ((Optional)object).isPresent() && optional2.equals(object);
                    boolean bl7 = optional2.isPresent() && n != 0 && optional2.equals(fnz4.geC());
                    boolean bl8 = optional2.isPresent() && bl2 && optional2.equals(fnz3.geC());
                    boolean bl9 = !bl6 || !bl7 || !bl8;
                    boolean bl10 = !((Optional)object).isPresent() && (s2 == 0 || s == 0) && bl;
                    boolean bl11 = bl5 = optional2.isPresent() || ((Optional)object).isPresent() || bl;
                    if ((bl10 || bl5) && bl9) {
                        n2 |= 4;
                    }
                }
                if (bl4) {
                    Object object2 = object = fnz4 == null ? Optional.empty() : fnz4.geC();
                    if (((Optional)object).isEmpty() && optional2.isPresent() || !((Optional)object).equals(optional2)) {
                        n2 |= 2;
                    }
                }
                if (bl3) {
                    Object object3 = object = fnz3 == null ? Optional.empty() : fnz3.geC();
                    if (((Optional)object).isEmpty() && optional2.isPresent() || !((Optional)object).equals(optional2)) {
                        n2 |= 1;
                    }
                }
                if ((object = bng_0Array[s2][s]) == null && n2 == 0) {
                    if (displayedScreenElement == null || s2 >= 18 || s >= 18) continue;
                    n = this.iIh[s2][s];
                    if (n <= 0) {
                        Optional<SI<Integer>> optional3 = bne_0.iJB.fZY();
                        if (optional3.isEmpty()) continue;
                        this.iIh[s2][s] = n = optional3.get().getValue().intValue();
                    }
                    displayedScreenElement.bT(true);
                    displayedScreenElement.re(n);
                    continue;
                }
                int n3 = n = object != null ? ((bng_0)object).EB(n2) : bne_0.dzu().EB(n2);
                if (n == -1 || n == 0) continue;
                bl2 = s2 == 0 && s == 2;
                boolean bl12 = bl = s == 0 && (s2 == 1 || s2 == 2);
                if (bl2 || bl) continue;
                ((DisplayedScreenElement)((Object)optional)).bT(true);
                ((DisplayedScreenElement)((Object)optional)).re(n);
            }
        }
    }

    public fnA a(byte by, ffV ffV2) {
        return this.iIg.a(by, ffV2, false);
    }

    public fnA f(byte by, boolean bl) {
        return this.iIg.c(by, bl, false);
    }

    public fnA a(byte by, boolean bl, byte by2, boolean bl2) {
        if (by == by2) {
            return fnA.sJO;
        }
        return this.iIg.b(by, bl, by2, bl2, false);
    }

    public fnA a(byte by, ffV ffV2, long l, boolean bl) {
        fnA fnA2 = this.iIg.b(by, ffV2, bl);
        if (fnA2 != fnA.sJF) {
            return fnA2;
        }
        aie_0.cfn();
        bgt_0 bgt_02 = aie_0.cfo().cVK();
        if (bl) {
            ffs_0 ffs_02 = fcI.ap(bgt_02.Xi(), l);
            if (ffs_02 == null) {
                return fnA.sJO;
            }
            if (!ffs_02.bt(ffV2)) {
                return fnA.sJO;
            }
            iHP.info((Object)("[GEM EXCHANGE FROM INVENTORY] commit ! gemUID=" + ffV2.LV() + ", bagUID=" + l + ", room=" + by));
            ffs_02.b(ffV2.LV(), (short)-1);
            this.iIg.b(by, ffV2, true);
            this.aPc();
        } else {
            cnh_0 cnh_02 = new cnh_0();
            cnh_02.nC(ffV2.LV());
            cnh_02.dA(by);
            aie_0.cfn();
            aie_0.cfo().etu().d(cnh_02);
        }
        return fnA2;
    }

    public fnA a(byte by, boolean bl, byte by2, boolean bl2, boolean bl3) {
        fnA fnA2 = this.a(by, bl, by2, bl2);
        if (fnA2 == fnA.sJF) {
            aie_0.cfn();
            bgt_0 bgt_02 = aie_0.cfo().cVK();
            if (bgt_02 != null) {
                if (bl3) {
                    iHP.info((Object)("[EXCHANGE GEM] commit ! sprimary=" + bl + " (pos:" + by + "), dprimary=" + bl2 + " (pos:" + by2 + ")"));
                    this.iIg.b(by, bl, by2, bl2, true);
                    this.aPc();
                } else {
                    iHP.info((Object)("[EXCHANGE GEM] query ! sprimary=" + bl + " (pos:" + by + "), dprimary=" + bl2 + " (pos:" + by2 + ")"));
                    cnj cnj2 = new cnj();
                    cnj2.jr(bl);
                    cnj2.js(bl2);
                    cnj2.dD(by);
                    cnj2.dE(by2);
                    aie_0.cfo().etu().d(cnj2);
                }
            } else {
                fnA2 = fnA.sJO;
            }
        }
        return fnA2;
    }

    public fnA b(byte by, ffV ffV2, long l, boolean bl) {
        fnA fnA2 = this.a(by, ffV2);
        if (fnA2 != fnA.sJF) {
            return fnA2;
        }
        if (l == 0L) {
            iHP.error((Object)"Cas non trait\u00e9");
            return fnA2;
        }
        aie_0.cfn();
        bgt_0 bgt_02 = aie_0.cfo().cVK();
        if (bgt_02 == null) {
            return fnA2;
        }
        ffs_0 ffs_02 = fcI.ap(bgt_02.Xi(), l);
        if (ffs_02 == null) {
            return fnA.sJO;
        }
        if (!ffs_02.bt(ffV2)) {
            return fnA.sJO;
        }
        if (bl) {
            iHP.info((Object)("[PUT GEM] commit ! gemUID=" + ffV2.LV() + ", bagUID=" + l + ", room=" + by));
            ffs_02.b(ffV2.LV(), (short)-1);
            this.iIg.a(by, ffV2, true);
            this.aPc();
        } else {
            iHP.info((Object)("[PUT GEM] query ! gemUID=" + ffV2.LV() + ", bagUID=" + l + ", room=" + by));
            cnh_0 cnh_02 = new cnh_0();
            cnh_02.nC(ffV2.LV());
            cnh_02.dA(by);
            aie_0.cfn();
            aie_0.cfo().etu().d(cnh_02);
        }
        return fnA2;
    }

    public fnA a(byte by, long l, byte by2, boolean bl, boolean bl2) {
        fnA fnA2;
        block10: {
            fnA2 = this.f(by, bl);
            if (fnA2 == fnA.sJF) {
                if (l == 0L) {
                    iHP.error((Object)"Cas non trait\u00e9");
                } else {
                    aie_0.cfn();
                    bgt_0 bgt_02 = aie_0.cfo().cVK();
                    if (bgt_02 != null) {
                        ffs_0 ffs_02 = fcI.ap(bgt_02.Xi(), l);
                        if (ffs_02 != null) {
                            try {
                                if (bl2) {
                                    this.iIg.c(by, bl, true);
                                    this.aPc();
                                    break block10;
                                }
                                cni cni2 = new cni();
                                cni2.nD(l);
                                cni2.dC(by2);
                                cni2.jq(bl);
                                cni2.dB(by);
                                aie_0.cfo().etu().d(cni2);
                            }
                            catch (Exception exception) {
                                iHP.error((Object)"Exception during removeGem", (Throwable)exception);
                                fnA2 = fnA.sJO;
                            }
                        } else {
                            fnA2 = fnA.sJO;
                        }
                    } else {
                        fnA2 = fnA.sJO;
                    }
                }
            }
        }
        return fnA2;
    }

    public ffV g(byte by, boolean bl) {
        return this.iIg.g(by, bl);
    }

    public fnE dyZ() {
        aie_0.cfn();
        bgt_0 bgt_02 = aie_0.cfo().cVK();
        bnv_2 bnv_22 = bgt_02.dnw();
        if (bnv_22 != null) {
            return this.iIg.gew();
        }
        return null;
    }

    public void a(fnE fnE2) {
        bgt_0 bgt_02 = aie_0.cfo().cVK();
        bnv_2 bnv_22 = bgt_02.dnw();
        if (bnv_22 != null && bnv_22 == bgt_02.dnx()) {
            tw_1 tw_12 = new tw_1();
            fnE2.c(tw_12);
            int n = tw_12.DN();
            ByteBuffer byteBuffer = ByteBuffer.allocate(n);
            tw_12.aF(byteBuffer);
            byteBuffer.flip();
            this.iIg.b(tw_12);
            cng_0 cng_02 = new cng_0();
            cng_02.el(byteBuffer.array());
            aie_0.cfn();
            aie_0.cfo().etu().d(cng_02);
        }
    }

    public void a(tw_1 tw_12) {
        iHP.info((Object)"[DIMENSIONAL BAG PERMISSIONS UPDATE]");
        this.iIg.b(tw_12);
    }

    public void h(long l, boolean bl) {
        bez_1 bez_12;
        if (aue_0.cVJ().cVK().dnx() != this && (bez_12 = (bez_1)this.iIe.tj(l)) != null) {
            bez_12.bl(bl);
            bez_12.dSo();
            fse_1.gFu().a((aef_2)this, iHR);
        }
    }

    public void dza() {
        aie_0.cfn();
        aue_0 aue_02 = aie_0.cfo();
        cmX cmX2 = new cmX();
        aue_02.etu().d(cmX2);
    }

    public void dzb() {
        Iterable iterable = () -> this.iIg.dyU().iterator();
        List list = StreamSupport.stream(iterable.spliterator(), false).flatMap(fnp2 -> fnp2.gen().stream()).toList();
        list.forEach(this::b);
    }

    public fnp a(fnH fnH2) {
        return this.iIg.a(fnH2);
    }

    public boolean b(fnH fnH2) {
        return this.iIg.b(fnH2);
    }

    public List<fnH> dzc() {
        ArrayList<fnH> arrayList = new ArrayList<fnH>();
        for (fnp fnp2 : this.iIg.dyU()) {
            arrayList.addAll(fnp2.gen());
        }
        return arrayList;
    }

    public boolean a(bgt_0 bgt_02, int n, int n2) {
        if (bgt_02.dnx() == this) {
            return true;
        }
        fnz fnz2 = (fnz)this.iIg.dyU().gd(n, n2);
        ffV ffV2 = fnz2.nF(true);
        if (ffV2 != null) {
            return this.iIg.a(bgt_02, fnz2.geC().orElse(null));
        }
        return false;
    }

    public void aZp() {
        this.iIg.aZp();
    }

    public void b(bez_1 bez_12) {
        this.iIf = bez_12;
        bkb_0 bkb_02 = aue_0.cVJ().cVK().dps();
        if (bkb_02 != null && this.iIf != null) {
            if (bkb_02 instanceof bkx_0) {
                bkx_0 bkx_02 = (bkx_0)((Object)bkb_02);
                this.iIf.mG(bkx_02.dsy().getName());
                this.iIf.CV(bkx_02.dsy().aVt());
                this.iIf.hC(bkx_02.dsy().dPw());
            } else {
                azx_1 azx_12 = csf_2.eOo().oj(this.iIf.Lx());
                fhc_0 fhc_02 = (fhc_0)azx_12.aHI();
                this.iIf.mG(fhc_02.getName());
                this.iIf.CV(fhc_02.aVt());
                this.iIf.ua(((Byte)azx_12.getFirst()).byteValue());
            }
            this.iIf.dSo();
        }
        fse_1.gFu().a((aef_2)this, iHS);
    }

    public bez_1 dzd() {
        return this.iIf;
    }

    public void dze() {
        if (!aiv_2.bBr().bpD()) {
            return;
        }
        short s = this.iIg.buM();
        long l = this.iIg.ccf();
        if (s <= 0 || l <= 0L) {
            aiv_2.bBr().bBk();
            return;
        }
        adD adD2 = adf_0.buP().av(s);
        if (adD2 == null) {
            return;
        }
        Optional<ahc_2> optional = adD2.w(l);
        if (optional.isEmpty()) {
            return;
        }
        ahc_2 ahc_22 = optional.get();
        aiv_2.bBr().ga(ahc_22.ccf());
    }
}

