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

public final class hS
extends GeneratedMessageV3.Builder<hS>
implements hT {
    private int an;
    private List<kW> jj = Collections.emptyList();
    private RepeatedFieldBuilderV3<kW, kY, lh> jm;

    public static final Descriptors.Descriptor KL() {
        return hL.vQ;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hL.vR.ensureFieldAccessorsInitialized(hQ.class, hS.class);
    }

    hS() {
        this.D();
    }

    hS(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (hQ.gG()) {
            this.oL();
        }
    }

    public hS KM() {
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
        return hL.vQ;
    }

    public hQ KK() {
        return hQ.KJ();
    }

    public hQ KN() {
        hQ hQ2 = this.KO();
        if (!hQ2.isInitialized()) {
            throw hS.newUninitializedMessageException((Message)hQ2);
        }
        return hQ2;
    }

    public hQ KO() {
        hQ hQ2 = new hQ(this);
        int n = this.an;
        if (this.jm == null) {
            if ((this.an & 1) != 0) {
                this.jj = Collections.unmodifiableList(this.jj);
                this.an &= 0xFFFFFFFE;
            }
            hQ2.jj = this.jj;
        } else {
            hQ2.jj = this.jm.build();
        }
        this.onBuilt();
        return hQ2;
    }

    public hS KP() {
        return (hS)super.clone();
    }

    public hS cM(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hS)super.setField(fieldDescriptor, object);
    }

    public hS aT(Descriptors.FieldDescriptor fieldDescriptor) {
        return (hS)super.clearField(fieldDescriptor);
    }

    public hS aT(Descriptors.OneofDescriptor oneofDescriptor) {
        return (hS)super.clearOneof(oneofDescriptor);
    }

    public hS aT(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (hS)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public hS cN(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hS)super.addRepeatedField(fieldDescriptor, object);
    }

    public hS aT(Message message) {
        if (message instanceof hQ) {
            return this.c((hQ)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public hS c(hQ hQ2) {
        if (hQ2 == hQ.KJ()) {
            return this;
        }
        if (this.jm == null) {
            if (!hQ2.jj.isEmpty()) {
                if (this.jj.isEmpty()) {
                    this.jj = hQ2.jj;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.oH();
                    this.jj.addAll(hQ2.jj);
                }
                this.onChanged();
            }
        } else if (!hQ2.jj.isEmpty()) {
            if (this.jm.isEmpty()) {
                this.jm.dispose();
                this.jm = null;
                this.jj = hQ2.jj;
                this.an &= 0xFFFFFFFE;
                this.jm = hQ.B() ? this.oL() : null;
            } else {
                this.jm.addAllMessages(hQ2.jj);
            }
        }
        this.cN(hQ.b(hQ2));
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

    public hS eH(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        hQ hQ2 = null;
        try {
            hQ2 = (hQ)hQ.wb.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            hQ2 = (hQ)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (hQ2 != null) {
                this.c(hQ2);
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

    public hS a(int n, kW kW2) {
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

    public hS a(int n, kY kY2) {
        if (this.jm == null) {
            this.oH();
            this.jj.set(n, kY2.aer());
            this.onChanged();
        } else {
            this.jm.setMessage(n, (AbstractMessage)kY2.aer());
        }
        return this;
    }

    public hS a(kW kW2) {
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

    public hS b(int n, kW kW2) {
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

    public hS a(kY kY2) {
        if (this.jm == null) {
            this.oH();
            this.jj.add(kY2.aer());
            this.onChanged();
        } else {
            this.jm.addMessage((AbstractMessage)kY2.aer());
        }
        return this;
    }

    public hS b(int n, kY kY2) {
        if (this.jm == null) {
            this.oH();
            this.jj.add(n, kY2.aer());
            this.onChanged();
        } else {
            this.jm.addMessage(n, (AbstractMessage)kY2.aer());
        }
        return this;
    }

    public hS D(Iterable<? extends kW> iterable) {
        if (this.jm == null) {
            this.oH();
            AbstractMessageLite.Builder.addAll(iterable, this.jj);
            this.onChanged();
        } else {
            this.jm.addAllMessages(iterable);
        }
        return this;
    }

    public hS KQ() {
        if (this.jm == null) {
            this.jj = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.jm.clear();
        }
        return this;
    }

    public hS dY(int n) {
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

    public final hS cM(UnknownFieldSet unknownFieldSet) {
        return (hS)super.setUnknownFields(unknownFieldSet);
    }

    public final hS cN(UnknownFieldSet unknownFieldSet) {
        return (hS)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cN(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cM(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cN(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aT(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aT(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aT(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cM(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.KM();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.KP();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cN(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eH(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aT(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.KM();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aT(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.KP();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cN(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cM(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cN(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aT(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aT(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aT(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cM(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eH(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.KP();
    }

    public /* synthetic */ Message buildPartial() {
        return this.KO();
    }

    public /* synthetic */ Message build() {
        return this.KN();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aT(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.KM();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eH(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.KP();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.KO();
    }

    public /* synthetic */ MessageLite build() {
        return this.KN();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.KM();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.KK();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.KK();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eH(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.KP();
    }

    public /* synthetic */ Object clone() {
        return this.KP();
    }
}

