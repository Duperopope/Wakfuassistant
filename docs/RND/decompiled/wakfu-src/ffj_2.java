/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from fFj
 */
public class ffj_2<T extends fft_1> {
    private static final Logger uoM = Logger.getLogger(ffj_2.class);
    public static final float uoN = 43.0f;
    public static final float uoO = 21.5f;
    protected final T uoP;
    protected final TLongObjectHashMap<ffo_2> uoQ = new TLongObjectHashMap();
    protected final TLongArrayList uoR = new TLongArrayList();

    public ffj_2(T t) {
        this.uoP = t;
    }

    public void a(long l, ffo_2 ffo_22) {
        this.uoQ.put(l, (Object)ffo_22);
        aeb_2.b(this.uoR, l);
    }

    public void aaD(int n) {
        this.uoR.add((long)n);
    }

    public void gtl() {
        TLongObjectIterator tLongObjectIterator = this.uoQ.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            this.uoR.add(tLongObjectIterator.key());
        }
    }

    public void clear() {
        this.uoQ.forEachValue(ffo_22 -> {
            ffo_22.bmX();
            return true;
        });
    }

    public void gtm() {
        int n = this.uoR.size();
        for (int i = 0; i < n; ++i) {
            long l = this.uoR.getQuick(i);
            ((fft_1)this.uoP).vc(l);
            ffo_2 ffo_22 = (ffo_2)this.uoQ.remove(l);
            if (ffo_22 == null || ffo_22.getPixmap() == null || ffo_22.getPixmap().bHg() == null) continue;
            ffo_22.bmX();
        }
        this.uoR.clear();
    }

    public void L(float f2, float f3, float f4) {
        int n = 774;
        int n2 = 387;
        TLongObjectIterator tLongObjectIterator = this.uoQ.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffo_2 ffo_22 = (ffo_2)tLongObjectIterator.value();
            ffo_22.cz(f2);
            ffj_2.a(f3, f4, 774, 387, ffo_22);
        }
    }

    protected static void a(float f2, float f3, int n, int n2, ffo_2 ffo_22) {
        ArrayList<ffl_2> arrayList = ffo_22.getChildren();
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            ffl_2 ffl_22 = arrayList.get(i);
            ArrayList<ffm_2> arrayList2 = ffl_22.bsL();
            for (int j = arrayList2.size() - 1; j >= 0; --j) {
                ffm_2 ffm_22 = arrayList2.get(j);
                short s = ffm_22.bsM();
                short s2 = ffm_22.bsN();
                int n3 = s * 18;
                int n4 = s2 * 18;
                float f4 = (float)(n3 - n4) * 43.0f + f2;
                float f5 = (float)(-(n3 + n4)) * 21.5f + f3;
                ffm_22.fF(f4 - (float)n);
                ffm_22.fG(f5 - (float)n2);
                ffm_22.fH(f4);
                ffm_22.fI(f5);
                ffm_22.fJ(f4 + (float)n);
                ffm_22.fK(f5 - (float)n2);
                ffm_22.fL(f4);
                ffm_22.fM(f5 - (float)(2 * n2));
            }
            ffl_22.gvK();
        }
    }

    public static ffo_2 a(ffp_2 ffp_22, float f2, float f3, float f4, String string) {
        ffo_2 ffo_22 = new ffo_2(ffp_22);
        ffo_22.cz(f2);
        List<ffq_2> list = ffp_22.bFA();
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            String string2;
            ffq_2 ffq_22 = list.get(i);
            ffl_2 ffl_22 = new ffl_2();
            if (!ffq_22.isVisible()) continue;
            ffl_22.c(ffq_22);
            vf_0 vf_02 = ffq_22.eaW();
            if (vf_02 != null) {
                string2 = vf_02.bkA().iterator();
                int n2 = 774;
                int n3 = 387;
                while (string2.hasNext()) {
                    int n4 = string2.next();
                    short s = add_0.rP(n4);
                    short s2 = add_0.rQ(n4);
                    int n5 = s * 18;
                    int n6 = s2 * 18;
                    float f5 = (float)(n5 - n6) * 43.0f + f3;
                    float f6 = (float)(-(n5 + n6)) * 21.5f + f4;
                    ffl_22.a(s, s2, f5 - 774.0f, f6 - 387.0f, f5, f6, f5 + 774.0f, f6 - 387.0f, f5, f6 - 774.0f);
                }
                ffl_22.gvK();
            }
            if ((string2 = ffq_22.byf()) != null) {
                awk_1 awk_12 = null;
                try {
                    awk_12 = ffy_2.tM(string2);
                }
                catch (Exception exception) {
                    uoM.error((Object)"Probl\u00e8me lors de la r\u00e9cup\u00e9ration de la texture d'iconUrl", (Throwable)exception);
                }
                if (awk_12 != null) {
                    ffl_22.setPixmap(new awg_1(awk_12));
                }
            }
            ffl_22.mE(string);
            ffl_22.tV(ffq_22.gvD());
            ffl_22.tW(ffq_22.gvE());
            ffl_22.uZ(ffq_22.gvF());
            ffl_22.oK(ffq_22.dZi());
            ffo_22.a(ffl_22);
        }
        ffo_22.gvK();
        return ffo_22;
    }

    public void qy(int n) {
        TLongObjectIterator tLongObjectIterator = this.uoQ.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ((ffo_2)tLongObjectIterator.value()).qy(n);
        }
    }
}

