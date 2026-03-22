/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;

public final class aav {
    private static final Logger bZp = Logger.getLogger(aav.class);
    private final TLongObjectHashMap<DisplayedScreenElement> bZq = new TLongObjectHashMap(8192);

    public aav() {
        this.bZq.setAutoCompactionFactor(0.0f);
    }

    public DisplayedScreenElement fE(long l) {
        assert (l != 0L);
        DisplayedScreenElement displayedScreenElement = (DisplayedScreenElement)this.bZq.get(l);
        if (displayedScreenElement != null) {
            displayedScreenElement.bGY();
            return displayedScreenElement;
        }
        DisplayedScreenElement displayedScreenElement2 = (DisplayedScreenElement)DisplayedScreenElement.bYT.bSK();
        this.bZq.put(l, (Object)displayedScreenElement2);
        return displayedScreenElement2;
    }

    public void a(DisplayedScreenElement displayedScreenElement) {
        if (displayedScreenElement.bSW() <= 0) {
            long l = displayedScreenElement.bYU.cbS;
            assert (l != 0L);
            this.bZq.remove(l);
        }
        displayedScreenElement.bsI();
    }

    public void am(byte by) {
        TLongObjectIterator tLongObjectIterator = this.bZq.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            DisplayedScreenElement displayedScreenElement = (DisplayedScreenElement)tLongObjectIterator.value();
            if (displayedScreenElement.bYW != null || !displayedScreenElement.al(by)) continue;
            displayedScreenElement.bri();
        }
    }

    public void clear() {
        if (!this.bZq.isEmpty()) {
            bZp.error((Object)"la factory contient encore des \u00e9l\u00e9ments!!!");
        }
        this.bZq.clear();
    }
}

