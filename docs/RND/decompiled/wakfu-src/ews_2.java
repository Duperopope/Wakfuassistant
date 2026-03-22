/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eWs
 */
class ews_2
implements Iterable<eww_2> {
    private final short rBz;
    private int rBA;
    private final List<eww_2> rBB = new ArrayList<eww_2>();

    public short fOa() {
        return this.rBz;
    }

    public boolean es(short s) {
        return this.rBz < s;
    }

    public void a(eww_2 eww_22) {
        this.rBB.add(eww_22);
    }

    public void SI(int n) {
        if (n <= this.rBA) {
            ++this.rBA;
        }
    }

    public void SJ(int n) {
        if (n < this.rBA) {
            --this.rBA;
        }
    }

    public int fOb() {
        return this.rBA;
    }

    @Override
    @NotNull
    public Iterator<eww_2> iterator() {
        return this.rBB.iterator();
    }

    public int DN() {
        int n = 8;
        for (eww_2 eww_22 : this.rBB) {
            n += eww_22.DN();
        }
        return n;
    }

    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.rBz);
        byteBuffer.putInt(this.rBA);
        byteBuffer.putShort((short)this.rBB.size());
        for (eww_2 eww_22 : this.rBB) {
            eww_22.as(byteBuffer);
        }
    }

    public static ews_2 a(Tz tz, long l, ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        int n = byteBuffer.getInt();
        ews_2 ews_22 = new ews_2(s, n);
        int n2 = byteBuffer.getShort();
        for (int i = 0; i < n2; ++i) {
            eww_2 eww_22 = eww_2.b(tz, l, byteBuffer);
            ews_22.a(eww_22);
        }
        return ews_22;
    }

    ews_2(short s, int n) {
        this.rBz = s;
        this.rBA = n;
    }
}

