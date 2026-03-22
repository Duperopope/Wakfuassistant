/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.sql.Timestamp;
import java.util.ArrayList;

/*
 * Renamed from euW
 */
class euw_1
extends fi_1 {
    final /* synthetic */ euv_1 osx;

    euw_1(euv_1 euv_12) {
        this.osx = euv_12;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        int n;
        byteBuffer.putLong(this.osx.aDg);
        byteBuffer.putLong(this.osx.osg);
        byteBuffer.putInt(this.osx.elB);
        byteBuffer.putInt(this.osx.osi);
        byteBuffer.put(this.osx.osu);
        byteBuffer.putLong(this.osx.osj);
        int[] objectArray = this.osx.oss;
        int byArray = objectArray.length;
        for (n = 0; n < byArray; ++n) {
            int evc_22 = objectArray[n];
            byteBuffer.putInt(evc_22);
        }
        byte[] byArray2 = BH.aP(this.osx.osh);
        byteBuffer.put((byte)byArray2.length);
        byteBuffer.put(byArray2);
        byte[] byArray3 = BH.aP(this.osx.eAk);
        byteBuffer.put((byte)byArray3.length);
        byteBuffer.put(byArray3);
        byteBuffer.putInt(this.osx.ezE.d());
        byteBuffer.putInt(this.osx.oso.size());
        for (n = 0; n < this.osx.oso.size(); ++n) {
            evc_2 evc_22 = this.osx.oso.get(n);
            byteBuffer.putInt(evc_22.arF());
            byteBuffer.putLong(evc_22.fdJ().getTime());
            byteBuffer.putLong(evc_22.fdK().getTime());
        }
        byteBuffer.putLong(this.osx.osm[1]);
        this.osx.osr.as(byteBuffer);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.osx.aDg = byteBuffer.getLong();
        this.osx.osg = byteBuffer.getLong();
        this.osx.elB = byteBuffer.getInt();
        this.osx.osi = byteBuffer.getInt();
        this.osx.osu = byteBuffer.get();
        this.osx.osj = byteBuffer.getLong();
        for (int i = 0; i < evm_2.fec(); ++i) {
            this.osx.oss[i] = byteBuffer.getInt();
        }
        byte[] byArray = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray);
        this.osx.osh = BH.dc(byArray);
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.osx.eAk = BH.dc(byArray2);
        this.osx.ezE = vb_0.pS(byteBuffer.getInt());
        this.osx.oso = new ArrayList<evc_2>();
        int n2 = byteBuffer.getInt();
        for (int i = 0; i < n2; ++i) {
            int n3 = byteBuffer.getInt();
            Timestamp timestamp = new Timestamp(byteBuffer.getLong());
            Timestamp timestamp2 = new Timestamp(byteBuffer.getLong());
            evc_2 evc_22 = new evc_2(n3, timestamp, timestamp2);
            this.osx.oso.add(evc_22);
        }
        this.osx.osm[1] = byteBuffer.getLong();
        this.osx.osr.eL(byteBuffer);
    }

    @Override
    public int zt() {
        int n = 0;
        n += 33 + 4 * evm_2.fec();
        byte[] byArray = BH.aP(this.osx.osh);
        n += 1 + byArray.length;
        byte[] byArray2 = BH.aP(this.osx.eAk);
        n += 1 + byArray2.length;
        n += 4;
        n += 4;
        n += this.osx.oso.size() * 20;
        n += 8;
        return n += this.osx.osr.DN();
    }
}

