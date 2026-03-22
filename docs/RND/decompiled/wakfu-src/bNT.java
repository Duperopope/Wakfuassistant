/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 */
import com.google.common.base.Strings;
import gnu.trove.set.hash.TByteHashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class bNT
implements aeh_2 {
    protected static final Logger kJk = Logger.getLogger(bNT.class);
    public static final String kJl = "currentName";
    public static final String kJm = "linksByIsland";
    public static final String kJn = "iconUrl";
    public static final String kJo = "transportType";
    public static final String kJp = "gfxId";
    private final Map<Integer, bNP> kJq = new HashMap<Integer, bNP>();
    private long kJr;
    private int eig;
    private boolean kJs;
    public static String kIG;
    private static final Pattern kJt;
    private static final List<Integer> kJu;
    private static final bNQ kJv;

    public boolean p(long l, boolean bl) {
        List<Long> list = ewo_0.oBF.o(ewr_0.oBV);
        this.kJs = bl;
        this.kJq.clear();
        kJv.egw();
        this.kJr = l;
        if (this.kJs) {
            this.eig = -1;
        } else {
            Object Info2 = frb_0.sYO.a(fre_0.sYZ, this.kJr);
            this.eig = ((frk_0)Info2).clx();
        }
        long l2 = aue_0.cVJ().cVO().xl();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        Set<Integer> set = frz.a(l2, zd_2.aoC);
        set.addAll(frb_0.sYO.gkl());
        set.forEach(n -> {
            bNS bNS2;
            frn_0 frn_02 = (frn_0)frb_0.sYO.a(fre_0.sYZ, n.intValue());
            if (frn_02 == null || frn_02.Sn() == l || !frn_02.bZ(bgt_02)) {
                return;
            }
            if (list.contains(frn_02.clw())) {
                return;
            }
            int n2 = frn_02.gks();
            bNP bNP2 = this.kJq.getOrDefault(n2, new bNP(frb_0.sYO.uJ(n2)));
            this.kJq.putIfAbsent(n2, bNP2);
            fro_0 fro_02 = bl ? new fro_0(0L, (int)l, (int)frn_02.Sn()) : frb_0.sYO.aN(l, frn_02.Sn());
            boolean bl2 = true;
            TByteHashSet tByteHashSet = new TByteHashSet();
            evd_2 evd_22 = bgt_02.dpL();
            evx_1 evx_12 = evy_1.oxK.a(frn_02.clw(), evd_22.fdL());
            if (evx_12 == evx_1.oxH && !evd_22.b(evv_1.oxr)) {
                bl2 = false;
                tByteHashSet.add((byte)1);
            }
            if (kJu.contains((int)(bNS2 = new bNS(fro_02, this.kJr, frn_02.wp(), bl2, tByteHashSet)).Sn())) {
                bNS2.ii(true);
                kJv.a(bNS2);
            }
            bNP2.a(bNS2);
        });
        return true;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    public List<bNP> egz() {
        ArrayList<bNP> arrayList = new ArrayList<bNP>();
        for (bNP bNP2 : this.kJq.values()) {
            if (bNP2.egv().isEmpty()) continue;
            arrayList.add(bNP2);
        }
        if (!kJv.egv().isEmpty()) {
            arrayList.add(kJv);
        }
        arrayList.sort(bNU.kJw);
        return arrayList;
    }

    public void ke(String string) {
        kIG = string;
        fse_1.gFu().a((aef_2)this, kJm);
    }

    public void lY(long l) {
        for (bNP bNP2 : this.kJq.values()) {
            bNS bNS2 = bNP2.lX(l);
            if (bNS2 == null) continue;
            bNS2.ii(!bNS2.egx());
            Integer n = (int)l;
            boolean bl = kJu.contains(n);
            if (bNS2.egx() && !bl) {
                kJu.add(n);
                kJv.a(bNS2);
                this.egB();
            } else if (!bNS2.egx() && bl) {
                kJu.remove(n);
                kJv.b(bNS2);
                this.egB();
            }
            fse_1.gFu().a((aef_2)this, kJm);
            return;
        }
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kJm)) {
            return this.kJq.isEmpty() ? null : this.egz();
        }
        if (string.equals(kJl)) {
            return this.kJs ? aum_0.cWf().c("haven.world.zaap.name", new Object[0]) : aum_0.cWf().a(36, (long)((int)this.kJr), new Object[0]);
        }
        if (string.equals(kJn)) {
            return auc_0.cVq().a("zaapTypeIconPath", "defaultIconPath", this.eig == -1 ? bNN.kIL.egt() : this.eig);
        }
        if (string.equals(kJo)) {
            return bNN.kIL.egt();
        }
        if (string.equals(kJp)) {
            return this.eig;
        }
        return null;
    }

    private static List<Integer> egA() {
        kJk.info((Object)"Loading list of favourite zaaps");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        String string = aub_0.cVb().a((byte)1, bsn_1.lko.getKey());
        if (Strings.isNullOrEmpty((String)string)) {
            return arrayList;
        }
        Matcher matcher = kJt.matcher(string);
        while (matcher.find()) {
            String string2 = matcher.group(1);
            try {
                arrayList.add(Integer.valueOf(string2));
            }
            catch (NumberFormatException numberFormatException) {
                kJk.error((Object)("An error was thrown while parsing favourite zaaps: could not cast value to long. Value: " + string2));
            }
        }
        return arrayList;
    }

    private void egB() {
        kJk.info((Object)"Saving favourite zaaps");
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer n : kJu) {
            stringBuilder.append(n).append(';');
        }
        aub_0.cVb().a((byte)1, bsn_1.lko.getKey(), stringBuilder.toString());
    }

    static {
        kJt = Pattern.compile("([0-9]+);?");
        kJu = bNT.egA();
        kJv = new bNQ();
    }
}

