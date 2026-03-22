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

public final class eR
extends GeneratedMessageV3.Builder<eR>
implements fe_0 {
    private int an;
    private long nW;
    private Object nY = "";
    private Object bu = "";
    private int ob;
    private Object od = "";

    public static final Descriptors.Descriptor xA() {
        return eO.nO;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eO.nP.ensureFieldAccessorsInitialized(eP.class, eR.class);
    }

    eR() {
        this.D();
    }

    eR(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (eP.bg()) {
            // empty if block
        }
    }

    public eR xB() {
        super.clear();
        this.nW = 0L;
        this.an &= 0xFFFFFFFE;
        this.nY = "";
        this.an &= 0xFFFFFFFD;
        this.bu = "";
        this.an &= 0xFFFFFFFB;
        this.ob = 0;
        this.an &= 0xFFFFFFF7;
        this.od = "";
        this.an &= 0xFFFFFFEF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return eO.nO;
    }

    public eP xz() {
        return eP.xy();
    }

    public eP xC() {
        eP eP2 = this.xD();
        if (!eP2.isInitialized()) {
            throw eR.newUninitializedMessageException((Message)eP2);
        }
        return eP2;
    }

    public eP xD() {
        eP eP2 = new eP(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            eP2.nW = this.nW;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            n2 |= 2;
        }
        eP2.nY = this.nY;
        if ((n & 4) != 0) {
            n2 |= 4;
        }
        eP2.bu = this.bu;
        if ((n & 8) != 0) {
            eP2.ob = this.ob;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            n2 |= 0x10;
        }
        eP2.od = this.od;
        eP2.an = n2;
        this.onBuilt();
        return eP2;
    }

    public eR xE() {
        return (eR)super.clone();
    }

    public eR bC(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eR)super.setField(fieldDescriptor, object);
    }

    public eR ao(Descriptors.FieldDescriptor fieldDescriptor) {
        return (eR)super.clearField(fieldDescriptor);
    }

    public eR ao(Descriptors.OneofDescriptor oneofDescriptor) {
        return (eR)super.clearOneof(oneofDescriptor);
    }

    public eR ao(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (eR)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public eR bD(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eR)super.addRepeatedField(fieldDescriptor, object);
    }

    public eR ao(Message message) {
        if (message instanceof eP) {
            return this.c((eP)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public eR c(eP eP2) {
        if (eP2 == eP.xy()) {
            return this;
        }
        if (eP2.xk()) {
            this.K(eP2.xl());
        }
        if (eP2.xm()) {
            this.an |= 2;
            this.nY = eP2.nY;
            this.onChanged();
        }
        if (eP2.xp()) {
            this.an |= 4;
            this.bu = eP2.bu;
            this.onChanged();
        }
        if (eP2.xq()) {
            this.bF(eP2.xr());
        }
        if (eP2.xs()) {
            this.an |= 0x10;
            this.od = eP2.od;
            this.onChanged();
        }
        this.bD(eP.b(eP2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.xk()) {
            return false;
        }
        return this.xm();
    }

    public eR cS(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        eP eP2 = null;
        try {
            eP2 = (eP)eP.of.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            eP2 = (eP)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (eP2 != null) {
                this.c(eP2);
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

    public eR K(long l) {
        this.an |= 1;
        this.nW = l;
        this.onChanged();
        return this;
    }

    public eR xF() {
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

    public eR x(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.nY = string;
        this.onChanged();
        return this;
    }

    public eR xG() {
        this.an &= 0xFFFFFFFD;
        this.nY = eP.xy().xn();
        this.onChanged();
        return this;
    }

    public eR bb(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.nY = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean xp() {
        return (this.an & 4) != 0;
    }

    @Override
    public String getTag() {
        Object object = this.bu;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.bu = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString bX() {
        Object object = this.bu;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bu = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public eR y(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 4;
        this.bu = string;
        this.onChanged();
        return this;
    }

    public eR xH() {
        this.an &= 0xFFFFFFFB;
        this.bu = eP.xy().getTag();
        this.onChanged();
        return this;
    }

    public eR bc(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 4;
        this.bu = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean xq() {
        return (this.an & 8) != 0;
    }

    @Override
    public int xr() {
        return this.ob;
    }

    public eR bF(int n) {
        this.an |= 8;
        this.ob = n;
        this.onChanged();
        return this;
    }

    public eR xI() {
        this.an &= 0xFFFFFFF7;
        this.ob = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean xs() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public String xt() {
        Object object = this.od;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.od = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString xu() {
        Object object = this.od;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.od = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public eR z(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 0x10;
        this.od = string;
        this.onChanged();
        return this;
    }

    public eR xJ() {
        this.an &= 0xFFFFFFEF;
        this.od = eP.xy().xt();
        this.onChanged();
        return this;
    }

    public eR bd(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 0x10;
        this.od = byteString;
        this.onChanged();
        return this;
    }

    public final eR bC(UnknownFieldSet unknownFieldSet) {
        return (eR)super.setUnknownFields(unknownFieldSet);
    }

    public final eR bD(UnknownFieldSet unknownFieldSet) {
        return (eR)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bD(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bC(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bD(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ao(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ao(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ao(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bC(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.xB();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.xE();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bD(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cS(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ao(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.xB();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ao(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.xE();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bD(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bC(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bD(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ao(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ao(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ao(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bC(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cS(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.xE();
    }

    public /* synthetic */ Message buildPartial() {
        return this.xD();
    }

    public /* synthetic */ Message build() {
        return this.xC();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ao(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.xB();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cS(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.xE();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.xD();
    }

    public /* synthetic */ MessageLite build() {
        return this.xC();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.xB();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.xz();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.xz();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cS(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.xE();
    }

    public /* synthetic */ Object clone() {
        return this.xE();
    }
}

