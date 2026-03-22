/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;

public class bEq
extends ffa_0<bgv_2>
implements aeh_2 {
    private static final Logger jNU = Logger.getLogger(bEq.class);
    public static final String jNV = "name";
    public static final String jNW = "nameUnderline";
    public static final String jNX = "id";
    public static final String jNY = "items";
    public static final String jNZ = "nameAndNumber";
    public static final String jOa = "itemNumber";
    public static final String jOb = "bonusThreshold";
    public static final String jOc = "condition";
    public static final String jOd = "bonusByItem";
    public static final String jOe = "allBonuses";
    public static final String jOf = "requirement";
    public static final String jOg = "isEquipable";
    public static final String jOh = "isPreviewable";
    public static final String jOi = "description";
    public static final String[] jOj = new String[]{"name", "nameUnderline", "nameAndNumber", "items", "itemNumber", "bonusThreshold", "condition", "requirement", "isEquipable", "isPreviewable", "allBonuses", "bonusByItem", "description", "id"};
    private ArrayList<String> jOk;
    private Object[] jOl;

    public bEq(short s, int n, List<bgv_2> list) {
        super(s, n, list);
    }

    public String getName() {
        return aum_0.cWf().a(20, (long)this.aIi(), new Object[0]);
    }

    public String getDescription() {
        if (!aum_0.cWf().e(21, this.aIi())) {
            return null;
        }
        return aum_0.cWf().a(21, (long)this.aIi(), new Object[0]);
    }

    public void dSd() {
        ArrayList<ang_2> arrayList = new ArrayList<ang_2>();
        List list = this.fVp();
        for (int i = 0; i < list.size(); ++i) {
            bgv_2 bgv_22 = (bgv_2)list.get(i);
            arrayList.add(bgv_22.a(ffj_0.sge));
        }
        this.jOk = eLP.ab(arrayList);
    }

    private byte dSe() {
        byte by = 0;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        fhk fhk2 = bgt_02.dmL();
        for (bgv_2 bgv_22 : this) {
            if (fhk2.a(bgt_02.dnP(), bgv_22.d()) == null) continue;
            by = (byte)(by + 1);
        }
        return by;
    }

    public String Gx(int n) {
        ArrayList<enk_0> arrayList = this.UP(n);
        if (arrayList == null) {
            return "";
        }
        return bEq.I(arrayList);
    }

    public Object[] dSf() {
        List list = this.fVp();
        TIntArrayList tIntArrayList = new TIntArrayList();
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        for (int i = 0; i < list.size(); ++i) {
            ffs_0 ffs_02;
            TLongObjectIterator<ffs_0> tLongObjectIterator;
            bgv_2 bgv_22 = (bgv_2)list.get(i);
            int n = bgv_22.d();
            ffV ffV2 = null;
            int n2 = -1;
            int n3 = -1;
            bgt_0 bgt_02 = aue_0.cVJ().c(cvo_2.eUK()) ? cvo_2.daL() : aue_0.cVJ().cVK();
            ffV2 = fgt.an(bgt_02.aZj(), n);
            if (ffV2 == null) {
                tLongObjectIterator = bgt_02.dno().fVg();
                while (ffV2 == null && tLongObjectIterator.hasNext()) {
                    tLongObjectIterator.advance();
                    ffs_02 = (ffs_0)tLongObjectIterator.value();
                    ffV2 = ffs_02.UH(n);
                }
            }
            tLongObjectIterator = bgt_02.dno().fVg();
            while (ffV2 == null && tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                ffs_02 = (ffs_0)tLongObjectIterator.value();
                ffV2 = ffs_02.UH(n);
            }
            if (ffV2 != null) {
                tIntObjectHashMap.put(n3 == -1 ? n : n3, (Object)ffV2);
            } else if (n2 == -1) {
                tIntObjectHashMap.put(n3 == -1 ? n : n3, (Object)bgv_22);
            }
            if (n3 == -1) continue;
            tIntArrayList.add(n3);
        }
        this.jOl = new Object[tIntObjectHashMap.size()];
        tIntObjectHashMap.values(this.jOl);
        return this.jOl;
    }

    public static String I(ArrayList<enk_0> arrayList) {
        arrayList.sort(bis_0.imT);
        eme_0 eme_02 = new eme_0(arrayList);
        ArrayList<String> arrayList2 = eme_02.fzQ();
        return arrayList2.isEmpty() ? "" : arrayList2.get(0);
    }

    @Override
    public Object eu(String string) {
        if (string == null) {
            return null;
        }
        if (string.equalsIgnoreCase(jNV)) {
            return this.getName();
        }
        if (string.equalsIgnoreCase(jNW)) {
            return "<u>" + this.getName() + "</u>";
        }
        if (string.equals(jNX)) {
            return this.aIi();
        }
        if (string.equals(jNZ)) {
            byte by = this.dSe();
            ahv_2 ahv_22 = new ahv_2();
            int n = this.dSg();
            if (by == n) {
                ahv_22.ceC().ih(new awx_2(0.0f, 0.7f, 0.0f, 1.0f).bQk());
            }
            ahv_22.c(this.getName()).c(" (").aO(by).c("/").yx(n).c(")");
            return ahv_22.ceL();
        }
        if (string.equals(jOg)) {
            TLongObjectIterator<ffs_0> tLongObjectIterator = aue_0.cVJ().cVK().dno().fVg();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
                for (bgv_2 bgv_22 : this) {
                    if (!ffs_02.pb(bgv_22.d())) continue;
                    return true;
                }
            }
            return false;
        }
        if (string.equals(jOh)) {
            return true;
        }
        if (string.equals(jOa)) {
            byte by = this.dSe();
            return "(" + by + "/" + this.dSg() + ")";
        }
        if (string.equals(jOb)) {
            if (!this.sfK.isEmpty()) {
                Object[] objectArray = new Integer[this.sfK.size()];
                int n = 0;
                for (int n2 : this.sfK.keys()) {
                    objectArray[n++] = n2;
                }
                Arrays.sort(objectArray);
                return objectArray;
            }
            return null;
        }
        if (string.equals(jNY)) {
            return this.dSf();
        }
        if (string.equals(jOd)) {
            return this.dSh();
        }
        if (string.equals(jOe)) {
            return this.Gx(this.dSg());
        }
        if (string.equals(jOi)) {
            return this.getDescription();
        }
        if (string.equalsIgnoreCase(jOf)) {
            Object object = "";
            if (this.jOk != null) {
                for (String string2 : this.jOk) {
                    object = (String)object + string2 + "\n";
                }
            }
            return object;
        }
        return null;
    }

    @Override
    public int dSg() {
        return this.dSf().length;
    }

    private String dSh() {
        ahv_2 ahv_22 = new ahv_2();
        int n = 0;
        for (int i = 0; i < this.dSf().length; ++i) {
            boolean bl;
            int n2 = i + 1;
            String string = this.Gx(n2);
            if (string.length() == 0) continue;
            if (n > 0) {
                ahv_22.ceH().ceH();
            }
            ahv_22.ceu();
            boolean bl2 = bl = this.dSe() >= n2;
            if (bl) {
                ahv_22.ih("00b400");
            }
            ahv_22.c(aum_0.cWf().c("object", n2)).c(" :");
            ahv_22.cev().ceH();
            ahv_22.c(string);
            ++n;
        }
        return ahv_22.ceL();
    }

    @Override
    public String[] bxk() {
        return jOj;
    }

    public void bYg() {
        this.jOl = null;
        fse_1.gFu().a((aef_2)this, jOg);
        fse_1.gFu().a((aef_2)this, jOj);
    }
}

