/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Comparator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class aPt
implements aeh_2 {
    private static final Logger eyK = Logger.getLogger(aPt.class);
    private static final aPt eyL = new aPt();
    private int eyM = 0;
    private final TIntObjectHashMap<apr_0> eyN = new TIntObjectHashMap();
    public static final String eyO = "chatTextStyle";
    public static final String eyP = "allFiltersList";
    public static final String[] eyQ = new String[]{"chatTextStyle", "allFiltersList"};
    private int eyR = -1;
    private int eyS = -1;

    public static aPt cAg() {
        return eyL;
    }

    @Override
    public String[] bxk() {
        return eyQ;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(eyO)) {
            return this.cAh();
        }
        if (string.equals(eyP)) {
            return this.cAu();
        }
        return null;
    }

    public String cAh() {
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        apv_0 apv_02 = apv_0.values()[bsg_12.d(bsn_1.ljA)];
        return "white" + (apv_02 != null ? apv_02.cAC() : apv_0.eyW.cAC()) + "Bordered";
    }

    public apr_0 c(apn_0 apn_02) {
        TIntObjectIterator tIntObjectIterator = this.eyN.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            apr_0 apr_02 = (apr_0)tIntObjectIterator.value();
            if (!apr_02.a(apn_02)) continue;
            return apr_02;
        }
        return null;
    }

    public int d(apn_0 apn_02) {
        apr_0 apr_02 = this.c(apn_02);
        return apr_02 == null ? -1 : apr_02.czm();
    }

    public boolean e(apn_0 apn_02) {
        TIntObjectIterator tIntObjectIterator = this.eyN.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            apr_0 apr_02 = (apr_0)tIntObjectIterator.value();
            if (apr_02.czW() != apn_02) continue;
            return true;
        }
        return false;
    }

    public boolean n(aPl aPl2) {
        TIntObjectIterator tIntObjectIterator = this.eyN.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            apr_0 apr_02 = (apr_0)tIntObjectIterator.value();
            apn_0 apn_02 = apr_02.czW();
            if (apn_02 == null) {
                eyK.error((Object)("Vue courante de la fen\u00eatre de chat d'id=" + apr_02.czm() + " inexistante !!!"));
                continue;
            }
            if (!apn_02.a(aPl2)) continue;
            return true;
        }
        return false;
    }

    public apr_0 cAi() {
        if (this.cAl().cAf()) {
            return this.cAl();
        }
        TIntObjectIterator tIntObjectIterator = this.eyN.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            apr_0 apr_02 = (apr_0)tIntObjectIterator.value();
            if (!apr_02.cAf()) continue;
            return apr_02;
        }
        return null;
    }

    public apr_0 cAj() {
        apr_0 apr_02 = new apr_0(this.cAk());
        this.eyN.put(apr_02.czm(), (Object)apr_02);
        return apr_02;
    }

    private int cAk() {
        for (int i = 0; i < this.eyN.size(); ++i) {
            if (this.eyN.get(i) != null) continue;
            return i;
        }
        return this.eyN.size();
    }

    public apr_0 zc(int n) {
        if (this.eyN.get(n) != null) {
            eyK.error((Object)("Window d\u00e9j\u00e0 pr\u00e9sente \u00e0 l'index : " + n));
            return null;
        }
        apr_0 apr_02 = new apr_0(n);
        this.eyN.put(apr_02.czm(), (Object)apr_02);
        return apr_02;
    }

    public void dc(int n, int n2) {
        if (!this.eyN.containsKey(n)) {
            eyK.error((Object)("on cherche \u00e0 supprimer une fen\u00eatre de chat inconnue d'id=" + n));
            return;
        }
        if (this.eyM == n) {
            if (n2 == -1) {
                n2 = this.zd(n);
            }
            if (n2 == -1) {
                eyK.error((Object)"impossible d'atteindre une fen\u00eatre de chat ! On annule la suppression dans le manager");
                return;
            }
            this.eyM = n2;
        }
        apr_0 apr_02 = (apr_0)this.eyN.remove(n);
        apr_02.cAd();
        apr_02.cAc();
    }

    private int zd(int n) {
        for (int n2 : this.eyN.keys()) {
            if (n == n2) continue;
            return n2;
        }
        return -1;
    }

    public apr_0 cAl() {
        return (apr_0)this.eyN.get(this.eyM);
    }

    public int cAm() {
        return this.eyN.size();
    }

    public apr_0 ze(int n) {
        return (apr_0)this.eyN.get(n);
    }

    public void zf(int n) {
        this.eyM = n;
    }

    public void b(apr_0 apr_02) {
        if (apr_02 != null) {
            this.eyM = apr_02.czm();
        } else {
            eyK.warn((Object)"On essaye de d\u00e9finir une vue pas enregistr\u00e9e dans le ChatWindowManager comme vue courante. (Ignor\u00e9)");
        }
    }

    public TIntObjectIterator<apr_0> cAn() {
        return this.eyN.iterator();
    }

    public apr_0 cAo() {
        return (apr_0)this.eyN.get(0);
    }

    @Nullable
    public apn_0 a(String string, aPa aPa2) {
        TIntObjectIterator tIntObjectIterator = this.eyN.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            TIntObjectIterator<apn_0> tIntObjectIterator2 = ((apr_0)tIntObjectIterator.value()).czR();
            while (tIntObjectIterator2.hasNext()) {
                tIntObjectIterator2.advance();
                apn_0 apn_02 = (apn_0)tIntObjectIterator2.value();
                if (!apn_02.getName().equals(string) || !apn_02.czN().equals(aPa2)) continue;
                return apn_02;
            }
        }
        return null;
    }

    @Nullable
    public apr_0 zg(int n) {
        TIntObjectIterator tIntObjectIterator = this.eyN.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            apr_0 apr_02 = (apr_0)tIntObjectIterator.value();
            TIntObjectIterator<apn_0> tIntObjectIterator2 = apr_02.czR();
            while (tIntObjectIterator2.hasNext()) {
                tIntObjectIterator2.advance();
                apn_0 apn_02 = (apn_0)tIntObjectIterator2.value();
                if (apn_02.cyJ() != n) continue;
                return apr_02;
            }
        }
        return null;
    }

    public boolean zh(int n) {
        return this.eyS == n;
    }

    public boolean zi(int n) {
        return this.eyR == n;
    }

    public void cAp() {
    }

    public void cAq() {
        apr_0 apr_02 = this.cAl();
        if (apr_02 == null) {
            return;
        }
        apn_0 apn_02 = apr_02.czW();
        if (apn_02 == null) {
            return;
        }
        apn_02.clean();
    }

    public void cAr() {
        TIntObjectIterator tIntObjectIterator = this.eyN.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((apr_0)tIntObjectIterator.value()).cAb();
        }
    }

    public apr_0 a(apn_0 apn_02, int n, int n2) {
        apr_0 apr_02 = this.ze(n);
        apr_0 apr_03 = n2 == -1 ? aPt.cAg().cAj() : this.ze(n2);
        this.a(apr_02, apn_02, n2);
        apr_03.b(apn_02);
        apr_03.a((aOY)apn_02);
        csz_1.ePn().d(apr_02);
        csz_1.ePn().d(apr_03);
        aym_0.c(apr_03);
        return apr_03;
    }

    public void a(apr_0 apr_02, apn_0 apn_02, int n) {
        apr_02.a(apn_02, n == -1);
        if (apr_02.czY() == 0) {
            int n2 = apr_02.czm();
            this.dc(n2, n);
            csz_1.ePn().Mx(n2);
        } else {
            apr_02.czT();
        }
    }

    public int cAs() {
        int n = 0;
        TIntObjectIterator tIntObjectIterator = this.eyN.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            apr_0 apr_02 = (apr_0)tIntObjectIterator.value();
            n += apr_02.eG(true);
        }
        return n;
    }

    public ArrayList<apn_0> cAt() {
        ArrayList<apn_0> arrayList = new ArrayList<apn_0>();
        TIntObjectIterator tIntObjectIterator = this.eyN.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            apr_0 apr_02 = (apr_0)tIntObjectIterator.value();
            TIntObjectIterator<apn_0> tIntObjectIterator2 = apr_02.czR();
            while (tIntObjectIterator2.hasNext()) {
                tIntObjectIterator2.advance();
                arrayList.add((apn_0)tIntObjectIterator2.value());
            }
        }
        arrayList.sort(new aPu(this));
        return arrayList;
    }

    private ArrayList<aPQ> cAu() {
        ArrayList<aPQ> arrayList = new ArrayList<aPQ>();
        for (apj_0 apj_02 : aPh.czg().czi()) {
            if (!apj_02.czx()) continue;
            arrayList.add(new aPQ(apj_02, false));
        }
        arrayList.sort(Comparator.comparingInt(aPQ::d));
        return arrayList;
    }

    private ArrayList<aPQ> cAv() {
        ArrayList<aPQ> arrayList = new ArrayList<aPQ>();
        for (apj_0 apj_02 : aPh.czg().czi()) {
            if (!apj_02.czw()) continue;
            arrayList.add(new aPQ(apj_02, false));
        }
        arrayList.sort(Comparator.comparingInt(aPQ::d));
        return arrayList;
    }

    public void cAw() {
        try {
            aPb.buR();
        }
        catch (Exception exception) {
            eyK.error((Object)"Erreur \u00e0 la sauvegarde du chat :");
            eyK.error((Object)"Exception during saveChatConfiguration", (Throwable)exception);
        }
    }

    public void clean() {
        TIntObjectIterator tIntObjectIterator = this.eyN.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((apr_0)tIntObjectIterator.value()).clean();
        }
        this.eyN.clear();
    }

    public void cAx() {
        this.clean();
        try {
            aPb.czb();
        }
        catch (Exception exception) {
            eyK.error((Object)"Erreur \u00e0 la suppression du fichier utilisateur du chat");
            eyK.error((Object)"Exception during cleanAndDeletePreferences", (Throwable)exception);
        }
    }

    public void cAy() {
        TIntObjectIterator tIntObjectIterator = this.eyN.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            apr_0 apr_02 = (apr_0)tIntObjectIterator.value();
            fse_1.gFu().a((aef_2)apr_02, apr_02.bxk());
            apr_02.cAe();
        }
        fse_1.gFu().a((aef_2)this, eyP);
    }

    public void cAz() {
        TIntObjectIterator tIntObjectIterator = this.eyN.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            apr_0 apr_02 = (apr_0)tIntObjectIterator.value();
            TIntObjectIterator<apn_0> tIntObjectIterator2 = apr_02.czR();
            while (tIntObjectIterator2.hasNext()) {
                tIntObjectIterator2.advance();
                ((apn_0)tIntObjectIterator2.value()).cyE();
            }
        }
    }

    public int cAA() {
        return this.eyS;
    }

    public void zj(int n) {
        this.eyS = n;
    }

    public int cAB() {
        return this.eyR;
    }

    public void zk(int n) {
        this.eyR = n;
    }
}

