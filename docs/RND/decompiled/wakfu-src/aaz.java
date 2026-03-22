/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.Comparator;

class aaz
implements Comparator<DisplayedScreenElement> {
    aaz() {
    }

    public int b(DisplayedScreenElement displayedScreenElement, DisplayedScreenElement displayedScreenElement2) {
        if (displayedScreenElement == displayedScreenElement2) {
            return 0;
        }
        return displayedScreenElement.bYU.cbQ - displayedScreenElement2.bYU.cbQ;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.b((DisplayedScreenElement)object, (DisplayedScreenElement)object2);
    }
}

