/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.ArrayList;

/*
 * Renamed from aaf
 */
public class aaf_0
extends aae_0 {
    @Override
    protected void h(ArrayList<DisplayedScreenElement> arrayList) {
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            DisplayedScreenElement displayedScreenElement = arrayList.get(i);
            if (!displayedScreenElement.brk().bsz().bxc()) continue;
            this.bXM.add(displayedScreenElement);
        }
    }
}

