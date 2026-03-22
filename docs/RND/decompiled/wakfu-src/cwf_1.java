/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteObjectIterator
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.iterator.TByteObjectIterator;
import gnu.trove.map.hash.TByteObjectHashMap;
import java.util.ArrayList;
import java.util.LinkedList;

/*
 * Renamed from cWF
 */
public class cwf_1
implements aeh_2,
ahv_1,
cBp,
cBr {
    private static final int nSZ = 1000;
    public static final String nTa = "cache";
    public static final String nTb = "memoryCache";
    public static final String nTc = "criterions";
    public static final String nTd = "events";
    public static final String nTe = "refresh";
    public static final String nTf = "cacheSourcesTotalSize";
    public static final String nTg = "sourcesTotalSize";
    public static final String nTh = "stratas";
    public static final String nTi = "log";
    public final String[] nTj = new String[]{"cache", "memoryCache", "criterions", "events", "refresh", "cacheSourcesTotalSize", "sourcesTotalSize", "log", "stratas"};
    private final TByteObjectHashMap<cwi_2> nTk = new TByteObjectHashMap();
    private final LinkedList<cwe_2> nTl = new LinkedList();
    private final LinkedList<cwd_1> nTm = new LinkedList();
    private final ArrayList<cwb_2> nTn = new ArrayList();
    private final LinkedList<cwe_2> nTo = new LinkedList();
    private final LinkedList<cwd_1> nTp = new LinkedList();
    private final ArrayList<cwb_2> nTq = new ArrayList();
    private final aah_1<cwh_2> nTr = new aah_1();
    private boolean dOj;
    private boolean nTs = true;

    public cwf_1(cwz_2 cwz_22) {
        cAY.eHc().a(this);
        for (cAN cAN2 : cAN.values()) {
            this.nTk.put(cAN2.eGR(), (Object)new cwi_2(cAN2));
        }
        ahw_1.a(cwf_1.class, this);
        cBn cBn2 = cAY.eHc().eHJ();
        ArrayList<cBq> arrayList = cBn2.eIh();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            cBq cBq2 = arrayList.get(i);
            cBq2.a(this);
            this.nTr.b(cBq2.d(), new cwh_2(cwz_22, cBq2));
        }
    }

    public void bmX() {
        int n;
        cAY.eHc().b(this);
        ahw_1.t(cwf_1.class);
        cBn cBn2 = cAY.eHc().eHJ();
        ArrayList<cBq> arrayList = cBn2.eIh();
        int n2 = arrayList.size();
        for (n = 0; n < n2; ++n) {
            arrayList.get(n).b(this);
        }
        n2 = this.nTr.bTR();
        for (n = 0; n < n2; ++n) {
            this.nTr.vU(n).clear();
        }
        this.nTr.clear();
    }

    @Override
    public String[] bxk() {
        return this.nTj;
    }

    public void bVm() {
        this.nTo.addAll(this.nTl);
        this.nTp.addAll(this.nTm);
        this.nTq.addAll(this.nTn);
        this.dOj = true;
        fse_1.gFu().a((aef_2)this, nTc, nTd, nTi);
    }

    public void ccE() {
        this.nTo.clear();
        this.nTp.clear();
        this.nTq.clear();
        this.dOj = false;
        fse_1.gFu().a((aef_2)this, nTc, nTd, nTi);
    }

    public String kD(boolean bl) {
        ahv_2 ahv_22 = new ahv_2();
        LinkedList<cwe_2> linkedList = this.dOj ? this.nTo : this.nTl;
        for (cwe_2 cwe_22 : linkedList) {
            Object object;
            byte by = cwe_22.eGR();
            if (by != -1) {
                object = cAN.dR(by);
                if (object == null) {
                    cwz_2.nSO.error((Object)"Game sound group inconnu !");
                    continue;
                }
                if (((cwi_2)this.nTk.get((byte)object.eGR())).nTH) continue;
                ahv_22.c(cwe_22.eWa()).c(" ");
                if (bl) {
                    ahv_22.ceu();
                }
                ahv_22.c(object.name());
                if (bl) {
                    ahv_22.cev();
                }
            } else {
                ahv_22.c(cwe_22.eWa()).c(" ");
                if (bl) {
                    ahv_22.ceu();
                }
                ahv_22.c("Null");
                if (bl) {
                    ahv_22.cev();
                }
            }
            object = cwe_22.getMessage().startsWith("Adding") ? awx_2.dnM.bQk() : awx_2.dnJ.bQk();
            ahv_22.c(" : ");
            if (bl) {
                ahv_22.ceC().ih((String)object);
            }
            ahv_22.c(cwe_22.getMessage());
            if (bl) {
                ahv_22.ceD();
            }
            ahv_22.ceH();
        }
        return ahv_22.ceL();
    }

    public String kE(boolean bl) {
        ahv_2 ahv_22 = new ahv_2();
        ArrayList<cwb_2> arrayList = this.dOj ? this.nTq : this.nTn;
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            cwb_2 cwb_22 = arrayList.get(i);
            if (bl) {
                ahv_22.ceu();
            }
            ahv_22.c(cwb_22.bAD()).c(" = ");
            if (bl) {
                ahv_22.cev();
            }
            ahv_22.c(cwb_22.getValue()).ceH();
        }
        return ahv_22.ceL();
    }

    public String kF(boolean bl) {
        ahv_2 ahv_22 = new ahv_2();
        LinkedList<cwd_1> linkedList = this.dOj ? this.nTp : this.nTm;
        int n = linkedList.size();
        for (int i = 0; i < n; ++i) {
            cwd_1 cwd_12 = linkedList.get(i);
            ahv_22.c(cwd_12.eWa()).c(" ");
            if (bl) {
                ahv_22.ceu();
            }
            ahv_22.c(cwd_12.eFd()).c(" : ");
            if (bl) {
                ahv_22.cev();
            }
            ahv_22.c(cwd_12.eWb()).ceH();
        }
        return ahv_22.ceL();
    }

    @Override
    public Object eu(String string) {
        if (string.equals(nTa)) {
            return this.nTk.values();
        }
        if (string.equals(nTi)) {
            return this.kD(true);
        }
        if (string.equals(nTf)) {
            return ahd_1.dRq.aVo();
        }
        if (string.equals(nTg)) {
            int n = 0;
            TByteObjectIterator tByteObjectIterator = this.nTk.iterator();
            while (tByteObjectIterator.hasNext()) {
                tByteObjectIterator.advance();
                n += ((cwi_2)tByteObjectIterator.value()).cca();
            }
            return n;
        }
        if (string.equals(nTb)) {
            long l = ahd_1.dRq.cdP();
            if (l < 1024L) {
                return l + " o";
            }
            if (l < 0x100000L) {
                return String.format("%.2f ko", Float.valueOf((float)l / 1024.0f));
            }
            return String.format("%.2f Mo", Float.valueOf((float)l / 1024.0f / 1024.0f));
        }
        if (string.equals(nTc)) {
            return this.kE(true);
        }
        if (string.equals(nTe)) {
            return this.nTs;
        }
        if (string.equals(nTd)) {
            return this.kF(true);
        }
        if (string.equals(nTh)) {
            return this.nTr;
        }
        return null;
    }

    public boolean eWc() {
        return this.nTs;
    }

    public void kG(boolean bl) {
        this.nTs = bl;
        fse_1.gFu().a((aef_2)this, nTe);
    }

    @Override
    public void a(cBq cBq2) {
        cwh_2 cwh_22 = this.nTr.vK(cBq2.d());
        if (cwh_22 != null) {
            cwh_22.eWe();
        }
    }

    @Override
    public void hR(long l) {
        this.nTn.clear();
        this.nTn.add(new cwb_2("Altitude", String.valueOf(cbr_0.eIZ().eJe())));
        this.nTn.add(new cwb_2("Num players", String.valueOf(cbr_0.eIZ().eJd())));
        this.nTn.add(new cwb_2("Season", String.valueOf((Object)cbr_0.eIZ().bjn())));
        this.nTn.add(new cwb_2("Temperature", String.valueOf(cbr_0.eIZ().blu() + "\u00b0w")));
        this.nTn.add(new cwb_2("Time", String.valueOf(cbr_0.eIZ().eJa() * 100.0f)));
        this.nTn.add(new cwb_2("Wakfu score", String.valueOf(cbr_0.eIZ().eJc() * 100.0f)));
        this.nTn.add(new cwb_2("Type de zone", cBi.dT((byte)cbr_0.eIZ().eJb()).aXB()));
        fse_1.gFu().a((aef_2)this, nTc);
    }

    @Override
    public void a(cCs cCs2) {
        if (this.nTm.size() == 50) {
            this.nTm.removeFirst();
        }
        this.nTm.add(new cwd_1(this.eWd(), cCs2.eJo(), cCs2.eJp()));
        fse_1.gFu().a((aef_2)this, nTd);
    }

    @Override
    public void a(azx_1<Byte, String> azx_12) {
        if (this.nTl.size() == 1000) {
            this.nTl.removeFirst();
        }
        this.nTl.addLast(new cwe_2(this.eWd(), azx_12.getFirst(), azx_12.aHI()));
        fse_1.gFu().a((aef_2)this, nTi);
    }

    private String eWd() {
        ux_0 ux_02 = ue_0.bjV().bjc();
        StringBuilder stringBuilder = new StringBuilder();
        int n = ux_02.bjE();
        int n2 = ux_02.bjF();
        int n3 = ux_02.bjH();
        stringBuilder.append("[");
        stringBuilder.append(n < 10 ? "0" : "").append(n).append(":");
        stringBuilder.append(n2 < 10 ? "0" : "").append(n2).append(":");
        stringBuilder.append(n3 < 10 ? "0" : "").append(n3);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

