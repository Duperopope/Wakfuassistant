/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.Comparator;

class aaD
implements Comparator<DisplayedScreenElement> {
    aaD() {
    }

    public int b(DisplayedScreenElement displayedScreenElement, DisplayedScreenElement displayedScreenElement2) {
        if (displayedScreenElement == null || displayedScreenElement.bYU == null) {
            return 0;
        }
        if (displayedScreenElement2 == null || displayedScreenElement2.bYU == null) {
            return 0;
        }
        return displayedScreenElement.bYU.cbQ - displayedScreenElement2.bYU.cbQ;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.b((DisplayedScreenElement)object, (DisplayedScreenElement)object2);
    }
}

