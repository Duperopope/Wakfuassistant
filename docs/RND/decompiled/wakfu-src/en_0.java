/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from En
 */
public class en_0 {
    private final fd_1 ayq;

    public en_0(fd_1 fd_12) {
        this.ayq = fd_12;
    }

    public void b(fp_0 fp_02) {
        Collection<fc_1> collection = this.ayq.aKv();
        fp_02.k((short)collection.size());
        for (fc_1 fc_12 : collection) {
            new em_0(fc_12).b(fp_02);
        }
    }
}

