/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from Ap
 */
public final class ap_0
extends GeneratedMessageV3.Builder<ap_0>
implements Aq {
    private int an;
    private long Dj;
    private an_0 aqp;
    private SingleFieldBuilderV3<an_0, AP, AW> apR;

    public static final Descriptors.Descriptor aCG() {
        return zS.apl;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apm.ensureFieldAccessorsInitialized(An.class, ap_0.class);
    }

    ap_0() {
        this.D();
    }

    ap_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (An.cs()) {
            this.aBA();
        }
    }

    public ap_0 aCH() {
        super.clear();
        this.Dj = 0L;
        this.an &= 0xFFFFFFFE;
        if (this.apR == null) {
            this.aqp = null;
        } else {
            this.apR.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zS.apl;
    }

    public An aCF() {
        return An.aCE();
    }

    public An aCI() {
        An an = this.aCJ();
        if (!an.isInitialized()) {
            throw ap_0.newUninitializedMessageException((Message)an);
        }
        return an;
    }

    public An aCJ() {
        An an = new An(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            an.Dj = this.Dj;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            an.aqp = this.apR == null ? this.aqp : (an_0)this.apR.build();
            n2 |= 2;
        }
        an.an = n2;
        this.onBuilt();
        return an;
    }

    public ap_0 aCK() {
        return (ap_0)super.clone();
    }

    public ap_0 gs(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ap_0)super.setField(fieldDescriptor, object);
    }

    public ap_0 cJ(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ap_0)super.clearField(fieldDescriptor);
    }

    public ap_0 cJ(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ap_0)super.clearOneof(oneofDescriptor);
    }

    public ap_0 cJ(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ap_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ap_0 gt(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ap_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ap_0 cJ(Message message) {
        if (message instanceof An) {
            return this.c((An)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ap_0 c(An an) {
        if (an == An.aCE()) {
            return this;
        }
        if (an.Xh()) {
            this.cb(an.Xi());
        }
        if (an.aBk()) {
            this.b(an.aCz());
        }
        this.gt(An.b(an));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.Xh()) {
            return false;
        }
        if (!this.aBk()) {
            return false;
        }
        return this.aCz().isInitialized();
    }

    public ap_0 kd(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        An an = null;
        try {
            an = (An)An.aqr.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            an = (An)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (an != null) {
                this.c(an);
            }
        }
        return this;
    }

    @Override
    public boolean Xh() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Xi() {
        return this.Dj;
    }

    public ap_0 cb(long l) {
        this.an |= 1;
        this.Dj = l;
        this.onChanged();
        return this;
    }

    public ap_0 aCL() {
        this.an &= 0xFFFFFFFE;
        this.Dj = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aBk() {
        return (this.an & 2) != 0;
    }

    @Override
    public an_0 aCz() {
        if (this.apR == null) {
            return this.aqp == null ? an_0.aEQ() : this.aqp;
        }
        return (an_0)this.apR.getMessage();
    }

    public ap_0 a(an_0 an_02) {
        if (this.apR == null) {
            if (an_02 == null) {
                throw new NullPointerException();
            }
            this.aqp = an_02;
            this.onChanged();
        } else {
            this.apR.setMessage((AbstractMessage)an_02);
        }
        this.an |= 2;
        return this;
    }

    public ap_0 a(AP aP) {
        if (this.apR == null) {
            this.aqp = aP.aEU();
            this.onChanged();
        } else {
            this.apR.setMessage((AbstractMessage)aP.aEU());
        }
        this.an |= 2;
        return this;
    }

    public ap_0 b(an_0 an_02) {
        if (this.apR == null) {
            this.aqp = (this.an & 2) != 0 && this.aqp != null && this.aqp != an_0.aEQ() ? an_0.c(this.aqp).e(an_02).aEV() : an_02;
            this.onChanged();
        } else {
            this.apR.mergeFrom((AbstractMessage)an_02);
        }
        this.an |= 2;
        return this;
    }

    public ap_0 aCM() {
        if (this.apR == null) {
            this.aqp = null;
            this.onChanged();
        } else {
            this.apR.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public AP aCN() {
        this.an |= 2;
        this.onChanged();
        return (AP)this.aBA().getBuilder();
    }

    @Override
    public AW aCA() {
        if (this.apR != null) {
            return (AW)this.apR.getMessageOrBuilder();
        }
        return this.aqp == null ? an_0.aEQ() : this.aqp;
    }

    private SingleFieldBuilderV3<an_0, AP, AW> aBA() {
        if (this.apR == null) {
            this.apR = new SingleFieldBuilderV3((AbstractMessage)this.aCz(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.aqp = null;
        }
        return this.apR;
    }

    public final ap_0 gs(UnknownFieldSet unknownFieldSet) {
        return (ap_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ap_0 gt(UnknownFieldSet unknownFieldSet) {
        return (ap_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gt(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gs(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gt(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cJ(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cJ(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cJ(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gs(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aCH();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aCK();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gt(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kd(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cJ(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aCH();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cJ(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aCK();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gt(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gs(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gt(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cJ(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cJ(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cJ(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gs(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kd(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aCK();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aCJ();
    }

    public /* synthetic */ Message build() {
        return this.aCI();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cJ(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aCH();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kd(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aCK();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aCJ();
    }

    public /* synthetic */ MessageLite build() {
        return this.aCI();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aCH();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aCF();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aCF();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kd(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aCK();
    }

    public /* synthetic */ Object clone() {
        return this.aCK();
    }
}

