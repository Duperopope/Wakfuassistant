/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from ahL
 */
class ahl_0
extends MouseAdapter {
    final /* synthetic */ ahk_0 cyx;

    ahl_0(ahk_0 ahk_02) {
        this.cyx = ahk_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
            this.cyx.cyq.bAX();
        }
    }
}

