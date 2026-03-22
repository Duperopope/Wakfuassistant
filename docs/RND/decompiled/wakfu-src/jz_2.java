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

/*
 * Renamed from jZ
 */
public final class jz_2
extends GeneratedMessageV3.Builder<jz_2>
implements ka_1 {
    private int an;
    private long AH;
    private Object bs = "";
    private long Er;
    private int ws;

    public static final Descriptors.Descriptor Zr() {
        return jk_2.CS;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jk_2.CT.ensureFieldAccessorsInitialized(jx_2.class, jz_2.class);
    }

    jz_2() {
        this.D();
    }

    jz_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (jx_2.pT()) {
            // empty if block
        }
    }

    public jz_2 Zs() {
        super.clear();
        this.AH = 0L;
        this.an &= 0xFFFFFFFE;
        this.bs = "";
        this.an &= 0xFFFFFFFD;
        this.Er = 0L;
        this.an &= 0xFFFFFFFB;
        this.ws = 0;
        this.an &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return jk_2.CS;
    }

    public jx_2 Zq() {
        return jx_2.Zp();
    }

    public jx_2 Zt() {
        jx_2 jx_22 = this.Zu();
        if (!jx_22.isInitialized()) {
            throw jz_2.newUninitializedMessageException((Message)jx_22);
        }
        return jx_22;
    }

    public jx_2 Zu() {
        jx_2 jx_22 = new jx_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            jx_22.AH = this.AH;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            n2 |= 2;
        }
        jx_22.bs = this.bs;
        if ((n & 4) != 0) {
            jx_22.Er = this.Er;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            jx_22.ws = this.ws;
            n2 |= 8;
        }
        jx_22.an = n2;
        this.onBuilt();
        return jx_22;
    }

    public jz_2 Zv() {
        return (jz_2)super.clone();
    }

    public jz_2 dM(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jz_2)super.setField(fieldDescriptor, object);
    }

    public jz_2 bt(Descriptors.FieldDescriptor fieldDescriptor) {
        return (jz_2)super.clearField(fieldDescriptor);
    }

    public jz_2 bt(Descriptors.OneofDescriptor oneofDescriptor) {
        return (jz_2)super.clearOneof(oneofDescriptor);
    }

    public jz_2 bt(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (jz_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public jz_2 dN(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jz_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public jz_2 bt(Message message) {
        if (message instanceof jx_2) {
            return this.d((jx_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public jz_2 d(jx_2 jx_22) {
        if (jx_22 == jx_2.Zp()) {
            return this;
        }
        if (jx_22.oN()) {
            this.aM(jx_22.Sn());
        }
        if (jx_22.wq()) {
            this.an |= 2;
            this.bs = jx_22.bs;
            this.onChanged();
        }
        if (jx_22.Zk()) {
            this.aN(jx_22.Zl());
        }
        if (jx_22.Ly()) {
            this.gj(jx_22.Lz());
        }
        this.dN(jx_2.c(jx_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.oN()) {
            return false;
        }
        if (!this.wq()) {
            return false;
        }
        if (!this.Zk()) {
            return false;
        }
        return this.Ly();
    }

    public jz_2 gh(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        jx_2 jx_22 = null;
        try {
            jx_22 = (jx_2)jx_2.Eu.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            jx_22 = (jx_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (jx_22 != null) {
                this.d(jx_22);
            }
        }
        return this;
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Sn() {
        return this.AH;
    }

    public jz_2 aM(long l) {
        this.an |= 1;
        this.AH = l;
        this.onChanged();
        return this;
    }

    public jz_2 Zw() {
        this.an &= 0xFFFFFFFE;
        this.AH = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean wq() {
        return (this.an & 2) != 0;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.bs = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString bW() {
        Object object = this.bs;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bs = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public jz_2 M(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.bs = string;
        this.onChanged();
        return this;
    }

    public jz_2 Zx() {
        this.an &= 0xFFFFFFFD;
        this.bs = jx_2.Zp().getName();
        this.onChanged();
        return this;
    }

    public jz_2 cz(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.bs = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Zk() {
        return (this.an & 4) != 0;
    }

    @Override
    public long Zl() {
        return this.Er;
    }

    public jz_2 aN(long l) {
        this.an |= 4;
        this.Er = l;
        this.onChanged();
        return this;
    }

    public jz_2 Zy() {
        this.an &= 0xFFFFFFFB;
        this.Er = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Ly() {
        return (this.an & 8) != 0;
    }

    @Override
    public int Lz() {
        return this.ws;
    }

    public jz_2 gj(int n) {
        this.an |= 8;
        this.ws = n;
        this.onChanged();
        return this;
    }

    public jz_2 Zz() {
        this.an &= 0xFFFFFFF7;
        this.ws = 0;
        this.onChanged();
        return this;
    }

    public final jz_2 dM(UnknownFieldSet unknownFieldSet) {
        return (jz_2)super.setUnknownFields(unknownFieldSet);
    }

    public final jz_2 dN(UnknownFieldSet unknownFieldSet) {
        return (jz_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dN(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dM(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dN(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bt(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bt(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bt(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dM(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Zs();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Zv();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dN(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gh(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bt(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Zs();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bt(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Zv();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dN(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dM(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dN(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bt(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bt(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bt(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dM(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gh(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Zv();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Zu();
    }

    public /* synthetic */ Message build() {
        return this.Zt();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bt(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Zs();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gh(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Zv();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Zu();
    }

    public /* synthetic */ MessageLite build() {
        return this.Zt();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Zs();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Zq();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Zq();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gh(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Zv();
    }

    public /* synthetic */ Object clone() {
        return this.Zv();
    }
}

