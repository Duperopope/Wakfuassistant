/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aPr
 */
public class apr_0
implements aeh_2 {
    private static final Logger eyy = Logger.getLogger(apr_0.class);
    public static final int eyz = 12;
    public static final String eyA = "currentView";
    public static final String eyB = "list";
    public static final String eyC = "windowId";
    public static final String eyD = "canAddView";
    public static final String eyE = "isInLine";
    public static final String[] eyF = new String[]{"currentView", "list", "canAddView", "windowId", "isInLine"};
    private int eyG = 0;
    private final TIntObjectHashMap<apn_0> eyH = new TIntObjectHashMap();
    private int ewY = -1;
    private boolean eyI = false;
    private Integer eyJ = null;

    public apr_0(int n) {
        this.ewY = n;
    }

    public int czm() {
        return this.ewY;
    }

    public apn_0 czP() {
        int n = aPt.cAg().cAs() + 1;
        int n2 = this.eyH.size();
        if (n2 >= 12) {
            aPd.e("error.chatViewMaxReached", new Object[0]);
            return null;
        }
        int n3 = this.czQ();
        apn_0 apn_02 = new apn_0(n3, aum_0.cWf().c("chat.pipeName.personnal", n), aPa.evq, aPl.exL, false);
        aym_0.f(apn_02);
        this.eyH.put(n3, (Object)apn_02);
        fse_1.gFu().a((aef_2)this, eyB, eyD);
        return apn_02;
    }

    public apn_0 a(int n, String string, aPa aPa2) {
        int n2 = n == -1 ? this.czQ() : n;
        int n3 = this.eyH.size();
        if (n3 >= 12) {
            aPd.e("error.chatViewMaxReached", new Object[0]);
            return null;
        }
        apn_0 apn_02 = new apn_0(n2, string, aPa2, aPl.exM, false, true);
        this.eyH.put(n2, (Object)apn_02);
        fse_1.gFu().a((aef_2)this, eyB);
        return apn_02;
    }

    private int czQ() {
        for (int i = 0; i < this.eyH.size(); ++i) {
            if (this.eyH.get(i) != null) continue;
            return i;
        }
        return this.eyH.size();
    }

    public void a(apn_0 apn_02, boolean bl) {
        int n = apn_02.cyJ();
        this.q(n, bl);
    }

    public void q(int n, boolean bl) {
        if (!this.eyH.containsKey(n)) {
            return;
        }
        apn_0 apn_02 = (apn_0)this.eyH.remove(n);
        if (apn_02 != null) {
            if (bl) {
                apn_02.cyM();
            }
            this.yY(n);
            fse_1.gFu().a((aef_2)this, eyB, eyD);
        }
    }

    private void yY(int n) {
        for (int i = n; i < this.eyH.size(); ++i) {
            apn_0 apn_02 = (apn_0)this.eyH.remove(i + 1);
            if (apn_02 == null) {
                eyy.error((Object)("Erreur de continuit\u00e9 dans les indices des vues \u00e0 l'indice : " + (i + 1)));
                return;
            }
            apn_02.yS(i);
            this.eyH.put(i, (Object)apn_02);
        }
    }

    public apn_0 yZ(int n) {
        return (apn_0)this.eyH.get(n);
    }

    public TIntObjectIterator<apn_0> czR() {
        return this.eyH.iterator();
    }

    public boolean a(apn_0 apn_02) {
        return this.eyH.containsValue((Object)apn_02);
    }

    private apn_0 czS() {
        return this.czV() > 0 ? (apn_0)this.czU()[0] : null;
    }

    public void czT() {
        this.a((aOY)this.czS());
    }

    public Object[] czU() {
        return this.eyH.values();
    }

    public int czV() {
        return this.eG(false);
    }

    public int eG(boolean bl) {
        if (!bl) {
            return this.eyH.size();
        }
        int n = 0;
        TIntObjectIterator tIntObjectIterator = this.eyH.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            if (((apn_0)tIntObjectIterator.value()).czL()) continue;
            ++n;
        }
        return n;
    }

    public apn_0 za(int n) {
        this.eyG = n;
        this.cAe();
        return this.czW();
    }

    public apn_0 czW() {
        return (apn_0)this.eyH.get(this.eyG);
    }

    public int czX() {
        return this.eyG;
    }

    public int czY() {
        return this.eyH.size();
    }

    public void a(aOY aOY2) {
        this.za(aOY2.cyJ());
    }

    @Override
    public String[] bxk() {
        return eyF;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(eyB)) {
            ArrayList<apn_0> arrayList = new ArrayList<apn_0>();
            for (Object object : this.czU()) {
                apn_0 apn_02 = (apn_0)object;
                arrayList.add(apn_02);
            }
            arrayList.sort(new aPs(this));
            Boolean bl = (Boolean)fse_1.gFu().vY("chat.enable.interactions");
            if (bl != null && !bl.booleanValue()) {
                return arrayList.subList(0, 1);
            }
            return arrayList;
        }
        if (string.equals(eyA)) {
            return this.czW();
        }
        if (string.equals(eyC)) {
            return this.ewY;
        }
        if (string.equals(eyD)) {
            return this.eyH.size() < 12;
        }
        if (eyE.equals(string)) {
            return this.eyI;
        }
        return null;
    }

    public boolean czZ() {
        return this.eyI;
    }

    public void eH(boolean bl) {
        if (bl == this.eyI) {
            return;
        }
        this.eyI = bl;
        fse_1.gFu().a((aef_2)this, eyE);
    }

    public Integer cAa() {
        return this.eyJ;
    }

    public void q(Integer n) {
        this.eyJ = n;
    }

    public void cAb() {
        TIntObjectIterator tIntObjectIterator = this.eyH.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            apn_0 apn_02 = (apn_0)tIntObjectIterator.value();
            apn_02.clear();
            apn_02.clean();
        }
    }

    public void b(apn_0 apn_02) {
        int n = this.eyH.size();
        if (n >= 12) {
            aPd.e("error.chatViewMaxReached", new Object[0]);
            return;
        }
        if (this.eyH.containsKey(apn_02.cyJ())) {
            apn_02.yS(this.czQ());
        }
        this.eyH.put(apn_02.cyJ(), (Object)apn_02);
        fse_1.gFu().a((aef_2)this, eyB);
    }

    public String toString() {
        return "wId=" + this.ewY + " curVId=" + this.eyG + " vieSize=" + this.czY();
    }

    public void cAc() {
        TIntObjectIterator tIntObjectIterator = this.eyH.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((apn_0)tIntObjectIterator.value()).clean();
        }
    }

    public void cAd() {
        TIntObjectIterator<apn_0> tIntObjectIterator = this.czR();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((apn_0)tIntObjectIterator.value()).cyM();
        }
    }

    public void clean() {
        this.cAd();
        this.eyH.clear();
    }

    public void cAe() {
        apn_0 apn_02 = this.czW();
        if (apn_02 == null) {
            eyy.error((Object)("On tente de rafra\u00eechir la vue courante du chat d'id=" + this.ewY + " alors qu'elle n'existe pas !"));
            return;
        }
        fse_1.gFu().a((aef_2)apn_02, aOY.evc);
        apn_02.czO();
        apn_02.czK();
    }

    public void a(apn_0 apn_02, int n) {
        if (apn_02 == null) {
            return;
        }
        apn_02.yS(n);
        apn_0 apn_03 = (apn_0)this.eyH.put(n, (Object)apn_02);
        this.a(apn_03, n + 1);
    }

    public void zb(int n) {
        for (apn_0 apn_02 : (apn_0[])this.eyH.values()) {
            apn_02.yS(apn_02.cyJ() + n);
            this.eyH.put(apn_02.cyJ(), (Object)apn_02);
        }
    }

    public boolean cAf() {
        return this.eyH.size() < 12;
    }

    public void l(TObjectProcedure<? super apn_0> tObjectProcedure) {
        this.eyH.forEachValue(tObjectProcedure);
    }
}

