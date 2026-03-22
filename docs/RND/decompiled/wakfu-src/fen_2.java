/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fEN
 */
public class fen_2
extends fel_2 {
    private static final String unI = "DefaultDark14";
    private static final String unJ = "chatBubble";
    private static final String unK = "BubbleArrowLeft";
    private static final String unL = "BubbleArrowRight";

    @Override
    public void b(fem_1 fem_12) {
        super.b(fem_12);
        this.tT(unI);
        this.a(unJ, new fsm_1(12, 20));
        this.h(fem_12.isToRight() ? unK : unL, fem_12.isToRight() ? 15 : -15, 0);
        fem_12.setXOffset(fem_12.isToRight() ? -5 : 5);
    }
}

