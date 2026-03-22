/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TShortArrayList
 *  gnu.trove.strategy.HashingStrategy
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.Lists;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TShortArrayList;
import gnu.trove.strategy.HashingStrategy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from BR
 */
final class br_0 {
    private static final Logger avP = Logger.getLogger(br_0.class);
    static final HashingStrategy<float[]> avQ = new bt_0();
    static final HashingStrategy<short[]> avR = new bu_0();
    private static final int avS = 4;
    private static final int avT = 2;
    private static final int avU = 4;
    private final bv_0 avV = new bv_0();
    private final ArrayList<bs_0> avW = new ArrayList();

    br_0() {
    }

    public void b(List<Cq> list) {
        this.avW.ensureCapacity(list.size());
        this.avV.aIb();
        avP.info((Object)("\tSprites = " + list.size()));
        for (Cq cq : list) {
            this.avW.add(this.a(cq));
        }
        avP.info((Object)("\tTranslations = " + this.avV.awi.size()));
        avP.info((Object)("\tRotations = " + this.avV.awh.size()));
        avP.info((Object)("\tColors = " + this.avV.awj.size()));
        avP.info((Object)("\tActions = " + this.avV.awk.size()));
    }

    private bs_0 a(Cq cq) {
        bs_0 bs_02 = new bs_0(cq);
        ea_1[] ea_1Array = cq.aIo();
        int n = ea_1Array.length;
        bs_02.awc = new short[n][];
        bs_02.awd = new short[n][];
        bs_02.awe = new TIntArrayList[n];
        for (int i = 0; i < n; ++i) {
            int n2;
            TIntArrayList tIntArrayList;
            ea_1 ea_12 = ea_1Array[i];
            fb_1[] fb_1Array = ea_12.aIG();
            int n3 = fb_1Array.length;
            bs_02.awc[i] = new short[n3];
            bs_02.awe[i] = tIntArrayList = new TIntArrayList(2000);
            for (int j = 0; j < n3; ++j) {
                fb_1 fb_12 = fb_1Array[j];
                bs_02.awc[i][j] = fb_1Array[j].aIi();
                n2 = 0;
                if (fb_12.aKe()) {
                    n2 = (byte)(n2 | 8);
                }
                if (fb_12.aKf()) {
                    n2 = (byte)(n2 | 4);
                }
                if (fb_12.aKc()) {
                    n2 = (byte)(n2 | 1);
                }
                if (fb_12.aKd()) {
                    n2 = (byte)(n2 | 2);
                }
                tIntArrayList.add(n2);
                if (fb_12.aKe()) {
                    tIntArrayList.add(4 * this.avV.i(fb_12.aKg(), fb_12.aKh(), fb_12.aKi(), fb_12.aKj()));
                }
                if (fb_12.aKf()) {
                    tIntArrayList.add(4 * this.avV.i(fb_12.aKk(), fb_12.aKl(), fb_12.aKm(), fb_12.aKn()));
                }
                if (fb_12.aKc()) {
                    tIntArrayList.add(4 * this.avV.g(fb_12.aIM(), fb_12.aIN(), fb_12.aIO(), fb_12.aIP()));
                }
                if (!fb_12.aKd()) continue;
                tIntArrayList.add(2 * this.avV.h(fb_12.aIQ(), fb_12.aIR()));
            }
            eh_2[] eh_2Array = ea_12.aIH();
            bs_02.awd[i] = new short[eh_2Array.length];
            if (eh_2Array.length == 0) continue;
            for (int j = 0; j < eh_2Array.length; ++j) {
                n2 = this.avV.a(eh_2Array[j]);
                if (n2 > 65535) {
                    throw new IllegalStateException("Too many actions in frame");
                }
                bs_02.awd[i][j] = (short)n2;
            }
        }
        return bs_02;
    }

    public eg_2 aHZ() {
        eg_2 eg_22 = new eg_2();
        Float[] floatArray = (Float[])this.avV.awn.stream().flatMap(fArray -> Lists.newArrayList((Object[])Bn.a(fArray)).stream()).toArray(Float[]::new);
        eg_22.j(Bn.a(floatArray));
        Float[] floatArray2 = (Float[])this.avV.awl.stream().flatMap(fArray -> Lists.newArrayList((Object[])Bn.a(fArray)).stream()).toArray(Float[]::new);
        eg_22.k(Bn.a(floatArray2));
        Float[] floatArray3 = (Float[])this.avV.awm.stream().flatMap(fArray -> Lists.newArrayList((Object[])Bn.a(fArray)).stream()).toArray(Float[]::new);
        eg_22.l(Bn.a(floatArray3));
        eg_22.a(this.avV.awo.toArray(new eh_2[this.avV.awo.size()]));
        return eg_22;
    }

