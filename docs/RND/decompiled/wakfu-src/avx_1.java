/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.openal.AL
 *  com.jogamp.openal.ALC
 *  com.jogamp.openal.ALCcontext
 *  com.jogamp.openal.ALCdevice
 *  com.jogamp.openal.ALExt
 *  com.jogamp.openal.ALFactory
 */
import com.jogamp.openal.AL;
import com.jogamp.openal.ALC;
import com.jogamp.openal.ALCcontext;
import com.jogamp.openal.ALCdevice;
import com.jogamp.openal.ALExt;
import com.jogamp.openal.ALFactory;

/*
 * Renamed from avx
 */
public abstract class avx_1
implements avi_2 {
    protected ALC dhO;
    protected ALCdevice dhP;
    protected ALCcontext dhQ;
    protected AL dhR;
    protected ALExt dhS;

    @Override
    public void aPg() {
        this.dhO = ALFactory.getALC();
        ALCcontext aLCcontext = this.dhO.alcGetCurrentContext();
        if (aLCcontext == null) {
            this.dhP = this.dhO.alcOpenDevice(null);
            this.dhQ = this.dhO.alcCreateContext(this.dhP, null);
            this.dhO.alcMakeContextCurrent(this.dhQ);
        } else {
            this.dhQ = aLCcontext;
            this.dhP = this.dhO.alcGetContextsDevice(aLCcontext);
        }
        this.dhR = ALFactory.getAL();
        this.dhS = ALFactory.getALExt();
    }

    protected boolean bNa() {
        return this.dhR.alGetError() == 0;
    }

    @Override
    public void bmX() {
        this.dhO = null;
        this.dhP = null;
        this.dhQ = null;
        this.dhR = null;
        this.dhS = null;
    }
}

