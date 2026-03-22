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
 * Renamed from eu
 */
public final class eu_2
extends GeneratedMessageV3.Builder<eu_2>
implements ev_2 {
    private int an;
    private ByteString mV = ByteString.EMPTY;
    private ByteString mL = ByteString.EMPTY;

    public static final Descriptors.Descriptor vu() {
        return ej_2.mz;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ej_2.mA.ensureFieldAccessorsInitialized(es_2.class, eu_2.class);
    }

    eu_2() {
        this.D();
    }

    eu_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (es_2.aJ()) {
            // empty if block
        }
    }

    public eu_2 vv() {
        super.clear();
        this.mV = ByteString.EMPTY;
        this.an &= 0xFFFFFFFE;
        this.mL = ByteString.EMPTY;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ej_2.mz;
    }

    public es_2 vt() {
        return es_2.vs();
    }

    public es_2 vw() {
        es_2 es_22 = this.vx();
        if (!es_22.isInitialized()) {
            throw eu_2.newUninitializedMessageException((Message)es_22);
        }
        return es_22;
    }

    public es_2 vx() {
        es_2 es_22 = new es_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            n2 |= 1;
        }
        es_22.mV = this.mV;
        if ((n & 2) != 0) {
            n2 |= 2;
        }
        es_22.mL = this.mL;
        es_22.an = n2;
        this.onBuilt();
        return es_22;
    }

    public eu_2 vy() {
        return (eu_2)super.clone();
    }

    public eu_2 bs(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eu_2)super.setField(fieldDescriptor, object);
    }

    public eu_2 aj(Descriptors.FieldDescriptor fieldDescriptor) {
        return (eu_2)super.clearField(fieldDescriptor);
    }

    public eu_2 aj(Descriptors.OneofDescriptor oneofDescriptor) {
        return (eu_2)super.clearOneof(oneofDescriptor);
    }

    public eu_2 aj(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (eu_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public eu_2 bt(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eu_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public eu_2 aj(Message message) {
        if (message instanceof es_2) {
            return this.c((es_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public eu_2 c(es_2 es_22) {
        if (es_22 == es_2.vs()) {
            return this;
        }
        if (es_22.vn()) {
            this.aT(es_22.vo());
        }
        if (es_22.uL()) {
            this.aU(es_22.uM());
        }
        this.bt(es_2.b(es_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.vn()) {
            return false;
        }
        return this.uL();
    }

    public eu_2 cD(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        es_2 es_22 = null;
        try {
            es_22 = (es_2)es_2.mY.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            es_22 = (es_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (es_22 != null) {
                this.c(es_22);
            }
        }
        return this;
    }

    @Override
    public boolean vn() {
        return (this.an & 1) != 0;
    }

    @Override
    public ByteString vo() {
        return this.mV;
    }

    public eu_2 aT(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 1;
        this.mV = byteString;
        this.onChanged();
        return this;
    }

    public eu_2 vz() {
        this.an &= 0xFFFFFFFE;
        this.mV = es_2.vs().vo();
        this.onChanged();
        return this;
    }

    @Override
    public boolean uL() {
        return (this.an & 2) != 0;
    }

    @Override
    public ByteString uM() {
        return this.mL;
    }

    public eu_2 aU(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.mL = byteString;
        this.onChanged();
        return this;
    }

    public eu_2 vA() {
        this.an &= 0xFFFFFFFD;
        this.mL = es_2.vs().uM();
        this.onChanged();
        return this;
    }

    public final eu_2 bs(UnknownFieldSet unknownFieldSet) {
        return (eu_2)super.setUnknownFields(unknownFieldSet);
    }

    public final eu_2 bt(UnknownFieldSet unknownFieldSet) {
        return (eu_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bt(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bs(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bt(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aj(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aj(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aj(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bs(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.vv();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.vy();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bt(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cD(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aj(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.vv();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aj(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.vy();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bt(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bs(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bt(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aj(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aj(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aj(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bs(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cD(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.vy();
    }

    public /* synthetic */ Message buildPartial() {
        return this.vx();
    }

    public /* synthetic */ Message build() {
        return this.vw();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aj(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.vv();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cD(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.vy();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.vx();
    }

    public /* synthetic */ MessageLite build() {
        return this.vw();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.vv();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.vt();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.vt();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cD(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.vy();
    }

    public /* synthetic */ Object clone() {
        return this.vy();
    }
}

