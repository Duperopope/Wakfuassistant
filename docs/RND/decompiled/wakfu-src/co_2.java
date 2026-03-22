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
 * Renamed from cO
 */
public final class co_2
extends GeneratedMessageV3.Builder<co_2>
implements cp_1 {
    private long fG;
    private int iK = 0;

    public static final Descriptors.Descriptor nV() {
        return ae_1.eU;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eV.ensureFieldAccessorsInitialized(cm_2.class, co_2.class);
    }

    co_2() {
        this.D();
    }

    co_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (cm_2.nU()) {
            // empty if block
        }
    }

    public co_2 nW() {
        super.clear();
        this.fG = 0L;
        this.iK = 0;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.eU;
    }

    public cm_2 nT() {
        return cm_2.nS();
    }

    public cm_2 nX() {
        cm_2 cm_22 = this.nY();
        if (!cm_22.isInitialized()) {
            throw co_2.newUninitializedMessageException((Message)cm_22);
        }
        return cm_22;
    }

    public cm_2 nY() {
        cm_2 cm_22 = new cm_2(this);
        cm_22.fG = this.fG;
        cm_22.iK = this.iK;
        this.onBuilt();
        return cm_22;
    }

    public co_2 nZ() {
        return (co_2)super.clone();
    }

    public co_2 aI(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (co_2)super.setField(fieldDescriptor, object);
    }

    public co_2 R(Descriptors.FieldDescriptor fieldDescriptor) {
        return (co_2)super.clearField(fieldDescriptor);
    }

    public co_2 R(Descriptors.OneofDescriptor oneofDescriptor) {
        return (co_2)super.clearOneof(oneofDescriptor);
    }

    public co_2 R(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (co_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public co_2 aJ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (co_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public co_2 R(Message message) {
        if (message instanceof cm_2) {
            return this.c((cm_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public co_2 c(cm_2 cm_22) {
        if (cm_22 == cm_2.nS()) {
            return this;
        }
        if (cm_22.fD() != 0L) {
            this.H(cm_22.fD());
        }
        if (cm_22.iK != 0) {
            this.ae(cm_22.nN());
        }
        this.aJ(cm_2.b(cm_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public co_2 bB(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        cm_2 cm_22 = null;
        try {
            cm_22 = (cm_2)cm_2.iM.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            cm_22 = (cm_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (cm_22 != null) {
                this.c(cm_22);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public co_2 H(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public co_2 oa() {
        this.fG = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public int nN() {
        return this.iK;
    }

    public co_2 ae(int n) {
        this.iK = n;
        this.onChanged();
        return this;
    }

    @Override
    public ck_2 nO() {
        ck_2 ck_22 = ck_2.ab(this.iK);
        return ck_22 == null ? ck_2.iA : ck_22;
    }

    public co_2 a(ck_2 ck_22) {
        if (ck_22 == null) {
            throw new NullPointerException();
        }
        this.iK = ck_22.getNumber();
        this.onChanged();
        return this;
    }

    public co_2 ob() {
        this.iK = 0;
        this.onChanged();
        return this;
    }

    public final co_2 aI(UnknownFieldSet unknownFieldSet) {
        return (co_2)super.setUnknownFields(unknownFieldSet);
    }

    public final co_2 aJ(UnknownFieldSet unknownFieldSet) {
        return (co_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aJ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aI(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aJ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.R(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.R(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.R(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aI(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.nW();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.nZ();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aJ(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bB(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.R(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.nW();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.R(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.nZ();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aJ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aI(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aJ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.R(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.R(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.R(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aI(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bB(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.nZ();
    }

    public /* synthetic */ Message buildPartial() {
        return this.nY();
    }

    public /* synthetic */ Message build() {
        return this.nX();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.R(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.nW();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bB(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.nZ();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.nY();
    }

    public /* synthetic */ MessageLite build() {
        return this.nX();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.nW();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.nT();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.nT();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bB(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.nZ();
    }

    public /* synthetic */ Object clone() {
        return this.nZ();
    }
}

