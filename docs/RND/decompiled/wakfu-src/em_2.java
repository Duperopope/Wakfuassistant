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
 * Renamed from em
 */
public final class em_2
extends GeneratedMessageV3.Builder<em_2>
implements en_2 {
    private int an;
    private ByteString mL = ByteString.EMPTY;

    public static final Descriptors.Descriptor uS() {
        return ej_2.mH;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ej_2.mI.ensureFieldAccessorsInitialized(ek_2.class, em_2.class);
    }

    em_2() {
        this.D();
    }

    em_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ek_2.jh()) {
            // empty if block
        }
    }

    public em_2 uT() {
        super.clear();
        this.mL = ByteString.EMPTY;
        this.an &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ej_2.mH;
    }

    public ek_2 uR() {
        return ek_2.uQ();
    }

    public ek_2 uU() {
        ek_2 ek_22 = this.uV();
        if (!ek_22.isInitialized()) {
            throw em_2.newUninitializedMessageException((Message)ek_22);
        }
        return ek_22;
    }

    public ek_2 uV() {
        ek_2 ek_22 = new ek_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            n2 |= 1;
        }
        ek_22.mL = this.mL;
        ek_22.an = n2;
        this.onBuilt();
        return ek_22;
    }

    public em_2 uW() {
        return (em_2)super.clone();
    }

    public em_2 bo(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (em_2)super.setField(fieldDescriptor, object);
    }

    public em_2 ah(Descriptors.FieldDescriptor fieldDescriptor) {
        return (em_2)super.clearField(fieldDescriptor);
    }

    public em_2 ah(Descriptors.OneofDescriptor oneofDescriptor) {
        return (em_2)super.clearOneof(oneofDescriptor);
    }

    public em_2 ah(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (em_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public em_2 bp(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (em_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public em_2 ah(Message message) {
        if (message instanceof ek_2) {
            return this.c((ek_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public em_2 c(ek_2 ek_22) {
        if (ek_22 == ek_2.uQ()) {
            return this;
        }
        if (ek_22.uL()) {
            this.aQ(ek_22.uM());
        }
        this.bp(ek_2.b(ek_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.uL();
    }

    public em_2 cx(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ek_2 ek_22 = null;
        try {
            ek_22 = (ek_2)ek_2.mN.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ek_22 = (ek_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ek_22 != null) {
                this.c(ek_22);
            }
        }
        return this;
    }

    @Override
    public boolean uL() {
        return (this.an & 1) != 0;
    }

    @Override
    public ByteString uM() {
        return this.mL;
    }

    public em_2 aQ(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 1;
        this.mL = byteString;
        this.onChanged();
        return this;
    }

    public em_2 uX() {
        this.an &= 0xFFFFFFFE;
        this.mL = ek_2.uQ().uM();
        this.onChanged();
        return this;
    }

    public final em_2 bo(UnknownFieldSet unknownFieldSet) {
        return (em_2)super.setUnknownFields(unknownFieldSet);
    }

    public final em_2 bp(UnknownFieldSet unknownFieldSet) {
        return (em_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bp(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bo(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bp(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ah(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ah(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ah(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bo(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.uT();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.uW();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bp(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cx(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ah(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.uT();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ah(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.uW();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bp(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bo(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bp(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ah(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ah(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ah(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bo(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cx(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.uW();
    }

    public /* synthetic */ Message buildPartial() {
        return this.uV();
    }

    public /* synthetic */ Message build() {
        return this.uU();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ah(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.uT();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cx(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.uW();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.uV();
    }

    public /* synthetic */ MessageLite build() {
        return this.uU();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.uT();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.uR();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.uR();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cx(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.uW();
    }

    public /* synthetic */ Object clone() {
        return this.uW();
    }
}

