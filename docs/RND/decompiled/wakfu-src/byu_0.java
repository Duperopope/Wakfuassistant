/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from byu
 */
public class byu_0
extends bxb_0 {
    protected static final Logger jCC = Logger.getLogger(byu_0.class);
    public static final short jCD = 1;
    private int emw;

    protected byu_0() {
    }

    @Override
    protected void eZ(ByteBuffer byteBuffer) {
        this.emw = byteBuffer.getInt();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ac((short)1);
        this.setVisible(true);
        this.bi(true);
        this.bf(true);
        this.emw = -1;
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public rw_0 dNn() {
        return null;
    }

    @Override
    protected rw_0[] dNg() {
        return rw_0.bly;
    }

    @Override
    protected cpm_1[] dNi() {
        return cpm_1.nip;
    }

    @Override
    public boolean dOf() {
        fhc_0 fhc_02 = this.dOg();
        return fhc_02 != null;
    }

    @Override
    public String getName() {
        fhc_0 fhc_02 = this.dOg();
        if (fhc_02 != null) {
            return fhc_02.getName();
        }
        return "<UNKNOWN>";
    }

    private fhc_0 dOg() {
        Object r = fgD.fXh().Vd(this.emw);
        if (r != null) {
            return r;
        }
        Optional<Integer> optional = fdb.fSX().sE(this.dQA());
        return optional.map(n -> fgD.fXh().Vd((int)n)).orElse(null);
    }

    @Override
    protected void a(ox_1 ox_12) {
    }

    @Override
    public fnJ dOh() {
        return fnJ.sKp;
    }

    static /* synthetic */ void a(byu_0 byu_02, ayv_2 ayv_22) {
        byu_02.a(ayv_22);
    }
}

