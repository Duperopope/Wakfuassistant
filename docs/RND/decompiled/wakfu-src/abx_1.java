/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Table
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.awt.event.KeyEvent;

/*
 * Renamed from aBx
 */
public class abx_1
implements abz_1 {
    private final Table<Integer, Integer, Runnable> dyP = HashBasedTable.create();
    private final Table<Integer, Integer, Runnable> dyQ = HashBasedTable.create();

    public void a(int n, int n2, int n3, Runnable runnable) {
        if (n2 != 0) {
            this.dyP.put((Object)n, (Object)n2, (Object)runnable);
        } else {
            this.dyQ.put((Object)n, (Object)n3, (Object)runnable);
        }
    }

    @Override
    public boolean b(KeyEvent keyEvent) {
        return this.a(401, keyEvent);
    }

    @Override
    public boolean c(KeyEvent keyEvent) {
        return this.a(402, keyEvent);
    }

    @Override
    public boolean a(KeyEvent keyEvent) {
        return this.a(400, keyEvent);
    }

    public boolean a(int n, KeyEvent keyEvent) {
        Runnable runnable = keyEvent.getKeyCode() != 0 ? (Runnable)this.dyP.get((Object)n, (Object)keyEvent.getKeyCode()) : (Runnable)this.dyQ.get((Object)n, (Object)keyEvent.getExtendedKeyCode());
        if (runnable == null) {
            return false;
        }
        runnable.run();
        return true;
    }
}

