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

public class bQX
implements aeh_2,
faf_0 {
    public static final String kYg = "itemList";
    public static final String kYh = "baseResourcesQuantityValue";
    public static final String kYi = "resourcesQuantityValue";
    public static final String kYj = "resourcesQuantityText";
    public static final String kYk = "validEnabled";
    public static final String[] kYl = new String[]{"itemList", "resourcesQuantityValue", "resourcesQuantityText", "validEnabled"};
    private final TLongObjectHashMap<ffT> kYm = new TLongObjectHashMap();
    private int kYn;
    private final int kYo;

    @Override
    public String[] bxk() {
        return kYl;
    }

    public bQX(int n) {
        this.kYo = n;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kYg)) {
            ArrayList<ffT> arrayList = new ArrayList<ffT>();
            TLongObjectIterator tLongObjectIterator = this.kYm.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                arrayList.add((ffT)tLongObjectIterator.value());
            }
            return arrayList;
        }
        if (string.equals(kYh)) {
            return Float.valueOf((float)this.kYo / 5.0E7f);
        }
        if (string.equals(kYi)) {
            return Float.valueOf((float)this.ekp() / 5.0E7f);
        }
        if (string.equals(kYj)) {
            ahv_2 ahv_22 = new ahv_2();
            ahv_22.ih(this.ekp() > 50000000 ? new awx_2(1.0f, 0.0f, 0.0f, 1.0f).bQk() : awx_2.dnF.bQk());
            ahv_22.c(aum_0.cWf().cQ(this.ekp()));
            ahv_22.ceD();
            ahv_22.c(" / " + aum_0.cWf().cQ(50000000L));
            return ahv_22.ceL();
        }
        if (string.equals(kYk)) {
            return this.kYn > 0;
        }
        return null;
    }

    private int ekp() {
        return this.kYo + this.kYn;
    }

    public TLongObjectHashMap<ffT> ekq() {
        return this.kYm;
    }

    public int ekr() {
        return this.kYn;
    }

    public void removeItem(ffT ffT2) {
        long l = ffT2.LV();
        if (!this.kYm.containsKey(l)) {
            return;
        }
        this.kYm.remove(l);
        this.kYn = (int)((long)this.kYn - faj_0.e(ffT2, ffT2.bfd()));
        ffV ffV2 = aue_0.cVJ().cVK().dno().tb(l);
        fse_1.gFu().a((aef_2)this, kYl);
        fse_1.gFu().a((aef_2)ffV2, "movable", "deletable");
    }

    public void c(ffV ffV2, short s) {
        long l = ffV2.LV();
        if (this.kYm.containsKey(l)) {
            return;
        }
        ffT ffT2 = new ffT(ffV2.dOg());
        ffT2.tn(l);
        ffT2.ak(s);
        if (ffV2.pe()) {
            ffT2.cD(ffV2);
        }
        this.kYm.put(l, (Object)ffT2);
        this.kYn = (int)((long)this.kYn + faj_0.e(ffT2, s));
        fse_1.gFu().a((aef_2)this, kYl);
        fse_1.gFu().a((aef_2)ffV2, "movable", "deletable");
    }

    public boolean jW(long l) {
        return this.kYm.containsKey(l);
    }

    public void dXp() {
        this.kYm.clear();
        this.kYn = 0;
        fse_1.gFu().a((aef_2)this, kYl);
    }

    @Override
    public void Jb(int n) {
        fse_1.gFu().a((aef_2)this, kYj, kYi);
    }

    public int aVo() {
        return this.kYm.size();
    }

    public boolean aJG() {
        return this.kYm.isEmpty();
    }
}

