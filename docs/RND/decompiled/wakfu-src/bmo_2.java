/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bmO
 */
public class bmo_2 {
    private static final Logger iEu = Logger.getLogger(bmo_2.class);
    public static final bmo_2 iEv = new bmo_2();
    private final Set<Short> iEw = new HashSet<Short>();
    private final TIntObjectHashMap<bmq_1> iEx = new TIntObjectHashMap();
    private final TIntObjectHashMap<TIntArrayList> iEy = new TIntObjectHashMap();
    private boolean bXs = false;

    private bmo_2() {
    }

    public void bkZ() {
        int n8;
        int n2;
        TIntObjectIterator tIntObjectIterator = bKU.eca().ekN();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bKT bKT2 = (bKT)tIntObjectIterator.value();
            ejj_0 object = ejj_0.dG(bKT2.ghz());
            if (object == null) continue;
            int n3 = bKT2.ghA();
            for (int object2 = 0; object2 < n3; ++object2) {
                bLc bLc2 = (bLc)bKT2.YL(object2);
                n2 = bLc2.ghG();
                for (n8 = 0; n8 < n2; ++n8) {
                    bmv_2 bmv_22 = (bmv_2)bLc2.YQ(n8);
                    if (!bmv_22.csC()) continue;
                    for (int n4 : bmv_22.dwu()) {
                        bmq_1 bmq_12 = (bmq_1)this.iEx.get(n4);
                        if (n4 == 0) continue;
                        if (bmq_12 == null) {
                            var15_28 = bEm.dSb().Ve(n4);
                            if (var15_28 == null) {
                                iEu.error((Object)("Impossible to find the ref item " + n4 + " for step " + object2 + " of resource " + bKT2.d()));
                                continue;
                            }
                            bmq_12 = new bmx_2(n4, bmv_22.clf(), bKT2.d(), bmv_22.dwb(), bmv_22.fyQ(), bmv_22.fyP() > 1, object, !((ffV)var15_28).c(fgg_0.siq), bmv_22.cms(), bmv_22.cmu());
                            this.iEx.put(n4, (Object)bmq_12);
                        } else {
                            var15_28 = bmq_12.dwc();
                            int n5 = bmq_12.ccu();
                            bKT bKT3 = (bKT)bKU.eca().YN(n5);
                            if (bKT3.ghz() != ((ejj_0)((Object)var15_28)).fxb()) {
                                bmq_12.Ee(bKT2.d());
                            }
                            int n6 = Math.min(bmq_12.dwb(), bmv_22.dwb());
                            bmq_12.Ed(n6);
                        }
                        int n7 = bmv_22.cms();
                        TIntArrayList tIntArrayList = (TIntArrayList)this.iEy.get(n7);
                        if (tIntArrayList == null) {
                            tIntArrayList = new TIntArrayList();
                            this.iEy.put(n7, (Object)tIntArrayList);
                        }
                        if (tIntArrayList.contains(n4)) continue;
                        tIntArrayList.add(n4);
                    }
                }
            }
        }
        for (bjz_1 bjz_12 : bja_1.drJ().drK()) {
            for (int n8 : bjz_12.fhO()) {
                if (n8 != ezj_0.ptH.aJr()) continue;
                this.iEw.add(bjz_12.aWP());
            }
            TIntObjectIterator tIntObjectIterator2 = bjz_12.fhL();
            while (tIntObjectIterator2.hasNext()) {
                tIntObjectIterator2.advance();
                bmv_2 bmv_23 = (bmv_2)tIntObjectIterator2.value();
                if (!bmv_23.csC()) continue;
                int[] nArray = bmv_23.dwu();
                n8 = nArray.length;
                for (n2 = 0; n2 < n8; ++n2) {
                    eyv eyv2;
                    int n9 = nArray[n2];
                    Object object = (bmq_1)this.iEx.get(n9);
                    if (object == null) {
                        var11_22 = eyw.fik().OW(bjz_12.cqy());
                        object = new bmq_2(n9, bmv_23.clf(), var11_22.fii(), var11_22.cqy(), bmv_23.dwb(), bmv_23.fyQ(), bmv_23.fyP() > 1, true, bmv_23.cms(), bmv_23.cmu());
                        this.iEx.put(n9, object);
                    } else {
                        int n4;
                        var11_22 = eyw.fik().OW(((bmq_1)object).ccu());
                        eyv2 = eyw.fik().OW(bjz_12.cqy());
                        if (var11_22.fij() != eyx.pjm) {
                            ((bmq_1)object).Ee(eyv2.cqy());
                        }
                        n4 = Math.min(((bmq_1)object).dwb(), bmv_23.dwb());
                        ((bmq_1)object).Ed(n4);
                    }
                    int n10 = bmv_23.cms();
                    eyv2 = (TIntArrayList)this.iEy.get(n10);
                    if (eyv2 == null) {
                        eyv2 = new TIntArrayList();
                        this.iEy.put(n10, (Object)eyv2);
                    }
                    if (eyv2.contains(n9)) continue;
                    eyv2.add(n9);
                }
            }
        }
        this.bXs = true;
    }

    public Set<Short> dxt() {
        if (!this.bXs) {
            this.bkZ();
        }
        return Collections.unmodifiableSet(this.iEw);
    }

    public boolean bE(short s) {
        if (!this.bXs) {
            this.bkZ();
        }
        return this.iEw.contains(s);
    }

    public boolean El(int n) {
        TIntArrayList tIntArrayList;
        if (!this.bXs) {
            this.bkZ();
        }
        return (tIntArrayList = (TIntArrayList)this.iEy.get(n)) != null && tIntArrayList.size() != 0;
    }

    public List<bmq_1> dv(int n, int n2) {
        TIntArrayList tIntArrayList;
        if (!this.bXs) {
            this.bkZ();
        }
        if ((tIntArrayList = (TIntArrayList)this.iEy.get(n)) != null) {
            ArrayList<bmq_1> arrayList = new ArrayList<bmq_1>(tIntArrayList.size());
            int n3 = tIntArrayList.size();
            for (int i = 0; i < n3; ++i) {
                bmq_1 bmq_12 = (bmq_1)this.iEx.get(tIntArrayList.get(i));
                if (bmq_12.dwb() > n2 || !bmq_12.dwf()) continue;
                arrayList.add(bmq_12);
            }
            arrayList.sort(bmp_2.iEz);
            return arrayList;
        }
        return Collections.emptyList();
    }

    public boolean Em(int n) {
        if (!this.bXs) {
            this.bkZ();
        }
        return this.iEx.containsKey(n);
    }

    @Nullable
    public bmq_1 En(int n) {
        if (!this.bXs) {
            this.bkZ();
        }
        return (bmq_1)this.iEx.get(n);
    }
}

