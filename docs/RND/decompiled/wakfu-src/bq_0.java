/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortShortHashMap
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.map.hash.TShortShortHashMap;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/*
 * Renamed from BQ
 */
public class bq_0 {
    private final Cn avL;
    private final cm_0 avM;
    private final bp_0 avN;
    public static final Pattern avO = Pattern.compile("([0-9]_)?(A|a)nim.*");

    public bq_0(Cn cn, cm_0 cm_02, bp_0 bp_02) {
        this.avL = cn;
        this.avM = cm_02;
        this.avN = bp_02;
    }

    public ez_0 aHY() {
        ez_0 ez_02 = new ez_0();
        this.a(ez_02);
        this.b(ez_02);
        this.c(ez_02);
        this.d(ez_02);
        this.e(ez_02);
        this.f(ez_02);
        return ez_02;
    }

    private void a(ez_0 ez_02) {
        et_1 et_12 = this.avL.aId();
        if (this.avM.axu.axh.axl) {
            et_12.aJA();
        }
        et_12.aJD();
        et_12.aJy();
        et_12.aJC();
        ez_02.a(et_12);
    }

    private void b(ez_0 ez_02) {
        ex_1 ex_12 = ez_02.aID();
        ex_12.setScale(this.avM.axu.axc.awY);
        ex_12.l(this.avM.axu.axd.awY);
        if (this.avM.axu.axh.axl) {
            ex_12.aJA();
        }
        ex_12.ax(this.avM.axu.axe.axl);
        List<String> list = this.avM.axw.axa.stream().map(ca_02 -> ca_02.axb).toList();
        ex_12.c(list);
        ArrayList<ew_1> arrayList = new ArrayList<ew_1>();
        List<Cq> list2 = this.avL.aIf().aIt();
        for (Cq object42 : list2) {
            if (object42 == null || object42.getName() == null || !avO.matcher(object42.getName()).matches()) continue;
            ew_1 ew_12 = new ew_1();
            ew_12.setName(object42.getName());
            ew_12.mD(ew_12.getName().hashCode());
            ew_12.p((short)-1);
            arrayList.add(ew_12);
        }
        for (int i = 0; i < list.size(); ++i) {
            ez_0 ez_03 = this.avN.bm(list.get(i));
            List<fk_0> list3 = ez_03.aIF().aIt();
            for (fk_0 fk_02 : list3) {
                if (fk_02 == null || fk_02.getName() == null || !avO.matcher(fk_02.getName()).matches()) continue;
                ew_1 ew_13 = new ew_1();
                ew_13.setName(fk_02.getName());
                ew_13.mD(ew_13.getName().hashCode());
                ew_13.p((short)i);
                arrayList.add(ew_13);
            }
        }
        ex_12.a(arrayList.toArray(new ew_1[arrayList.size()]));
        ArrayList<fa_1> arrayList2 = new ArrayList<fa_1>();
        for (cf_0 cf_02 : this.avM.axu.axf) {
            fa_1 fa_12 = new fa_1(cf_02.axn.hashCode(), cf_02.axo.hashCode());
            arrayList2.add(fa_12);
        }
        ex_12.d(arrayList2);
        ArrayList<ez_1> arrayList3 = new ArrayList<ez_1>();
        for (ci_0 ci_02 : this.avM.axu.axg) {
            ez_1 ez_12 = new ez_1(ci_02.axs, ci_02.axt.hashCode());
            arrayList3.add(ez_12);
        }
        ex_12.e(arrayList3);
        HashMap<String, Byte> hashMap = new HashMap<String, Byte>();
        for (ce_0 ce_02 : this.avM.axu.axk) {
            hashMap.put(ce_02.p, ce_02.axm);
        }
        ex_12.q(hashMap);
        cg_0 cg_02 = this.avM.axu.axj;
        ex_12.m(new float[]{cg_02.axp, cg_02.axq, cg_02.axr});
    }

    private void c(ez_0 ez_02) {
        fm_0 fm_02 = this.avL.aIg();
        ez_02.a(fm_02);
    }

    private void d(ez_0 ez_02) {
        fd_1 fd_12 = this.avL.aIe();
        ez_02.a(fd_12);
    }

    private void e(ez_0 ez_02) {
        Object object;
        TShortShortHashMap tShortShortHashMap = new TShortShortHashMap();
        List<Cq> list = this.avL.aIf().aIt();
        for (Cq object32 : list) {
            ea_1 ea_12;
            if (object32 == null || object32.aIo().length != 1 || object32.aIo()[0].aIG().length != 1 || (ea_12 = object32.aIo()[0]).aIH().length != 0 || ((fb_1)(object = ea_12.aIG()[0])).aKe() || ((fb_1)object).aKf() || ((fb_1)object).aKc() || ((fb_1)object).aKd()) continue;
            if (((fb_1)object).aIi() < 0) {
                if (object32.getName() != null) continue;
                tShortShortHashMap.put(object32.aIi(), ((fb_1)object).aIi());
                continue;
            }
            while (tShortShortHashMap.contains(((fb_1)object).aIi())) {
                ((fb_1)object).j(tShortShortHashMap.get(((fb_1)object).aIi()));
            }
            if (object32.getName() != null || ((fb_1)object).aIi() >= 0) continue;
            tShortShortHashMap.put(object32.aIi(), ((fb_1)object).aIi());
        }
        TIntHashSet tIntHashSet = new TIntHashSet();
        for (Cq cq2 : list) {
            if (cq2 == null) continue;
            if (cq2.getName() != null) {
                tIntHashSet.add((int)cq2.aIi());
            }
            for (ea_1 ea_13 : object = cq2.aIo()) {
                fb_1[] fb_1Array;
                if (ea_13 == null) continue;
                for (fb_1 fb_12 : fb_1Array = ea_13.aIG()) {
                    if (tShortShortHashMap.contains(fb_12.aIi())) {
                        fb_12.j(tShortShortHashMap.get(fb_12.aIi()));
                    }
                    tIntHashSet.add((int)fb_12.aIi());
                }
            }
        }
        List<Cq> list2 = list.stream().filter(cq -> cq != null && tIntHashSet.contains((int)cq.aIi())).toList();
        br_0 br_02 = new br_0();
        br_02.b(list2);
        object = br_02.aHZ();
        ez_02.a((eg_2)object);
        fi_0 fi_02 = br_02.aIa();
        for (fk_0 fk_02 : fi_02.aIt()) {
            fk_02.a((eg_2)object);
        }
        ez_02.b(fi_02);
    }

    private void f(ez_0 ez_02) {
        ez_02.a(this.avL.aIh());
    }
}

