/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortObjectIterator
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TShortObjectIterator;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.set.hash.TIntHashSet;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class bon
implements aeh_2,
alx_2 {
    public static final String iOz = "tutorials";
    public static final String iOA = "oneActivated";
    private static final Logger iOB = Logger.getLogger(bon.class);
    private static final bon iOC = new bon();
    private static final String iOD = "tutorials";
    private static final String iOE = "tutorial";
    private static final String iOF = "part";
    private static final String iOG = "name";
    private static final String iOH = "activated";
    private static final String iOI = "eventId";
    private static final String iOJ = "id";
    private final String[] iOK = new String[]{"tutorials", "oneActivated"};
    private final TShortObjectHashMap<boo> iOL = new TShortObjectHashMap();
    private final TIntHashSet iOM = new TIntHashSet();
    private boolean cHn = true;
    private static final boolean iON = false;
    private int iOO;
    private String hYN;

    public static bon dAK() {
        return iOC;
    }

    public static int G(short s, short s2) {
        StringBuilder stringBuilder = new StringBuilder("2");
        String string = String.valueOf(s);
        String string2 = String.valueOf(s2);
        StringBuilder stringBuilder2 = new StringBuilder("000");
        stringBuilder2.replace(stringBuilder2.length() - string.length(), stringBuilder2.length(), string);
        stringBuilder.append((CharSequence)stringBuilder2);
        StringBuilder stringBuilder3 = new StringBuilder("0000");
        stringBuilder3.replace(stringBuilder3.length() - string2.length(), stringBuilder3.length(), string2);
        stringBuilder.append((CharSequence)stringBuilder3);
        return Integer.valueOf(stringBuilder.toString());
    }

    @Override
    public Object eu(String string) {
        if (string.equals("tutorials")) {
            return this.iOL.values();
        }
        if (string.equals(iOA)) {
            return !this.dAN();
        }
        return null;
    }

    public void bG(short s) {
        boo boo2;
        boo2.az(!(boo2 = (boo)this.iOL.get(s)).aOY());
        try {
            this.mg(this.dAM());
        }
        catch (Exception exception) {
            iOB.error((Object)"Exception during activateDesactivateTutorial", (Throwable)exception);
        }
        fse_1.gFu().a((aef_2)this, this.bxk());
    }

    public void mg(String string) {
        aqr_2 aqr_22 = aqr_2.bGR();
        aqs_2 aqs_22 = aqr_22.bGS();
        aqs_22.a(new aqt_2("tutorials", null));
        TShortObjectIterator tShortObjectIterator = this.iOL.iterator();
        while (tShortObjectIterator.hasNext()) {
            tShortObjectIterator.advance();
            boo boo2 = (boo)tShortObjectIterator.value();
            aqt_2 aqt_22 = new aqt_2(iOE, null);
            aqs_22.bGT().a(aqt_22);
            aqt_22.c(new aqu_2(iOG, boo2.getName()));
            aqt_22.c(new aqu_2(iOJ, String.valueOf(boo2.aIi())));
            TShortObjectIterator<bos> tShortObjectIterator2 = boo2.dAP();
            while (tShortObjectIterator2.hasNext()) {
                tShortObjectIterator2.advance();
                bos bos2 = (bos)tShortObjectIterator2.value();
                aqt_2 aqt_23 = new aqt_2(iOF, null);
                aqt_22.a(aqt_23);
                aqt_23.c(new aqu_2(iOJ, String.valueOf(bos2.aIi())));
                aqt_23.c(new aqu_2(iOG, bos2.getName()));
                aqt_23.c(new aqu_2(iOH, String.valueOf(bos2.aOY())));
                aqt_23.c(new aqu_2(iOI, String.valueOf(bos2.dAR())));
            }
        }
        aqr_22.eD(string);
        aqr_22.a(aqs_22);
    }

    @Override
    public String[] bxk() {
        return this.iOK;
    }

    public void H(short s, short s2) {
        bos bos2;
        boo boo2 = (boo)this.iOL.get(s);
        bos2.az(!(bos2 = boo2.bH(s2)).aOY());
        if (this.I(boo2.aIi(), bos2.aIi())) {
            bon.dAK().J(boo2.aIi(), bos2.aIi());
        }
        try {
            this.mg(this.dAM());
        }
        catch (Exception exception) {
            iOB.error((Object)"Exception during activateDesactivateTutorialPart", (Throwable)exception);
        }
        fse_1.gFu().a((aef_2)this, this.bxk());
    }

    public void dAL() {
        boolean bl = this.dAN();
        TShortObjectIterator tShortObjectIterator = this.iOL.iterator();
        while (tShortObjectIterator.hasNext()) {
            tShortObjectIterator.advance();
            boo boo2 = (boo)tShortObjectIterator.value();
            boo2.az(bl);
            this.mg(this.dAM());
        }
        fse_1.gFu().a((aef_2)this, this.bxk());
    }

    private String dAM() {
        return new URL(auc_0.kG("tutorialFile")).getFile();
    }

    private boolean dAN() {
        TShortObjectIterator tShortObjectIterator = this.iOL.iterator();
        while (tShortObjectIterator.hasNext()) {
            tShortObjectIterator.advance();
            if (((boo)tShortObjectIterator.value()).aOY()) continue;
            return true;
        }
        return false;
    }

    public void a(String string, bon bon2) {
        aqr_2 aqr_22 = aqr_2.bGR();
        aqs_2 aqs_22 = (aqs_2)aqr_22.bxD();
        aqr_22.ex(string);
        aqr_22.a(aqs_22, new ape_1[0]);
        aqr_22.close();
        boolean bl = false;
        TShortObjectIterator tShortObjectIterator = bon2.iOL.iterator();
        while (tShortObjectIterator.hasNext()) {
            Object object;
            tShortObjectIterator.advance();
            boo boo2 = (boo)tShortObjectIterator.value();
            ArrayList<apd_1> arrayList = aqs_22.eA(iOE);
            apd_1 object2 = null;
            boolean bl2 = false;
            for (apd_1 apd_12 : arrayList) {
                if (apd_12.fq(iOG) == null) {
                    iOB.error((Object)"Nom de tutorial invalide dans le chargement des tutoriaux");
                }
                object = apd_12.fq(iOG).bCt();
                if (!boo2.getName().equals(object)) continue;
                object2 = apd_12;
                bl2 = true;
                break;
            }
            if (object2 == null) {
                bl = true;
                object2 = new aqt_2(iOE, null);
                object2.c(new aqu_2(iOG, boo2.getName()));
                object2.c(new aqu_2(iOJ, String.valueOf(boo2.aIi())));
                arrayList.add(object2);
                aqs_22.bGT().a(object2);
            }
            Iterator<apd_1> iterator = boo2.dAP();
            while (iterator.hasNext()) {
                iterator.advance();
                bos bos2 = (bos)iterator.value();
                if (bl2) {
                    object = object2.fo(iOF);
                    boolean bl3 = false;
                    Iterator iterator2 = ((ArrayList)object).iterator();
                    while (iterator2.hasNext()) {
                        apd_1 apd_13 = (apd_1)iterator2.next();
                        if (bos2.aIi() != apd_13.fq(iOJ).bCo()) continue;
                        bl3 = true;
                        break;
                    }
                    if (bl3) continue;
                    bl = true;
                    this.a(bos2, object2);
                    continue;
                }
                this.a(bos2, object2);
            }
        }
        if (bl) {
            aqr_22.eD(string);
            aqr_22.a(aqs_22);
        }
    }

    private void a(bos bos2, apd_1 apd_12) {
        aqt_2 aqt_22 = new aqt_2(iOF, null);
        aqt_22.c(new aqu_2(iOJ, String.valueOf(bos2.aIi())));
        apd_12.a(aqt_22);
        if (bos2.getName() != null && bos2.getName().length() > 0) {
            aqt_22.c(new aqu_2(iOG, bos2.getName()));
            apd_12.a(aqt_22);
        }
        aqt_22.c(new aqu_2(iOH, "true"));
        apd_12.a(aqt_22);
        aqt_22.c(new aqu_2(iOI, String.valueOf(bos2.dAR())));
        apd_12.a(aqt_22);
    }

    public void a(bor bor2, String string) {
        if (this.cHn) {
            // empty if block
        }
    }

    public void dAO() {
    }

    public void mh(String string) {
        aqr_2 aqr_22 = aqr_2.bGR();
        aqs_2 aqs_22 = aqr_22.bGS();
        aqr_22.ex(string);
        aqr_22.a(aqs_22, new ape_1[0]);
        aqr_22.close();
        ArrayList<apd_1> arrayList = aqs_22.eA(iOE);
        if (arrayList == null) {
            return;
        }
        for (apd_1 apd_12 : arrayList) {
            if (apd_12.fq(iOG) == null) {
                iOB.error((Object)"Nom de tutorial invalide dans le chargement des tutoriaux");
                continue;
            }
            String string2 = apd_12.fq(iOG).bCt();
            int n = apd_12.fq(iOJ).bCo();
            ArrayList<apd_1> arrayList2 = apd_12.fp(iOF);
            TShortObjectHashMap tShortObjectHashMap = new TShortObjectHashMap();
            for (int i = 0; i < arrayList2.size(); ++i) {
                apd_1 apd_13 = arrayList2.get(i);
                apd_1 apd_14 = apd_13.fq(iOG);
                apd_1 apd_15 = apd_13.fq(iOH);
                apd_1 apd_16 = apd_13.fq(iOI);
                apd_1 apd_17 = apd_13.fq(iOJ);
                if (apd_14 == null || apd_15 == null || apd_16 == null || apd_17 == null) {
                    iOB.error((Object)("Step incorrecte dans le XML de tutorial " + string2));
                    continue;
                }
                tShortObjectHashMap.put((short)apd_17.bCo(), (Object)new bos((short)apd_17.bCo(), apd_14.bCt(), apd_15.bCu(), apd_16.bCn()));
            }
            boo boo2 = (boo)this.iOL.get((short)n);
            if (boo2 != null) continue;
            boo2 = new boo((short)n, string2, (TShortObjectHashMap<bos>)tShortObjectHashMap);
            this.iOL.put((short)n, (Object)boo2);
        }
    }

    public boolean I(short s, short s2) {
        return this.iOM.contains(GC.d(s, s2));
    }

    public void J(short s, short s2) {
        this.iOO = -1;
        if (!this.iOM.remove(GC.d(s, s2))) {
            iOB.error((Object)"[TUTORIAL] On essaye de supprimer un TutorialAction des launchedTutorial alors que celui-ci n'y est pas.");
        }
    }

    public void setEnabled(boolean bl) {
        this.cHn = bl;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string != null && string.equals(this.hYN)) {
            this.dAO();
        }
    }

    public String toString() {
        return "EmbeddedTutorialManager{m_tutorialsCount=" + this.iOL.size() + ", m_enabled=" + this.cHn + ", m_launchedActionId=" + this.iOO + ", m_linkedDialogId='" + this.hYN + "', m_launchedTutorialsCount=" + this.iOM.size() + "}";
    }
}

