/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fLG
 */
public class flg_2
extends flp_2 {
    private static final Logger uIM = Logger.getLogger(flg_2.class);
    private Object uIN = null;
    private static final ObjectPool uIO = new ayv_2(new flh_2());
    private static int uIP = 0;
    private static int uIQ = 0;

    public static flg_2 a(fhv_1 fhv_12, fzq_0 fzq_02, Object object) {
        flg_2 flg_22;
        ++uIP;
        try {
            flg_22 = (flg_2)uIO.borrowObject();
            flg_22.uth = uIO;
        }
        catch (Exception exception) {
            uIM.error((Object)"Probl\u00e8me au borrowObject.");
            flg_22 = new flg_2();
            flg_22.aVI();
        }
        flg_22.x(fhv_12);
        flg_22.b(fzq_02);
        flg_22.setItemValue(object);
        return flg_22;
    }

    public static flg_2 a(flp_2 flp_22, fhv_1 fhv_12, fzq_0 fzq_02, Object object) {
        flg_2 flg_22;
        ++uIP;
        try {
            flg_22 = (flg_2)uIO.borrowObject();
            flg_22.uth = uIO;
        }
        catch (Exception exception) {
            uIM.error((Object)"Probl\u00e8me au borrowObject.");
            flg_22 = new flg_2();
            flg_22.aVI();
        }
        flg_22.NQ(flp_22.ofv);
        flg_22.aca(flp_22.tPo);
        flg_22.abZ(flp_22.ofK);
        flg_22.qu(flp_22.bVF);
        flg_22.qv(flp_22.bVG);
        flg_22.oZ(flp_22.gBF());
        flg_22.x(fhv_12);
        flg_22.b(fzq_02);
        flg_22.setItemValue(object);
        return flg_22;
    }

    @Override
    public void aZp() {
        super.aZp();
        ++uIQ;
    }

    public Object getItemValue() {
        return this.uIN;
    }

    public void setItemValue(Object object) {
        this.uIN = object;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uIN = null;
    }
}

