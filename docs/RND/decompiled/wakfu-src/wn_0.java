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
 * Renamed from Wn
 */
public class wn_0 {
    public final wm_0[] bNe;
    public final int bNf;
    public final int bNg;

    public wn_0(wm_0[] wm_0Array, int n, int n2) {
        this.bNe = wm_0Array;
        this.bNf = n;
        this.bNg = n2;
        this.blR();
    }

    public wn_0(ByteBuffer byteBuffer) {
        this.bNg = byteBuffer.getShort() & 0xFFFF;
        this.bNf = byteBuffer.getShort() & 0xFFFF;
        int n = byteBuffer.get() & 0xFF;
        this.bNe = new wm_0[n];
        for (int i = 0; i < n; ++i) {
            int n2 = byteBuffer.getInt();
            int n3 = byteBuffer.getInt();
            int n4 = byteBuffer.getInt();
            this.bNe[i] = new wm_0(n2, n3, n4);
        }
    }

    public wm_0 ql(int n) {
        for (wm_0 wm_02 : this.bNe) {
            if (wm_02.bNb != n) continue;
            return wm_02;
        }
        return null;
    }

    public void a(fs_0 fs_02) {
        fs_02.k((short)this.bNg);
        fs_02.k((short)this.bNf);
        fs_02.g((byte)this.bNe.length);
        for (int i = 0; i < this.bNe.length; ++i) {
            fs_02.mz(this.bNe[i].bNb);
            fs_02.mz(this.bNe[i].bNc);
            fs_02.mz(this.bNe[i].bNd);
        }
    }

    public Element bkB() {
        Element element = new Element("monsterBalancing");
        element.setAttribute("max_quantity", String.valueOf(this.bNg));
        element.setAttribute("stasis_threshold", String.valueOf(this.bNf));
        for (int i = 0; i < this.bNe.length; ++i) {
            Element element2 = this.bNe[i].dC("monsterFamily");
            element.addContent((Content)element2);
        }
        return element;
    }

    private void blR() {
        int n = 0;
        for (wm_0 wm_02 : this.bNe) {
            n += wm_02.bNd;
        }
        if (n > this.bNg) {
            throw new RuntimeException("le nombre max de monstres d\u00e9passe la quantit\u00e9 max");
        }
        if (this.bNf > this.bNg) {
            throw new RuntimeException("le seuil est sup\u00e9rieur \u00e0 la quantit\u00e9 max de monstres");
        }
    }
}

