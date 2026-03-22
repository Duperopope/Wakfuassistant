/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from ctT
 */
public class ctt_0
extends nr_0 {
    private static final Logger miP = Logger.getLogger(ctt_0.class);
    private uw_0 miQ;
    private String miR;
    private String miS;
    private uw_0 miT;
    private uz_0 miU;
    private boolean miV;

    @Override
    public boolean dn(byte[] byArray) {
        boolean bl;
        boolean bl2;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.miQ = uw_0.fn(byteBuffer.getLong());
        this.miT = uw_0.fn(byteBuffer.getLong());
        this.miU = uz_0.fo(byteBuffer.getLong());
        this.miV = byteBuffer.get() == 1;
        boolean bl3 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            byte[] byArray2 = new byte[byteBuffer.get()];
            byteBuffer.get(byArray2);
            this.miR = BH.dc(byArray2);
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            byte[] byArray3 = new byte[byteBuffer.get()];
            byteBuffer.get(byArray3);
            this.miS = BH.dc(byArray3);
        }
        return true;
    }

    public ux_0 eCK() {
        return this.miQ;
    }

    public uw_0 eCL() {
        return this.miT;
    }

    public uz_0 eCM() {
        return this.miU;
    }

    public boolean eCN() {
        return this.miV;
    }

    public String eCO() {
        return this.miR;
    }

    public String eCP() {
        return this.miS;
    }

    @Override
    public int d() {
        return 15345;
    }
}

