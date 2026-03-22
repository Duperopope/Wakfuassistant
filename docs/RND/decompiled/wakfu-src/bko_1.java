/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bko
 */
public class bko_1
extends bkb_0 {
    protected static final Logger iqI = Logger.getLogger(bko_1.class);
    private final bgy iqJ;
    private int eAf;
    private final HashMap<String, Object> iqK = new HashMap();

    public bko_1(bgy bgy2) {
        this.iqJ = bgy2;
    }

    @Override
    public short dsm() {
        return 20;
    }

    @Override
    public boolean dsn() {
        return true;
    }

    @Override
    public void bIH() {
        this.iqJ.i(false, true);
        this.iqJ.a(this.eAf, this.iqK, true);
        this.iqJ.a(this);
        if (this.dsu()) {
            this.dsv();
        }
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        if (bl2) {
            cmo_0 cmo_02 = new cmo_0();
            cmo_02.dw((byte)3);
            cmo_02.cD(this.dsm());
            aue_0.cVJ().etu().d(cmo_02);
        }
        return this.dsd();
    }

    @Override
    public boolean dsd() {
        if (this.dsu()) {
            this.dsw();
        }
        return true;
    }

    public void dX(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.eAf = byteBuffer.getInt();
        int n = byteBuffer.get();
        for (int i = 0; i < n; ++i) {
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray2);
            this.iqK.put(BH.dc(byArray2), byteBuffer.getLong());
        }
    }

    private boolean dsu() {
        bbf_0 bbf_02 = bbl_0.hBr.AH(this.eAf);
        if (bbf_02 == null) {
            iqI.error((Object)("Emote inconnu: " + this.eAf));
            return false;
        }
        boolean bl = this.iqJ == aue_0.cVJ().cVK();
        return bl && bbf_02.cnf();
    }

    private void dsv() {
        ahd_2 ahd_22 = cAN.mpo.eGS();
        ahd_22.br(ahd_22.bBt() * 0.2f, 700.0f);
    }

    private void dsw() {
        ahd_2 ahd_22 = cAN.mpo.eGS();
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        float f2 = bsg_12.c(afd.cpy);
        ahd_22.br(f2, 700.0f);
    }

    @Override
    public boolean dsi() {
        return true;
    }
}

