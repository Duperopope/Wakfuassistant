/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eWd
 */
public final class ewd_2 {
    private static final int rAS = 8;
    private static final float rAT = 2.3333333f;
    private static final int rAU = 0;
    private static final int rAV = -1;
    private static final int rAW = -2;
    private eum_0 rAX;

    public void a(@NotNull eum_0 eum_02) {
        this.rAX = eum_02;
    }

    public ewh_2 a(Collection<? extends exP> collection, acd_1 acd_12) {
        List<? extends exP> list = this.b(collection, acd_12);
        if (list.isEmpty()) {
            ewh_2 ewh_22 = new ewh_2();
            ewh_22.aU(Collections.emptyList());
            return ewh_22;
        }
        int n = ewd_2.aS(list);
        int n2 = this.rAX.ffW();
        return this.a(list, n, n2, acd_12);
    }

    private ewh_2 a(List<? extends exP> list, int n, int n2, acd_1 acd_12) {
        int n3 = this.a(n, n2, list, acd_12);
        int n4 = GC.C((float)n3 / 2.0f);
        int n5 = n3 - n4;
        ewh_2 ewh_22 = new ewh_2();
        ewh_22.aU(list);
        ewh_22.SG(n5);
        ewh_22.SH(n4);
        return ewh_22;
    }

    private float fNJ() {
        short s = this.rAX.cmL();
        return ewd_2.er(s);
    }

    private static float er(short s) {
        return Math.min(0.5f + (float)s / 200.0f, 1.0f);
    }

    private int a(int n, int n2, List<? extends exP> list, acd_1 acd_12) {
        int n3;
        int n4 = Math.max(0, n2);
        float f2 = n4 == (n3 = Math.max(0, n)) ? 2.3333333f * (float)(n3 - n4) : 2.3333333f * (float)(n3 - n4) / (float)(n4 + n3);
        float f3 = GC.b(f2, -1.0f, 1.0f);
        float f4 = (f3 + 1.0f) * 8.0f / 2.0f * this.fNJ();
        float f5 = f4 + (float)this.a(list, acd_12);
        return GC.B(GC.c(0.0f, f5));
    }

    private int a(List<? extends exP> list, acd_1 acd_12) {
        so_0 so_02 = ewd_2.b(list, acd_12);
        return ewd_2.b(so_02);
    }

    private static int b(so_0 so_02) {
        switch (so_02) {
            case bpI: {
                return 0;
            }
            case bpG: 
            case bpH: {
                return -1;
            }
            case bpF: {
                return -2;
            }
        }
        return 0;
    }

    private static so_0 b(List<? extends exP> list, acd_1 acd_12) {
        so_0 so_02 = so_0.bpF;
        for (exP exP2 : list) {
            so_0 so_03;
            sp_0 sp_02 = exP2.baD();
            if (sp_02 == null || (so_03 = sp_02.o(acd_12.getX(), acd_12.getY(), acd_12.bdi())) == null) continue;
            if ((so_03 == so_0.bpH || so_03 == so_0.bpG) && so_02 != so_0.bpI) {
                so_02 = so_03;
            }
            if (so_03 != so_0.bpI) continue;
            so_02 = so_03;
        }
        return so_02;
    }

    private static int aS(List<? extends exP> list) {
        int n = 0;
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            exP exP2 = list.get(i);
            n += exP2.ffX() / (i + 1);
        }
        return n;
    }

    private List<? extends exP> b(Collection<? extends exP> collection, acd_1 acd_12) {
        List<? extends exP> list = this.c(collection, acd_12);
        ewd_2.aT(list);
        return list;
    }

    private List<? extends exP> c(Collection<? extends exP> collection, acd_1 acd_12) {
        ArrayList<? extends exP> arrayList = new ArrayList<exP>(collection);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            exP exP2 = (exP)iterator.next();
            if (!ewj_1.a(exP2, this.rAX, acd_12) && exP2.a(exx_2.rGm) && !exP2.cyi()) continue;
            iterator.remove();
        }
        return arrayList;
    }

    private static void aT(List<? extends exP> list) {
        list.sort(new ewe_2());
    }
}

