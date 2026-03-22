/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jdom.Content
 *  org.jdom.Element
 */
import java.nio.ByteBuffer;
import org.jdom.Content;
import org.jdom.Element;

/*
 * Renamed from Wo
 */
public class wo_0 {
    public final wm_0[] bNh;
    public final int bNi;
    public final int bNj;

    public wo_0(wm_0[] wm_0Array, int n, int n2) {
        this.bNh = wm_0Array;
        this.bNi = n;
        this.bNj = n2;
        this.blR();
    }

    public wo_0(ByteBuffer byteBuffer) {
        this.bNj = byteBuffer.getShort() & 0xFFFF;
        this.bNi = byteBuffer.getShort() & 0xFFFF;
        int n = byteBuffer.get() & 0xFF;
        this.bNh = new wm_0[n];
        for (int i = 0; i < n; ++i) {
            int n2 = byteBuffer.getInt();
            int n3 = byteBuffer.getInt();
            int n4 = byteBuffer.getInt();
            this.bNh[i] = new wm_0(n2, n3, n4);
        }
    }

    public wm_0 qm(int n) {
        for (wm_0 wm_02 : this.bNh) {
            if (wm_02.bNb != n) continue;
            return wm_02;
        }
        return null;
    }

    public void a(fs_0 fs_02) {
        fs_02.k((short)this.bNj);
        fs_02.k((short)this.bNi);
        fs_02.g((byte)this.bNh.length);
        for (int i = 0; i < this.bNh.length; ++i) {
            fs_02.mz(this.bNh[i].bNb);
            fs_02.mz(this.bNh[i].bNc);
            fs_02.mz(this.bNh[i].bNd);
        }
    }

    public Element bkB() {
        Element element = new Element("resourceBalancing");
        element.setAttribute("max_quantity", String.valueOf(this.bNj));
        element.setAttribute("stasis_threshold", String.valueOf(this.bNi));
        for (int i = 0; i < this.bNh.length; ++i) {
            Element element2 = this.bNh[i].dC("resourceFamily");
            element.addContent((Content)element2);
        }
        return element;
    }

    private void blR() {
        int n = 0;
        for (wm_0 wm_02 : this.bNh) {
            n += wm_02.bNd;
        }
        if (n > this.bNj) {
            throw new RuntimeException("le nombre max de resources d\u00e9passe la quantit\u00e9 max");
        }
        if (this.bNi > this.bNj) {
            throw new RuntimeException("le seuil est sup\u00e9rieur \u00e0 la quantit\u00e9 max de resources");
        }
    }
}

