/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class eRl
extends fi_1 {
    protected vy_1 rhB;
    final /* synthetic */ erk_0 rhC;

    protected eRl(erk_0 erk_02) {
        this.rhC = erk_02;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        this.rhB.aF(byteBuffer);
        if (this.rhC.fGB().fIq()) {
            azg_1 azg_12 = new azg_1();
            byte by = 0;
            fqP<fqE> fqP2 = ((ezb_0)this.rhC.rhx).dkB();
            for (fqE fqE2 : fqP2) {
                if (fqE2.cmL() == 0) continue;
                by = (byte)(by + 1);
                azg_12.vC(fqE2.avr());
                azg_12.vC(fqE2.cmL());
            }
            byteBuffer.put(by);
            byteBuffer.put(azg_12.bTe());
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.rhB = new vy_1();
        this.rhB.aG(byteBuffer);
        this.rhC.fGw();
        this.rhC.rhx.b(this.rhB);
        if (this.rhC.fGB().fIq()) {
            int n2 = byteBuffer.get();
            fqP<fqE> fqP2 = ((ezb_0)this.rhC.rhx).dkB();
            for (int i = 0; i < n2; ++i) {
                fqE fqE2;
                int n3 = byteBuffer.getInt();
                int n4 = byteBuffer.getInt();
                if (fqP2 == null || (fqE2 = (fqE)fqP2.pc(n3)) == null) continue;
                fqE2.cj((short)n4);
            }
        }
    }

    @Override
    public int zt() {
        this.rhB = new vy_1();
        this.rhC.rhx.a(this.rhB);
        if (this.rhC.fGB().fIq()) {
            int n = 0;
            fqP<fqE> fqP2 = ((ezb_0)this.rhC.rhx).dkB();
            for (fqE fqE2 : fqP2) {
                if (fqE2.cmL() == 0) continue;
                n = (byte)(n + 1);
            }
            return this.rhB.DN() + 1 + n * 8;
        }
        return this.rhB.DN();
    }
}

