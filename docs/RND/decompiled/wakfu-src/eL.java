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

public final class eL
extends GeneratedMessageV3.Builder<eL>
implements eM {
    private int an;
    private int nE;
    private List<eF> nG = Collections.emptyList();
    private RepeatedFieldBuilderV3<eF, eH, eI> nL;
    private int nI = -2;

    public static final Descriptors.Descriptor wX() {
        return eE.nn;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eE.no.ensureFieldAccessorsInitialized(eJ.class, eL.class);
    }

    eL() {
        this.D();
    }

    eL(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (eJ.aJ()) {
            this.xh();
        }
    }

    public eL wY() {
        super.clear();
        this.nE = 0;
        this.an &= 0xFFFFFFFE;
        if (this.nL == null) {
            this.nG = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
        } else {
            this.nL.clear();
        }
        this.nI = -2;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return eE.nn;
    }

    public eJ wW() {
        return eJ.wV();
    }

    public eJ wZ() {
        eJ eJ2 = this.xa();
        if (!eJ2.isInitialized()) {
            throw eL.newUninitializedMessageException((Message)eJ2);
        }
        return eJ2;
    }

    public eJ xa() {
        eJ eJ2 = new eJ(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            eJ2.nE = this.nE;
            n2 |= 1;
        }
        if (this.nL == null) {
            if ((this.an & 2) != 0) {
                this.nG = Collections.unmodifiableList(this.nG);
                this.an &= 0xFFFFFFFD;
            }
            eJ2.nG = this.nG;
        } else {
            eJ2.nG = this.nL.build();
        }
        if ((n & 4) != 0) {
            n2 |= 2;
        }
        eJ2.nI = this.nI;
        eJ2.an = n2;
        this.onBuilt();
        return eJ2;
    }

    public eL xb() {
        return (eL)super.clone();
    }

    public eL bA(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eL)super.setField(fieldDescriptor, object);
    }

    public eL an(Descriptors.FieldDescriptor fieldDescriptor) {
        return (eL)super.clearField(fieldDescriptor);
    }

    public eL an(Descriptors.OneofDescriptor oneofDescriptor) {
        return (eL)super.clearOneof(oneofDescriptor);
    }

    public eL an(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (eL)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public eL bB(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eL)super.addRepeatedField(fieldDescriptor, object);
    }

    public eL an(Message message) {
        if (message instanceof eJ) {
            return this.c((eJ)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public eL c(eJ eJ2) {
        if (eJ2 == eJ.wV()) {
            return this;
        }
        if (eJ2.wL()) {
            this.bA(eJ2.wM());
        }
        if (this.nL == null) {
            if (!eJ2.nG.isEmpty()) {
                if (this.nG.isEmpty()) {
                    this.nG = eJ2.nG;
                    this.an &= 0xFFFFFFFD;
                } else {
                    this.xd();
                    this.nG.addAll(eJ2.nG);
                }
                this.onChanged();
            }
        } else if (!eJ2.nG.isEmpty()) {
            if (this.nL.isEmpty()) {
                this.nL.dispose();
                this.nL = null;
                this.nG = eJ2.nG;
                this.an &= 0xFFFFFFFD;
                this.nL = eJ.oB() ? this.xh() : null;
            } else {
                this.nL.addAllMessages(eJ2.nG);
            }
        }
        if (eJ2.wQ()) {
            this.bE(eJ2.wR());
        }
        this.bB(eJ.b(eJ2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.wL()) {
            return false;
        }
        for (int i = 0; i < this.wP(); ++i) {
            if (this.by(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public eL cP(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        eJ eJ2 = null;
        try {
            eJ2 = (eJ)eJ.nK.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            eJ2 = (eJ)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (eJ2 != null) {
                this.c(eJ2);
            }
        }
        return this;
    }

    @Override
    public boolean wL() {
        return (this.an & 1) != 0;
    }

    @Override
    public int wM() {
        return this.nE;
    }

    public eL bA(int n) {
        this.an |= 1;
        this.nE = n;
        this.onChanged();
        return this;
    }

    public eL xc() {
        this.an &= 0xFFFFFFFE;
        this.nE = 0;
        this.onChanged();
        return this;
    }

    private void xd() {
        if ((this.an & 2) == 0) {
            this.nG = new ArrayList<eF>(this.nG);
            this.an |= 2;
        }
    }

    @Override
    public List<eF> wN() {
        if (this.nL == null) {
            return Collections.unmodifiableList(this.nG);
        }
        return this.nL.getMessageList();
    }

    @Override
    public int wP() {
        if (this.nL == null) {
            return this.nG.size();
        }
        return this.nL.getCount();
    }

    @Override
    public eF by(int n) {
        if (this.nL == null) {
            return this.nG.get(n);
        }
        return (eF)this.nL.getMessage(n);
    }

    public eL a(int n, eF eF2) {
        if (this.nL == null) {
            if (eF2 == null) {
                throw new NullPointerException();
            }
            this.xd();
            this.nG.set(n, eF2);
            this.onChanged();
        } else {
            this.nL.setMessage(n, (AbstractMessage)eF2);
        }
        return this;
    }

    public eL a(int n, eH eH2) {
        if (this.nL == null) {
            this.xd();
            this.nG.set(n, eH2.wC());
            this.onChanged();
        } else {
            this.nL.setMessage(n, (AbstractMessage)eH2.wC());
        }
        return this;
    }

    public eL d(eF eF2) {
        if (this.nL == null) {
            if (eF2 == null) {
                throw new NullPointerException();
            }
            this.xd();
            this.nG.add(eF2);
            this.onChanged();
        } else {
            this.nL.addMessage((AbstractMessage)eF2);
        }
        return this;
    }

    public eL b(int n, eF eF2) {
        if (this.nL == null) {
            if (eF2 == null) {
                throw new NullPointerException();
            }
            this.xd();
            this.nG.add(n, eF2);
            this.onChanged();
        } else {
            this.nL.addMessage(n, (AbstractMessage)eF2);
        }
        return this;
    }

    public eL a(eH eH2) {
        if (this.nL == null) {
            this.xd();
            this.nG.add(eH2.wC());
            this.onChanged();
        } else {
            this.nL.addMessage((AbstractMessage)eH2.wC());
        }
        return this;
    }

    public eL b(int n, eH eH2) {
        if (this.nL == null) {
            this.xd();
            this.nG.add(n, eH2.wC());
            this.onChanged();
        } else {
            this.nL.addMessage(n, (AbstractMessage)eH2.wC());
        }
        return this;
    }

    public eL l(Iterable<? extends eF> iterable) {
        if (this.nL == null) {
            this.xd();
            AbstractMessageLite.Builder.addAll(iterable, this.nG);
            this.onChanged();
        } else {
            this.nL.addAllMessages(iterable);
        }
        return this;
    }

    public eL xe() {
        if (this.nL == null) {
            this.nG = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.nL.clear();
        }
        return this;
    }

    public eL bB(int n) {
        if (this.nL == null) {
            this.xd();
            this.nG.remove(n);
            this.onChanged();
        } else {
            this.nL.remove(n);
        }
        return this;
    }

    public eH bC(int n) {
        return (eH)this.xh().getBuilder(n);
    }

    @Override
    public eI bz(int n) {
        if (this.nL == null) {
            return this.nG.get(n);
        }
        return (eI)this.nL.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends eI> wO() {
        if (this.nL != null) {
            return this.nL.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.nG);
    }

    public eH xf() {
        return (eH)this.xh().addBuilder((AbstractMessage)eF.wy());
    }

    public eH bD(int n) {
        return (eH)this.xh().addBuilder(n, (AbstractMessage)eF.wy());
    }

    public List<eH> xg() {
        return this.xh().getBuilderList();
    }

    private RepeatedFieldBuilderV3<eF, eH, eI> xh() {
        if (this.nL == null) {
            this.nL = new RepeatedFieldBuilderV3(this.nG, (this.an & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.nG = null;
        }
        return this.nL;
    }

    @Override
    public boolean wQ() {
        return (this.an & 4) != 0;
    }

    @Override
    public int wR() {
        return this.nI;
    }

    public eL bE(int n) {
        this.an |= 4;
        this.nI = n;
        this.onChanged();
        return this;
    }

    public eL xi() {
        this.an &= 0xFFFFFFFB;
        this.nI = -2;
        this.onChanged();
        return this;
    }

    public final eL bA(UnknownFieldSet unknownFieldSet) {
        return (eL)super.setUnknownFields(unknownFieldSet);
    }

    public final eL bB(UnknownFieldSet unknownFieldSet) {
        return (eL)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bB(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bA(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bB(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.an(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.an(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.an(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bA(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.wY();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.xb();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bB(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cP(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.an(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.wY();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.an(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.xb();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bB(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bA(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bB(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.an(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.an(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.an(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bA(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cP(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.xb();
    }

    public /* synthetic */ Message buildPartial() {
        return this.xa();
    }

    public /* synthetic */ Message build() {
        return this.wZ();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.an(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.wY();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cP(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.xb();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.xa();
    }

    public /* synthetic */ MessageLite build() {
        return this.wZ();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.wY();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.wW();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.wW();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cP(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.xb();
    }

    public /* synthetic */ Object clone() {
        return this.xb();
    }
}

