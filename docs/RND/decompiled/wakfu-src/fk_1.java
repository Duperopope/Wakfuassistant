/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fk
 */
class fk_1 {
    private static final int oZ = 10;
    private final int pa;
    private final ArrayList<ByteBuffer> pb = new ArrayList();
    private final ArrayList<ByteBuffer> pc = new ArrayList();
    private final Object pd = new Object();

    public fk_1(int n) {
        this.pa = n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    public ByteBuffer zu() {
        Object object = this.pd;
        synchronized (object) {
            if (this.pc.isEmpty()) {
                for (int i = 0; i < 10; ++i) {
                    this.pc.add(ByteBuffer.allocate(this.pa));
                }
            }
            if (this.pc.isEmpty()) {
                return null;
            }
            ByteBuffer byteBuffer = this.pc.remove(0);
            this.pb.add(byteBuffer);
            return byteBuffer;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean at(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("buffer = null");
        }
        Object object = this.pd;
        synchronized (object) {
            if (!this.pb.contains(byteBuffer)) {
                return false;
            }
            byteBuffer.clear();
            this.pb.remove(byteBuffer);
            this.pc.add(byteBuffer);
            return true;
        }
    }
}

