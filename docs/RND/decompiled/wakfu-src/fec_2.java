/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Memory
 *  uk.co.caprica.vlcj.player.direct.BufferFormat
 *  uk.co.caprica.vlcj.player.direct.DirectMediaPlayer
 *  uk.co.caprica.vlcj.player.direct.RenderCallback
 */
import com.sun.jna.Memory;
import java.nio.ByteBuffer;
import uk.co.caprica.vlcj.player.direct.BufferFormat;
import uk.co.caprica.vlcj.player.direct.DirectMediaPlayer;
import uk.co.caprica.vlcj.player.direct.RenderCallback;

/*
 * Renamed from fEc
 */
public final class fec_2
extends awr_1
implements RenderCallback {
    private ByteBuffer uiT;
    private long uiU = -1L;
    private BufferFormat uiV;

    public fec_2() {
        this.aPg();
    }

    @Override
    public byte bPK() {
        return 18;
    }

    @Override
    protected long bPL() {
        return this.uiU;
    }

    @Override
    protected ByteBuffer bPJ() {
        return this.uiT;
    }

    @Override
    protected int bwN() {
        return this.uiV != null ? this.uiV.getWidth() : 0;
    }

    @Override
    protected int bwO() {
        return this.uiV != null ? this.uiV.getHeight() : 0;
    }

    public void display(DirectMediaPlayer directMediaPlayer, Memory[] memoryArray, BufferFormat bufferFormat) {
        this.uiU = this.uiU == -1L ? 1L : ++this.uiU;
        this.uiV = bufferFormat;
        Memory memory = memoryArray[0];
        int n = Math.toIntExact(memory.size());
        byte[] byArray = memory.getByteArray(0L, n);
        this.uiT = ByteBuffer.wrap(byArray);
    }
}

