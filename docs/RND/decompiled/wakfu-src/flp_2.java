/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.awt.event.MouseEvent;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fLP
 */
public class flp_2
extends flf_2 {
    public static final int uJe = 0;
    public static final int uJf = 1;
    public static final int uJg = 2;
    public static final int uJh = 3;
    private static final Logger uJi = Logger.getLogger(flp_2.class);
    private static final ObjectPool uJj = new ayv_2(new flq_1());
    protected int bVF;
    protected int bVG;
    protected int ofv;
    protected int tPo;
    protected int uJk;

    public int x(fes_2 fes_22) {
        if (fes_22 != null) {
            return this.bVF - fes_22.getDisplayX();
        }
        return 0;
    }

    public int getScreenX() {
        return this.bVF;
    }

    public void qu(int n) {
        this.bVF = n;
    }

    public int y(fes_2 fes_22) {
        if (fes_22 != null) {
            return this.bVG - fes_22.getDisplayY();
        }
        return 0;
    }

    public int getScreenY() {
        return this.bVG;
    }

    public void qv(int n) {
        this.bVG = n;
    }

    public int fca() {
        return this.ofv;
    }

    public boolean gEk() {
        return this.ofv == 1;
    }

    public boolean gEl() {
        return this.ofv == 2;
    }

    public boolean gEm() {
        return this.ofv == 3;
    }

    public void NQ(int n) {
        this.ofv = n;
    }

    public int gEn() {
        return this.tPo;
    }

    public void aca(int n) {
        this.tPo = n;
    }

    public int gEo() {
        return this.uJk;
    }

    public void acb(int n) {
        this.uJk = n;
    }

    public static flp_2 l(MouseEvent mouseEvent) {
        flp_2 flp_22 = flp_2.gEp();
        flp_22.ofv = mouseEvent.getButton();
        flp_22.ofK = mouseEvent.getModifiersEx();
        flp_22.tPo = mouseEvent.getClickCount();
        return flp_22;
    }

    public static flp_2 gEp() {
        flp_2 flp_22;
        try {
            flp_22 = (flp_2)uJj.borrowObject();
            flp_22.uth = uJj;
        }
        catch (Exception exception) {
            uJi.error((Object)"Probl\u00e8me au borrowObject.");
            flp_22 = new flp_2();
            flp_22.aVI();
        }
        return flp_22;
    }

    public static flp_2 o(flp_2 flp_22) {
        flp_2 flp_23 = flp_2.gEp();
        flp_23.NQ(flp_22.ofv);
        flp_23.aca(flp_22.tPo);
        flp_23.abZ(flp_22.ofK);
        flp_23.qu(flp_22.bVF);
        flp_23.qv(flp_22.bVG);
        flp_23.x(flp_22.uBe);
        return flp_23;
    }

    @Override
    public void aZp() {
        super.aZp();
    }

    @Override
    public void aVH() {
        super.aVH();
    }
}

