/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;

public final class agX {
    private static final int cvc = 0;
    private static final byte cvd = -1;

    public static void c(agV agV2) {
        agV2.a(0, (short)-1);
    }

    public static boolean d(agV agV2) {
        return agV2.bqi() == -1;
    }

    public static void a(agV agV2, DisplayedScreenElement displayedScreenElement) {
        if (displayedScreenElement == null) {
            agX.c(agV2);
        } else {
            agV2.a(displayedScreenElement.bqh(), displayedScreenElement.bqi());
        }
    }
}

