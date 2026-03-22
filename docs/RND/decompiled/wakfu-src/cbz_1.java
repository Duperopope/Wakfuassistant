/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Renamed from cbz
 */
abstract class cbz_1
implements ChangeListener {
    cbz_1() {
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        JSlider jSlider = (JSlider)changeEvent.getSource();
        this.eR(cbo_1.a(jSlider));
    }

    protected abstract void eR(float var1);
}

