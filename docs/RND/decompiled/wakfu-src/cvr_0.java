/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from cvr
 */
public class cvr_0
extends nr_0 {
    private byte mjf = 0;
    private long iqc = 0L;
    private byte mjg = 0;
    private int bap;
    private int baq;
    private byte mkb;
    private short mkc;
    private final ArrayList<azx_1<Long, ffV>> mkd = new ArrayList();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.iqc = byteBuffer.getInt();
        this.mjf = byteBuffer.get();
        this.bap = byteBuffer.getInt();
        this.baq = byteBuffer.getInt();
        this.mjg = byteBuffer.get();
        this.mkb = byteBuffer.get();
        this.mkc = byteBuffer.getShort();
        int n = byteBuffer.getShort();
        for (int i = 0; i < n; ++i) {
            long l = byteBuffer.getLong();
            int n2 = byteBuffer.getInt();
            byte by = byteBuffer.get();
            long l2 = byteBuffer.getLong();
            Object r = fgD.fXh().Vd(n2);
            if (r == null) continue;
            ffV ffV2 = new ffV(l);
            ffV2.l((fhc_0)r);
            ffV2.ak(by);
            this.mkd.add(new azx_1<Long, ffV>(l2, ffV2));
        }
        return true;
    }

    @Override
    public int d() {
        return 12941;
    }

    public byte eCV() {
        return this.mjf;
    }

    public long eCW() {
        return this.iqc;
    }

    public int getX() {
        return this.bap;
    }

    public int getY() {
        return this.baq;
    }

    public byte eCX() {
        return this.mjg;
    }

    public ArrayList<azx_1<Long, ffV>> getItems() {
        return this.mkd;
    }

    public byte eDV() {
        return this.mkb;
    }

    public short eDW() {
        return this.mkc;
    }

    public byte eCY() {
        return this.mkb;
    }
}

