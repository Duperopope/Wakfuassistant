/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.ArrayList;
import java.util.HashMap;

public class aUn
implements aeh_2 {
    public static final String gxV = "shortcuts";
    public static final String gxW = "bindNumberList";
    public static final String gxX = "currentBind";
    public static final String gxY = "binds";
    public static final String gxZ = "listFilter";
    private final HashMap<String, aUl> gya = new HashMap();
    private final TLongObjectHashMap<String> gyb = new TLongObjectHashMap();
    private final ArrayList<Long> gyc = new ArrayList();
    private aUl gyd;
    private static short gye = 0;
    private final TLongObjectHashMap<aUk> gyf = new TLongObjectHashMap();
    private final fez_1 gyg = new fez_1();
    private final String[] gyh = new String[]{"shortcuts", "bindNumberList", "currentBind", "binds"};
    private static final aUn gyi = new aUn();

    public static aUn cUM() {
        return gyi;
    }

    @Override
    public String[] bxk() {
        return this.gyh;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(gxV)) {
            ArrayList<aUk> arrayList = new ArrayList<aUk>();
            TLongObjectIterator tLongObjectIterator = this.gyf.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                ArrayList<aUl> arrayList2 = new ArrayList<aUl>();
                aUk aUk2 = (aUk)tLongObjectIterator.value();
                for (aUl aUl2 : this.gya.values()) {
                    amc_1 amc_12 = aUl2.cUD();
                    if (amc_12 == null || amc_12.bCL() == null || !aUk2.getName().equals(amc_12.bCL())) continue;
                    arrayList2.add(aUl2);
                }
                arrayList2.sort(new aUo(this));
                aUk2.A(arrayList2);
                arrayList.add(aUk2);
            }
            return arrayList;
        }
        if (string.equals(gxX)) {
            return this.gyd;
        }
        if (string.equals(gxY)) {
            return this.kh("binding");
        }
        if (string.equals(gxZ)) {
            return this.gyg;
        }
        return this.gya.get(string);
    }

    private ArrayList<aUl> kh(String string) {
        ArrayList<aUl> arrayList = new ArrayList<aUl>();
        for (aUl aUl2 : this.gya.values()) {
            if (!aUl2.aWZ().equalsIgnoreCase(string)) continue;
            arrayList.add(aUl2);
        }
        return arrayList;
    }

    private boolean ki(String string) {
        return string.equals("common") || string.equals("world") || string.equals("fight") || string.equals("binding") || string.equals("default");
    }

    public aUl kj(String string) {
        return this.gya.get(string);
    }

    public void aPg() {
        amc_1[] amc_1Array;
        this.gya.clear();
        this.gyb.clear();
        this.gyf.clear();
        gye = 0;
        for (amc_1 amc_12 : amc_1Array = aUm.cUI().bCy()) {
            String string2 = amc_12.aWZ();
            if (amc_12.getId() != null && this.ki(string2)) {
                int n;
                if (string2.equals("binding")) {
                    gye = (short)(gye + 1);
                }
                this.gya.put(amc_12.getId(), new aUl(amc_12));
                this.gyb.put(amc_12.bCF(), (Object)amc_12.getId());
                String string3 = amc_12.bCL();
                if (string3 != null && !this.gyf.containsKey((long)(n = string3.hashCode()))) {
                    this.gyf.put((long)n, (Object)new aUk(string3));
                }
                fse_1.gFu().a((aef_2)this, amc_12.getId());
                continue;
            }
            this.gyc.add(amc_12.bCF());
        }
        this.gyg.z(string -> this.gyf.forEachValue(aUk2 -> {
            aUk2.ke((String)string);
            return true;
        }));
        this.gyg.bc((String)this.gyg.gvA());
        this.a(null);
    }

    public boolean it(long l) {
        return this.gyc.contains(l);
    }

    public boolean iu(long l) {
        return this.gyb.containsKey(l) || this.gyc.contains(l);
    }

    public aUl iv(long l) {
        aUl aUl2;
        String string = (String)this.gyb.get(l);
        if (string != null && (aUl2 = this.gya.get(string)) != null) {
            return aUl2;
        }
        return null;
    }

    public void cUN() {
        this.aPg();
        blh_2 blh_22 = aue_0.cVJ().cVN();
        if (blh_22 != null) {
            fse_1.gFu().a((aef_2)blh_22.edC(), "keyList");
        }
        fse_1.gFu().a((aef_2)this, this.gyh);
        bvk_0 bvk_02 = cxs_1.eXb().eXc();
        if (bvk_02 != null) {
            bvk_02.dKO();
        }
    }

    public void a(aUl aUl2) {
        this.gyd = aUl2;
        fse_1.gFu().a((aef_2)this, gxX);
    }

    public aUl cUO() {
        return this.gyd;
    }

    public amc_1 kk(String string) {
        if ((gye = (short)(gye + 1)) > 20) {
            return null;
        }
        return new amc_1("binding" + gye, -1, -1, null, "!/common/bind ", false, false, false, false, false, string);
    }

    public void eX(boolean bl) {
        if (bl) {
            ArrayList<aUl> arrayList = this.kh("binding");
            if (arrayList.size() > 0) {
                this.a(arrayList.get(0));
            }
        } else {
            this.a(null);
        }
    }
}

