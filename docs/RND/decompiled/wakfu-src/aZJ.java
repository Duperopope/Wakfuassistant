/*
 * Decompiled with CFR 0.152.
 */
public class aZJ
implements afl {
    public static final aZJ hys = new aZJ();

    private aZJ() {
    }

    public void a(WL wL) {
        aqb_1.bGD().a(new anb_0(), anb_02 -> foy_0.sLJ.b(aZJ.a(anb_02), anb_02.AK()));
        wL.b(this);
    }

    public static for_0 a(anb_0 anb_02) {
        ane_0[] ane_0Array;
        Object[] objectArray;
        for_0 for_02 = new for_0(anb_02.d(), anb_02.csG(), anb_02.agM(), anb_02.csJ(), anb_02.csK(), anb_02.csI(), anb_02.csH(), anb_02.cqA(), sm_0.pf((byte)anb_02.csL()));
        and_0[] and_0Array = anb_02.csM();
        if (and_0Array != null) {
            objectArray = and_0Array;
            int n = objectArray.length;
            for (int i = 0; i < n; ++i) {
                Object object = objectArray[i];
                for_02.a(foq_0.hf(((and_0)object).csP()), ((and_0)object).csQ());
            }
        }
        if ((objectArray = anb_02.csN()) != null) {
            for (Object object : objectArray) {
                for_02.gi(((aNC)object).azv(), ((aNC)object).getValue());
            }
        }
        if ((ane_0Array = anb_02.csO()) != null) {
            for (ane_0 ane_02 : ane_0Array) {
                for_02.ai(ane_02.azv(), ane_02.isVisible());
            }
        }
        return for_02;
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.item", new Object[0]);
    }
}

