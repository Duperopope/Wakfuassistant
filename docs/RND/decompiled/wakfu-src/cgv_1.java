/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cGV
 */
@fyf_0
public class cgv_1
extends cex_2 {
    private static final Logger mYU = Logger.getLogger(cgv_1.class);
    public static final String PACKAGE = "wakfu.seedSpreader";
    private static ffT mYV;

    public static ffT getDraggedItem() {
        return mYV;
    }

    public static void setDraggedItem(ffT ffT2) {
        mYV = ffT2;
    }

    public static void removeSeed(flu_1 flu_12) {
        mYV = (ffT)flu_12.getValue();
        dae_0.cV((short)18146);
    }

    public static void closeWindow(fiq_1 fiq_12) {
        if (cxu_2.eXE().eXG()) {
            fiq_2.gCw().d(fik_2.a(string -> cgv_1.eKo()).l("question.seedSpreaderClose", new Object[0]).vG(ccp_2.mRM.byf()));
        } else {
            cgv_1.eKo();
        }
    }

    private static void eKo() {
        fyw_0.gqw().tl("seedSpreaderDialog");
    }
}

