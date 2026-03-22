/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class eze
extends Va<UX> {
    final /* synthetic */ ezc ppi;

    eze(ezc ezc2, UX uX, int n) {
        this.ppi = ezc2;
        super(uX, n);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.ppi.aHT);
        byteBuffer.putInt(this.ppi.bap);
        byteBuffer.putInt(this.ppi.baq);
        byteBuffer.putShort(this.ppi.ban);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.ppi.aHT = byteBuffer.getLong();
        this.ppi.bap = byteBuffer.getInt();
        this.ppi.baq = byteBuffer.getInt();
        this.ppi.ban = byteBuffer.getShort();
    }

    @Override
    public int zt() {
        return 12;
    }

    @Override
    public void zm() {
        for (UZ uZ : ezc.b(this.ppi)) {
            uZ.a(this);
        }
    }

    @Override
    public void zl() {
    }
}

