/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.ArrayList;
import lombok.Generated;

public class aIv {
    private static final int dYn = Integer.MAX_VALUE;
    private final int dYo;
    private final int dYp;
    private final float dYq;
    private final float dYr;
    private final int dYs;
    private final int dYt;

    aIv(aIs aIs2, int n, int n2) {
        this.dYo = n;
        this.dYp = n2;
        this.dYq = aIs.a(aIs2, n);
        this.dYr = aIs.b(aIs2, n2);
        if (aue_0.cVJ().cVK() == null) {
            this.dYs = Integer.MAX_VALUE;
            this.dYt = Integer.MAX_VALUE;
            return;
        }
        ArrayList<DisplayedScreenElement> arrayList = aIs2.a(n, n2, aue_0.cVJ().cVK().getAltitude(), aar.bZk, 0.0f, 0.0f);
        if (arrayList == null || arrayList.isEmpty()) {
            this.dYs = Integer.MAX_VALUE;
            this.dYt = Integer.MAX_VALUE;
        } else {
            this.dYs = arrayList.get(0).bcC();
            this.dYt = arrayList.get(0).bcD();
        }
    }

    public boolean cgA() {
        return this.dYs != Integer.MAX_VALUE && this.dYt != Integer.MAX_VALUE;
    }

    @Generated
    public int bqM() {
        return this.dYo;
    }

    @Generated
    public int bqN() {
        return this.dYp;
    }

    @Generated
    public float cgB() {
        return this.dYq;
    }

    @Generated
    public float cgC() {
        return this.dYr;
    }

    @Generated
    public int bcC() {
        return this.dYs;
    }

    @Generated
    public int bcD() {
        return this.dYt;
    }

    @Generated
    public String toString() {
        return "WakfuWorldScene.MousePosition(m_mouseX=" + this.bqM() + ", m_mouseY=" + this.bqN() + ", m_adjMouseX=" + this.cgB() + ", m_adjMouseY=" + this.cgC() + ", m_worldCellX=" + this.bcC() + ", m_worldCellY=" + this.bcD() + ")";
    }
}

