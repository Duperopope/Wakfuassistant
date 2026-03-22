/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import gnu.trove.procedure.TObjectProcedure;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class fam {
    private static final Logger rOZ = Logger.getLogger(fam.class);
    private static final int rPa = 20;
    private final LinkedList<fao> rPb = new LinkedList();
    private final LinkedList<fap> rPc = new LinkedList();

    public void b(fao fao2) {
        this.rPb.addFirst(fao2);
        while (this.rPb.size() > 20) {
            this.rPb.removeLast();
        }
    }

    public void b(fap fap2) {
        this.rPc.addFirst(fap2);
        while (this.rPc.size() > 20) {
            this.rPc.removeLast();
        }
    }

    public void b(fam fam2) {
        this.c(fam2);
        this.d(fam2);
    }

    private void c(fam fam2) {
        int n = fam2.rPb.size();
        for (int i = 0; i < n; ++i) {
            this.b(fam2.rPb.get(i));
        }
    }

    private void d(fam fam2) {
        int n = fam2.rPc.size();
        for (int i = 0; i < n; ++i) {
            this.b(fam2.rPc.get(i));
        }
    }

    public boolean M(TObjectProcedure<fao> tObjectProcedure) {
        int n = this.rPb.size();
        for (int i = 0; i < n; ++i) {
            if (tObjectProcedure.execute((Object)this.rPb.get(i))) continue;
            return false;
        }
        return true;
    }

    public boolean N(TObjectProcedure<fap> tObjectProcedure) {
        int n = this.rPc.size();
        for (int i = 0; i < n; ++i) {
            if (tObjectProcedure.execute((Object)this.rPc.get(i))) continue;
            return false;
        }
        return true;
    }

    public kg_0 fQW() {
        ki_0 ki_02 = kg_0.aaa();
        this.rPb.forEach(fao2 -> {
            kl_0 kl_02 = kj_0.aaF().N(fao2.rPd).aP(fao2.pov).b(fao2.aaA()).gA(fao2.fQY());
            ki_02.a(kl_02);
        });
        this.rPc.forEach(fap2 -> {
            kp_0 kp_02 = kn_0.aaY().O(fap2.rPd).aQ(fap2.pov).aR(fap2.aaW());
            ki_02.a(kp_02);
        });
        return ki_02.aag();
    }

    public void g(kg_0 kg_02) {
        kg_02.ZT().forEach(kj_02 -> this.rPb.addLast(new fao(kj_02.aav(), kj_02.aay(), kj_02.aaA(), (short)kj_02.aaD())));
        kg_02.ZW().forEach(kn_02 -> this.rPc.addLast(new fap(kn_02.aav(), kn_02.aay(), kn_02.aaW())));
    }

    public void as(byte[] byArray) {
        try {
            kg_0 kg_02 = kg_0.bw(byArray);
            this.g(kg_02);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            rOZ.error((Object)"Unable to load history", (Throwable)invalidProtocolBufferException);
        }
    }

    public byte[] apI() {
        return this.fQW().toByteArray();
    }

    public String toString() {
        return "GuildStorageHistory{m_itemHistory=" + this.rPb.size() + ", m_moneyHistory=" + this.rPc.size() + "}";
    }
}