    public fi_0 aIa() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (bs_0 bs_02 : this.avW) {
            Object object;
            int n = bs_02.awc.length;
            if (n == 1) {
                ed_1 ed_12;
                fk_0 fk_02;
                object = bs_02.awc[0];
                if (((Object)object).length == 1) {
                    if (bs_02.awd[0].length == 0) {
                        fk_02 = new fh_0();
                        ((fh_0)fk_02).j(bs_02.avX);
                        ((fh_0)fk_02).f(bs_02.awb);
                        if ((bs_02.awb & 0x40) != 0) {
                            ((fh_0)fk_02).setName(bs_02.avY);
                        }
                        ((fh_0)fk_02).mp(bs_02.avZ);
                        ((fh_0)fk_02).mq(bs_02.awa);
                        ((fh_0)fk_02).u((short)object[0]);
                        ed_12 = new ed_1(bs_02.awe[0].toArray());
                        ((fh_0)fk_02).a(ed_12);
                        arrayList.add(fk_02);
                        continue;
                    }
                    fk_02 = new ff_0();
                    ((ff_0)fk_02).j(bs_02.avX);
                    ((ff_0)fk_02).f(bs_02.awb);
                    if ((bs_02.awb & 0x40) != 0) {
                        ((ff_0)fk_02).setName(bs_02.avY);
                    }
                    ((ff_0)fk_02).mp(bs_02.avZ);
                    ((ff_0)fk_02).mq(bs_02.awa);
                    ((ff_0)fk_02).u((short)object[0]);
                    ((ff_0)fk_02).f(bs_02.awd[0]);
                    ed_12 = new ed_1(bs_02.awe[0].toArray());
                    ((ff_0)fk_02).a(ed_12);
                    arrayList.add(fk_02);
                    continue;
                }
                fk_02 = new fg_0();
                ((fg_0)fk_02).j(bs_02.avX);
                ((fg_0)fk_02).f(bs_02.awb);
                if ((bs_02.awb & 0x40) != 0) {
                    ((fg_0)fk_02).setName(bs_02.avY);
                }
                ((fg_0)fk_02).mp(bs_02.avZ);
                ((fg_0)fk_02).mq(bs_02.awa);
                ((fg_0)fk_02).g((short[])object);
                ((fg_0)fk_02).f(bs_02.awd[0]);
                ed_12 = new ed_1(bs_02.awe[0].toArray());
                ((fg_0)fk_02).a(ed_12);
                arrayList.add(fk_02);
                continue;
            }
            object = new fe_1();
            ((fe_1)object).j(bs_02.avX);
            ((fe_1)object).f(bs_02.awb);
            if ((bs_02.awb & 0x40) != 0) {
                ((fe_1)object).setName(bs_02.avY);
            }
            ((fe_1)object).mp(bs_02.avZ);
            ((fe_1)object).mq(bs_02.awa);
            boolean bl = Arrays.stream(bs_02.awd).anyMatch(sArray -> ((short[])sArray).length > 0);
            int n2 = bl ? 3 : 2;
            int[] nArray = new int[n * n2];
            TIntArrayList tIntArrayList = new TIntArrayList();
            bs_02.awf.clear();
            for (int i = 0; i < n; ++i) {
                if (bs_02.awf.contains((Object)bs_02.awe[i])) {
                    nArray[i * n2] = bs_02.awf.get((Object)bs_02.awe[i]);
                    continue;
                }
                nArray[i * n2] = tIntArrayList.size();
                tIntArrayList.add(bs_02.awe[i].toArray());
                bs_02.awf.put((Object)bs_02.awe[i], nArray[i * n2]);
            }
            bs_02.awg.clear();
            TShortArrayList tShortArrayList = new TShortArrayList();
            for (int i = 0; i < n; ++i) {
                if (bs_02.awg.contains((Object)bs_02.awc[i])) {
                    nArray[i * n2 + 1] = bs_02.awg.get((Object)bs_02.awc[i]);
                    continue;
                }
                nArray[i * n2 + 1] = tShortArrayList.size();
                tShortArrayList.add((short)bs_02.awc[i].length);
                tShortArrayList.add(bs_02.awc[i]);
                bs_02.awg.put((Object)bs_02.awc[i], nArray[i * n2 + 1]);
            }
            TShortArrayList tShortArrayList2 = new TShortArrayList();
            if (bl) {
                bs_02.awg.clear();
                for (int i = 0; i < n; ++i) {
                    if (bs_02.awg.contains((Object)bs_02.awd[i])) {
                        nArray[i * n2 + 2] = bs_02.awg.get((Object)bs_02.awd[i]);
                        continue;
                    }
                    nArray[i * n2 + 2] = tShortArrayList2.size();
                    tShortArrayList2.add((short)bs_02.awd[i].length);
                    tShortArrayList2.add(bs_02.awd[i]);
                    bs_02.awg.put((Object)bs_02.awd[i], nArray[i * n2 + 2]);
                }
            }
            ((fe_1)object).e(nArray);
            ((fe_1)object).e(tShortArrayList.toArray());
            ((fe_1)object).f(tShortArrayList2.toArray());
            short[] sArray2 = ((fe_1)object).aKy();
            for (int i = 0; i < sArray2.length; ++i) {
                if (sArray2[i] > ((fe_1)object).aIn()) {
                    ((fe_1)object).ms(sArray2[i]);
                }
                i += sArray2[i];
            }
            ed_1 ed_13 = new ed_1(tIntArrayList.toArray());
            ((fe_1)object).a(ed_13);
            arrayList.add(object);
        }
        fi_0 fi_02 = new fi_0();
        fi_02.a(arrayList.toArray(new fk_0[arrayList.size()]));
        return fi_02;
    }
}

