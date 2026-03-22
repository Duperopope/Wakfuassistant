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
 * Renamed from kp
 */
public final class kp_0
extends GeneratedMessageV3.Builder<kp_0>
implements kq_0 {
    private int an;
    private Object EY = "";
    private long Fa;
    private long Fm;

    public static final Descriptors.Descriptor abc() {
        return kb.ED;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kb.EE.ensureFieldAccessorsInitialized(kn_0.class, kp_0.class);
    }

    kp_0() {
        this.D();
    }

    kp_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (kn_0.ju()) {
            // empty if block
        }
    }

    public kp_0 abd() {
        super.clear();
        this.EY = "";
        this.an &= 0xFFFFFFFE;
        this.Fa = 0L;
        this.an &= 0xFFFFFFFD;
        this.Fm = 0L;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kb.ED;
    }

    public kn_0 abb() {
        return kn_0.aba();
    }

    public kn_0 abe() {
        kn_0 kn_02 = this.abf();
        if (!kn_02.isInitialized()) {
            throw kp_0.newUninitializedMessageException((Message)kn_02);
        }
        return kn_02;
    }

    public kn_0 abf() {
        kn_0 kn_02 = new kn_0(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            n2 |= 1;
        }
        kn_02.EY = this.EY;
        if ((n & 2) != 0) {
            kn_02.Fa = this.Fa;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            kn_02.Fm = this.Fm;
            n2 |= 4;
        }
        kn_02.an = n2;
        this.onBuilt();
        return kn_02;
    }

    public kp_0 abg() {
        return (kp_0)super.clone();
    }

    public kp_0 dU(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kp_0)super.setField(fieldDescriptor, object);
    }

    public kp_0 bx(Descriptors.FieldDescriptor fieldDescriptor) {
        return (kp_0)super.clearField(fieldDescriptor);
    }

    public kp_0 bx(Descriptors.OneofDescriptor oneofDescriptor) {
        return (kp_0)super.clearOneof(oneofDescriptor);
    }

    public kp_0 bx(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (kp_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public kp_0 dV(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kp_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public kp_0 bx(Message message) {
        if (message instanceof kn_0) {
            return this.d((kn_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public kp_0 d(kn_0 kn_02) {
        if (kn_02 == kn_0.aba()) {
            return this;
        }
        if (kn_02.aau()) {
            this.an |= 1;
            this.EY = kn_02.EY;
            this.onChanged();
        }
        if (kn_02.aax()) {
            this.aQ(kn_02.aay());
        }
        if (kn_02.aaV()) {
            this.aR(kn_02.aaW());
        }
        this.dV(kn_0.c(kn_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.aau()) {
            return false;
        }
        if (!this.aax()) {
            return false;
        }
        return this.aaV();
    }

    public kp_0 gt(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        kn_0 kn_02 = null;
        try {
            kn_02 = (kn_0)kn_0.Fo.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            kn_02 = (kn_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (kn_02 != null) {
                this.d(kn_02);
            }
        }
        return this;
    }

    @Override
    public boolean aau() {
        return (this.an & 1) != 0;
    }

    @Override
    public String aav() {
        Object object = this.EY;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.EY = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString aaw() {
        Object object = this.EY;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.EY = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public kp_0 O(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 1;
        this.EY = string;
        this.onChanged();
        return this;
    }

    public kp_0 abh() {
        this.an &= 0xFFFFFFFE;
        this.EY = kn_0.aba().aav();
        this.onChanged();
        return this;
    }

    public kp_0 cF(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 1;
        this.EY = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aax() {
        return (this.an & 2) != 0;
    }

    @Override
    public long aay() {
        return this.Fa;
    }

    public kp_0 aQ(long l) {
        this.an |= 2;
        this.Fa = l;
        this.onChanged();
        return this;
    }

    public kp_0 abi() {
        this.an &= 0xFFFFFFFD;
        this.Fa = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aaV() {
        return (this.an & 4) != 0;
    }

    @Override
    public long aaW() {
        return this.Fm;
    }

    public kp_0 aR(long l) {
        this.an |= 4;
        this.Fm = l;
        this.onChanged();
        return this;
    }

    public kp_0 abj() {
        this.an &= 0xFFFFFFFB;
        this.Fm = 0L;
        this.onChanged();
        return this;
    }

    public final kp_0 dU(UnknownFieldSet unknownFieldSet) {
        return (kp_0)super.setUnknownFields(unknownFieldSet);
    }

    public final kp_0 dV(UnknownFieldSet unknownFieldSet) {
        return (kp_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dV(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dU(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dV(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bx(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bx(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bx(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dU(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.abd();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.abg();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dV(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gt(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bx(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.abd();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bx(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.abg();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dV(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dU(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dV(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bx(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bx(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bx(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dU(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gt(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.abg();
    }

    public /* synthetic */ Message buildPartial() {
        return this.abf();
    }

    public /* synthetic */ Message build() {
        return this.abe();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bx(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.abd();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gt(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.abg();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.abf();
    }

    public /* synthetic */ MessageLite build() {
        return this.abe();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.abd();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.abb();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.abb();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gt(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.abg();
    }

    public /* synthetic */ Object clone() {
        return this.abg();
    }
}

