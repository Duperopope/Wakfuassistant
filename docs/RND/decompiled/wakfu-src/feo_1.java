/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fEO
 */
public class feo_1
extends fel_2 {
    private static final String unM = "gray";
    private static final String unN = "chatThinkingBubble";
    private static final String unO = "BubbleThinkingArrowLeft";
    private static final String unP = "BubbleThinkingArrowRight";

    @Override
    public void b(fem_1 fem_12) {
        super.b(fem_12);
        this.tT(unM);
        this.a(unN, new fsm_1(30, 40));
        this.h(fem_12.isToRight() ? unO : unP, fem_12.isToRight() ? 25 : -25, 5);
        fem_12.setXOffset(fem_12.isToRight() ? -5 : 5);
    }
}

