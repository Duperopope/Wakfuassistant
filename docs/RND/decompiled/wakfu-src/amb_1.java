/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from amb
 */
public abstract class amb_1
implements abz_1 {
    protected final String cGB = "name";
    protected final String cGC = "id";
    protected final String cGD = "category";
    protected final String cGE = "group";
    protected final String cGF = "shortcut";
    protected final String cGG = "consoleCommand";
    protected final String cGH = "rebindAllowed";
    protected final String cGI = "alwaysValid";
    protected final String cGJ = "altKey";
    protected final String cGK = "ctrlKey";
    protected final String cGL = "shiftKey";
    protected final String cGM = "keyCode";
    protected final String cGN = "extendedKeyCode";
    protected final String cGO = "extendedKeyName";
    protected final String cGP = "keyRegExp";
    protected final String cGQ = "params";
    protected final String cGR = "onKeyReleased";
    protected static final String cGS = "shortcuts";
    private static final Logger cGT = Logger.getLogger(amb_1.class);
    protected final HashMap<String, Boolean> cGU = new HashMap();
    protected final ArrayList<amc_1> cGV = new ArrayList();
    protected final HashMap<String, amc_1> cGW = new HashMap();
    protected final TLongObjectHashMap<amc_1> cGX = new TLongObjectHashMap();
    protected final ArrayList<amc_1> cGY = new ArrayList();
    private boolean cGZ = true;
    private int cHa = -1;
    public static final String cHb = "binding";

    public void p(String string, boolean bl) {
        if (this.fc(string)) {
            this.cGU.put(string, bl);
        }
    }

    public void bCw() {
        for (amc_1 amc_12 : this.cGW.values()) {
            amc_12.setEnabled(true);
        }
    }

    public void q(String string, boolean bl) {
        amc_1 amc_12 = this.cGW.get(string);
        if (amc_12 != null) {
            amc_12.setEnabled(bl);
        }
    }

    public void r(String string, boolean bl) {
        aqr_2 aqr_22 = aqr_2.bGR();
        Object d2 = aqr_22.bxD();
        aqr_22.ex(string);
        aqr_22.a(d2, new ape_1[0]);
        aqr_22.close();
        if (bl) {
            String string2 = fo_0.bA(string).getFile();
            this.a((apb_1)d2, string2);
        } else {
            this.b((apb_1)d2);
        }
    }

    public void b(apb_1 apb_12) {
        ArrayList<apd_1> arrayList = apb_12.eA("group");
        for (apd_1 apd_12 : arrayList) {
            ArrayList<apd_1> arrayList2;
            String string;
            if (apd_12.fq("name") == null) {
                cGT.error((Object)"Nom de groupe invalide dans le chargement des raccourcis");
            }
            if (!this.fc(string = apd_12.fq("name").bCt())) {
                this.cGU.put(string, false);
            }
            if ((arrayList2 = apd_12.fo("shortcut")) == null) continue;
            this.a(string, arrayList2, false, null);
        }
    }

    public void a(apb_1 apb_12, String string) {
        ArrayList<apd_1> arrayList = apb_12.eA("shortcut");
        if (arrayList == null) {
            return;
        }
        this.a(null, arrayList, true, string);
    }

    private void a(String string, List<apd_1> list, boolean bl, String string2) {
        HashSet<amc_1> hashSet = new HashSet<amc_1>();
        HashSet<Object> hashSet2 = new HashSet<Object>();
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            Object object;
            amc_1 amc_12;
            String string3;
            String string4;
            int n2;
            int n3;
            apd_1 apd_12 = list.get(i);
            apd_1 apd_13 = apd_12.fq("consoleCommand");
            apd_1 apd_14 = apd_12.fq("id");
            if (apd_13 == null && apd_14 == null) continue;
            String string5 = apd_13 != null ? apd_13.bCt() : null;
            boolean bl2 = apd_12.fq("ctrlKey") != null && apd_12.fq("ctrlKey").bCu();
            boolean bl3 = apd_12.fq("altKey") != null && apd_12.fq("altKey").bCu();
            boolean bl4 = apd_12.fq("shiftKey") != null && apd_12.fq("shiftKey").bCu();
            boolean bl5 = apd_12.fq("alwaysValid") != null && apd_12.fq("alwaysValid").bCu();
            String string6 = apd_12.fq("params") != null ? apd_12.fq("params").bCt() : null;
            boolean bl6 = apd_12.fq("onKeyReleased") != null && apd_12.fq("onKeyReleased").bCu();
            int n4 = n3 = apd_12.fq("keyCode") != null ? apd_12.fq("keyCode").bCo() : -1;
            if (n3 == 0) {
                n2 = apd_12.fq("extendedKeyCode") != null ? apd_12.fq("extendedKeyCode").bCo() : -1;
                string4 = apd_12.fq("extendedKeyName") != null ? apd_12.fq("extendedKeyName").bCt() : null;
            } else {
                n2 = -1;
                string4 = null;
            }
            String string7 = string3 = apd_14 != null ? apd_14.bCt() : null;
            if (bl) {
                amc_12 = this.fb(string3);
                if (amc_12 == null) continue;
                hashSet.add(amc_12);
                hashSet2.remove(amc_12);
                object = (amc_1)this.cGX.get(amc_1.a(n3, n2, bl4, bl3, bl2));
                if (object != null && !hashSet.contains(object)) {
                    hashSet2.add(object);
                }
                this.a(amc_12, n3, n2, string4, bl4, bl3, bl2, string6);
                continue;
            }
            amc_12 = new amc_1(string3, n3, n2, string4, string5, bl2, bl3, bl4, bl6, bl5, string6);
            object = apd_12.fq("category");
            String string8 = object != null ? object.bCt() : null;
            amc_12.fe(string8);
            this.b(amc_12, string);
        }
        Iterator iterator = hashSet2.iterator();
        while (iterator.hasNext()) {
            this.a((amc_1)iterator.next(), string2);
        }
    }

    private void a(amc_1 amc_12, int n, int n2, @Nullable String string, boolean bl, boolean bl2, boolean bl3, String string2) {
        this.a(amc_12, n, n2, string, string2, amb_1.b(bl, bl2, bl3));
    }

    private void a(amc_1 amc_12, int n, int n2, @Nullable String string, String string2, int n3) {
        this.b(amc_12);
        amc_12.ta(n);
        amc_12.tb(n2);
        amc_12.ff(string);
        amc_12.tc(n3);
        if (string2 != null) {
            amc_12.fh(string2);
        }
        this.b(amc_12, amc_12.aWZ());
    }

    public boolean a(amc_1 amc_12) {
        return this.cGW.containsKey(amc_12.getId());
    }

    public amc_1 fb(String string) {
        return this.cGW.get(string);
    }

    public void a(amc_1 amc_12, String string) {
        try {
            this.a(amc_12, -1, -1, null, null, 0, string);
        }
        catch (Exception exception) {
            cGT.warn((Object)"Probl\u00e8me en d\u00e9sassignant le raccourci", (Throwable)exception);
        }
    }

    public void a(String string, int n, int n2, @Nullable String string2, String string3, int n3, String string4) {
        this.a(this.fb(string), n, n2, string2, string3, n3, string4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(amc_1 amc_12, int n, int n2, @Nullable String string, String string2, int n3, String string3) {
        if (!this.a(amc_12)) {
            return;
        }
        this.a(amc_12, n, n2, string, string2, n3);
        aqr_2 aqr_22 = aqr_2.bGR();
        aqs_2 aqs_22 = aqr_22.bGS();
        if (!fq_0.bC(string3)) {
            aqr_22.eD(string3);
            aqs_22.a(new aqt_2(cGS, null));
            aqr_22.a(aqs_22, "");
            aqr_22.close();
        }
        aqr_22.ex(string3);
        aqr_22.a(aqs_22, new ape_1[0]);
        aqr_22.close();
        ArrayList<apd_1> arrayList = aqs_22.eA("shortcut");
        apd_1 apd_12 = null;
        if (arrayList != null) {
            for (apd_1 apd_13 : arrayList) {
                aqu_2 aqu_22;
                int n4;
                block25: {
                    if (apd_13.fq("id") == null || !apd_13.fq("id").bCt().equalsIgnoreCase(amc_12.getId())) continue;
                    apd_12 = apd_13;
                    n4 = amc_12.bCC();
                    if (apd_13.fq("keyCode") == null) {
                        if (n4 != -1) {
                            aqu_22 = new aqu_2("keyCode", String.valueOf(n4));
                            apd_13.c(aqu_22);
                            break block25;
                        } else {
                            cGT.warn((Object)"Le raccourci trouv\u00e9 ne poss\u00e8de pas de touche associ\u00e9e");
                            break;
                        }
                    }
                    apd_13.fq("keyCode").sY(n4);
                }
                if (n4 == 0) {
                    Object object;
                    int n5 = amc_12.bCD();
                    if (apd_13.fq("extendedKeyCode") == null) {
                        object = new aqu_2("extendedKeyCode", String.valueOf(n5));
                        apd_13.c((apd_1)object);
                    } else {
                        apd_13.fq("extendedKeyCode").sY(n5);
                    }
                    object = amc_12.bCE();
                    if (apd_13.fq("extendedKeyName") == null) {
                        aqu_2 aqu_23 = new aqu_2("extendedKeyName", (String)object);
                        apd_13.c(aqu_23);
                    } else {
                        apd_13.fq("extendedKeyName").fa((String)object);
                    }
                }
                if (amc_12.bCI()) {
                    if (apd_13.fq("shiftKey") != null) {
                        apd_13.fq("shiftKey").cC(true);
                    } else {
                        aqu_22 = new aqu_2("shiftKey", String.valueOf(true));
                        apd_13.c(aqu_22);
                    }
                } else if (apd_13.fq("shiftKey") != null) {
                    apd_13.d(apd_13.fq("shiftKey"));
                }
                if (amc_12.bCH()) {
                    if (apd_13.fq("altKey") != null) {
                        apd_13.fq("altKey").cC(true);
                    } else {
                        aqu_22 = new aqu_2("altKey", String.valueOf(true));
                        apd_13.c(aqu_22);
                    }
                } else if (apd_13.fq("altKey") != null) {
                    apd_13.d(apd_13.fq("altKey"));
                }
                if (amc_12.bCG()) {
                    if (apd_13.fq("ctrlKey") != null) {
                        apd_13.fq("ctrlKey").cC(true);
                        continue;
                    }
                    aqu_22 = new aqu_2("ctrlKey", String.valueOf(true));
                    apd_13.c(aqu_22);
                    continue;
                }
                if (apd_13.fq("ctrlKey") == null) continue;
                apd_13.d(apd_13.fq("ctrlKey"));
            }
        }
        if (apd_12 == null) {
            this.a(amc_12, aqs_22, false);
        }
        aqr_22.eD(string3);
        aqr_22.a(aqs_22);
        aqr_22.close();
    }

    private void b(amc_1 amc_12, String string) {
        amc_12.cZ(string);
        this.cGV.add(amc_12);
        if (amc_12.getId() != null) {
            this.cGW.put(amc_12.getId(), amc_12);
        }
        long l = amc_12.bCF();
        this.cGX.put(l, (Object)amc_12);
    }

    private void b(amc_1 amc_12) {
        this.cGV.remove(amc_12);
        this.cGW.remove(amc_12.getId());
        long l = amc_12.bCF();
        if (this.cGX.get(l) == amc_12) {
            this.cGX.remove(l);
        }
    }

    public void a(amc_1 amc_12, String string, String string2) {
        if (this.a(amc_12)) {
            return;
        }
        aqr_2 aqr_22 = aqr_2.bGR();
        aqs_2 aqs_22 = aqr_22.bGS();
        if (!fq_0.bC(string2)) {
            aqr_22.eD(string2);
            aqs_22.a(new aqt_2(cGS, null));
            aqr_22.a(aqs_22, "");
            aqr_22.close();
        }
        aqr_22.ex(string2);
        aqr_22.a(aqs_22, new ape_1[0]);
        aqr_22.close();
        this.b(amc_12, string);
        this.a(amc_12, aqs_22, true);
        aqr_22.eD(string2);
        aqr_22.a(aqs_22);
        aqr_22.close();
    }

    public void c(amc_1 amc_12, String string) {
        if (!this.a(amc_12)) {
            return;
        }
        aqr_2 aqr_22 = aqr_2.bGR();
        aqs_2 aqs_22 = aqr_22.bGS();
        if (!fq_0.bC(string)) {
            aqr_22.eD(string);
            aqs_22.a(new aqt_2(cGS, null));
            aqr_22.a(aqs_22, "");
            aqr_22.close();
        }
        aqr_22.ex(string);
        aqr_22.a(aqs_22, new ape_1[0]);
        aqr_22.close();
        ArrayList<apd_1> arrayList = aqs_22.eA("shortcut");
        if (arrayList == null) {
            cGT.error((Object)("impossible de supprimer le raccourci du document " + string + "qui semble vide"));
            return;
        }
        for (apd_1 apd_12 : arrayList) {
            if (apd_12.fq("id") == null || !apd_12.fq("id").bCt().equalsIgnoreCase(amc_12.getId())) continue;
            aqs_22.bGT().b(apd_12);
        }
        this.b(amc_12);
        aqr_22.eD(string);
        aqr_22.a(aqs_22);
        aqr_22.close();
    }

    public void a(amc_1 amc_12, aqs_2 aqs_22, boolean bl) {
        aqt_2 aqt_22 = new aqt_2("shortcut", null);
        if (amc_12.getId() != null && amc_12.getId().length() > 0) {
            aqt_22.c(new aqu_2("id", amc_12.getId()));
        }
        if (bl) {
            if (amc_12.aWZ() != null && amc_12.aWZ().length() > 0) {
                aqt_22.c(new aqu_2("name", amc_12.aWZ()));
            }
            if (amc_12.bCB() != null && amc_12.bCB().length() > 0) {
                aqt_22.c(new aqu_2("consoleCommand", amc_12.bCB()));
            }
        }
        if (amc_12.bCN() != null && amc_12.bCN().length() > 0) {
            aqt_22.c(new aqu_2("params", amc_12.bCN()));
        }
        if (amc_12.bCH()) {
            aqt_22.c(new aqu_2("altKey", "true"));
        }
        if (amc_12.bCG()) {
            aqt_22.c(new aqu_2("ctrlKey", "true"));
        }
        if (amc_12.bCI()) {
            aqt_22.c(new aqu_2("shiftKey", "true"));
        }
        aqt_22.c(new aqu_2("keyCode", String.valueOf(amc_12.bCC())));
        if (amc_12.bCC() == 0) {
            aqt_22.c(new aqu_2("extendedKeyCode", String.valueOf(amc_12.bCD())));
            aqt_22.c(new aqu_2("extendedKeyName", amc_12.bCE()));
        }
        aqs_22.bGT().a(aqt_22);
    }

    private apd_1 a(String string, apd_1 apd_12) {
        aqt_2 aqt_22 = new aqt_2("group", null);
        if (string != null && string.length() > 0) {
            aqt_22.c(new aqu_2("name", string));
            apd_12.a(aqt_22);
        }
        apd_12.a(aqt_22);
        return aqt_22;
    }

    public void b(amc_1 amc_12, String string, String string2) {
        if (!this.a(amc_12)) {
            return;
        }
        amc_12.fh(string);
        aqr_2 aqr_22 = aqr_2.bGR();
        aqs_2 aqs_22 = aqr_22.bGS();
        if (!fq_0.bC(string2)) {
            aqr_22.eD(string2);
            aqs_22.a(new aqt_2(cGS, null));
            aqr_22.a(aqs_22, "");
            aqr_22.close();
        }
        aqr_22.ex(string2);
        aqr_22.a(aqs_22, new ape_1[0]);
        aqr_22.close();
        ArrayList<apd_1> arrayList = aqs_22.bGT().fo("shortcut");
        apd_1 apd_12 = null;
        if (arrayList != null) {
            for (apd_1 apd_13 : arrayList) {
                if (apd_13.fq("id") == null || !apd_13.fq("id").bCt().equalsIgnoreCase(amc_12.getId())) continue;
                apd_12 = apd_13;
                if (apd_13.fq("params") == null) {
                    apd_13.c(new aqu_2("params", string));
                    continue;
                }
                apd_13.fq("params").fa(string);
            }
        }
        if (apd_12 == null) {
            this.a(amc_12, aqs_22, false);
        }
        aqr_22.eD(string2);
        aqr_22.a(aqs_22);
    }

    public void cD(boolean bl) {
        this.cGZ = bl;
    }

    public boolean bCx() {
        return this.cGZ;
    }

    public void a(String string, amd_1 amd_12) {
        amc_1 amc_12 = this.cGW.get(string);
        if (amc_12 != null && this.fd(amc_12.aWZ())) {
            amc_12.a(amd_12);
        }
    }

    public boolean e(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 17 || keyEvent.getKeyCode() == 16 || keyEvent.getKeyCode() == 18) {
            return false;
        }
        amc_1 amc_12 = (amc_1)this.cGX.get(amb_1.f(keyEvent));
        if (amc_12 != null && this.fd(amc_12.aWZ())) {
            return amc_12.bCJ();
        }
        return false;
    }

    private boolean c(amc_1 amc_12) {
        if (amc_12 == null) {
            return false;
        }
        if (!this.fd(amc_12.aWZ()) || !amc_12.isEnabled()) {
            return false;
        }
        return this.cGZ || amc_12.bCJ();
    }

    @Override
    public boolean c(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 17 || keyEvent.getKeyCode() == 16 || keyEvent.getKeyCode() == 18) {
            return false;
        }
        this.cHa = -1;
        amc_1 amc_12 = (amc_1)this.cGX.get(amb_1.f(keyEvent));
        if (!this.c(amc_12) || !amc_12.bCO()) {
            return false;
        }
        if (!this.cGY.contains(amc_12)) {
            return false;
        }
        this.cGY.remove(amc_12);
        return this.d(amc_12);
    }

    @Override
    public boolean b(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 17 || keyEvent.getKeyCode() == 16 || keyEvent.getKeyCode() == 18 || this.cHa == keyEvent.getKeyCode()) {
            return false;
        }
        this.cHa = -1;
        amc_1 amc_12 = (amc_1)this.cGX.get(amb_1.f(keyEvent));
        if (!this.c(amc_12) || amc_12.bCO() && this.cGY.contains(amc_12)) {
            return false;
        }
        if (amc_12.bCO()) {
            this.cGY.add(amc_12);
        }
        return this.d(amc_12);
    }

    public abstract boolean d(amc_1 var1);

    public amc_1[] bCy() {
        return this.cGV.toArray(new amc_1[this.cGV.size()]);
    }

    public boolean fc(String string) {
        return this.cGU.containsKey(string);
    }

    public boolean fd(String string) {
        Boolean bl = this.cGU.get(string);
        return bl != null && bl != false;
    }

    public void bCz() {
        for (amc_1 amc_12 : this.cGY) {
            this.d(amc_12);
        }
        this.cGY.clear();
        this.sZ(-1);
    }

    public void sZ(int n) {
        this.cHa = n;
    }

    public static long f(KeyEvent keyEvent) {
        int n = keyEvent.getModifiersEx();
        boolean bl = (n & 0x40) == 64;
        boolean bl2 = (n & 0x200) == 512;
        boolean bl3 = (n & 0x80) == 128;
        return amc_1.a(keyEvent.getKeyCode(), keyEvent.getExtendedKeyCode(), bl3, bl, bl2);
    }

    public static int b(boolean bl, boolean bl2, boolean bl3) {
        int n = 0;
        if (bl) {
            n |= 0x40;
        }
        if (bl2) {
            n |= 0x200;
        }
        if (bl3) {
            n |= 0x80;
        }
        return n;
    }
}

