/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/*
 * Renamed from axX
 */
class axx_1
extends OutputStream {
    final Queue<String> drQ = new ConcurrentLinkedQueue<String>();
    StringBuffer drR = new StringBuffer();

    axx_1() {
    }

    @Override
    public void write(int n) {
        char c2 = (char)n;
        if (c2 == '\n') {
            String string = this.drR.toString();
            this.drQ.offer(string);
            this.drR = new StringBuffer();
        } else {
            this.drR.append(c2);
        }
    }

    public String bRL() {
        return this.drQ.poll();
    }
}

