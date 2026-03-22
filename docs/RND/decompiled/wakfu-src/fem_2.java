/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fEM
 */
public class fem_2
extends fel_2 {
    private static final String unE = "DefaultDark14";
    private static final String unF = "chatScreamingBubble";
    private static final String unG = "BubbleArrowLeft";
    private static final String unH = "BubbleArrowRight";

    @Override
    public void b(fem_1 fem_12) {
        super.b(fem_12);
        this.tT(unE);
        this.a(unF, new fsm_1(40, 40));
        this.h(fem_12.isToRight() ? unG : unH, fem_12.isToRight() ? 35 : -35, 3);
        fem_12.setXOffset(fem_12.isToRight() ? -5 : 5);
    }
}

