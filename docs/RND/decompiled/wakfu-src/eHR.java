/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;

public final class eHR {
    public static final ehx_0 qtM = new ehx_0(1, eHR.W((short)2, (short)4));
    public static final ehx_0 qtN = new ehx_0(2, eHR.W((short)3, (short)4));
    public static final ehx_0 qtO = new ehx_0(3, eHR.W((short)4, (short)4));
    public static final ehx_0 qtP = new ehx_0(4, eHR.W((short)5, (short)4));
    public static final ehx_0 qtQ = new ehx_0(5, new TIntArrayList(new int[]{40, 80, 120, 160}));

    private static TIntArrayList W(short s, short s2) {
        TIntArrayList tIntArrayList = new TIntArrayList();
        tIntArrayList.add((int)s);
        for (short s3 = s; s3 <= 200; s3 = (short)(s3 + 1)) {
            if (s3 % s2 != 0) continue;
            tIntArrayList.add((int)((short)(s3 + s)));
        }
        return tIntArrayList;
    }

    static {
        qtM.c(eHQ.qtk);
        qtM.c(eHQ.qtl);
        qtM.c(eHQ.qtm);
        qtM.c(eHQ.qtn);
        qtM.c(eHQ.qto);
        qtN.c(eHQ.qtp);
        qtN.c(eHQ.qtq);
        qtN.c(eHQ.qtr);
        qtO.c(eHQ.qtt);
        qtO.c(eHQ.qtu);
        qtO.c(eHQ.qtv);
        qtO.c(eHQ.qtw);
        qtP.c(eHQ.qtz);
        qtP.c(eHQ.qtA);
        qtP.c(eHQ.qtB);
        qtP.c(eHQ.qtC);
        qtP.c(eHQ.qtD);
        qtP.c(eHQ.qtE);
        qtP.c(eHQ.qtF);
        qtQ.c(eHQ.qtG);
        qtQ.c(eHQ.qtH);
        qtQ.c(eHQ.qtI);
        qtQ.c(eHQ.qtJ);
        qtQ.c(eHQ.qtK);
        qtQ.c(eHQ.qtL);
    }
}

