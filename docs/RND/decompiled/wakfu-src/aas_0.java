/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;

/*
 * Renamed from aas
 */
class aas_0
extends aaw_0 {
    aas_0() {
    }

    public int b(DisplayedScreenElement displayedScreenElement, DisplayedScreenElement displayedScreenElement2) {
        aax_0 aax_02 = this.brx();
        float f2 = aax_02.bZu;
        float f3 = aax_02.bZv;
        aaj_0 aaj_02 = aax_02.bZt;
        float f4 = this.a(displayedScreenElement, f2, f3, aaj_02);
        float f5 = this.a(displayedScreenElement2, f2, f3, aaj_02);
        return Float.compare(f4, f5);
    }

    private float a(DisplayedScreenElement displayedScreenElement, float f2, float f3, aaj_0 aaj_02) {
        ScreenElement screenElement = displayedScreenElement.brk();
        int n = screenElement.bsu();
        int n2 = screenElement.bsv();
        short s = screenElement.bst();
        float f4 = aaj_02.aM(n, n2);
        float f5 = aaj_02.j(n, n2, s);
        return aco_1.bn(f2 - f4, f3 - f5);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.b((DisplayedScreenElement)object, (DisplayedScreenElement)object2);
    }
}

