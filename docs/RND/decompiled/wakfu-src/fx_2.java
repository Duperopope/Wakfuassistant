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
 *  com.google.protobuf.MapField
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
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/*
 * Renamed from fX
 */
public final class fx_2
extends GeneratedMessageV3.Builder<fx_2>
implements fy_2 {
    private int an;
    private List<fp_1> rs = Collections.emptyList();
    private RepeatedFieldBuilderV3<fp_1, fr_1, ft_1> ry;
    private MapField<Long, Integer> ru;

    public static final Descriptors.Descriptor CC() {
        return fo_1.qS;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 2: {
                return this.Ct();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 2: {
                return this.CM();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fo_1.qT.ensureFieldAccessorsInitialized(fu_1.class, fx_2.class);
    }

    fx_2() {
        this.D();
    }

    fx_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (fu_1.aJ()) {
            this.CL();
        }
    }

    public fx_2 CD() {
        super.clear();
        if (this.ry == null) {
            this.rs = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.ry.clear();
        }
        this.CM().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return fo_1.qS;
    }

    public fu_1 CB() {
        return fu_1.CA();
    }

    public fu_1 CE() {
        fu_1 fu_12 = this.CF();
        if (!fu_12.isInitialized()) {
            throw fx_2.newUninitializedMessageException((Message)fu_12);
        }
        return fu_12;
    }

    public fu_1 CF() {
        fu_1 fu_12 = new fu_1(this);
        int n = this.an;
        if (this.ry == null) {
            if ((this.an & 1) != 0) {
                this.rs = Collections.unmodifiableList(this.rs);
                this.an &= 0xFFFFFFFE;
            }
            fu_12.rs = this.rs;
        } else {
            fu_12.rs = this.ry.build();
        }
        fu_12.ru = this.Ct();
        fu_12.ru.makeImmutable();
        this.onBuilt();
        return fu_12;
    }

    public fx_2 CG() {
        return (fx_2)super.clone();
    }

    public fx_2 bY(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fx_2)super.setField(fieldDescriptor, object);
    }

    public fx_2 az(Descriptors.FieldDescriptor fieldDescriptor) {
        return (fx_2)super.clearField(fieldDescriptor);
    }

    public fx_2 az(Descriptors.OneofDescriptor oneofDescriptor) {
        return (fx_2)super.clearOneof(oneofDescriptor);
    }

    public fx_2 az(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (fx_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public fx_2 bZ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fx_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public fx_2 az(Message message) {
        if (message instanceof fu_1) {
            return this.c((fu_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public fx_2 c(fu_1 fu_12) {
        if (fu_12 == fu_1.CA()) {
            return this;
        }
        if (this.ry == null) {
            if (!fu_12.rs.isEmpty()) {
                if (this.rs.isEmpty()) {
                    this.rs = fu_12.rs;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.CH();
                    this.rs.addAll(fu_12.rs);
                }
                this.onChanged();
            }
        } else if (!fu_12.rs.isEmpty()) {
            if (this.ry.isEmpty()) {
                this.ry.dispose();
                this.ry = null;
                this.rs = fu_12.rs;
                this.an &= 0xFFFFFFFE;
                this.ry = fu_1.oB() ? this.CL() : null;
            } else {
                this.ry.addAllMessages(fu_12.rs);
            }
        }
        this.CM().mergeFrom(fu_12.Ct());
        this.bZ(fu_1.b(fu_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.Cs(); ++i) {
            if (this.cH(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public fx_2 dz(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        fu_1 fu_12 = null;
        try {
            fu_12 = (fu_1)fu_1.rw.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            fu_12 = (fu_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (fu_12 != null) {
                this.c(fu_12);
            }
        }
        return this;
    }

    private void CH() {
        if ((this.an & 1) == 0) {
            this.rs = new ArrayList<fp_1>(this.rs);
            this.an |= 1;
        }
    }

    @Override
    public List<fp_1> Cq() {
        if (this.ry == null) {
            return Collections.unmodifiableList(this.rs);
        }
        return this.ry.getMessageList();
    }

    @Override
    public int Cs() {
        if (this.ry == null) {
            return this.rs.size();
        }
        return this.ry.getCount();
    }

    @Override
    public fp_1 cH(int n) {
        if (this.ry == null) {
            return this.rs.get(n);
        }
        return (fp_1)this.ry.getMessage(n);
    }

    public fx_2 a(int n, fp_1 fp_12) {
        if (this.ry == null) {
            if (fp_12 == null) {
                throw new NullPointerException();
            }
            this.CH();
            this.rs.set(n, fp_12);
            this.onChanged();
        } else {
            this.ry.setMessage(n, (AbstractMessage)fp_12);
        }
        return this;
    }

    public fx_2 a(int n, fr_1 fr_12) {
        if (this.ry == null) {
            this.CH();
            this.rs.set(n, fr_12.Ce());
            this.onChanged();
        } else {
            this.ry.setMessage(n, (AbstractMessage)fr_12.Ce());
        }
        return this;
    }

    public fx_2 d(fp_1 fp_12) {
        if (this.ry == null) {
            if (fp_12 == null) {
                throw new NullPointerException();
            }
            this.CH();
            this.rs.add(fp_12);
            this.onChanged();
        } else {
            this.ry.addMessage((AbstractMessage)fp_12);
        }
        return this;
    }

    public fx_2 b(int n, fp_1 fp_12) {
        if (this.ry == null) {
            if (fp_12 == null) {
                throw new NullPointerException();
            }
            this.CH();
            this.rs.add(n, fp_12);
            this.onChanged();
        } else {
            this.ry.addMessage(n, (AbstractMessage)fp_12);
        }
        return this;
    }

    public fx_2 a(fr_1 fr_12) {
        if (this.ry == null) {
            this.CH();
            this.rs.add(fr_12.Ce());
            this.onChanged();
        } else {
            this.ry.addMessage((AbstractMessage)fr_12.Ce());
        }
        return this;
    }

    public fx_2 b(int n, fr_1 fr_12) {
        if (this.ry == null) {
            this.CH();
            this.rs.add(n, fr_12.Ce());
            this.onChanged();
        } else {
            this.ry.addMessage(n, (AbstractMessage)fr_12.Ce());
        }
        return this;
    }

    public fx_2 u(Iterable<? extends fp_1> iterable) {
        if (this.ry == null) {
            this.CH();
            AbstractMessageLite.Builder.addAll(iterable, this.rs);
            this.onChanged();
        } else {
            this.ry.addAllMessages(iterable);
        }
        return this;
    }

    public fx_2 CI() {
        if (this.ry == null) {
            this.rs = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.ry.clear();
        }
        return this;
    }

    public fx_2 cJ(int n) {
        if (this.ry == null) {
            this.CH();
            this.rs.remove(n);
            this.onChanged();
        } else {
            this.ry.remove(n);
        }
        return this;
    }

    public fr_1 cK(int n) {
        return (fr_1)this.CL().getBuilder(n);
    }

    @Override
    public ft_1 cI(int n) {
        if (this.ry == null) {
            return this.rs.get(n);
        }
        return (ft_1)this.ry.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends ft_1> Cr() {
        if (this.ry != null) {
            return this.ry.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.rs);
    }

    public fr_1 CJ() {
        return (fr_1)this.CL().addBuilder((AbstractMessage)fp_1.Ca());
    }

    public fr_1 cL(int n) {
        return (fr_1)this.CL().addBuilder(n, (AbstractMessage)fp_1.Ca());
    }

    public List<fr_1> CK() {
        return this.CL().getBuilderList();
    }

    private RepeatedFieldBuilderV3<fp_1, fr_1, ft_1> CL() {
        if (this.ry == null) {
            this.ry = new RepeatedFieldBuilderV3(this.rs, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.rs = null;
        }
        return this.ry;
    }

    private MapField<Long, Integer> Ct() {
        if (this.ru == null) {
            return MapField.emptyMapField(fw_2.rx);
        }
        return this.ru;
    }

    private MapField<Long, Integer> CM() {
        this.onChanged();
        if (this.ru == null) {
            this.ru = MapField.newMapField(fw_2.rx);
        }
        if (!this.ru.isMutable()) {
            this.ru = this.ru.copy();
        }
        return this.ru;
    }

    @Override
    public int Cu() {
        return this.Ct().getMap().size();
    }

    @Override
    public boolean O(long l) {
        return this.Ct().getMap().containsKey(l);
    }

    @Override
    @Deprecated
    public Map<Long, Integer> Cv() {
        return this.Cw();
    }

    @Override
    public Map<Long, Integer> Cw() {
        return this.Ct().getMap();
    }

    @Override
    public int a(long l, int n) {
        Map map = this.Ct().getMap();
        return map.containsKey(l) ? (Integer)map.get(l) : n;
    }

    @Override
    public int P(long l) {
        Map map = this.Ct().getMap();
        if (!map.containsKey(l)) {
            throw new IllegalArgumentException();
        }
        return (Integer)map.get(l);
    }

    public fx_2 CN() {
        this.CM().getMutableMap().clear();
        return this;
    }

    public fx_2 Q(long l) {
        this.CM().getMutableMap().remove(l);
        return this;
    }

    @Deprecated
    public Map<Long, Integer> CO() {
        return this.CM().getMutableMap();
    }

    public fx_2 b(long l, int n) {
        this.CM().getMutableMap().put(l, n);
        return this;
    }

    public fx_2 j(Map<Long, Integer> map) {
        this.CM().getMutableMap().putAll(map);
        return this;
    }

    public final fx_2 bY(UnknownFieldSet unknownFieldSet) {
        return (fx_2)super.setUnknownFields(unknownFieldSet);
    }

    public final fx_2 bZ(UnknownFieldSet unknownFieldSet) {
        return (fx_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bZ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bY(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bZ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.az(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.az(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.az(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bY(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.CD();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.CG();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bZ(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dz(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.az(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.CD();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.az(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.CG();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bZ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bY(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bZ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.az(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.az(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.az(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bY(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dz(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.CG();
    }

    public /* synthetic */ Message buildPartial() {
        return this.CF();
    }

    public /* synthetic */ Message build() {
        return this.CE();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.az(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.CD();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dz(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.CG();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.CF();
    }

    public /* synthetic */ MessageLite build() {
        return this.CE();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.CD();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.CB();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.CB();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dz(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.CG();
    }

    public /* synthetic */ Object clone() {
        return this.CG();
    }
}

