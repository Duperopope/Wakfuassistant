/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.nio.ByteBuffer;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bjo
 */
public class bjo_1
implements bjn_1 {
    @Nullable
    private ezu_1 iod;
    private long aDL;
    private String aFF = "";
    private float ioe;
    private buP iof;

    @Override
    public long Ya() {
        return this.iod != null ? this.iod.Sn() : this.aDL;
    }

    @Override
    @Nullable
    public ezz_1 jP(long l) {
        if (this.iod == null) {
            return null;
        }
        return this.iod.jP(l);
    }

    @Override
    public fab jR(long l) {
        return this.iod != null ? this.iod.jR(l) : null;
    }

    @Override
    public long drj() {
        return this.iod != null ? this.iod.drj() : 0L;
    }

    @Override
    public void jQ(long l) {
        this.aDL = l;
    }

    @Override
    public void setName(String string) {
        this.aFF = string;
    }

    @Override
    public TIntHashSet drk() {
        if (this.iod == null) {
            return new TIntHashSet();
        }
        bjp_1 bjp_12 = new bjp_1();
        this.iod.J(bjp_12);
        return bjp_12.drk();
    }

    @Nullable
    public ezu_1 drl() {
        return this.iod;
    }

    public void a(ezu_1 ezu_12) {
        this.iod = ezu_12;
    }

    @Override
    public String getName() {
        return this.iod != null ? this.iod.getName() : this.aFF;
    }

    @Override
    public long Yc() {
        return this.iod != null ? this.iod.Yc() : 0L;
    }

    @Override
    public short cmL() {
        return this.iod != null ? this.iod.cmL() : (short)0;
    }

    public int Yh() {
        return this.iod != null ? this.iod.Yh() : 0;
    }

    public void a(long l, byte ... byArray) {
        bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(l);
        if (bgt_02 == null) {
            return;
        }
        bgt_0 bgt_03 = aue_0.cVJ().cVK();
        long l2 = fcK.rUe.sq(bgt_03.Xi());
        if (fcI.fSM() && l2 != 0L && l2 != l) {
            return;
        }
        ezu_1 ezu_12 = this.iod;
        if (this.iod != null) {
            this.iod.J((TObjectProcedure<ezv_1>)((TObjectProcedure)ezv_12 -> {
                if (ezv_12.fPL()) {
                    this.iof.f((ezv_1)ezv_12);
                }
                return true;
            }));
        }
        bvk.dJZ().clean();
        bvf.jrC.clean();
        if (byArray != null) {
            eKd eKd2;
            if (this.iod == null) {
                this.iod = new eye_2();
                this.iof = new buP(this.iod);
                this.iod.a(this.iof);
            }
            eyk_2.a(ByteBuffer.wrap(byArray), this.iod);
            Optional optional = bbs_2.a(eva_1.owr);
            if (optional.isPresent() && (eKd2 = (eKd)optional.get()).dua() == bgt_03.Sn()) {
                eKd2.my(this.iod.getName());
                eKd2.jQ(this.iod.Sn());
            }
        }
        if (this.iod != null) {
            bvf.jrC.bkZ();
            if (l2 == bgt_03.Sn() || l2 == 0L) {
                bvk.dJZ().bkZ();
            }
            if (ezu_12 == null && this.iod.getMessage() != null && !this.iod.getMessage().isEmpty()) {
                bvk.dJZ().dKf();
            }
        } else if (ezu_12 != null) {
            if (aue_0.cVJ().c(cvg_2.eTB())) {
                aue_0.cVJ().b(cvg_2.eTB());
            }
            if (aue_0.cVJ().c(cvm_1.eTF()) && cvm_1.eTF().eTG() instanceof bnn_0) {
                aue_0.cVJ().b(cvm_1.eTF());
            }
        }
        fse_1.gFu().a((aef_2)bgt_02, "hasGuild");
        fse_1.gFu().a((aef_2)bgt_03, "hasGuild");
        cvv_2.nPF.kv(true);
    }

    public void ew(float f2) {
        this.ioe = f2;
    }

    public float drm() {
        return this.ioe;
    }

    @Override
    public void clear() {
        this.iod = null;
        this.iof = null;
        this.aDL = 0L;
    }

    public String toString() {
        return "GuildLocalInformationHandler{m_guild=" + String.valueOf(this.iod) + "}";
    }
}

