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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from lw
 */
public final class lw_1
extends GeneratedMessageV3.Builder<lw_1>
implements lx_1 {
    private int an;
    private List<kW> jj = Collections.emptyList();
    private RepeatedFieldBuilderV3<kW, kY, lh> jm;

    public static final Descriptors.Descriptor agA() {
        return kF.Gg;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gh.ensureFieldAccessorsInitialized(lu_1.class, lw_1.class);
    }

    lw_1() {
        this.D();
    }

    lw_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (lu_1.BA()) {
            this.oL();
        }
    }

    public lw_1 agB() {
        super.clear();
        if (this.jm == null) {
            this.jj = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.jm.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kF.Gg;
    }

    public lu_1 agz() {
        return lu_1.agy();
    }

    public lu_1 agC() {
        lu_1 lu_12 = this.agD();
        if (!lu_12.isInitialized()) {
            throw lw_1.newUninitializedMessageException((Message)lu_12);
        }
        return lu_12;
    }

    public lu_1 agD() {
        lu_1 lu_12 = new lu_1(this);
        int n = this.an;
        if (this.jm == null) {
            if ((this.an & 1) != 0) {
                this.jj = Collections.unmodifiableList(this.jj);
                this.an &= 0xFFFFFFFE;
            }
            lu_12.jj = this.jj;
        } else {
            lu_12.jj = this.jm.build();
        }
        this.onBuilt();
        return lu_12;
    }

    public lw_1 agE() {
        return (lw_1)super.clone();
    }

    public lw_1 ew(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lw_1)super.setField(fieldDescriptor, object);
    }

    public lw_1 bL(Descriptors.FieldDescriptor fieldDescriptor) {
        return (lw_1)super.clearField(fieldDescriptor);
    }

    public lw_1 bL(Descriptors.OneofDescriptor oneofDescriptor) {
        return (lw_1)super.clearOneof(oneofDescriptor);
    }

    public lw_1 bL(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (lw_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public lw_1 ex(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lw_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public lw_1 bL(Message message) {
        if (message instanceof lu_1) {
            return this.e((lu_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public lw_1 e(lu_1 lu_12) {
        if (lu_12 == lu_1.agy()) {
            return this;
        }
        if (this.jm == null) {
            if (!lu_12.jj.isEmpty()) {
                if (this.jj.isEmpty()) {
                    this.jj = lu_12.jj;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.oH();
                    this.jj.addAll(lu_12.jj);
                }
                this.onChanged();
            }
        } else if (!lu_12.jj.isEmpty()) {
            if (this.jm.isEmpty()) {
                this.jm.dispose();
                this.jm = null;
                this.jj = lu_12.jj;
                this.an &= 0xFFFFFFFE;
                this.jm = lu_1.fK() ? this.oL() : null;
            } else {
                this.jm.addAllMessages(lu_12.jj);
            }
        }
        this.ex(lu_1.d(lu_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.ov(); ++i) {
            if (this.dW(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public lw_1 hj(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        lu_1 lu_12 = null;
        try {
            lu_12 = (lu_1)lu_1.Ih.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            lu_12 = (lu_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (lu_12 != null) {
                this.e(lu_12);
            }
        }
        return this;
    }

    private void oH() {
        if ((this.an & 1) == 0) {
            this.jj = new ArrayList<kW>(this.jj);
            this.an |= 1;
        }
    }

    @Override
    public List<kW> ot() {
        if (this.jm == null) {
            return Collections.unmodifiableList(this.jj);
        }
        return this.jm.getMessageList();
    }

    @Override
    public int ov() {
        if (this.jm == null) {
            return this.jj.size();
        }
        return this.jm.getCount();
    }

    @Override
    public kW dW(int n) {
        if (this.jm == null) {
            return this.jj.get(n);
        }
        return (kW)this.jm.getMessage(n);
    }

    public lw_1 c(int n, kW kW2) {
        if (this.jm == null) {
            if (kW2 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.set(n, kW2);
            this.onChanged();
        } else {
            this.jm.setMessage(n, (AbstractMessage)kW2);
        }
        return this;
    }

    public lw_1 c(int n, kY kY2) {
        if (this.jm == null) {
            this.oH();
            this.jj.set(n, kY2.aer());
            this.onChanged();
        } else {
            this.jm.setMessage(n, (AbstractMessage)kY2.aer());
        }
        return this;
    }

    public lw_1 k(kW kW2) {
        if (this.jm == null) {
            if (kW2 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.add(kW2);
            this.onChanged();
        } else {
            this.jm.addMessage((AbstractMessage)kW2);
        }
        return this;
    }

    public lw_1 d(int n, kW kW2) {
        if (this.jm == null) {
            if (kW2 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.add(n, kW2);
            this.onChanged();
        } else {
            this.jm.addMessage(n, (AbstractMessage)kW2);
        }
        return this;
    }

    public lw_1 e(kY kY2) {
        if (this.jm == null) {
            this.oH();
            this.jj.add(kY2.aer());
            this.onChanged();
        } else {
            this.jm.addMessage((AbstractMessage)kY2.aer());
        }
        return this;
    }

    public lw_1 d(int n, kY kY2) {
        if (this.jm == null) {
            this.oH();
            this.jj.add(n, kY2.aer());
            this.onChanged();
        } else {
            this.jm.addMessage(n, (AbstractMessage)kY2.aer());
        }
        return this;
    }

    public lw_1 Z(Iterable<? extends kW> iterable) {
        if (this.jm == null) {
            this.oH();
            AbstractMessageLite.Builder.addAll(iterable, this.jj);
            this.onChanged();
        } else {
            this.jm.addAllMessages(iterable);
        }
        return this;
    }

    public lw_1 agF() {
        if (this.jm == null) {
            this.jj = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.jm.clear();
        }
        return this;
    }

    public lw_1 hk(int n) {
        if (this.jm == null) {
            this.oH();
            this.jj.remove(n);
            this.onChanged();
        } else {
            this.jm.remove(n);
        }
        return this;
    }

    public kY dZ(int n) {
        return (kY)this.oL().getBuilder(n);
    }

    @Override
    public lh dX(int n) {
        if (this.jm == null) {
            return this.jj.get(n);
        }
        return (lh)this.jm.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends lh> ou() {
        if (this.jm != null) {
            return this.jm.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.jj);
    }

    public kY KR() {
        return (kY)this.oL().addBuilder((AbstractMessage)kW.aen());
    }

    public kY ea(int n) {
        return (kY)this.oL().addBuilder(n, (AbstractMessage)kW.aen());
    }

    public List<kY> oK() {
        return this.oL().getBuilderList();
    }

    private RepeatedFieldBuilderV3<kW, kY, lh> oL() {
        if (this.jm == null) {
            this.jm = new RepeatedFieldBuilderV3(this.jj, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.jj = null;
        }
        return this.jm;
    }

    public final lw_1 ew(UnknownFieldSet unknownFieldSet) {
        return (lw_1)super.setUnknownFields(unknownFieldSet);
    }

    public final lw_1 ex(UnknownFieldSet unknownFieldSet) {
        return (lw_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ex(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ew(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ex(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bL(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bL(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bL(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ew(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.agB();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.agE();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ex(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hj(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bL(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.agB();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bL(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.agE();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ex(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ew(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ex(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bL(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bL(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bL(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ew(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hj(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.agE();
    }

    public /* synthetic */ Message buildPartial() {
        return this.agD();
    }

    public /* synthetic */ Message build() {
        return this.agC();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bL(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.agB();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hj(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.agE();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.agD();
    }

    public /* synthetic */ MessageLite build() {
        return this.agC();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.agB();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.agz();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.agz();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hj(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.agE();
    }

    public /* synthetic */ Object clone() {
        return this.agE();
    }
}

