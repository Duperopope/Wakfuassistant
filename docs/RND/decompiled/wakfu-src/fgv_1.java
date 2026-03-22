/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.awt.Rectangle;
import java.util.ArrayList;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fGv
 */
public class fgv_1
implements ayx_2 {
    private static final Logger utf = Logger.getLogger(fgv_1.class);
    private static final ObjectPool utg = new ayv_2(new fgw_1());
    private ObjectPool uth;
    private final ArrayList<fgb_2> uti = new ArrayList();
    private fgg_2 utj = null;
    private final Rectangle utk = new Rectangle();
    private int utl = 0;
    private fzY utm;
    private int utn;

    fgv_1() {
    }

    public static fgv_1 gxN() {
        fgv_1 fgv_12;
        try {
            fgv_12 = (fgv_1)utg.borrowObject();
            fgv_12.uth = utg;
        }
        catch (Exception exception) {
            utf.error((Object)"Probl\u00e8me au borrowObject.");
            fgv_12 = new fgv_1();
            fgv_12.aVI();
        }
        return fgv_12;
    }

    public void aZp() {
        try {
            if (this.uth != null) {
                this.uth.returnObject((Object)this);
            } else {
                this.aVH();
            }
        }
        catch (Exception exception) {
            utf.warn((Object)"Probl\u00e8me lors du retour dans un pool", (Throwable)exception);
            this.aVH();
        }
    }

    public int a(awx_1 awx_12, fgb_2 fgb_22, int n) {
        int n2 = 0;
        for (int i = 0; i < this.uti.size(); ++i) {
            fgb_2 fgb_23 = this.uti.get(i);
            if (fgb_23 != fgb_22) {
                n2 += fgb_23.b(awx_12, fgb_23.aPs());
                continue;
            }
            return n2 + fgb_23.b(awx_12, n);
        }
        return n2;
    }

    public fgf_2 i(String string, int n, int n2) {
        return this.a(string, null, 0, 0, n, n2);
    }

    public fgf_2 a(String string, fgm_1 fgm_12, int n, int n2, int n3, int n4) {
        fgf_2 fgf_22 = new fgf_2();
        fgf_22.a(this);
        fgf_22.setText(string);
        fgf_22.a(fgm_12);
        fgf_22.Lq(n);
        fgf_22.abr(n2);
        fgf_22.setX(n3);
        fgf_22.setWidth(n4);
        this.a(fgf_22);
        return fgf_22;
    }

    public fge_2 a(fgl_2 fgl_22, int n) {
        fge_2 fge_22 = new fge_2();
        fge_22.a(this);
        fge_22.a(fgl_22);
        fge_22.setX(n);
        this.a(fge_22);
        return fge_22;
    }

    private void a(fgb_2 fgb_22) {
        this.utk.width += fgb_22.getWidth();
        this.uti.add(fgb_22);
    }

    public void abl(int n) {
        fgb_2 fgb_22 = this.uti.remove(n);
        this.utk.width -= fgb_22.getWidth();
    }

    public void gxO() {
        this.uti.clear();
        this.utk.width = 0;
        this.gxP();
    }

    public void gxP() {
        this.utj = null;
    }

    public fgg_2 gxQ() {
        return this.utj;
    }

    public void r(int n, int n2, boolean bl) {
        this.utj = new fgg_2();
        this.utj.a(this);
        this.utj.setX(n);
        this.utj.setWidth(n2);
        this.utj.oT(bl);
    }

    public Rectangle gxR() {
        return this.utk;
    }

    public int getX() {
        return this.utk.x;
    }

    public void setX(int n) {
        this.utk.x = n;
    }

    public int getY() {
        return this.utk.y;
    }

    public void setY(int n) {
        this.utk.y = n;
    }

    public int getHeight() {
        return this.utk.height;
    }

    public void setHeight(int n) {
        this.utk.height = n;
    }

    public int getWidth() {
        return this.utk.width;
    }

    public int gxS() {
        return this.utl;
    }

    public void abm(int n) {
        this.utl = n;
    }

    public fzY getAlignment() {
        return this.utm;
    }

    public void setAlignment(fzY fzY2) {
        this.utm = fzY2;
    }

    public boolean aJG() {
        return this.uti.isEmpty();
    }

    public int gxT() {
        return this.utn;
    }

    public void abn(int n) {
        this.utn = n;
    }

    public int gxU() {
        return this.uti.size();
    }

    public fgb_2 abo(int n) {
        return this.uti.get(n);
    }

    public fgb_2 gxV() {
        if (!this.uti.isEmpty()) {
            return this.uti.get(0);
        }
        return null;
    }

    public fgb_2 gxW() {
        if (!this.uti.isEmpty()) {
            return this.uti.get(this.uti.size() - 1);
        }
        return null;
    }

    public int aPs() {
        int n = 0;
        for (int i = 0; i < this.uti.size(); ++i) {
            n += this.uti.get(i).aPs();
        }
        return n;
    }

    public void gxX() {
        this.utk.width = 0;
        for (fgb_2 fgb_22 : this.uti) {
            this.utk.width += fgb_22.getWidth();
        }
    }

    public final ArrayList<fgb_2> gxY() {
        return this.uti;
    }

    @Override
    public void aVI() {
        this.utl = 0;
    }

    @Override
    public void aVH() {
        this.uti.clear();
        this.utj = null;
        this.utk.setBounds(0, 0, 0, 0);
        this.utm = null;
        this.utn = 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n = this.uti.size();
        for (int i = 0; i < n; ++i) {
            stringBuilder.append(this.uti.get(i).toString());
        }
        return stringBuilder.toString();
    }
}

