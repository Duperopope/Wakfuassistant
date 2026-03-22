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
 * Renamed from lk
 */
public final class lk_1
extends GeneratedMessageV3.Builder<lk_1>
implements lp_0 {
    private int an;
    private kW Fc;
    private SingleFieldBuilderV3<kW, kY, lh> Fh;
    private int ws;

    public static final Descriptors.Descriptor afI() {
        return kF.Gq;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gr.ensureFieldAccessorsInitialized(li.class, lk_1.class);
    }

    lk_1() {
        this.D();
    }

    lk_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (li.mL()) {
            this.aaS();
        }
    }

    public lk_1 afJ() {
        super.clear();
        if (this.Fh == null) {
            this.Fc = null;
        } else {
            this.Fh.clear();
        }
        this.an &= 0xFFFFFFFE;
        this.ws = 0;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kF.Gq;
    }

    public li afH() {
        return li.afG();
    }

    public li afK() {
        li li2 = this.afL();
        if (!li2.isInitialized()) {
            throw lk_1.newUninitializedMessageException((Message)li2);
        }
        return li2;
    }

    public li afL() {
        li li2 = new li(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            li2.Fc = this.Fh == null ? this.Fc : (kW)this.Fh.build();
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            li2.ws = this.ws;
            n2 |= 2;
        }
        li2.an = n2;
        this.onBuilt();
        return li2;
    }

    public lk_1 afM() {
        return (lk_1)super.clone();
    }

    public lk_1 eq(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lk_1)super.setField(fieldDescriptor, object);
    }

    public lk_1 bI(Descriptors.FieldDescriptor fieldDescriptor) {
        return (lk_1)super.clearField(fieldDescriptor);
    }

    public lk_1 bI(Descriptors.OneofDescriptor oneofDescriptor) {
        return (lk_1)super.clearOneof(oneofDescriptor);
    }

    public lk_1 bI(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (lk_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public lk_1 er(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lk_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public lk_1 bI(Message message) {
        if (message instanceof li) {
            return this.c((li)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public lk_1 c(li li2) {
        if (li2 == li.afG()) {
            return this;
        }
        if (li2.aaz()) {
            this.j(li2.aaA());
        }
        if (li2.Ly()) {
            this.hd(li2.Lz());
        }
        this.er(li.b(li2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.aaz()) {
            return false;
        }
        if (!this.Ly()) {
            return false;
        }
        return this.aaA().isInitialized();
    }

    public lk_1 ha(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        li li2 = null;
        try {
            li2 = (li)li.HS.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            li2 = (li)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (li2 != null) {
                this.c(li2);
            }
        }
        return this;
    }

    @Override
    public boolean aaz() {
        return (this.an & 1) != 0;
    }

    @Override
    public kW aaA() {
        if (this.Fh == null) {
            return this.Fc == null ? kW.aen() : this.Fc;
        }
        return (kW)this.Fh.getMessage();
    }

    public lk_1 i(kW kW2) {
        if (this.Fh == null) {
            if (kW2 == null) {
                throw new NullPointerException();
            }
            this.Fc = kW2;
            this.onChanged();
        } else {
            this.Fh.setMessage((AbstractMessage)kW2);
        }
        this.an |= 1;
        return this;
    }

    public lk_1 d(kY kY2) {
        if (this.Fh == null) {
            this.Fc = kY2.aer();
            this.onChanged();
        } else {
            this.Fh.setMessage((AbstractMessage)kY2.aer());
        }
        this.an |= 1;
        return this;
    }

    public lk_1 j(kW kW2) {
        if (this.Fh == null) {
            this.Fc = (this.an & 1) != 0 && this.Fc != null && this.Fc != kW.aen() ? kW.f(this.Fc).h(kW2).aes() : kW2;
            this.onChanged();
        } else {
            this.Fh.mergeFrom((AbstractMessage)kW2);
        }
        this.an |= 1;
        return this;
    }

    public lk_1 afN() {
        if (this.Fh == null) {
            this.Fc = null;
            this.onChanged();
        } else {
            this.Fh.clear();
        }
        this.an &= 0xFFFFFFFE;
        return this;
    }

    public kY aaR() {
        this.an |= 1;
        this.onChanged();
        return (kY)this.aaS().getBuilder();
    }

    @Override
    public lh aaB() {
        if (this.Fh != null) {
            return (lh)this.Fh.getMessageOrBuilder();
        }
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    private SingleFieldBuilderV3<kW, kY, lh> aaS() {
        if (this.Fh == null) {
            this.Fh = new SingleFieldBuilderV3((AbstractMessage)this.aaA(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Fc = null;
        }
        return this.Fh;
    }

    @Override
    public boolean Ly() {
        return (this.an & 2) != 0;
    }

    @Override
    public int Lz() {
        return this.ws;
    }

    public lk_1 hd(int n) {
        this.an |= 2;
        this.ws = n;
        this.onChanged();
        return this;
    }

    public lk_1 afO() {
        this.an &= 0xFFFFFFFD;
        this.ws = 0;
        this.onChanged();
        return this;
    }

    public final lk_1 eq(UnknownFieldSet unknownFieldSet) {
        return (lk_1)super.setUnknownFields(unknownFieldSet);
    }

    public final lk_1 er(UnknownFieldSet unknownFieldSet) {
        return (lk_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.er(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eq(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.er(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bI(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bI(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bI(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eq(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.afJ();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.afM();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.er(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ha(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bI(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.afJ();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bI(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.afM();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.er(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eq(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.er(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bI(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bI(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bI(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eq(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ha(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.afM();
    }

    public /* synthetic */ Message buildPartial() {
        return this.afL();
    }

    public /* synthetic */ Message build() {
        return this.afK();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bI(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.afJ();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ha(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.afM();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.afL();
    }

    public /* synthetic */ MessageLite build() {
        return this.afK();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.afJ();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.afH();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.afH();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ha(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.afM();
    }

    public /* synthetic */ Object clone() {
        return this.afM();
    }
}

