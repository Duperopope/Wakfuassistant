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
 * Renamed from bY
 */
public final class by_1
extends GeneratedMessageV3.Builder<by_1>
implements cj_2 {
    private long fG;
    private Object bs = "";
    private Object bu = "";

    public static final Descriptors.Descriptor kS() {
        return ae_1.fo;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fp.ensureFieldAccessorsInitialized(bw_2.class, by_1.class);
    }

    by_1() {
        this.D();
    }

    by_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (bw_2.kR()) {
            // empty if block
        }
    }

    public by_1 kT() {
        super.clear();
        this.fG = 0L;
        this.bs = "";
        this.bu = "";
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.fo;
    }

    public bw_2 kQ() {
        return bw_2.kP();
    }

    public bw_2 kU() {
        bw_2 bw_22 = this.kV();
        if (!bw_22.isInitialized()) {
            throw by_1.newUninitializedMessageException((Message)bw_22);
        }
        return bw_22;
    }

    public bw_2 kV() {
        bw_2 bw_22 = new bw_2(this);
        bw_22.fG = this.fG;
        bw_22.bs = this.bs;
        bw_22.bu = this.bu;
        this.onBuilt();
        return bw_22;
    }

    public by_1 kW() {
        return (by_1)super.clone();
    }

    public by_1 ao(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (by_1)super.setField(fieldDescriptor, object);
    }

    public by_1 H(Descriptors.FieldDescriptor fieldDescriptor) {
        return (by_1)super.clearField(fieldDescriptor);
    }

    public by_1 H(Descriptors.OneofDescriptor oneofDescriptor) {
        return (by_1)super.clearOneof(oneofDescriptor);
    }

    public by_1 H(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (by_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public by_1 ap(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (by_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public by_1 H(Message message) {
        if (message instanceof bw_2) {
            return this.k((bw_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public by_1 k(bw_2 bw_22) {
        if (bw_22 == bw_2.kP()) {
            return this;
        }
        if (bw_22.fD() != 0L) {
            this.w(bw_22.fD());
        }
        if (!bw_22.getName().isEmpty()) {
            this.bs = bw_22.bs;
            this.onChanged();
        }
        if (!bw_22.getTag().isEmpty()) {
            this.bu = bw_22.bu;
            this.onChanged();
        }
        this.ap(bw_2.j(bw_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public by_1 aX(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bw_2 bw_22 = null;
        try {
            bw_22 = (bw_2)bw_2.hB.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bw_22 = (bw_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bw_22 != null) {
                this.k(bw_22);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public by_1 w(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public by_1 kX() {
        this.fG = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.bs = string;
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

    public by_1 t(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.bs = string;
        this.onChanged();
        return this;
    }

    public by_1 kY() {
        this.bs = bw_2.kP().getName();
        this.onChanged();
        return this;
    }

    public by_1 am(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        bw_2.ak(byteString);
        this.bs = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public String getTag() {
        Object object = this.bu;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.bu = string;
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

    public by_1 u(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.bu = string;
        this.onChanged();
        return this;
    }

    public by_1 kZ() {
        this.bu = bw_2.kP().getTag();
        this.onChanged();
        return this;
    }

    public by_1 an(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        bw_2.al(byteString);
        this.bu = byteString;
        this.onChanged();
        return this;
    }

    public final by_1 ao(UnknownFieldSet unknownFieldSet) {
        return (by_1)super.setUnknownFields(unknownFieldSet);
    }

    public final by_1 ap(UnknownFieldSet unknownFieldSet) {
        return (by_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ap(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ao(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ap(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.H(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.H(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.H(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ao(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.kT();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.kW();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ap(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aX(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.H(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.kT();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.H(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.kW();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ap(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ao(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ap(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.H(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.H(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.H(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ao(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aX(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.kW();
    }

    public /* synthetic */ Message buildPartial() {
        return this.kV();
    }

    public /* synthetic */ Message build() {
        return this.kU();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.H(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.kT();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aX(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.kW();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.kV();
    }

    public /* synthetic */ MessageLite build() {
        return this.kU();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.kT();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.kQ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.kQ();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aX(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.kW();
    }

    public /* synthetic */ Object clone() {
        return this.kW();
    }
}

