/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
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
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from dE
 */
public final class de_2
extends GeneratedMessageV3.Builder<de_2>
implements dg_2 {
    private int an;
    private boolean kO;
    private int kW;

    public static final Descriptors.Descriptor rO() {
        return df_2.jH;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return df_2.jI.ensureFieldAccessorsInitialized(dc_1.class, de_2.class);
    }

    de_2() {
        this.D();
    }

    de_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (dc_1.Y()) {
            // empty if block
        }
    }

    public de_2 rP() {
        super.clear();
        this.kO = false;
        this.an &= 0xFFFFFFFE;
        this.kW = 0;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return df_2.jH;
    }

    public dc_1 rN() {
        return dc_1.rM();
    }

    public dc_1 rQ() {
        dc_1 dc_12 = this.rR();
        if (!dc_12.isInitialized()) {
            throw de_2.newUninitializedMessageException((Message)dc_12);
        }
        return dc_12;
    }

    public dc_1 rR() {
        dc_1 dc_12 = new dc_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            dc_12.kO = this.kO;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            dc_12.kW = this.kW;
            n2 |= 2;
        }
        dc_12.an = n2;
        this.onBuilt();
        return dc_12;
    }

    public de_2 rS() {
        return (de_2)super.clone();
    }

    public de_2 ba(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (de_2)super.setField(fieldDescriptor, object);
    }

    public de_2 aa(Descriptors.FieldDescriptor fieldDescriptor) {
        return (de_2)super.clearField(fieldDescriptor);
    }

    public de_2 aa(Descriptors.OneofDescriptor oneofDescriptor) {
        return (de_2)super.clearOneof(oneofDescriptor);
    }

    public de_2 aa(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (de_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public de_2 bb(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (de_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public de_2 aa(Message message) {
        if (message instanceof dc_1) {
            return this.c((dc_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public de_2 c(dc_1 dc_12) {
        if (dc_12 == dc_1.rM()) {
            return this;
        }
        if (dc_12.rn()) {
            this.d(dc_12.getEnabled());
        }
        if (dc_12.rH()) {
            this.aL(dc_12.rI());
        }
        this.bb(dc_1.b(dc_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.rn();
    }

    public de_2 cc(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        dc_1 dc_12 = null;
        try {
            dc_12 = (dc_1)dc_1.kY.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            dc_12 = (dc_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (dc_12 != null) {
                this.c(dc_12);
            }
        }
        return this;
    }

    @Override
    public boolean rn() {
        return (this.an & 1) != 0;
    }

    @Override
    public boolean getEnabled() {
        return this.kO;
    }

    public de_2 d(boolean bl) {
        this.an |= 1;
        this.kO = bl;
        this.onChanged();
        return this;
    }

    public de_2 rT() {
        this.an &= 0xFFFFFFFE;
        this.kO = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean rH() {
        return (this.an & 2) != 0;
    }

    @Override
    public int rI() {
        return this.kW;
    }

    public de_2 aL(int n) {
        this.an |= 2;
        this.kW = n;
        this.onChanged();
        return this;
    }

    public de_2 rU() {
        this.an &= 0xFFFFFFFD;
        this.kW = 0;
        this.onChanged();
        return this;
    }

    public final de_2 ba(UnknownFieldSet unknownFieldSet) {
        return (de_2)super.setUnknownFields(unknownFieldSet);
    }

    public final de_2 bb(UnknownFieldSet unknownFieldSet) {
        return (de_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bb(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ba(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bb(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aa(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aa(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aa(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ba(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.rP();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.rS();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bb(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cc(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aa(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.rP();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aa(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.rS();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bb(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ba(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bb(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aa(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aa(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aa(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ba(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cc(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.rS();
    }

    public /* synthetic */ Message buildPartial() {
        return this.rR();
    }

    public /* synthetic */ Message build() {
        return this.rQ();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aa(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.rP();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cc(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.rS();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.rR();
    }

    public /* synthetic */ MessageLite build() {
        return this.rQ();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.rP();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.rN();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.rN();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cc(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.rS();
    }

    public /* synthetic */ Object clone() {
        return this.rS();
    }
}

