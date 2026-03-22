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
 * Renamed from gV
 */
public final class gv_0
extends GeneratedMessageV3.Builder<gv_0>
implements gw_0 {
    private int an;
    private long tw;
    private gm_0 ty;
    private SingleFieldBuilderV3<gm_0, go_1, gp_1> tB;

    public static final Descriptors.Descriptor GC() {
        return gl_0.sU;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gl_0.sV.ensureFieldAccessorsInitialized(gt_0.class, gv_0.class);
    }

    gv_0() {
        this.D();
    }

    gv_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (gt_0.Y()) {
            this.GK();
        }
    }

    public gv_0 GD() {
        super.clear();
        this.tw = 0L;
        this.an &= 0xFFFFFFFE;
        if (this.tB == null) {
            this.ty = null;
        } else {
            this.tB.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return gl_0.sU;
    }

    public gt_0 GB() {
        return gt_0.GA();
    }

    public gt_0 GE() {
        gt_0 gt_02 = this.GF();
        if (!gt_02.isInitialized()) {
            throw gv_0.newUninitializedMessageException((Message)gt_02);
        }
        return gt_02;
    }

    public gt_0 GF() {
        gt_0 gt_02 = new gt_0(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            gt_02.tw = this.tw;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            gt_02.ty = this.tB == null ? this.ty : (gm_0)this.tB.build();
            n2 |= 2;
        }
        gt_02.an = n2;
        this.onBuilt();
        return gt_02;
    }

    public gv_0 GG() {
        return (gv_0)super.clone();
    }

    public gv_0 cs(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gv_0)super.setField(fieldDescriptor, object);
    }

    public gv_0 aJ(Descriptors.FieldDescriptor fieldDescriptor) {
        return (gv_0)super.clearField(fieldDescriptor);
    }

    public gv_0 aJ(Descriptors.OneofDescriptor oneofDescriptor) {
        return (gv_0)super.clearOneof(oneofDescriptor);
    }

    public gv_0 aJ(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (gv_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public gv_0 ct(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gv_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public gv_0 aJ(Message message) {
        if (message instanceof gt_0) {
            return this.d((gt_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public gv_0 d(gt_0 gt_02) {
        if (gt_02 == gt_0.GA()) {
            return this;
        }
        if (gt_02.wo()) {
            this.U(gt_02.Gt());
        }
        if (gt_02.Gu()) {
            this.e(gt_02.Gv());
        }
        this.ct(gt_0.c(gt_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.wo()) {
            return false;
        }
        if (!this.Gu()) {
            return false;
        }
        return this.Gv().isInitialized();
    }

    public gv_0 ed(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        gt_0 gt_02 = null;
        try {
            gt_02 = (gt_0)gt_0.tA.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            gt_02 = (gt_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (gt_02 != null) {
                this.d(gt_02);
            }
        }
        return this;
    }

    @Override
    public boolean wo() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Gt() {
        return this.tw;
    }

    public gv_0 U(long l) {
        this.an |= 1;
        this.tw = l;
        this.onChanged();
        return this;
    }

    public gv_0 GH() {
        this.an &= 0xFFFFFFFE;
        this.tw = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Gu() {
        return (this.an & 2) != 0;
    }

    @Override
    public gm_0 Gv() {
        if (this.tB == null) {
            return this.ty == null ? gm_0.FG() : this.ty;
        }
        return (gm_0)this.tB.getMessage();
    }

    public gv_0 d(gm_0 gm_02) {
        if (this.tB == null) {
            if (gm_02 == null) {
                throw new NullPointerException();
            }
            this.ty = gm_02;
            this.onChanged();
        } else {
            this.tB.setMessage((AbstractMessage)gm_02);
        }
        this.an |= 2;
        return this;
    }

    public gv_0 a(go_1 go_12) {
        if (this.tB == null) {
            this.ty = go_12.FN();
            this.onChanged();
        } else {
            this.tB.setMessage((AbstractMessage)go_12.FN());
        }
        this.an |= 2;
        return this;
    }

    public gv_0 e(gm_0 gm_02) {
        if (this.tB == null) {
            this.ty = (this.an & 2) != 0 && this.ty != null && this.ty != gm_0.FG() ? gm_0.a(this.ty).c(gm_02).FO() : gm_02;
            this.onChanged();
        } else {
            this.tB.mergeFrom((AbstractMessage)gm_02);
        }
        this.an |= 2;
        return this;
    }

    public gv_0 GI() {
        if (this.tB == null) {
            this.ty = null;
            this.onChanged();
        } else {
            this.tB.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public go_1 GJ() {
        this.an |= 2;
        this.onChanged();
        return (go_1)this.GK().getBuilder();
    }

    @Override
    public gp_1 Gw() {
        if (this.tB != null) {
            return (gp_1)this.tB.getMessageOrBuilder();
        }
        return this.ty == null ? gm_0.FG() : this.ty;
    }

    private SingleFieldBuilderV3<gm_0, go_1, gp_1> GK() {
        if (this.tB == null) {
            this.tB = new SingleFieldBuilderV3((AbstractMessage)this.Gv(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.ty = null;
        }
        return this.tB;
    }

    public final gv_0 cs(UnknownFieldSet unknownFieldSet) {
        return (gv_0)super.setUnknownFields(unknownFieldSet);
    }

    public final gv_0 ct(UnknownFieldSet unknownFieldSet) {
        return (gv_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ct(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cs(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ct(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aJ(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aJ(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aJ(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cs(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.GD();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.GG();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ct(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ed(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aJ(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.GD();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aJ(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.GG();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ct(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cs(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ct(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aJ(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aJ(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aJ(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cs(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ed(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.GG();
    }

    public /* synthetic */ Message buildPartial() {
        return this.GF();
    }

    public /* synthetic */ Message build() {
        return this.GE();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aJ(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.GD();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ed(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.GG();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.GF();
    }

    public /* synthetic */ MessageLite build() {
        return this.GE();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.GD();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.GB();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.GB();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ed(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.GG();
    }

    public /* synthetic */ Object clone() {
        return this.GG();
    }
}

