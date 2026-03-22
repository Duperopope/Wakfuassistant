/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteObjectIterator
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TByteObjectIterator;
import gnu.trove.map.hash.TByteObjectHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from biM
 */
public class bim_0
implements pu_0,
aeh_2 {
    private static final Logger imn = Logger.getLogger(bim_0.class);
    public static final String imo = "main";
    public static final String imp = "mainCustom";
    public static final String imq = "hasCustom";
    public static final String imr = "isCustomFull";
    public static final String ims = "fight";
    public static final String imt = "secondary";
    public static final byte imu = 8;
    private static final HashMap<String, exx_2> imv = new HashMap();
    private final TByteObjectHashMap<bih_0> imw = new TByteObjectHashMap();
    private final bgy imx;
    private final ArrayList<bih_0> imy = new ArrayList();
    private final ArrayList<bih_0> imz = new ArrayList();
    private final ArrayList<bih_0> imA = new ArrayList();
    private final ArrayList<bih_0> imB = new ArrayList();
    private static final String imC = "highlightedCharacteristics";
    private static final Pattern imD;

    private static void b(exx_2 ... exx_2Array) {
        for (exx_2 exx_22 : exx_2Array) {
            imv.put(exx_22.name(), exx_22);
        }
    }

    public bim_0(bgy bgy2) {
        this.imx = bgy2;
        this.aL(bgy2);
        this.dqM();
    }

    private void aL(bgy bgy2) {
        this.imw.put(exx_2.rHr.aJr(), (Object)new bjb_2(bgy2.e(exx_2.rHp), this, bgy2, bgy2.e(exx_2.rGi), bgy2.e(exx_2.rHp)));
        this.imw.put(exx_2.rGi.aJr(), (Object)new biV(bgy2.e(exx_2.rGi), this, bgy2));
        this.imw.put(exx_2.rHp.aJr(), (Object)new biV(bgy2.e(exx_2.rHp), this, bgy2, 39));
        this.imw.put(exx_2.rGQ.aJr(), (Object)new bip_0(bgy2.e(exx_2.rGQ), this));
        this.imw.put(exx_2.rGj.aJr(), (Object)new biF(bgy2.e(exx_2.rGj), this, bgy2));
        this.imw.put(exx_2.rHu.aJr(), (Object)new big_0(bgy2.e(exx_2.rHu), this, bgy2));
        this.imw.put(exx_2.rHH.aJr(), (Object)new biW(this, bgy2));
        this.imw.put(exx_2.rHT.aJr(), (Object)new bja_2(this, bgy2));
        this.imw.put(exx_2.rHN.aJr(), (Object)new biY(this, bgy2));
        this.a(bgy2.e(exx_2.rGk), (byte)2);
        this.a(bgy2.e(exx_2.rGl), (byte)5);
        this.a(bgy2.e(exx_2.rGq));
        this.a(bgy2.e(exx_2.rGI));
        this.a(bgy2, exx_2.rGx, exx_2.rGC, true);
        this.a(bgy2, exx_2.rGz, exx_2.rGE, true);
        this.a(bgy2, exx_2.rGy, exx_2.rGD, true);
        this.a(bgy2, exx_2.rGA, exx_2.rGF, true);
        this.a(bgy2, exx_2.rHn, exx_2.rHo, true);
        this.a(bgy2, exx_2.rHF, exx_2.rHG, true);
        this.a(bgy2, exx_2.rGC, exx_2.rGx, false);
        this.a(bgy2, exx_2.rGE, exx_2.rGz, false);
        this.a(bgy2, exx_2.rGD, exx_2.rGy, false);
        this.a(bgy2, exx_2.rGF, exx_2.rGA, false);
        this.a(bgy2, exx_2.rHo, exx_2.rHn, false);
        this.a(bgy2, exx_2.rHG, exx_2.rHF, false);
        this.a(bgy2.e(exx_2.rGN));
        this.a(bgy2.e(exx_2.rGM));
        this.a(bgy2.e(exx_2.rGK));
        this.a(bgy2.e(exx_2.rGL));
        this.a(bgy2.e(exx_2.rGu));
        this.c(bgy2.e(exx_2.rHm));
        this.b(bgy2.e(exx_2.rGp));
        this.c(bgy2.e(exx_2.rGo));
        this.b(bgy2.e(exx_2.rGO));
        this.b(bgy2.e(exx_2.rHK));
        this.a(bgy2.e(exx_2.rHl));
        this.a(bgy2.e(exx_2.rGt));
        this.a(bgy2.e(exx_2.rGv));
        this.a(bgy2.e(exx_2.rGq));
        this.a(bgy2.e(exx_2.rGR));
        this.a(bgy2.e(exx_2.rGJ));
        this.a(bgy2.e(exx_2.rGH));
        this.a(bgy2.e(exx_2.rGn));
        this.a(bgy2.e(exx_2.rGm));
        this.a(bgy2.e(exx_2.rGw));
        this.a(bgy2.e(exx_2.rGB));
        this.a(bgy2.e(exx_2.rHs));
        this.a(bgy2.e(exx_2.rHz));
        this.a(bgy2.e(exx_2.rHA));
        this.a(bgy2.e(exx_2.rHD));
        this.b(bgy2.e(exx_2.rHx));
        this.b(bgy2.e(exx_2.rHQ));
        this.b(bgy2.e(exx_2.rHR));
    }

    private void dqM() {
        this.dqP();
        this.dqO();
        this.dqN();
    }

    private void dqN() {
        this.imA.add((bih_0)this.imw.get(exx_2.rGR.aJr()));
        this.imA.add((bih_0)this.imw.get(exx_2.rHs.aJr()));
        this.imA.add((bih_0)this.imw.get(exx_2.rGt.aJr()));
        this.imA.add((bih_0)this.imw.get(exx_2.rGu.aJr()));
        this.imA.add((bih_0)this.imw.get(exx_2.rHz.aJr()));
        this.imA.add((bih_0)this.imw.get(exx_2.rHQ.aJr()));
        this.imA.add((bih_0)this.imw.get(exx_2.rHA.aJr()));
        this.imA.add((bih_0)this.imw.get(exx_2.rHR.aJr()));
        this.imA.add((bih_0)this.imw.get(exx_2.rGv.aJr()));
        this.imA.add((bih_0)this.imw.get(exx_2.rHx.aJr()));
        this.imA.add((bih_0)this.imw.get(exx_2.rHD.aJr()));
    }

    private void dqO() {
        this.imz.add((bih_0)this.imw.get(exx_2.rGO.aJr()));
        this.imz.add((bih_0)this.imw.get(exx_2.rHK.aJr()));
        this.imz.add((bih_0)this.imw.get(exx_2.rGo.aJr()));
        this.imz.add((bih_0)this.imw.get(exx_2.rHm.aJr()));
        this.imz.add((bih_0)this.imw.get(exx_2.rGI.aJr()));
        this.imz.add((bih_0)this.imw.get(exx_2.rGq.aJr()));
        this.imz.add((bih_0)this.imw.get(exx_2.rGn.aJr()));
        this.imz.add((bih_0)this.imw.get(exx_2.rGm.aJr()));
        this.imz.add((bih_0)this.imw.get(exx_2.rGJ.aJr()));
        this.imz.add((bih_0)this.imw.get(exx_2.rGH.aJr()));
        this.imz.add((bih_0)this.imw.get(exx_2.rHl.aJr()));
    }

    private void dqP() {
        this.imy.add((bih_0)this.imw.get(exx_2.rGi.aJr()));
        this.imy.add((bih_0)this.imw.get(exx_2.rGj.aJr()));
        this.imy.add((bih_0)this.imw.get(exx_2.rGk.aJr()));
        this.imy.add((bih_0)this.imw.get(exx_2.rGl.aJr()));
    }

    private void a(exf_2 exf_22) {
        this.a(exf_22, (byte)-1);
    }

    private void a(exf_2 exf_22, byte by) {
        exx_2 exx_22 = exf_22.dqy();
        this.imw.put(exx_22.aJr(), (Object)new bil_0(exf_22, this, by));
    }

    private void b(exf_2 exf_22) {
        this.b(exf_22, (byte)-1);
    }

    private void b(exf_2 exf_22, byte by) {
        exx_2 exx_22 = exf_22.dqy();
        this.imw.put(exx_22.aJr(), (Object)new biz_0(exf_22, this, by));
    }

    private void c(exf_2 exf_22) {
        this.c(exf_22, (byte)-1);
    }

    private void c(exf_2 exf_22, byte by) {
        exx_2 exx_22 = exf_22.dqy();
        this.imw.put(exx_22.aJr(), (Object)new biU(exf_22, this, by));
    }

    private void a(bgy bgy2, exx_2 exx_22, exx_2 exx_23, boolean bl) {
        exf_2 exf_22 = bgy2.e(exx_22);
        exf_2 exf_23 = bgy2.e(exx_23);
        this.imw.put(exf_22.dqy().aJr(), (Object)new biq_0(exf_22, this, bgy2, exf_23, bl));
    }

    public void c(exx_2 ... exx_2Array) {
        for (exx_2 exx_22 : exx_2Array) {
            bih_0 bih_02 = (bih_0)this.imw.get(exx_22.aJr());
            if (bih_02 == null) continue;
            bih_02.dqL();
        }
    }

    @Override
    public void a(pr_0 pr_02) {
        exx_2 exx_22 = (exx_2)pr_02.aYQ();
        switch (exx_22) {
            case rGi: 
            case rHp: 
            case rHr: 
            case rGk: 
            case rGj: 
            case rGl: 
            case rHH: 
            case rHT: {
                fse_1.gFu().a((aef_2)this.imx, "timelineDescription");
                break;
            }
            case rGB: {
                this.c(exx_2.rGF, exx_2.rGE, exx_2.rGC, exx_2.rGD, exx_2.rHo, exx_2.rHG);
                break;
            }
            case rGw: {
                this.c(exx_2.rGA, exx_2.rGz, exx_2.rGx, exx_2.rGy, exx_2.rHn, exx_2.rHF);
            }
        }
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(imo)) {
            return this.imy;
        }
        if (string.equals(imp)) {
            return this.imB;
        }
        if (string.equals(imq)) {
            return this.imB.size() != 0;
        }
        if (string.equals(imr)) {
            return this.imB.size() >= 8;
        }
        if (string.equals(ims)) {
            return this.imz;
        }
        if (string.equals(imt)) {
            return this.imA;
        }
        exx_2 exx_22 = imv.get(string);
        if (exx_22 != null) {
            return this.imw.get(exx_22.aJr());
        }
        return null;
    }

    public bih_0 h(exx_2 exx_22) {
        return (bih_0)this.imw.get(exx_22.aJr());
    }

    public void a(exx_2 exx_22, boolean bl) {
        this.a(exx_22, bl, true);
        this.dqS();
    }

    public void a(exx_2 exx_22, boolean bl, boolean bl2) {
        bih_0 bih_02 = (bih_0)this.imw.get(exx_22.aJr());
        if (bih_02 == null) {
            imn.warn((Object)("On essaye de highlighter une caract\u00e9ristique qui n'est pas dans le provider : " + String.valueOf(exx_22)));
            return;
        }
        bih_02.gl(bl);
        if (bl && !this.imB.contains(bih_02)) {
            this.imB.add(bih_02);
            if (bl2) {
                fse_1.gFu().a((aef_2)this, imr, imp, imq);
            }
        } else if (!bl && this.imB.contains(bih_02)) {
            this.imB.remove(bih_02);
            if (bl2) {
                fse_1.gFu().a((aef_2)this, imr, imp, imq);
            }
        }
    }

    private void dqQ() {
        this.imB.clear();
        TByteObjectIterator tByteObjectIterator = this.imw.iterator();
        while (tByteObjectIterator.hasNext()) {
            tByteObjectIterator.advance();
            ((bih_0)tByteObjectIterator.value()).gl(false);
        }
    }

    public void dqR() {
        this.dqQ();
        String string = aub_0.cVb().a((byte)1, this.dqT());
        if (string == null) {
            return;
        }
        Matcher matcher = imD.matcher(string);
        while (matcher.find()) {
            byte by = Bw.q(matcher.group(1));
            exx_2 exx_22 = exx_2.c(by);
            if (exx_22 == null) continue;
            if (!imv.containsKey(exx_22.name())) {
                this.a(exx_22, false, false);
                continue;
            }
            this.a(exx_22, true, false);
        }
        fse_1.gFu().a((aef_2)this, imr, imp, imq);
    }

    public void dqS() {
        StringBuilder stringBuilder = new StringBuilder();
        int n = this.imB.size();
        for (int i = 0; i < n; ++i) {
            stringBuilder.append(this.imB.get(i).dqy().aJr()).append(";");
        }
        aub_0.cVb().a((byte)1, this.dqT(), stringBuilder.toString());
    }

    private String dqT() {
        return imC + this.imx.Sn();
    }

    public void dqU() {
        this.imy.clear();
        this.imy.add((bih_0)this.imw.get(exx_2.rGi.aJr()));
        this.imy.add((bih_0)this.imw.get(exx_2.rGj.aJr()));
        this.imy.add((bih_0)this.imw.get(exx_2.rGk.aJr()));
        this.imy.add((bih_0)this.imw.get(exx_2.rHH.aJr()));
    }

    static {
        bim_0.b(exx_2.rGi, exx_2.rHp, exx_2.rHr, exx_2.rGj, exx_2.rGk, exx_2.rGl, exx_2.rGq, exx_2.rGI, exx_2.rGQ, exx_2.rGx, exx_2.rGz, exx_2.rGy, exx_2.rGA, exx_2.rHn, exx_2.rHF, exx_2.rGC, exx_2.rGE, exx_2.rGD, exx_2.rGF, exx_2.rHo, exx_2.rHG, exx_2.rGN, exx_2.rGM, exx_2.rGK, exx_2.rGL, exx_2.rGu, exx_2.rHm, exx_2.rHl, exx_2.rGt, exx_2.rGO, exx_2.rHs, exx_2.rHK, exx_2.rGv, exx_2.rGq, exx_2.rGp, exx_2.rGo, exx_2.rGR, exx_2.rGJ, exx_2.rGH, exx_2.rGn, exx_2.rGm, exx_2.rHu, exx_2.rHQ, exx_2.rHR, exx_2.rHz, exx_2.rHA, exx_2.rHD, exx_2.rHx, exx_2.rHH, exx_2.rHT, exx_2.rHN);
        imD = Pattern.compile("([0-9]+);?");
    }
}

