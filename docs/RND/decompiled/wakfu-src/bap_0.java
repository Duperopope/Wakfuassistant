/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bAP
 */
public class bap_0
extends bxb_0 {
    static final Logger jFC = Logger.getLogger(bap_0.class);
    public static final short jFD = 1;
    private int jFE;
    private long jFF;
    private short jFG;
    private boolean jFH;

    protected bap_0() {
    }

    @Override
    protected void eZ(ByteBuffer byteBuffer) {
        this.jFF = byteBuffer.getLong();
        this.jFE = byteBuffer.getInt();
        this.jFG = byteBuffer.getShort();
        this.jFH = byteBuffer.get() == 1;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ht(true);
        this.ac((short)1);
        this.setVisible(true);
        this.bi(true);
        this.bf(true);
        this.jFE = 0;
        this.jFF = 0L;
        this.jFG = 0;
        this.jFH = false;
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean dNb() {
        return this.aJG();
    }

    public boolean aJG() {
        return this.jFG == 0;
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        this.b(rw_02);
        switch (rw_02) {
            case bln: 
            case bkX: 
            case bkY: {
                this.c(rw_02);
                return true;
            }
        }
        return super.b(rw_02, rG);
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkR;
    }

    @Override
    protected rw_0[] dNg() {
        return new rw_0[]{rw_0.bkX, rw_0.bkY};
    }

    @Override
    protected cpm_1[] dNi() {
        return new cpm_1[]{cps_1.niJ.eLI()};
    }

    @Override
    public String getName() {
        Object r = fgD.fXh().Vd(this.jFE);
        return r != null ? ((fhc_0)r).getName() : "<UNKNOWN>";
    }

    public long dPv() {
        return this.jFF;
    }

    @Override
    protected void a(ox_1 ox_12) {
        if (ox_12.avV() == 1) {
            ww_1 ww_12 = (ww_1)ox_12;
            this.jFF = ww_12.ahy.adP;
        }
    }

    public boolean dPw() {
        return this.jFH;
    }

    public int aVt() {
        Object r = fgD.fXh().Vd(this.jFE);
        return r != null ? ((fhc_0)r).aVt() : -1;
    }

    @Override
    public fnJ dOh() {
        return fnJ.sKs;
    }

    static /* synthetic */ void a(bap_0 bap_02, ayv_2 ayv_22) {
        bap_02.a(ayv_22);
    }
}

