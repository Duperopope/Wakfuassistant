/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;

/*
 * Renamed from aPD
 */
public class apd_0
implements aeh_2 {
    public static final String ezP = "categories";
    public static final String ezQ = "friendsList";
    public static final String ezR = "ignoreList";
    public static final String[] ezS = new String[]{"categories", "friendsList", "ignoreList"};
    private final EnumMap<aPz, aPw> ezT = new EnumMap(aPz.class);
    private static final apd_0 ezU = new apd_0();
    private final HashMap<Long, apc_0> ezV = new HashMap();
    private boolean ezW = true;

    private apd_0() {
        this.bkZ();
    }

    public static apd_0 cAO() {
        return ezU;
    }

    private void bkZ() {
        this.ezT.put(aPz.ezn, new aPw(aPz.ezn));
        this.ezT.put(aPz.ezo, new aPw(aPz.ezo));
    }

    public void clear() {
        this.ezV.clear();
        for (aPw aPw2 : this.ezT.values()) {
            aPw2.clear();
        }
        this.ezW = true;
    }

    public void a(short s, apc_0 apc_02) {
        if (!this.ezV.containsKey(apc_02.Sn())) {
            apc_02.aQ(s);
            this.ezV.put(apc_02.Sn(), apc_02);
        } else {
            apc_02 = this.ezV.get(apc_02.Sn());
            apc_02.aQ(s);
        }
        aPw aPw2 = this.ezT.get((Object)aPz.aP(s));
        if (aPw2 != null) {
            aPw2.a(apc_02);
            fse_1.gFu().a((aef_2)this, ezP);
        }
    }

    public void a(short s, Iterable<apc_0> iterable) {
        for (apc_0 apc_02 : iterable) {
            this.a(s, apc_02);
        }
        fse_1.gFu().a((aef_2)this, ezP);
    }

    public boolean a(short s, Long l) {
        aPw aPw2 = this.ezT.get((Object)aPz.aP(s));
        if (aPw2 != null) {
            aPw2.x(l);
            fse_1.gFu().a((aef_2)this, ezP);
        }
        if (this.ezV.containsKey(l)) {
            apc_0 apc_02 = this.ezV.get(l);
            apc_02.aR(s);
            if (s == 1) {
                apc_02.eN(false);
            }
            if (apc_02.cAJ()) {
                this.ezV.remove(l);
            }
            return true;
        }
        return false;
    }

    public Collection<apc_0> cAP() {
        return this.ezV.values();
    }

    public aPw cAQ() {
        return this.ezT.get((Object)aPz.ezn);
    }

    public aPw cAR() {
        return this.ezT.get((Object)aPz.ezo);
    }

    public apc_0 y(Long l) {
        return this.ezV.get(l);
    }

    public apc_0 jk(String string) {
        if (string == null) {
            return null;
        }
        for (apc_0 apc_02 : this.ezV.values()) {
            if (!string.equals(apc_02.xO())) continue;
            return apc_02;
        }
        return null;
    }

    public boolean cAS() {
        return this.ezW;
    }

    public void eL(boolean bl) {
        this.ezW = bl;
        fse_1.gFu().a((aef_2)this.cAQ(), "contentList");
        fse_1.gFu().a((aef_2)this.cAR(), "contentList");
    }

    @Override
    public String[] bxk() {
        return ezS;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(ezP)) {
            ArrayList<aPw> arrayList = this.cAT();
            return arrayList.size() > 0 ? arrayList : null;
        }
        if (string.equals(ezQ)) {
            return this.cAQ();
        }
        if (string.equals(ezR)) {
            return this.cAR();
        }
        return null;
    }

    private ArrayList<aPw> cAT() {
        ArrayList<aPw> arrayList = new ArrayList<aPw>();
        for (aPw aPw2 : this.ezT.values()) {
            if (aPw2 == null || aPw2.cAF() <= 0) continue;
            arrayList.add(aPw2);
        }
        return arrayList;
    }
}

