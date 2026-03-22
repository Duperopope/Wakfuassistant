/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.StreamSupport;

public class HB {
    private final JE aJm;
    private final ll_2 aJn;
    private final lk_2 aJo;
    private final Dimension aJp;
    private final HashMap<Integer, float[]> aJq;
    private final HashMap<Integer, int[]> aJr;
    private final HashMap<Integer, int[]> aJs;

    public HB(JE jE, ll_2 ll_22, lk_2 lk_22, Dimension dimension, HashMap<Integer, float[]> hashMap, HashMap<Integer, int[]> hashMap2, HashMap<Integer, int[]> hashMap3) {
        this.aJm = jE;
        this.aJn = ll_22;
        this.aJo = lk_22;
        this.aJp = dimension;
        this.aJq = Maps.newHashMap(hashMap);
        this.aJr = Maps.newHashMap(hashMap2);
        this.aJs = Maps.newHashMap(hashMap3);
    }

    public final void aPc() {
        List<kt_1> list = this.aJm.aPi().aPl().stream().filter(arg_0 -> HC.a(JI.aKZ).apply(arg_0)).map(arg_0 -> HC.aPd().apply(arg_0)).flatMap(jH -> StreamSupport.stream(((Iterable)HC.aPe().apply(jH)).spliterator(), false)).filter(arg_0 -> HC.a(JI.aLa).apply(arg_0)).map(arg_0 -> HC.aPf().apply(arg_0)).toList();
        for (kt_1 kt_12 : list) {
            this.b(kt_12);
        }
    }

    private void b(kt_1 kt_12) {
        List<km_1> list2 = kt_12.aPi().aPl().stream().filter(arg_0 -> HC.a(JI.aKG).apply(arg_0)).map(arg_0 -> HC.aPf().apply(arg_0)).toList();
        for (km_1 list3 : list2) {
            this.a(list3);
        }
        List<kn_1> list4 = kt_12.aPi().aPl().stream().filter(arg_0 -> HC.a(JI.aKS).apply(arg_0)).map(arg_0 -> HC.aPf().apply(arg_0)).toList();
        Iterator iterator = list4.iterator();
        while (iterator.hasNext()) {
            kn_1 kn_12 = (kn_1)iterator.next();
            this.a(kn_12);
        }
        List<kt_1> list = kt_12.aPi().aPl().stream().filter(arg_0 -> HC.a(JI.aLa).apply(arg_0)).map(arg_0 -> HC.aPf().apply(arg_0)).toList();
        for (kt_1 kt_13 : list) {
            this.b(kt_13);
        }
    }

    private void a(km_1 km_12) {
        int n = km_12.aPA();
        float[] fArray = this.aJq.get(n);
        if (fArray == null) {
            return;
        }
        km_12.O(fArray[0]);
        km_12.P(fArray[1]);
        km_12.Q(fArray[2]);
        km_12.R(fArray[3]);
        int[] nArray = this.aJr.get(n);
        if (nArray == null) {
            return;
        }
        km_12.nj(nArray[0] / 2);
        km_12.ni(nArray[1] / 2);
        int[] nArray2 = this.aJs.get(n);
        if (nArray2 == null) {
            return;
        }
        km_12.k(km_12.aPB()[0] - (float)nArray2[0], km_12.aPB()[1] - (float)nArray2[0]);
        km_12.l(km_12.aPC()[0] - (float)nArray2[1], km_12.aPC()[1] - (float)nArray2[1]);
    }

    private void a(kn_1 kn_12) {
        int n = kn_12.aPA();
        float[] fArray = this.aJq.get(n);
        if (fArray == null) {
            return;
        }
        kn_12.O(fArray[0]);
        kn_12.P(fArray[1]);
        kn_12.Q(fArray[2]);
        kn_12.R(fArray[3]);
        int[] nArray = this.aJr.get(n);
        if (nArray == null) {
            return;
        }
        kn_12.nj(nArray[0] / 2);
        kn_12.ni(nArray[1] / 2);
        int[] nArray2 = this.aJs.get(n);
        if (nArray2 == null) {
            return;
        }
        kn_12.k(kn_12.aPB()[0] - (float)nArray2[0], kn_12.aPB()[1] - (float)nArray2[0]);
        kn_12.l(kn_12.aPC()[0] - (float)nArray2[1], kn_12.aPC()[1] - (float)nArray2[1]);
        lm_2 lm_22 = this.aJn.nn(kn_12.aPA());
        short s = lm_22.aRu();
        short s2 = lm_22.aRv();
        short s3 = (short)this.aJp.getWidth();
        short s4 = (short)this.aJp.getHeight();
        short[] sArray = lm_22.aRA();
        float f2 = fArray[1] * (float)s3;
        float f3 = fArray[0] * (float)s4;
        short[] sArray2 = lm_22.aRy();
        for (int i = 0; i < sArray2.length; i += 2) {
            int n2 = i;
            sArray2[n2] = (short)((float)sArray2[n2] + f2);
            int n3 = i + 1;
            sArray2[n3] = (short)((float)sArray2[n3] + f3);
        }
        lm_2 lm_23 = new lm_2();
        lm_23.z(s);
        lm_23.A(s2);
        lm_23.B(s3);
        lm_23.C(s4);
        lm_23.no(lm_22.aRz());
        lm_23.i(sArray);
        lm_23.h(sArray2);
        this.aJo.a(n, lm_23);
    }
}

