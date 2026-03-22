/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from cSF
 */
public class csf_2
extends cro_2
implements adi_1 {
    private static final csf_2 nGc = new csf_2();
    protected static final Logger nGd = Logger.getLogger(csf_2.class);
    private final TLongObjectHashMap<azx_1<Byte, fhc_0>> nGe = new TLongObjectHashMap();
    private csg_2 nGf;
    private csg_2 nGg;
    private fbz_2 nGh;
    private fbz_2 nGi;
    private alx_2 nGj;
    private final alx_2 nGk = string -> {
        if (string.equals("dimensionalBagFleaDialog")) {
            csf_2.eMW().dyJ();
        }
    };

    public static csf_2 eOo() {
        return nGc;
    }

    private csf_2() {
        nDL = -3L;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fyw_0.gqw().a(this.nGk);
        this.bkZ();
        this.nGh.a(this.nGf);
        aue_0.cVJ().etu().a(cck_1.etR());
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fyw_0.gqw().b(this.nGk);
        fyw_0.gqw().b(this.nGj);
        this.nGj = null;
        this.nGh.b(this.nGf);
        this.nGh = null;
        this.nGf = null;
        if (this.nGi != null) {
            this.nGi.b(this.nGg);
            this.nGi = null;
            this.nGg = null;
        }
        this.clean();
        fyw_0.gqw().tl("dimensionalBagFleaDialog");
        aue_0.cVJ().etu().b(cck_1.etR());
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void oi(long l) {
        this.nGe.remove(l);
    }

    public void a(long l, azx_1 azx_12) {
        this.nGe.put(l, (Object)azx_12);
    }

    public azx_1 oj(long l) {
        return (azx_1)this.nGe.get(l);
    }

    public void eOp() {
        fyw_0.gqw().tl("dimensionalBagFleaDialog");
    }
}

