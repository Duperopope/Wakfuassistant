/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.List;

public final class aar
extends Enum<aar> {
    public static final /* enum */ aar bZj = new aar(true, new aas_0());
    public static final /* enum */ aar bZk = new aar(true, new aat_0());
    public static final /* enum */ aar bZl = new aar(false, new aau());
    private final boolean bZm;
    private final aaw_0 bZn;
    private static final /* synthetic */ aar[] bZo;

    public static aar[] values() {
        return (aar[])bZo.clone();
    }

    public static aar valueOf(String string) {
        return Enum.valueOf(aar.class, string);
    }

    static int a(DisplayedScreenElement displayedScreenElement, DisplayedScreenElement displayedScreenElement2) {
        long l = displayedScreenElement.brl().cWM;
        long l2 = displayedScreenElement2.brl().cWM;
        if (l < l2) {
            return 1;
        }
        if (l > l2) {
            return -1;
        }
        return 0;
    }

    private aar(boolean bl, aaw_0 aaw_02) {
        this.bZm = bl;
        this.bZn = aaw_02;
    }

    public void a(List<DisplayedScreenElement> list, aax_0 aax_02) {
        this.bZn.a(aax_02);
        list.sort(this.bZn);
    }

    public boolean brv() {
        return this.bZm;
    }

    private static /* synthetic */ aar[] brw() {
        return new aar[]{bZj, bZk, bZl};
    }

    static {
        bZo = aar.brw();
    }
}

