/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

public final class eU
extends GeneratedMessageV3.Builder<eU>
implements eV {
    private int an;
    private long nW;
    private Object nY = "";
    private boolean ok;
    private Object om = "";
    private boolean oo;
    private int oq = -1;
    private int lM = -1;
    private Object ot = "";
    private long jT = -1L;

    public static final Descriptors.Descriptor yc() {
        return eO.nS;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eO.nT.ensureFieldAccessorsInitialized(eS.class, eU.class);
    }

    eU() {
        this.D();
    }

    eU(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (eS.gG()) {
            // empty if block
        }
    }

    public eU yd() {
        super.clear();
        this.nW = 0L;
        this.an &= 0xFFFFFFFE;
        this.nY = "";
        this.an &= 0xFFFFFFFD;
        this.ok = false;
        this.an &= 0xFFFFFFFB;
        this.om = "";
        this.an &= 0xFFFFFFF7;
        this.oo = false;
        this.an &= 0xFFFFFFEF;
        this.oq = -1;
        this.an &= 0xFFFFFFDF;
        this.lM = -1;
        this.an &= 0xFFFFFFBF;
        this.ot = "";
        this.an &= 0xFFFFFF7F;
        this.jT = -1L;
        this.an &= 0xFFFFFEFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return eO.nS;
    }

    public eS yb() {
        return eS.ya();
    }

    public eS ye() {
        eS eS2 = this.yf();
        if (!eS2.isInitialized()) {
            throw eU.newUninitializedMessageException((Message)eS2);
        }
        return eS2;
    }

    public eS yf() {
        eS eS2 = new eS(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            eS2.nW = this.nW;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            n2 |= 2;
        }
        eS2.nY = this.nY;
        if ((n & 4) != 0) {
            eS2.ok = this.ok;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            n2 |= 8;
        }
        eS2.om = this.om;
        if ((n & 0x10) != 0) {
            eS2.oo = this.oo;
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            n2 |= 0x20;
        }
        eS2.oq = this.oq;
        if ((n & 0x40) != 0) {
            n2 |= 0x40;
        }
        eS2.lM = this.lM;
        if ((n & 0x80) != 0) {
            n2 |= 0x80;
        }
        eS2.ot = this.ot;
        if ((n & 0x100) != 0) {
            n2 |= 0x100;
        }
        eS2.jT = this.jT;
        eS2.an = n2;
        this.onBuilt();
        return eS2;
    }

    public eU yg() {
        return (eU)super.clone();
    }

    public eU bE(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eU)super.setField(fieldDescriptor, object);
    }

    public eU ap(Descriptors.FieldDescriptor fieldDescriptor) {
        return (eU)super.clearField(fieldDescriptor);
    }

    public eU ap(Descriptors.OneofDescriptor oneofDescriptor) {
        return (eU)super.clearOneof(oneofDescriptor);
    }

    public eU ap(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (eU)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public eU bF(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eU)super.addRepeatedField(fieldDescriptor, object);
    }

    public eU ap(Message message) {
        if (message instanceof eS) {
            return this.c((eS)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public eU c(eS eS2) {
        if (eS2 == eS.ya()) {
            return this;
        }
        if (eS2.xk()) {
            this.L(eS2.xl());
        }
        if (eS2.xm()) {
            this.an |= 2;
            this.nY = eS2.nY;
            this.onChanged();
        }
        if (eS2.xL()) {
            this.g(eS2.xM());
        }
        if (eS2.xN()) {
            this.an |= 8;
            this.om = eS2.om;
            this.onChanged();
        }
        if (eS2.xQ()) {
            this.h(eS2.xR());
        }
        if (eS2.xS()) {
            this.bG(eS2.xT());
        }
        if (eS2.sX()) {
            this.bH(eS2.sY());
        }
        if (eS2.xU()) {
            this.an |= 0x80;
            this.ot = eS2.ot;
            this.onChanged();
        }
        if (eS2.pe()) {
            this.M(eS2.pf());
        }
        this.bF(eS.b(eS2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.xk()) {
            return false;
        }
        if (!this.xm()) {
            return false;
        }
        return this.xL();
    }

    public eU cV(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        eS eS2 = null;
        try {
            eS2 = (eS)eS.ow.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            eS2 = (eS)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (eS2 != null) {
                this.c(eS2);
            }
        }
        return this;
    }

    @Override
    public boolean xk() {
        return (this.an & 1) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    public eU L(long l) {
        this.an |= 1;
        this.nW = l;
        this.onChanged();
        return this;
    }

    public eU yh() {
        this.an &= 0xFFFFFFFE;
        this.nW = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean xm() {
        return (this.an & 2) != 0;
    }

    @Override
    public String xn() {
        Object object = this.nY;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.nY = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString xo() {
        Object object = this.nY;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.nY = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public eU A(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.nY = string;
        this.onChanged();
        return this;
    }

    public eU yi() {
        this.an &= 0xFFFFFFFD;
        this.nY = eS.ya().xn();
        this.onChanged();
        return this;
    }

    public eU bf(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.nY = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean xL() {
        return (this.an & 4) != 0;
    }

    @Override
    public boolean xM() {
        return this.ok;
    }

    public eU g(boolean bl) {
        this.an |= 4;
        this.ok = bl;
        this.onChanged();
        return this;
    }

    public eU yj() {
        this.an &= 0xFFFFFFFB;
        this.ok = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean xN() {
        return (this.an & 8) != 0;
    }

    @Override
    public String xO() {
        Object object = this.om;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.om = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString xP() {
        Object object = this.om;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.om = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public eU B(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 8;
        this.om = string;
        this.onChanged();
        return this;
    }

    public eU yk() {
        this.an &= 0xFFFFFFF7;
        this.om = eS.ya().xO();
        this.onChanged();
        return this;
    }

    public eU bg(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 8;
        this.om = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean xQ() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public boolean xR() {
        return this.oo;
    }

    public eU h(boolean bl) {
        this.an |= 0x10;
        this.oo = bl;
        this.onChanged();
        return this;
    }

    public eU yl() {
        this.an &= 0xFFFFFFEF;
        this.oo = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean xS() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public int xT() {
        return this.oq;
    }

    public eU bG(int n) {
        this.an |= 0x20;
        this.oq = n;
        this.onChanged();
        return this;
    }

    public eU ym() {
        this.an &= 0xFFFFFFDF;
        this.oq = -1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean sX() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public int sY() {
        return this.lM;
    }

    public eU bH(int n) {
        this.an |= 0x40;
        this.lM = n;
        this.onChanged();
        return this;
    }

    public eU yn() {
        this.an &= 0xFFFFFFBF;
        this.lM = -1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean xU() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public String xV() {
        Object object = this.ot;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.ot = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString xW() {
        Object object = this.ot;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.ot = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public eU C(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 0x80;
        this.ot = string;
        this.onChanged();
        return this;
    }

    public eU yo() {
        this.an &= 0xFFFFFF7F;
        this.ot = eS.ya().xV();
        this.onChanged();
        return this;
    }

    public eU bh(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 0x80;
        this.ot = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean pe() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public long pf() {
        return this.jT;
    }

    public eU M(long l) {
        this.an |= 0x100;
        this.jT = l;
        this.onChanged();
        return this;
    }

    public eU yp() {
        this.an &= 0xFFFFFEFF;
        this.jT = -1L;
        this.onChanged();
        return this;
    }

    public final eU bE(UnknownFieldSet unknownFieldSet) {
        return (eU)super.setUnknownFields(unknownFieldSet);
    }

    public final eU bF(UnknownFieldSet unknownFieldSet) {
        return (eU)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bF(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bE(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bF(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ap(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ap(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ap(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bE(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.yd();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.yg();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bF(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cV(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ap(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.yd();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ap(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.yg();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bF(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bE(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bF(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ap(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ap(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ap(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bE(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cV(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.yg();
    }

    public /* synthetic */ Message buildPartial() {
        return this.yf();
    }

    public /* synthetic */ Message build() {
        return this.ye();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ap(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.yd();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cV(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.yg();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.yf();
    }

    public /* synthetic */ MessageLite build() {
        return this.ye();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.yd();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.yb();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.yb();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cV(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.yg();
    }

    public /* synthetic */ Object clone() {
        return this.yg();
    }
}

