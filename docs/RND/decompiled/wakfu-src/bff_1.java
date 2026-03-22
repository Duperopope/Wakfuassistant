/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bFF
 */
public class bff_1
extends bfc_1 {
    private static final Logger jTO = Logger.getLogger(bff_1.class);
    private int eAf;
    long bhR;

    public bff_1(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
        this.eAf = Integer.valueOf(stringArray[0]);
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dno().tb(ffV2.LV()) == null) {
            jTO.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        bfg_1 bfg_12 = new bfg_1(this, ffV2);
        if (!bbe_0.hAP.a(this.eAf, (bbg_0)bfg_12)) {
            jTO.error((Object)("[ItemAction] Impossible d'utiliser l'Emote " + this.eAf));
            return false;
        }
        return true;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        super.aF(byteBuffer);
        byteBuffer.putLong(this.bhR);
        return false;
    }

    @Override
    public int DN() {
        return super.DN() + 8;
    }

    @Override
    public void clear() {
        this.bhR = -1L;
    }

    @Override
    public fgM dTl() {
        return fgM.sky;
    }
}

