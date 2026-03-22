/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from fjE
 */
public class fje_0
extends fjz_0 {
    private static final Logger szt = Logger.getLogger(fje_0.class);
    public static final fja_0 szu = new fjf_0();
    private long szv;
    private long szw;

    public fje_0() {
        super(fjb_0.szg);
    }

    public void tX(long l) {
        this.szv = l;
    }

    public void tY(long l) {
        this.szw = l;
    }

    @Override
    public void bGy() {
        fjo_0 fjo_02 = this.gbW();
        if (fjo_02 == null) {
            szt.error((Object)("Impossible d'ex\u00e9cuter l'action " + String.valueOf(this) + " : la nation " + this.epQ + " n'existe pas"));
            return;
        }
        fjo_02.E(this.szv, this.szw);
    }

    @Override
    public boolean h(fjm fjm2) {
        int n = fjm2.ffF().Xt();
        if (n != this.epQ) {
            return false;
        }
        if (fjm2.dnG() < 1) {
            return false;
        }
        int n2 = fjm2.ffF().WA(n);
        return fkf_0.gcc().WJ(n2).b(fkj_0.sAK);
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.szv);
        byteBuffer.putLong(this.szw);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.szv = byteBuffer.getLong();
        this.szw = byteBuffer.getLong();
        return true;
    }

    @Override
    public int DN() {
        return 16;
    }

    @Override
    public void clear() {
        this.epQ = -1;
        this.szv = -1L;
        this.szw = -1L;
    }

    public String toString() {
        return "NationCandidateVoteRequest{m_citizenId=" + this.szv + ", m_candidateId=" + this.szw + "}";
    }
}

