/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.ArrayList;

/*
 * Renamed from aae
 */
public abstract class aae_0 {
    protected final ArrayList<DisplayedScreenElement> bXM = new ArrayList();

    public void clear() {
        this.bXM.clear();
    }

    public void reset() {
        this.bXM.clear();
    }

    public ArrayList<DisplayedScreenElement> bqD() {
        return this.bXM;
    }

    protected abstract void h(ArrayList<DisplayedScreenElement> var1);

    public ArrayList<DisplayedScreenElement> i(ArrayList<DisplayedScreenElement> arrayList) {
        this.bXM.clear();
        this.h(arrayList);
        return this.bXM;
    }
}

