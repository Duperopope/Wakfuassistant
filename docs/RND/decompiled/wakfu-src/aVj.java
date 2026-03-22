/*
 * Decompiled with CFR 0.152.
 */
public class aVj {
    private aVj() {
    }

    public static void n(Runnable runnable) {
        bsj_0 bsj_02;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null && (bsj_02 = bgt_02.dmV()) != null) {
            aVi.cWF().a(bsj_02, (aft_2)new avv_0(runnable));
            aVi.cWF().m(bsj_02);
            return;
        }
        runnable.run();
    }
}

