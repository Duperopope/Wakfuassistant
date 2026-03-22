/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.io.File;

/*
 * Renamed from asr
 */
public abstract class asr_1 {
    protected final aah_1<asd_1> cXW = new aah_1();
    protected asd_1 cXX = null;
    private int cXY = 0;
    private boolean bsj = false;
    private String p;
    private String aCH;
    private long cXZ;

    public void setName(String string) {
        this.p = string;
    }

    public void x(String string, String string2) {
        this.bsj = true;
        this.p = string;
        this.aCH = string2;
        this.cXZ = this.bJE();
        this.cXX = null;
        this.cXY = 0;
    }

    public void aUI() {
        this.x(this.p, this.aCH);
    }

    public void y(String string, String string2) {
        this.bsj = true;
        this.p = string;
        this.cXX = null;
        this.cXY = 0;
    }

    public final String bJB() {
        return this.p;
    }

    public void a(art_1 art_12, Entity entity, asl_1 asl_12) {
        if (!this.bsj) {
            ast_1.bJG().bJK();
        }
    }

    public final void um(int n) {
        if (this.cXY == n) {
            return;
        }
        this.cXX = this.cXW.vK(n);
        this.cXY = n;
        this.reset();
    }

    public final boolean un(int n) {
        return this.cXW.vZ(n);
    }

    public void reset() {
        if (this.cXX == null) {
            return;
        }
        this.cXX.bJU();
    }

    public final boolean bJC() {
        return this.cXX == null;
    }

    public void bJD() {
    }

    private long bJE() {
        if (this.aCH == null) {
            return 0L;
        }
        int n = this.aCH.indexOf("file:");
        if (n == -1) {
            return 0L;
        }
        String string = this.aCH.substring(n + 5);
        return new File(string).lastModified();
    }

    public final void bJF() {
        if (this.bJE() > this.cXZ) {
            this.aUI();
        }
    }

    protected abstract void a(asl_1 var1);
}

